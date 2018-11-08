grammar g2;

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

    Type typeCheck(Type firstOperandType, Type secondOperandType, String operator, boolean lambda) {
        //print("^^^^ in type check ^^^^^");
        if (lambda)
        {
            //print("lambda ---> returning first type : "+ firstOperandType.toString());
            return firstOperandType;
        }
        //print("firstOpernadType:"+firstOperandType.toString());
        //print("secondOperandType:"+secondOperandType.toString());
        //print("operator:"+operator);
        if (operator == "="){
            if (firstOperandType.equals(secondOperandType)) {
                //print("assign operator with correct types");
                return firstOperandType;
            }
            else if(firstOperandType.equals(NoType.getInstance())){
                //print("assign operator with no type returning "+ secondOperandType.toString());
                return secondOperandType;
            }
            else if(secondOperandType.equals(NoType.getInstance())){
                //print("assign operator with no type returning "+ firstOperandType.toString());
                return firstOperandType;
            }else{
                print("%%%%%%%%%%%%%%conflinct in operand types%%%%%%%%%%%%%");
                //print("returning notype");
                return NoType.getInstance();
            }
        }
        else if(operator == "==" || operator == "<>") {
            if (firstOperandType.equals(secondOperandType)) {
                //print("equlity operator with correct types");
                return firstOperandType;

            }
            else if(firstOperandType.equals(NoType.getInstance())){
                //print("equality operator with no type returning "+ secondOperandType.toString());
                return secondOperandType;
            }
            else if(secondOperandType.equals(NoType.getInstance())){
                //print("equality operator with no type returning "+ firstOperandType.toString());
                return firstOperandType;
            }else{
                print("%%%%%%%%%%%%%%conflinct in operand types%%%%%%%%%%%%%");
                //print("returning notype");
                return NoType.getInstance();
            }
        } else {
            if (firstOperandType.equals(IntType.getInstance())) {
                if ((secondOperandType.equals(IntType.getInstance())) || (secondOperandType.equals(NoType.getInstance()))) {
                    //print("other operator - correct - returning int type");
                    return IntType.getInstance();
                }
                else{
                    print("%%%%%%%%%%%%%%conflinct in operand types%%%%%%%%%%%%%");
                    //print("returning notype");
                    return NoType.getInstance();
                }
            }
            if (secondOperandType.equals(IntType.getInstance())) {
                if ((firstOperandType.equals(IntType.getInstance())) || (firstOperandType.equals(NoType.getInstance()))) {
                    //print("other operator - correct - returning int type");
                    return IntType.getInstance();
                }
                else{
                    print("%%%%%%%%%%%%%%%conflict in operands%%%%%%%%%%%%%%%%");
                    //print("returning notype");
                    return NoType.getInstance();
                }
            }
            else{
                if(!(firstOperandType.equals(NoType.getInstance()) && secondOperandType.equals(NoType.getInstance()) ))
                    print("%%%%%%%%%%%%%%%conflict in operands%%%%%%%%%%%%%%%%");
                //print("returning notype");
                return NoType.getInstance();
            }
        }

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
            SymbolTable.resultString += "--newScope-pass2--"+'\n';
        	SymbolTable.push();
    }

    void endScope() {
        //print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
        SymbolTable.pop();
    }

    void printSymbolTableTop(){
    print("printing symbol table");
    SymbolTable.top.print();}
}
//TODO: Scopes must be checked with the project Desc

program returns [boolean synHasActor]:
    {
       print("Pass2 started -------------------------");
       beginScope();
    }
    {$synHasActor = false;}
	(a = actor {if($a.synActorExists){$synHasActor = true;}}| '\n')*
    {
        endScope();
        print("Pass2 finished -------------------------");
    }
;

actor returns [boolean synActorExists]:
  ad = actorDef {beginScope();} (actorBodyStatement[$ad.actorName])* 'end'{endScope();}('\n'|EOF)
  {$synActorExists = true;}
;

actorDef returns [String actorName]:
	'actor'name=Id {$actorName = $name.text;}'<'CONST_INT'>'('\n')+
;


actorBodyStatement[String actorName]:
	(dataDef[true]('\n')+ | receiver[$actorName])
;

type returns [Type dataType]:
	(array = arrayType {$dataType = $array.dataArrayType;}| variable = varType {$dataType = $variable.dataVariableType;})
