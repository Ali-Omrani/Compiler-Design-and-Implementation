grammar g;

@header{
    import java.util.List;
}

@members{


    void print(String str){
        System.out.println(str);
    }

    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTableLocalVariableItem item = new SymbolTableLocalVariableItem(
            new Variable(name,type),
            SymbolTable.top.getOffset(Register.SP)
        );
        SymbolTable.resultString += item.itemToString() + '\n';
        SymbolTable.top.put(
            item
        );
    }

    void putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTableGlobalVariableItem item = new SymbolTableGlobalVariableItem(
              new Variable(name,type),
              SymbolTable.top.getOffset(Register.GP)
        );
        SymbolTable.resultString += item.itemToString() + '\n';
        SymbolTable.top.put(
               item
        );
    }

    void beginScope() {
            SymbolTable.resultString += "----"+'\n';
        	int offset = 0;
        	if(SymbolTable.top != null){
            	offset = SymbolTable.top.getOffset(Register.SP);
            }
            SymbolTable.push(new SymbolTable(SymbolTable.top));
            SymbolTable.top.setOffset(Register.GP, SymbolTable.getGlobalOffset());
            SymbolTable.top.setOffset(Register.SP, offset);
            SymbolTable.top.firstOffset = offset;
    }

    void endScope() {
//        print("Stack global offset: " + SymbolTable.top.getOffset(Register.GP));
//        print("Stack local offset: " + SymbolTable.top.getOffset(Register.SP));
        //{printSymbolTableTop();}

        SymbolTable.setGlobalOffset(SymbolTable.top.getOffset(Register.GP));
        SymbolTable.pop();
    }

    public void putTemp(String baseName, Type type) {
    		int idx = 1;
            String newName = baseName + "_Temproray_" + Integer.toString(idx);
    		while (SymbolTable.top.containsItemName(newName)) {
    			idx++;
    			newName = baseName + "_Temproray_" + Integer.toString(idx);
    		}
    		try{
    		    putLocalVar(newName, type);
            }catch(ItemAlreadyExistsException e) {
                 System.err.println("-----Exception--------:duplicate actor name");
            }
    }


    String putReceiver(String name, List<Type> arguments) throws ItemAlreadyExistsException{
        SymbolTableFunctionObject item = new SymbolTableFunctionObject(
                                                         arguments,
                                                         name
                                                     );
        SymbolTable.resultString += "---- "+ item.itemToString()+ " ----"+'\n';
        SymbolTable.top.put(
            item
        );

        return item.itemToString();
    }

    String putTempReciver(String name, List<Type> arguments){
        print("*************put Temp Receiver");
        int idx=1;
        String newName = name + "_TEMPORARY_" + Integer.toString(idx);
        SymbolTableFunctionObject newReceiver = new SymbolTableFunctionObject(
                                                                  arguments,
                                                                  newName
                                                              );

        while (SymbolTable.top.containsItemName(newReceiver.getKey())) {
            idx++;
            newName = name + "_TEMPORARY_" + Integer.toString(idx);
            newReceiver = new SymbolTableFunctionObject(arguments, newName);
        }
        try{
            return putReceiver(newName, arguments);
        }catch(ItemAlreadyExistsException e) {
             System.err.println("-----Exception--------:duplicate actor name");
        }
        return "";
    }

    void putActor(String name, int bufferSize, List<String> receivers)throws ItemAlreadyExistsException{
            SymbolTableActorItem item = new SymbolTableActorItem(
                                                             name,
                                                             bufferSize,
                                                             receivers
                                                         );
            SymbolTable.resultString += "---- "+ item.itemToString()+ " ----"+'\n';
            print("actor created with name:"+name);
            item.printReceivers();
            SymbolTable.top.put(
                new SymbolTableActorItem(
                    name,
                    bufferSize,
                    receivers
                )
            );

    }

    void printSymbolTableTop(){
    print("printing symbol table");
    SymbolTable.top.print();
    }
}
//TODO: Scopes must be checked with the project Desc

program returns [boolean synHasActor]:
    {//print("program");
    }
    {beginScope();}
    {$synHasActor = false;}
	(a = actor {if($a.synActorExists){$synHasActor = true;}}| '\n')*
    {if(!$synHasActor){
          {print("program 1doesnt have any actor");}
        //{throw new NoActorException();}
    }}
    {endScope();}
    {
        if(!SymbolTable.hasError){
            print(SymbolTable.resultString);
        }
    }
