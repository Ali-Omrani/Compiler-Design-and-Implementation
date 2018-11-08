grammar g;

@header{
    import java.util.List;
}

@members{


    void print(String str){
        System.out.println(str);
    }

    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableLocalVariableItem(
                new Variable(name,type),
                SymbolTable.top.getOffset(Register.SP)
            )
        );
    }

    void putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableGlobalVariableItem(
                new Variable(name,type),
                SymbolTable.top.getOffset(Register.GP)
            )
        );
    }

    void beginScope() {
        	int offset = 0;
        	if(SymbolTable.top != null){
            	offset = SymbolTable.top.getOffset(Register.SP);
            }
            SymbolTable.push(new SymbolTable(SymbolTable.top));
            SymbolTable.top.setOffset(Register.GP, SymbolTable.getGlobalOffset());
            SymbolTable.top.setOffset(Register.SP, offset);
    }

    void endScope() {
        print("Stack global offset: " + SymbolTable.top.getOffset(Register.GP));
        print("Stack local offset: " + SymbolTable.top.getOffset(Register.SP));
        {printSymbolTableTop();}
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


    void putReceiver(String name, List<Type> arguments) throws ItemAlreadyExistsException{
        SymbolTable.top.put(
            new SymbolTableFunctionObject(
                arguments,
                name
            )
        );
    }

    void putTempReciver(String name, List<Type> arguments){
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
            putReceiver(newName, arguments);
        }catch(ItemAlreadyExistsException e) {
             System.err.println("-----Exception--------:duplicate actor name");
        }
    }

    void printSymbolTableTop(){
    print("printing symbol table");
    SymbolTable.top.print();}
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
;

actor returns [boolean synActorExists]:
  {//print("actor");
  }
  actorDef {beginScope();} (actorBodyStatement)* 'end'{endScope();}('\n'|EOF)
  {$synActorExists = true;}
;

actorDef:
	'actor'name=Id'<'CONST_INT'>'('\n')+
	{
	    int actorBufferLength = $CONST_INT.int;
        if (actorBufferLength<=0){
            print( "Line:" +Integer.toString($name.getLine()) +"  +++++++++++++++Zero Or Negative Length in actor buffer length+++++++++++++++" );
            actorBufferLength = 0;
        }
        try{
            putLocalVar($name.text, new ActorType(actorBufferLength));
        }
        catch(ItemAlreadyExistsException e) {
            System.err.println( "Line:" +Integer.toString($name.getLine()) + "-----Exception--------:duplicate actor name");
            putTemp($name.text, new ActorType(actorBufferLength));
        }
	}
	{//print("actorDef : " + $name.text);
	}
;

actorBodyStatement:
  {//print("actorBodyStatement");
  }
	(dataDef[true]('\n')+ | receiver)
;

type returns [Type dataType]:
	(array = arrayType {$dataType = $array.dataArrayType;}| variable = varType {$dataType = $variable.dataVariableType;}) {//print("type");
	}
;


//TODO : check if it is really column major
arrayType returns [Type dataArrayType]:
	v = varType {$dataArrayType = $v.dataVariableType;}
	('['CONST_INT']'
	//TODO :throw NegativeLengthException
	{if($CONST_INT.int<=0){
	    print("Line:" + Integer.toString($CONST_INT.getLine())+"  +++++++++++++++Zero Or Negative Length in array def+++++++++++++++");
	    {$dataArrayType = new ArrayType(0,$dataArrayType);}
    }else
        {$dataArrayType = new ArrayType($CONST_INT.int,$dataArrayType);}
	}


	)+ {//print("arrayType");
	}
;

//TODO : add type_str for print
varType returns [Type dataVariableType]:
	'int'{$dataVariableType = IntType.getInstance();}| 'char'{$dataVariableType = CharType.getInstance();} //{print("varType : "+ $type_str.text);}
;

dataDef [boolean isGlobal] returns [Type dataType]:
    {//print("dataDef");
    }

    t = type {$dataType = $t.dataType;} name = Id
    {System.out.println($name.text+" variable is "+((isGlobal)?"global":"local"));}
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
            putTemp($name2.text, $dataType);
        }
    }
    ('=' expression)?)*
;

receiver:
	{//print("receiver");
	}
	//TODO: Add line of error
	recDef = receiverDef
	{beginScope();
	for(Variable var: $recDef.receiverArgs){
	    try{
	        putLocalVar(var.getName(), var.getType());
	    }catch(ItemAlreadyExistsException e){
	        System.err.println("-----Exception--------:duplicate variable name");
	        putTemp(var.getName(), var.getType());
	    }
	}}(receiverBodyStatement)* {endScope();} 'end' ('\n')+
;

receiverDef returns [List<Variable> receiverArgs]:
	'receiver' name = Id {//print("receiverDef : " + $name.text);
	}
	'('  argumentDefVars = argumentDef
	 {
	    $receiverArgs = $argumentDefVars.args;
        List<Type> types= new ArrayList<Type>();
        List<Variable> argRes = $argumentDefVars.args;
        print(Integer.toString(argRes.size()));
        for (Variable var : argRes){
            types.add(var.getType());
        }
        try{
            putReceiver($name.text,types);
        }catch(ItemAlreadyExistsException e){
            System.err.println("Line:" +Integer.toString($name.getLine()) +"-----Exception--------:duplicate receiver name");
            putTempReciver($name.text, types);
        }
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
	for (Variable var : $args
            			 ) {
            			print(var.toString());
            		}
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
	{print("--------------------------forEachDepth = " + Integer.toString($forEachDepth));}
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
    }

;

writeStatement :
	{//print("writeStatement");
	}
	'write' '('arguments')'
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
	'foreach' Id 'in' expression ('\n')+
	{beginScope();}
	{$forEachDepth++;}
    (statement[$forEachDepth](('\n')+))* {endScope();}'end' {$forEachDepth--;}
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