;


arrayType returns [Type dataArrayType]:
	v = varType {$dataArrayType = $v.dataVariableType;}
	('['CONST_INT']'
        {$dataArrayType = new ArrayType($CONST_INT.int,$dataArrayType);}
	)+
;

varType returns [Type dataVariableType]:
	'int'{$dataVariableType = IntType.getInstance();}| 'char'{$dataVariableType = CharType.getInstance();}
;
//TODO : bug in phase2 : global variables defined in groups : only first one will be considered global
dataDef [boolean isGlobal] returns [Type dataType]:
    //RValue
    t = type
    {$dataType = $t.dataType;}
    name = Id
    ('=' ex = expression
        {
            if($isGlobal)
                print ($name.line + ")  globals can not be assigned in definition");

            Type firstOperandType =  $t.dataType;
            Type secondOperandType = $ex.expressionType;
            typeCheck(firstOperandType, secondOperandType, "=", false);

        }


    )?

    {if(!$isGlobal){SymbolTable.define();}}

    (','name2 =Id
        {
        if(!$isGlobal){SymbolTable.define();
        }
    }

    ('=' ex2  = expression
        {
            if($isGlobal)
                print ($name2.line + ")  globals can not be assigned in definition");

            Type firstOperandType = $t.dataType;
            Type secondOperandType = $ex2.expressionType;
            typeCheck(firstOperandType, secondOperandType, "=", false);
        }

    )?)*
;

receiver[String actorName]:
	recDef = receiverDef
	{beginScope();}(receiverBodyStatement[$actorName, $recDef.isInitNoArg])* {endScope();} 'end' ('\n')+
;

receiverDef returns [List<Variable> receiverArgs, boolean isInitNoArg]:
	'receiver' (name = Id {$isInitNoArg = false;}| 'init' {$isInitNoArg = true;})


	'('  argumentDefVars = argumentDef
	 {$receiverArgs = $argumentDefVars.args;}
	 //{print("receiverDef : previsInitNoArg = " + $isInitNoArg + "$argumentDefVars.hasArg = " + $argumentDefVars.hasArg );}
	 {$isInitNoArg = $isInitNoArg && !$argumentDefVars.hasArg;}
	 ')' ('\n')+

	 //{print("receiverDef : isInitNoArg = " + $isInitNoArg);}



;


argumentDef returns [List<Variable> args = new ArrayList<>(), boolean hasArg]:
	(t = type name = Id {
    Variable v = new Variable($name.text, $t.dataType);
	$args.add(v);
	SymbolTable.define();
	}
	',')* t2 = type name2 = Id {
    Variable v2 = new Variable($name2.text, $t2.dataType);
	$args.add(v2);
	SymbolTable.define();
	$hasArg = true;
	} |
	{$hasArg = false;}
;

receiverBodyStatement[String actorName, boolean cantSend]:
	statement[0, $actorName, $cantSend]('\n')+
;

statement[int forEachDepth,String actorName, boolean cantSend] :
//	{print("--------------------------forEachDepth = " + Integer.toString($forEachDepth));}

	scopeStatement[$forEachDepth,$actorName, $cantSend] |sendStatement[$actorName, $cantSend] | ifStatement[$forEachDepth, $actorName, $cantSend]| forEachStatement[$forEachDepth, $actorName, $cantSend]| quitStatement | breakStatement[$forEachDepth] | writeStatement | expression | dataDef[false]
;

scopeStatement[int forEachDepth, String actorName, boolean cantSend]:
	'begin' (('\n')+) {beginScope();}(statement[$forEachDepth, $actorName, $cantSend](('\n')+))* {endScope();}'end'
;

breakStatement[int forEachDepth] :
	b = 'break'
;

writeStatement :
	w = 'write' '('ex = expression')'
	{
	    if
	    (!
            (
                ($ex.expressionType.equals(IntType.getInstance()))
                ||
                ($ex.expressionType.equals(CharType.getInstance()))
                ||
                (
                $ex.expressionType instanceof ArrayType &&
                ((ArrayType)$ex.expressionType).getType().equals(CharType.getInstance())
                )
            )
        )
	    {
	        print($w.line+") write only accepts int / char / charArray but argument is of type "+$ex.expressionType.toString());
	    }
	}
;