;

actor returns [boolean synActorExists, List<String> receiverSign = new ArrayList<>()]:

  ad = actorDef {beginScope();} (abs = actorBodyStatement[$ad.actorName]{
    if($abs.isReceiver){
        $receiverSign.add($abs.receiverString);
    }
  })*
 'end'{endScope();}
  {
     try{
         putActor($ad.actorName, $ad.actorBufferLength, $receiverSign);
     }
     catch(ItemAlreadyExistsException e) {
         System.err.println( "-----Exception--------:duplicate actor name");
         SymbolTable.hasError = true;
         putTemp($ad.actorName, new ActorType($ad.actorBufferLength));
     }
     SymbolTable.resultString += "----------------- Actor : "+$ad.actorName+"<"+Integer.toString($ad.actorBufferLength)+"> -------------------------"+'\n';
   }
   {SymbolTable.resultString += "------------------------------------------------------"+'\n';}
 ('\n'|EOF)
  {$synActorExists = true;}
;

actorDef returns[String actorName, int actorBufferLength]:
	'actor'name=Id'<'CONST_INT'>'('\n')+
	{
	    $actorBufferLength = $CONST_INT.int;
        if ($actorBufferLength<=0){
            print( "Line:" +Integer.toString($name.getLine()) +"  +++++++++++++++Zero Or Negative Length in actor buffer length+++++++++++++++" );
            SymbolTable.hasError = true;
            $actorBufferLength = 0;
        }
        $actorName= $name.text;
	}
	{//print("actorDef : " + $name.text);
	}
    {
        SymbolTable.addActor(new Actor($name.text,$CONST_INT.int));
    }

;


actorBodyStatement[String actorName] returns[boolean isReceiver, String receiverString]:
  {//print("actorBodyStatement");
  }
	(dataDef[true]{$isReceiver = false; $receiverString = "";}('\n')+ | r = receiver[$actorName]{$isReceiver = true; $receiverString = $r.receiverString;})
;

type returns [Type dataType]:
	(array = arrayType {$dataType = $array.dataArrayType;}| variable = varType {$dataType = $variable.dataVariableType;}) {//print("type");
	}
;


//TODO : check if it is really column major
arrayType returns [Type dataArrayType, List<Integer> dimensions = new ArrayList<>()]:
	{print("+++++++++++++++arrayType");}
	v = varType {$dataArrayType = $v.dataVariableType;}
	('['CONST_INT']'
	//TODO :throw NegativeLengthException
	{
        if($CONST_INT.int<=0){
            print("Line:" + Integer.toString($CONST_INT.getLine())+"  +++++++++++++++Zero Or Negative Length in array def+++++++++++++++");
            SymbolTable.hasError = true;
            $dimensions.add(0);
        }else{
            $dimensions.add($CONST_INT.int);
        }
	}


	)+
	{
	    print("********************"+Integer.toString($dimensions.size()));
	    for(int i = ($dimensions.size()-1);i>=0;i--){
	        print("in for for i: "+Integer.toString(i));
	        $dataArrayType = new ArrayType($dimensions.get(i),$dataArrayType);
	    }
	}

;

//TODO : add type_str for print
varType returns [Type dataVariableType]:
	'int'{$dataVariableType = IntType.getInstance();}| 'char'{$dataVariableType = CharType.getInstance();} //{print("varType : "+ $type_str.text);}
;

dataDef [boolean isGlobal] returns [Type dataType]:
    t = type {$dataType = $t.dataType;} name = Id
//    {System.out.println($name.text+" variable is "+((isGlobal)?"global":"local"));}
    {
        try{
            if($isGlobal){
                putGlobalVar($name.text, $dataType);
            }
            else{
                putLocalVar($name.text, $dataType);
            }
        }
        catch(ItemAlreadyExistsException e) {
            System.err.println( "Line:" +Integer.toString($name.getLine()) +"  -----Exception--------:duplicate variable name");
            SymbolTable.hasError = true;
            putTemp($name.text, $dataType);
        }


    }
    ('=' expression)? (','name2 =Id
    {
        try{
            putLocalVar($name2.text, $dataType);
        }
        catch(ItemAlreadyExistsException e) {
            System.err.println( "Line:" +Integer.toString($name2.getLine()) +"  -----Exception--------:duplicate variable name");
            SymbolTable.hasError = true;
            putTemp($name2.text, $dataType);
        }
    }
    ('=' expression)?)*