expression returns [boolean isLValue, Type expressionType] :
	ae=assignmentExpression {$isLValue = $ae.isLValue;}
	{$expressionType = $ae.assignmentExpressionType;}
;

assignmentExpression returns [boolean isLValue, Type assignmentExpressionType]:

	oe=orExpression[true] aet=assignmentExpressionTmp[$oe.isLValue]
	{
	    Type firstOperandType = $oe.orExpressionType;
        Type secondOperandType = $aet.assignmentExpressionTmpType;
        if($aet.hasValue){
            $assignmentExpressionType = typeCheck(firstOperandType, secondOperandType, "=", !$aet.hasValue);
        }
        else{
            $assignmentExpressionType = firstOperandType;
        }
	}
	{$isLValue = $oe.isLValue  && !$aet.hasValue;}
;
//warning
assignmentExpressionTmp[boolean leftOperandLValue] returns[Type assignmentExpressionTmpType, boolean hasValue]:
	op='=' oe=orExpression[true] aet=assignmentExpressionTmp[$oe.isLValue]
	{
	    Type firstOperandType = $oe.orExpressionType;
	    Type secondOperandType = $aet.assignmentExpressionTmpType;
	    String operator = $op.text;
	    $assignmentExpressionTmpType = typeCheck(firstOperandType, secondOperandType, "=", !$aet.hasValue);
	    $hasValue = true;
	    //print ("aet.hasValue : " + $aet.hasValue);
	    //print ("oe.isLValue : " + $oe.isLValue);
        {
            if(!$leftOperandLValue)
                print($op.line + ") LValue Error");
        }
	}
	|
	{
	    $hasValue = false;
	    $assignmentExpressionTmpType = NoType.getInstance();
	}


;

orExpression [boolean isLeft] returns [Type orExpressionType, boolean isLValue]:
	ae=andExpression[$isLeft] oet=orExpressionTmp
	{
    	    Type firstOperandType = $ae.andExpressionType;
    	    Type secondOperandType = $oet.orExpressionTmpType;
    	    if($oet.hasValue){
    	        $orExpressionType = typeCheck(firstOperandType, secondOperandType, "or", !$oet.hasValue);
    	    }
    	    else{
    	        $orExpressionType = firstOperandType;
    	    }
    }
    {
        //print ("oet.hasValue : " + $oet.hasValue);
        //print ("ae.isLValue : " + $ae.isLValue);
        $isLValue = $ae.isLValue && !$oet.hasValue;
    }
;

orExpressionTmp returns[Type orExpressionTmpType, boolean hasValue]:
	op='or' ae = andExpression[false] oet = orExpressionTmp
	{
	    Type firstOperandType = $ae.andExpressionType;
	    Type secondOperandType = $oet.orExpressionTmpType;
	    $hasValue = true;
	    String operator = $op.text;
	    $orExpressionTmpType = typeCheck(firstOperandType, secondOperandType, "or", !$oet.hasValue);
	}
	|
	{
	    $hasValue = false;
	    $orExpressionTmpType = NoType.getInstance();
	}
;

andExpression [boolean isLeft] returns [Type andExpressionType, boolean isLValue]:
	ece = equalityCmpExpression[$isLeft] aet = andExpressionTmp
	{
	    Type firstOperandType = $ece.equalityCmpExpressionType;
        Type secondOperandType = $aet.andExpressionTmpType;
        if($aet.hasValue){
            $andExpressionType = typeCheck(firstOperandType, secondOperandType, "and",!$aet.hasValue );
        }
        else{
            $andExpressionType = firstOperandType;
        }
	}
	{$isLValue = $ece.isLValue && !$aet.hasValue;}
;

andExpressionTmp returns [Type andExpressionTmpType, boolean hasValue]:
	op='and'  ece = equalityCmpExpression[false] aet = andExpressionTmp
	{
	     Type firstOperandType = $ece.equalityCmpExpressionType;
	     Type secondOperandType = $aet.andExpressionTmpType;
	     $hasValue = true;
	     String operator = $op.text;
	     $andExpressionTmpType = typeCheck(firstOperandType, secondOperandType, "and", !$aet.hasValue);
	}
	|
	{
	    $hasValue = false;
	    $andExpressionTmpType = NoType.getInstance();
	}
;

equalityCmpExpression [boolean isLeft] returns[Type equalityCmpExpressionType, boolean isLValue]:
	ce = comparisonExpression[$isLeft] ecet =equalityCmpExpressionTmp
	{
	    Type firstOperandType = $ce.comparisonExpressionType;
        Type secondOperandType = $ecet.equalityCmpExpressionTmpType;
        if($ecet.hasValue){
            $equalityCmpExpressionType = typeCheck(firstOperandType, secondOperandType, "==", !$ecet.hasValue);
            if (!$equalityCmpExpressionType.equals(NoType.getInstance())){
                $equalityCmpExpressionType = IntType.getInstance();
                print("equality check -- casting return type to int");
            }
        }
        else{
            $equalityCmpExpressionType = firstOperandType;
        }
	}
	{$isLValue = $ce.isLValue && !$ecet.hasValue;}
;

equalityCmpExpressionTmp returns [Type equalityCmpExpressionTmpType, boolean hasValue]:
	op=('=='|'<>')  {//print("equalityCmpExpressionTmp : "+ $op.text);
	} ce = comparisonExpression[false] ect = equalityCmpExpressionTmp
	{
	    Type firstOperandType = $ce.comparisonExpressionType;
        Type secondOperandType = $ect.equalityCmpExpressionTmpType;
        String operator = $op.text;
        $equalityCmpExpressionTmpType = typeCheck(firstOperandType, secondOperandType, "==", !$ect.hasValue);
        $hasValue = true;
	}
	|
	{
	    $hasValue = false;
	    $equalityCmpExpressionTmpType = NoType.getInstance();
	}
;

comparisonExpression[boolean isLeft] returns [Type comparisonExpressionType, boolean isLValue]:
	ae = addExpression[isLeft] cet =comparisonExpressionTmp
     {
        Type firstOperandType = $ae.addExpressionType;
        Type secondOperandType = $cet.comparisonExpressionTmpType;
        if($cet.hasValue){
            $comparisonExpressionType = typeCheck(firstOperandType, secondOperandType, "<", !$cet.hasValue);
        }
        else{
            $comparisonExpressionType = firstOperandType;
        }
     }
     {$isLValue = $ae.isLValue && !$cet.hasValue;}
;

comparisonExpressionTmp returns [Type comparisonExpressionTmpType, boolean hasValue]:
	op=('<'|'>')
	ae = addExpression[false] cet = comparisonExpressionTmp
	 {
	    Type firstOperandType = $ae.addExpressionType;
        Type secondOperandType = $cet.comparisonExpressionTmpType;
        String operator = $op.text;
        $comparisonExpressionTmpType = typeCheck(firstOperandType, secondOperandType, "<", !$cet.hasValue);
        $hasValue = true;
	 }
	 |
	 {
	    $comparisonExpressionTmpType = NoType.getInstance();
	    $hasValue = false;
	 }
;

addExpression[boolean isLeft] returns [Type addExpressionType, boolean isLValue] :
	me = multExpression[$isLeft] aet =addExpressionTmp
	{
	    Type firstOperandType = $me.multExpressionType;
        Type secondOperandType =  $aet.addExpressionTmpType;
        if($aet.hasValue){
            $addExpressionType = typeCheck(firstOperandType, secondOperandType, "+", !$aet.hasValue);
        }
        else{
            $addExpressionType = firstOperandType;
        }
	}
	{$isLValue = $me.isLValue && !$aet.hasValue;}
;

addExpressionTmp returns [Type addExpressionTmpType, boolean hasValue]:
	op=('+'|'-')
	me = multExpression[false] aet = addExpressionTmp
	{
	    Type firstOperandType = $me.multExpressionType;
        Type secondOperandType =  $aet.addExpressionTmpType;
        String operator = $op.text;
        $addExpressionTmpType = typeCheck(firstOperandType, secondOperandType, "+", !$aet.hasValue);
        $hasValue = true;
	}
	|
	{
	    $addExpressionTmpType = NoType.getInstance();
	    $hasValue = false;
	}
;


multExpression[boolean isLeft] returns[Type multExpressionType, boolean isLValue]:
	ne = notExpression[$isLeft] met = multExpressionTmp
	{
	   Type firstOperandType = $ne.notExpressionType;
	   Type secondOperandType =  $met.multExpressionTmpType;
	   if($met.hasValue){
	        $multExpressionType = typeCheck(firstOperandType, secondOperandType, "*", !$met.hasValue);
	   }
	   else{
	        $multExpressionType = firstOperandType;
	   }
    }
    {$isLValue = $ne.isLValue && !$met.hasValue;}