;

receiver[String actorName] returns [String receiverString]:
	{//print("receiver");
	}
	//TODO: Add line of error
	recDef = receiverDef[$actorName]
	{beginScope();
	for(Variable var: $recDef.receiverArgs){
	    try{
	        putLocalVar(var.getName(), var.getType());
	    }catch(ItemAlreadyExistsException e){
	        System.err.println("-----Exception--------:duplicate variable name");
	        putTemp(var.getName(), var.getType());
	    }
	}
	$receiverString = $recDef.receiverString;
	}(receiverBodyStatement)* {endScope();} 'end' ('\n')+
;

receiverDef[String actorName] returns [List<Variable> receiverArgs, String receiverString]:
	'receiver' name = Id {//print("receiverDef : " + $name.text);
	}
	'('  argumentDefVars = argumentDef
	 {
	    $receiverArgs = $argumentDefVars.args;
	    int argCount = 0;
        List<Type> types= new ArrayList<Type>();
        List<Variable> argRes = $argumentDefVars.args;
//        print(Integer.toString(argRes.size()));
        for (Variable var : argRes){
            types.add(var.getType());
            if(var.getType() instanceof ArrayType){
                ArrayType arrType = (ArrayType)var.getType();
                print("*************************************************** it is arrraaaaaay");
                argCount += arrType.getElementCount();
                print(Integer.toString(argCount));
            }
            else{
                print("*************************************************** it is not arrraaaaaay");
                argCount++;
            }
        }
        try{
            $receiverString = putReceiver($name.text,types);
        }catch(ItemAlreadyExistsException e){
            System.err.println("Line:" +Integer.toString($name.getLine()) +"-----Exception--------:duplicate receiver name");
            SymbolTable.hasError = true;
            $receiverString = putTempReciver($name.text, types);
        }
        SymbolTable.addActorReceiverPair(new ActorReceiverPair($actorName, $receiverString, argCount));
    }
	 ')' ('\n')+

;


argumentDef returns [List<Variable> args = new ArrayList<>()]:
	{//print("argumentDef");
	}

	(t = type name = Id {
    Variable v = new Variable($name.text, $t.dataType);
	$args.add(v);
	}
	',')* t2 = type name2 = Id {
    Variable v2 = new Variable($name2.text, $t2.dataType);
	$args.add(v2);

	} |
;

receiverBodyStatement:
	{//print("receiverBodyStatement");
	}
	statement[0]('\n')+
;

statement[int forEachDepth] :
	{//print("statement");
	}
//	{print("--------------------------forEachDepth = " + Integer.toString($forEachDepth));}
	scopeStatement[$forEachDepth] | sendStatement | ifStatement[$forEachDepth]| forEachStatement[$forEachDepth]| quitStatement | breakStatement[$forEachDepth] | writeStatement | expression | dataDef[false]
;

scopeStatement[int forEachDepth]:
	{//print("scopeStatement");
	}
	'begin' (('\n')+) {beginScope();}(statement[$forEachDepth](('\n')+))* {endScope();}'end'
;

breakStatement[int forEachDepth] :
	{//print("break");
	}
	b = 'break'
    {if ($forEachDepth<=0) /*throw InvalidBreakException*/
        print("Line:" +Integer.toString($b.getLine()) +"---------Invalid Break");
        SymbolTable.hasError = true;
    }

;

writeStatement :
	{//print("writeStatement");
	}
	'write' '(' expression')'
;

expression :
	{//print("expression");
	}
	assignmentExpression
;

assignmentExpression :
	{//print("assignmentExpression");
	}
	orExpression assignmentExpressionTmp
;

assignmentExpressionTmp:
	op='='{//print("assignmentExpressionTmp : " + $op.text);
	}
	  orExpression assignmentExpressionTmp |

;

orExpression :
	{//print("orExpression");
	}
	andExpression orExpressionTmp
;

orExpressionTmp :

	op='or'{//print("orExpressionTmp : " + $op.text);
	} andExpression orExpressionTmp
	|
;

andExpression :
	{//print("andExpression");
	}
	equalityCmpExpression andExpressionTmp
;

andExpressionTmp :
	op='and' {//print("addExpressionTmp : " + $op.text);
	} equalityCmpExpression andExpressionTmp |
;