;

multExpressionTmp returns[Type multExpressionTmpType, boolean hasValue]:
	op=('*'|'/') {//print("multExpressionTmp : " + $op.text);
	} ne = notExpression[false] met = multExpressionTmp
	{
	        Type firstOperandType = $ne.notExpressionType;
            Type secondOperandType = $met.multExpressionTmpType;
            String operator = $op.text;
            $multExpressionTmpType = typeCheck(firstOperandType, secondOperandType, "*", !$met.hasValue);
            $hasValue = true;
	}
	|
	{
	    $hasValue = false;
	    $multExpressionTmpType = NoType.getInstance();
	}
;

notExpression[boolean isLeft] returns[Type notExpressionType, boolean isLValue]:
	net = notExpressionTmp
	aae=arrayAccessExpression[$isLeft]
	{
	    if($net.hasNot){
	        if(!($aae.arrayAccessExpressionType.equals(IntType.getInstance()))){
	            print("-----------------------------not operand should be Integer");
	            $notExpressionType = NoType.getInstance();
	        }
	        else{
	            $notExpressionType = $aae.arrayAccessExpressionType;
	        }
	    }
	    else{
	        $notExpressionType = $aae.arrayAccessExpressionType;
	    }
	}
	{$isLValue = $aae.isLValue && !$net.hasValue;}
    //{print("================== in not expression-- " + $aae.arrayAccessExpressionType.toString());}
    //{print("================== in not expression-- " + $aae.arrayAccessExpressionType.toString());}



//	{if ($net.isBoolean && $aae.arrayAccessExpressionType)
//	   }
;

notExpressionTmp returns [boolean hasNot,boolean isBoolean, boolean hasValue]:
	 op='-' notExpressionTmp {$hasNot = true;$isBoolean = false; $hasValue = true;}| 'not' notExpressionTmp {$hasNot = true;$isBoolean = true; $hasValue = true;}
	 |{$hasNot = false;$hasValue = false;}
;
//array access  no influence on lvalue
arrayAccessExpression[boolean isLeft] returns [Type arrayAccessExpressionType, boolean isLValue]:
	{//print("arrayAccessExpression");
}
	oe =  otherExpression[$isLeft] aaet = arrayAccessExpressionTmp[$oe.otherExpressionType]
    {
	  $arrayAccessExpressionType = $aaet.afterAccessType;
	  $isLValue = $oe.isLValue;

	}
;

arrayAccessExpressionTmp [Type beforeAccessType] returns [Type afterAccessType]:
		'['e = expression ']' aet = arrayAccessExpressionTmp[((ArrayType)$beforeAccessType).getType()]
		{$afterAccessType = $aet.afterAccessType;}
    |
        {$afterAccessType = $beforeAccessType;}
;