equalityCmpExpression :
	{//print("equalityCmpExpression");
	}
	comparisonExpression equalityCmpExpressionTmp
;

equalityCmpExpressionTmp :

	op=('=='|'<>')  {//print("equalityCmpExpressionTmp : "+ $op.text);
	} comparisonExpression equalityCmpExpressionTmp |
;

comparisonExpression :
	{//print("comparisonExpression");
	}
	addExpression comparisonExpressionTmp
;

comparisonExpressionTmp :

	op=('<'|'>'){//print("comparisonExpressionTmp : " + $op.text);
	} addExpression comparisonExpressionTmp |
;

addExpression :
	{//print("addExpression");
	}
	multExpression addExpressionTmp
;

addExpressionTmp:
	op=('+'|'-') {//print("addExpressionTmp : " + $op.text);
	} multExpression addExpressionTmp |
;


multExpression:
	{//print("multExpression");
	}
	notExpression multExpressionTmp
;

multExpressionTmp:
	op=('*'|'/') {//print("multExpressionTmp : " + $op.text);
	} notExpression multExpressionTmp |
;

notExpression:
	{//print("notExpression");
	}
	notExpressionTmp arrayAccessExpression
;

notExpressionTmp:
	{//print("notExpressionTmp : " + '-');
	} op='-' notExpressionTmp  | 'not' notExpressionTmp |
;

arrayAccessExpression :
	{//print("arrayAccessExpression");
	}
	otherExpression arrayAccessExpressionTmp
;

arrayAccessExpressionTmp:
		{//print("arrayAccessExpressionTmp : []");
		}
		'['expression arrayAccessExpressionTmp']'arrayAccessExpressionTmp
    |
;

otherExpression    :
    (
    functionCall {//print("otherExpression functionCall" );
    }
    |   CONST_INT {//print("otherExpression CONST_INT" );
    }
    |	CONST_STRING {//print("otherExpression CONST_STRING" );
    }
    |	CONST_CHAR {//print("otherExpression CONST_CHAR" );
    }
    |   Id {//print("otherExpression Id" );
    }
    |   '{' expression (',' expression)* '}'
    |  {//print("otherExpression : ()");
    } '(' expression ')'
    )
    ;

quitStatement :
	{//print("quit");
	}
	'quit'
;


sendStatement :
	{//print("sendStatement");
	}
	('sender'|'self'|Id)'<<' functionCall
;

functionCall:
	{//print("functionCall");
	}
	Id'('arguments')'|'read''('CONST_INT')'
;

arguments :
	{//print("arguments");
	}
	(argument',')* argument|
;

argument:
	{//print("argument");
	}
	expression |
;

ifStatement[int forEachDepth]:
	{//print("ifStatement");
	}
	'if' {beginScope();} expression ('\n')+ (statement[$forEachDepth](('\n')+))*  {endScope();} elseIfelse[$forEachDepth] 'end'
;

elseIfelse[int forEachDepth]:
	{//print("elseIfelse");
	}
	(elseIf[$forEachDepth])* (elseStatement[$forEachDepth])
;
forEachStatement[int forEachDepth]:
	{//print("forEachStatement");
	}
	'foreach' id =Id 'in' expression ('\n')+
	{beginScope();}
	{
	    try{
                putLocalVar($id.text, NoType.getInstance());
            }catch(ItemAlreadyExistsException e) {
                 System.err.println("-----Exception--------:duplicate variable name");
            }
	}
	{$forEachDepth++;}
	{beginScope();}
    (statement[$forEachDepth](('\n')+))*{endScope();} {endScope();}'end' {$forEachDepth--;}
;

elseIf[int forEachDepth]:
	{//print("elseIf");
	}
	'elseif'{beginScope();} expression ('\n')+ (statement[$forEachDepth](('\n')+))* {endScope();}

;

elseStatement[int forEachDepth]:
	{//print("elseStatement");
	}
	'else' ('\n')+ {beginScope();} (statement[$forEachDepth](('\n')+))* {endScope();}|
;

COMMENT:
	('#'~('\n')*) -> skip
;

CONST_INT:
        [0-9]+
;

CONST_STRING:
	["] ~('"')* ["]
;

CONST_CHAR:
	['] ~('\'') [']
;

Id:
        [a-zA-Z_][a-zA-Z0-9_]*
;

WS:
        [ \r\t]+ -> skip
;