otherExpression [boolean isLeft] returns [Type otherExpressionType, boolean isLValue]:
    (
    fc = functionCall {/* TODO : add expression type for functioncall*/}
    {
        $otherExpressionType = new ArrayType($fc.readSize, CharType.getInstance());
    }
    |   CONST_INT { $otherExpressionType = IntType.getInstance();
        print("otherExpression CONST_INT: " + $CONST_INT.text + " ---- " + $otherExpressionType.toString() );
        $isLValue = false;}
    |	CONST_STRING {
        int stringSize = ($CONST_STRING.text.length()) - 2;
        $otherExpressionType = new ArrayType(stringSize, CharType.getInstance());
        print("otherExpression CONST_STRING: " + $CONST_STRING.text + " ---- " + $otherExpressionType.toString() );
        $isLValue = false;}
    |	CONST_CHAR { $otherExpressionType = CharType.getInstance();
        print("otherExpression CONST_CHAR: " + $CONST_CHAR.text + " ---- " + $otherExpressionType.toString() );
        $isLValue = false;}
    |   id = Id
    {
         SymbolTableItem item = SymbolTable.top.get($id.text);
         if(item == null) {
             print($id.line + ") Item " + $id.text + " doesnt exist.");
             $otherExpressionType = NoType.getInstance();
         }
         else {
             SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
            // print($id.line + ") Variable " + $id.text + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
             $otherExpressionType = var.getVariable().getType();
         }
         $isLValue = true;
    }
    {print("otherExpression Id: " + $id.text + " ---- " + $otherExpressionType.toString());}
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


sendStatement[String actorName, boolean cantSend] returns [boolean isSelf, boolean isSender]:
	{//print("sendStatement");
	}
	(se='sender'
	{
	    //print ("00000 in sendStatement , sender , cantSend = " + $cantSend);
	    $isSender = true; $isSelf = false;
	    if ($cantSend)
	        print ($se.line + ") init has no args cant use send");

	}
	|
	self = 'self'{$isSelf = true; $isSender=false;}|
	id = Id {
	   $isSender = false;
	   $isSelf = false;
       SymbolTableItem item = SymbolTable.top.get($id.text);
       if(item == null || !(item instanceof SymbolTableActorItem)){
            print($id.line +") #### actor with name "+$id.text+" not found for send statement ####");
       }
	}
	)'<<' fc = functionCall
	{
	    if(!$isSender){
            String receiverActorName;
            int lineNum;
            if($isSelf){
                receiverActorName = $actorName;
                lineNum = $self.line;
            }
            else{
                receiverActorName = $id.text;
                lineNum = $id.line;

            }
            SymbolTableItem item = SymbolTable.top.get(receiverActorName);
            if(item != null && item instanceof SymbolTableActorItem){
                 SymbolTableActorItem actorItem = (SymbolTableActorItem) item;
                 if(!actorItem.hasReceiver($fc.receiverSign)){
                        print(lineNum +") receiver "+$fc.receiverSign+" not found for actor "+receiverActorName);
                 }
            }
        }
	}

;

functionCall returns[String receiverSign, boolean isRead, int readSize]:
	id =Id {$receiverSign = $id.text + "(";}'('ar = arguments  {$receiverSign += $ar.argumentsTypeString +")";}')'{$isRead = false; $readSize = 0;}|'read''('CONST_INT')'{$isRead = true; $readSize = $CONST_INT.int;}
;

arguments returns [String argumentsTypeString = ""]:
	{//print("arguments");
	}
	(a1=argument','{$argumentsTypeString += ($a1.argumentTypeString + " ");})* a2 = argument{$argumentsTypeString += ($a2.argumentTypeString + " ");}| {$argumentsTypeString += " ";}

;

argument returns [String argumentTypeString]:
	{//print("argument");
	}
	e = expression {$argumentTypeString = ($e.expressionType).toString();}| {$argumentTypeString = "";}
;

ifStatement[int forEachDepth, String actorName, boolean cantSend]:
	{//print("ifStatement");
	}
	i = 'if' {beginScope();} ex = expression
	{
	        if(!$ex.expressionType.equals(IntType.getInstance())){
	            print($i.line +") error in if expression: type should be int but it is "+$ex.expressionType.toString());
	        }
	}
	('\n')+ (statement[$forEachDepth, $actorName, $cantSend](('\n')+))*  {endScope();} elseIfelse[$forEachDepth, $actorName, $cantSend] 'end'
;

elseIfelse[int forEachDepth, String actorName, boolean cantSend]:
	(elseIf[$forEachDepth, $actorName, $cantSend])* (elseStatement[$forEachDepth, $actorName, $cantSend])
;
forEachStatement[int forEachDepth, String actorName, boolean cantSend]:
	'foreach' id = Id 'in' ex = expression ('\n')+
	{beginScope();}
    {
        if(!($ex.expressionType instanceof ArrayType)){
            print($id.line+") foreach statement should have arrayType");
            //with no type put in pass1
            SymbolTable.define();
        }
        else{
            SymbolTable.top.changeType($id.text,((ArrayType)$ex.expressionType).getType());
            SymbolTable.define();
        }

    printSymbolTableTop();
    }
	{$forEachDepth++;}
    (statement[$forEachDepth, $actorName, $cantSend](('\n')+))* {endScope();}'end' {$forEachDepth--;}
;

elseIf[int forEachDepth, String actorName, boolean cantSend]:
	'elseif'{beginScope();} expression ('\n')+ (statement[$forEachDepth, $actorName, $cantSend](('\n')+))* {endScope();}

;

elseStatement[int forEachDepth, String actorName, boolean cantSend]:
	'else' ('\n')+ {beginScope();} (statement[$forEachDepth, $actorName, $cantSend](('\n')+))* {endScope();}|
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
