grammar g2;

@header{
    import java.util.List;
}

@members{

    Translator mips = new Translator();

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

//    void beginScope() {
//        SymbolTable.resultString += "--newScope-pass2--"+'\n';
//        SymbolTable.push();
//        mips.beginScope();
//    }
//
//    void beginReceiverScope(){
//            SymbolTable.resultString += "--newScope-pass2--"+'\n';
//            SymbolTable.push();
//    }

    void beginScope() {
        SymbolTable.resultString += "--newScope-pass2--"+'\n';
        SymbolTable.push();
        mips.beginScope(SymbolTable.top.firstOffset);
    }

    void endScope() {
        //print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
        SymbolTable.pop();
        mips.endScope();
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
        mips.generateMainInstructions();
        mips.putInitMessages();
        mips.generateActorCodes();
        mips.generateErrorInstructions();
        mips.makeOutput();
    }
;

actor returns [boolean synActorExists]:
  ad = actorDef {beginScope();} (actorBodyStatement[$ad.actorName])* 'end'{endScope();}('\n'|EOF)
  {$synActorExists = true;}
;

actorDef returns [String actorName]:
	'actor'name=Id {$actorName = $name.text;}'<'CONST_INT'>'('\n')+
	{
	    mips.allocateActorBuffer($CONST_INT.int);
	    mips.allocateUnreadMessageSpaceForActorBuffer($actorName);
	}
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
dataDef [boolean isGlobal] returns [Type dataType , boolean hasExp1, boolean hasExp2]:
    //RValue
    t = type
    {$dataType = $t.dataType;}
    {$hasExp1 = false;}
    name = Id
    ('=' ex = expression
        {
            if($isGlobal){
                print ($name.line + ")  globals can not be assigned in definition");
            }
            Type firstOperandType =  $t.dataType;
            Type secondOperandType = $ex.expressionType;
            typeCheck(firstOperandType, secondOperandType, "=", false);
            $hasExp1 = true;
        }
    )?
    {
        if(!$hasExp1){
            if($isGlobal)
            {
                SymbolTableItem item = SymbolTable.top.get($name.text);
                if($t.dataType instanceof ArrayType){
                    int arrayOffset = ((SymbolTableVariableItemBase)item).getOffset();
                    Type arrayBaseType = ((ArrayType) $t.dataType).getBaseType();
                    mips.addCommentToInitInstructions("-------- addind global array "+ $name.text + "---------");
                    for(int i=0;i<(((ArrayType)$t.dataType).getElementCount());i++){
                        mips.addGlobalVariable(arrayOffset+(i*(arrayBaseType.size())),arrayBaseType.getDefaultValue());
                    }
                    mips.addCommentToInitInstructions("---------- end of addind global array "+ $name.text + "-------");

                }
                else{
                    mips.addGlobalVariable(((SymbolTableVariableItemBase)item).getOffset(), $t.dataType.getDefaultValue());
                }

            }
            else
            {
                if($t.dataType instanceof ArrayType){
                    mips.addCommentToInstructions("----------- adding local array "+$name.text+"--------------");
                    for(int i=0;i<(((ArrayType)$t.dataType).getElementCount());i++){
                        mips.addToStack(((ArrayType) $t.dataType).getBaseType().getDefaultValue());
                    }
                    mips.addCommentToInstructions("------------ end of adding local array "+$name.text+" --------------");
                }
                else{
                    mips.addToStack($t.dataType.getDefaultValue());
                }
            }
        }
    }

    {if(!$isGlobal){SymbolTable.define();}}

    (','name2 =Id
        {
        $hasExp2 = false;
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
            $hasExp2 = true;
        }

    )?
    {
            if(!$hasExp2){
                if($isGlobal)
                {
                    SymbolTableItem item = SymbolTable.top.get($name.text);
                    if($t.dataType instanceof ArrayType){
                        int arrayOffset = ((SymbolTableVariableItemBase)item).getOffset();
                        Type arrayBaseType = ((ArrayType) $t.dataType).getBaseType();
                        mips.addCommentToInitInstructions("-------- addind global array "+ $name.text + "---------");
                        for(int i=0;i<(((ArrayType)$t.dataType).getElementCount());i++){
                            mips.addGlobalVariable(arrayOffset+(i*(arrayBaseType.size())),arrayBaseType.getDefaultValue());
                        }
                        mips.addCommentToInitInstructions("---------- end of addind global array "+ $name.text + "-------");

                    }
                    else{
                        mips.addGlobalVariable(((SymbolTableVariableItemBase)item).getOffset(), $t.dataType.getDefaultValue());
                    }

                }
                else
                {
                    if($t.dataType instanceof ArrayType){
                        mips.addCommentToInstructions("----------- adding local array "+$name.text+"--------------");
                        for(int i=0;i<(((ArrayType)$t.dataType).getElementCount());i++){
                            mips.addToStack(((ArrayType) $t.dataType).getBaseType().getDefaultValue());
                        }
                        mips.addCommentToInstructions("------------ end of adding local array "+$name.text+" --------------");
                    }
                    else{
                        mips.addToStack($t.dataType.getDefaultValue());
                    }
                }
            }
        }

    )*
;
//uncomment
receiver[String actorName]:
	recDef = receiverDef[$actorName]
	{beginScope();}(receiverBodyStatement[$actorName, $recDef.isInitNoArg])* {endScope();} {mips.jumpToActorEnd($actorName);}'end' ('\n')+
;

receiverDef[String actorName] returns [List<Variable> receiverArgs, boolean isInitNoArg ,boolean isInit]:
	'receiver' (name = Id {$isInitNoArg = false; $isInit = false;}| 'init' {$isInitNoArg = true; $isInit = true;})


	'('argumentDefVars = argumentDef
	 {$receiverArgs = $argumentDefVars.args;}
	 //{print("receiverDef : previsInitNoArg = " + $isInitNoArg + "$argumentDefVars.hasArg = " + $argumentDefVars.hasArg );}
	 {$isInitNoArg = $isInitNoArg && !$argumentDefVars.hasArg;}
	 ')' ('\n')+

	 //{print("receiverDef : isInitNoArg = " + $isInitNoArg);}
    {
        List<Type> types = new ArrayList<>();
        for (Variable var : $receiverArgs){
            types.add(var.getType());
        }

        String receiverToString = "receiver: ";
        if($isInit){
            receiverToString += "init";
        }
        else{
            receiverToString += $name.text;
        }
        receiverToString += "(";
        for (Type t:types
             ) {
            receiverToString += t.toString()+" ";
        }
        receiverToString+=")";
        int receiverId = SymbolTable.getReceiverIdBySign($actorName, receiverToString);
        if($isInit){
            SymbolTable.setActorInit($actorName, receiverId);
        }
        mips.addLabel("r"+receiverId);
    }

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

	scopeStatement[$forEachDepth,$actorName, $cantSend] |sendStatement[$actorName, $cantSend] | ifStatement[$forEachDepth, $actorName, $cantSend]| forEachStatement[$forEachDepth, $actorName, $cantSend]| quitStatement[$actorName] | breakStatement[$forEachDepth] | writeStatement | expression | dataDef[false]
;

scopeStatement[int forEachDepth, String actorName, boolean cantSend]:
	'begin' (('\n')+) {beginScope();}(statement[$forEachDepth, $actorName, $cantSend](('\n')+))* {endScope();}'end'
;

breakStatement[int forEachDepth] :
	b = 'break'
	{
	mips.breakFor();
	}
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
         }else {
             int addrOrValue;
             if($ex.expressionType.equals(IntType.getInstance())){
//                if($ex.isLValue)
//                    mips.writeIndirect();
//                else
                    mips.write();
             }
             else if($ex.expressionType.equals(CharType.getInstance())){
//                if($ex.isLValue)
//                    mips.writeIndirect(1);
//                else
                    mips.write(1);
             }
             else{
//                if($ex.isLValue)
//                    mips.writeIndirect(((ArrayType)$ex.expressionType).getElementCount());
//                else
                    mips.write(((ArrayType)$ex.expressionType).getElementCount());
             }
         }
     }
;

expression returns [boolean isLValue, Type expressionType] :
	ae=assignmentExpression {$isLValue = $ae.isLValue;}
	{$expressionType = $ae.assignmentExpressionType;}
;

assignmentExpression returns [boolean isLValue, Type assignmentExpressionType]:
    oe=orExpression[true] op='=' ae=assignmentExpression
    {
        Type firstOperandType = $oe.orExpressionType;
        Type secondOperandType = $ae.assignmentExpressionType;
            $assignmentExpressionType = typeCheck(firstOperandType, secondOperandType, "=", false);
    }
    {
         if(!$oe.isLValue)
            print($op.line + ") LValue Error");
    }
    {
        if(firstOperandType instanceof ArrayType){
            int count = ((ArrayType)firstOperandType).getElementCount();
            print("khar toooooooooooleeeeeeee " + $oe.isLValue);
            mips.arrayAssignCommand(count);
        }
        else{
            mips.assignCommand();
        }
    }
    {$isLValue = false;}
    |
    orExpr = orExpression[false]
    {
        $assignmentExpressionType = $orExpr.orExpressionType;
        $isLValue = $orExpr.isLValue;
    }
;


////warning
//assignmentExpressionTmp[boolean leftOperandLValue] returns[Type assignmentExpressionTmpType, boolean hasValue]:
//	op='=' oe=orExpression[true]aet=assignmentExpressionTmp[$oe.isLValue]
//	{
//	    Type firstOperandType = $oe.orExpressionType;
//	    Type secondOperandType = $aet.assignmentExpressionTmpType;
//	    String operator = $op.text;
//	    $assignmentExpressionTmpType = typeCheck(firstOperandType, secondOperandType, "=", !$aet.hasValue);
//	    $hasValue = true;
//
//            if(!$leftOperandLValue)
//                print($op.line + ") LValue Error");
//
//            if(firstOperandType instanceof ArrayType){
//                int count = ((ArrayType)firstOperandType).getElementCount();
//                print("khar toooooooooooleeeeeeee " + $oe.isLValue);
//                if(!$aet.hasValue && $oe.isLValue)
//                    mips.loadIndirect(count);
//                mips.arrayAssignCommand(count);
//            }
//            else{
//                if(!$aet.hasValue && $oe.isLValue)
//                    mips.loadIndirect(1);
//                mips.assignCommand();
//            }
//    }
//	|
//	{
//	    $hasValue = false;
//	    $assignmentExpressionTmpType = NoType.getInstance();
//	}
//
//
//;

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
	op='or' ae = andExpression[false] {
	    mips.operationCommand($op.text);
	}
	oet = orExpressionTmp
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
	op='and'  ece = equalityCmpExpression[false]
	{
	    mips.operationCommand($op.text);
	}
	aet = andExpressionTmp
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
	} ce = comparisonExpression[false]
	{
                print ($ce.comparisonExpressionType.toString());
    	        if ($ce.comparisonExpressionType instanceof ArrayType){
//    	            print ("0-00000--09-000000--- array equality---------------");
    	            int arraySize = ((ArrayType)$ce.comparisonExpressionType).getElementCount();
        	        mips.arrayOperationCommand($op.text, arraySize);
                }
        	    else{
//        	        print ("0-00000--09-000000--- equality mamooli ---------------");
        	        mips.operationCommand($op.text);
                }
        }

	ect = equalityCmpExpressionTmp
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
	ae = addExpression[isLeft]
	cet =comparisonExpressionTmp
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
	ae = addExpression[false]
    {mips.operationCommand($op.text);}
	cet = comparisonExpressionTmp
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
	me = multExpression[false]
	{
        mips.operationCommand($op.text);
	}
	aet = addExpressionTmp
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
	} ne = notExpression[false]
    {
        mips.operationCommand($op.text);
    }
	 met = multExpressionTmp
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
	            {
                	    mips.operationCommand("not");
                }
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
arrayAccessExpression[boolean isLeft] returns [Type arrayAccessExpressionType, boolean isLValue, List<Integer> indexBoundList]:
	{//print("arrayAccessExpression");
}
	oe =  otherExpression[$isLeft]
	{
    	    // indexOutOfBoundError
    	    if ($oe.otherExpressionType instanceof ArrayType){

    	        $indexBoundList = ((ArrayType)$oe.otherExpressionType).getDimensionsForStack();
    	        for (int i=0; i<$indexBoundList.size(); i++)
    	            print(Integer.toString($indexBoundList.get(i)));
            }
    }
	aaet = arrayAccessExpressionTmp[$oe.otherExpressionType, $isLeft, $oe.offset,$indexBoundList]
    {
	  $arrayAccessExpressionType = $aaet.afterAccessType;
	  $isLValue = $oe.isLValue;

	}

;

arrayAccessExpressionTmp [Type beforeAccessType, boolean otherIsLeft, int offset, List<Integer>indexBoundList] returns [Type afterAccessType, int indexCount]:
    {
        if($otherIsLeft == false){
            int elementsNum = ((ArrayType) beforeAccessType).getElementCount();
            for(int i=0; i<elementsNum; i++){
                mips.popStack();
            }
        }
        print("isLeft: "+$otherIsLeft);
    }
    {$afterAccessType = $beforeAccessType;}
    {
        /*print("-----------in temp-----------");
        for (int i=0; i<$indexBoundList.size(); i++)
            print(Integer.toString($indexBoundList.get(i)));
        print("-----------end temp-----------");*/
    }


    {$indexCount = 0;}
    ('['e = expression ']'{$afterAccessType = ((ArrayType)$afterAccessType).getType(); mips.checkIndex($indexBoundList.get($indexCount)); $indexCount++; })+
    {
        print("after access type:"+$afterAccessType.toString());
        if($otherIsLeft){
            List<Integer> dimensions = ((ArrayType)$beforeAccessType).getDimensionsForStack();
            for(int i=0; i<dimensions.size(); i++){
                print("-"+dimensions.get(i)+"-");
            }
            mips.leftArrayAccess($indexCount, dimensions);
        }
        else{
            List<Integer> dimensions = ((ArrayType)$beforeAccessType).getDimensionsForStack();
                for(int i=0; i<dimensions.size(); i++){
                print("-"+dimensions.get(i)+"-");
            }
            int accessCount = 1;
            for(int i=0; i<(dimensions.size() - $indexCount); i++){
                accessCount = accessCount* dimensions.get(dimensions.size()-(i+1));
            }
            mips.rightArrayAccess($indexCount,dimensions,accessCount,$offset);

        }
    }
    |
    {
        $afterAccessType = $beforeAccessType;
    }
;

//arrayAccessExpressionTmp [Type beforeAccessType] returns [Type afterAccessType, boolean hasValue]:
//        {
//            int elementsNum = ((ArrayType) beforeAccessType).getElementCount();
//            for(int i=0; i<elementsNum; i++){
//                mips.popStack();
//            }
//        }
//		'['e = expression ']' aet = arrayAccessExpressionTmp[((ArrayType)$beforeAccessType).getType()]
//		{
//		    $afterAccessType = $aet.afterAccessType;
//		    $hasValue = true;
//		}
//    |
//        {
//            $afterAccessType = $beforeAccessType;
//            $hasValue = false;
//        }
//;

otherExpression [boolean isLeft] returns [Type otherExpressionType, boolean isLValue , int offset]:
    (
    fc = functionCall {/* TODO : add expression type for functioncall*/}
    {
        $otherExpressionType = new ArrayType($fc.readSize, CharType.getInstance());
        $offset = -1;

    }
    |   CONST_INT { $otherExpressionType = IntType.getInstance();
        print("otherExpression CONST_INT: " + $CONST_INT.text + " ---- " + $otherExpressionType.toString() );
        $isLValue = false;}
        {
            mips.addToStack($CONST_INT.text);
            $offset = -1;
        }
    |	CONST_STRING {
        int stringSize = ($CONST_STRING.text.length()) - 2;
        $otherExpressionType = new ArrayType(stringSize, CharType.getInstance());
        print("otherExpression CONST_STRING: " + $CONST_STRING.text + " ---- " + $otherExpressionType.toString() );
        $isLValue = false;}
        {
            for(int i=0;i<(($CONST_STRING.text.length()) - 2);i++){
                mips.addToStack("'"+Character.toString($CONST_STRING.text.charAt(i+1))+"'");
            }
            $offset = -1;
        }
    |	CONST_CHAR { $otherExpressionType = CharType.getInstance();
        print("otherExpression CONST_CHAR: " + $CONST_CHAR.text + " ---- " + $otherExpressionType.toString() );
        $isLValue = false;}
        {
            mips.addToStack($CONST_CHAR.text);
            $offset = -1;
        }
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
             if (var.getBaseRegister() == Register.SP){
                 if ($isLeft == false){
                    if($otherExpressionType instanceof ArrayType){
                        mips.addCommentToInstructions("---------------RValue array pushing to stack------");
                        int elementsCount = ((ArrayType)$otherExpressionType).getElementCount();
                        for(int i=0;i<elementsCount;i++){
                            mips.addToStack($id.text, (var.getOffset()*-1)-(4*i));
                        }
                        mips.addCommentToInstructions("---------------end of RValue array pushing to stack------");
            		}
            		else{
                        mips.addToStack($id.text, var.getOffset()*-1);
                    }
                 }
                 else{
                    mips.addAddressToStack($id.text, var.getOffset()*-1);
                 }
                 $offset = var.getOffset();
             }
             else {
                 if($isLeft == false){
                    if($otherExpressionType instanceof ArrayType){
                        int elementsCount = ((ArrayType)$otherExpressionType).getElementCount();
                        for(int i=0;i<elementsCount;i++){
                            mips.addGlobalToStack((var.getOffset()*-1)-(4*i));
                        }
                    }
                    else{
                        mips.addGlobalToStack(var.getOffset());
                    }
                 }
                 else{
                    mips.addGlobalAddressToStack($id.text, var.getOffset());
                 }
                 $offset = var.getOffset();
             }
         }
         $isLValue = true;
    }
    {
        print("otherExpression Id: " + $id.text + " ---- " + $otherExpressionType.toString());
    }
    |   '{' exp = expression (',' expression)* '}'
         {
            $isLValue = false;
            $otherExpressionType = $exp.expressionType;
            $offset = -1;
         }

    |  {//print("otherExpression : ()");
    } '(' ex =expression ')'
    {
        $isLValue = $ex.isLValue;
        $otherExpressionType = $ex.expressionType;
        $offset = -1;
    }
    )
    ;

quitStatement[String actorName] :
	{//print("quit");
	}
	'quit'
	{
	    mips.jumpToActorEnd($actorName);
	}
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
	)sendOp = '<<' fc = functionCall
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
            mips.sendMessage(receiverActorName, $fc.receiverSign, $sendOp.line );
        }
	}

;

functionCall returns[String receiverSign, boolean isRead, int readSize]:
	(id =Id{$receiverSign = $id.text + "(";}|'init'{$receiverSign = "init" + "(";}) '('ar = arguments  {$receiverSign += $ar.argumentsTypeString +")";}')'{$isRead = false; $readSize = 0;}{print("^%^%^%^%^"+$receiverSign+"&^&^&^&^&^&");}|'read''('CONST_INT')'{$isRead = true; $readSize = $CONST_INT.int; mips.read($CONST_INT.int);}
	{print("^%^%^%^%^"+$receiverSign+"&^&^&^&^&^&");}
;

arguments returns [String argumentsTypeString = ""]:
	{//print("arguments");
	}
	(a1=argument','{$argumentsTypeString += ($a1.argumentTypeString + " ");})* a2 = argument{$argumentsTypeString += ($a2.argumentTypeString + " ");}{print("injaaaaaaam");}|{$argumentsTypeString = "";}{print("oooonjaaaaaam");}

;

argument returns [String argumentTypeString]:
	{//print("argument");
	}
	e = expression {$argumentTypeString = ($e.expressionType).toString();}
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

	{
	    mips.addCommentToInstructions("--------if begin -------");
	    mips.jz();
	    mips.addCommentToInstructions("--------if end -------");
	}
	('\n')+ (statement[$forEachDepth, $actorName, $cantSend]((n='\n')+))*


    {
        endScope();
        mips.addCommentToInstructions("--------if exit begin -------");
        mips.getNewExitListAndPush();
        mips.addJumpExit();
        mips.addCommentToInstructions("--------if exit end -------");
    }



    eif = elseIfelse[$forEachDepth, $actorName, $cantSend] endStatement = 'end'
	{
	    if(!$eif.hasElse)
	    {
	        mips.addCommentToInstructions("--------no else begin -------");
            mips.compjpz("line"+Integer.toString($endStatement.line));
            mips.compJumpExitAndPop("line"+Integer.toString($endStatement.line));
            mips.addCommentToInstructions("--------no else end -------");

	    }
	}
;

elseIfelse[int forEachDepth, String actorName, boolean cantSend]returns [boolean hasElse]:
	(elseIf[$forEachDepth, $actorName, $cantSend])*
	(
	es = elseStatement[$forEachDepth, $actorName, $cantSend]
    {$hasElse = $es.hasElse;}
	)
;



elseIf[int forEachDepth, String actorName, boolean cantSend]:
	ei = 'elseif'

    {
            mips.addCommentToInstructions("--------elseif before expression begin -------");
            mips.compjpz("line"+Integer.toString($ei.line));
            mips.addCommentToInstructions("--------elseif before expression end -------");
    }
	{beginScope();} expression

	{
    	    mips.addCommentToInstructions("--------elseif1 begin -------");
    	    //mips.elseIfjcompjpz("line"+Integer.toString($ei.line));
    	    mips.jz();
    	    mips.addCommentToInstructions("--------elseif1 end -------");
    }

	('\n')+ (statement[$forEachDepth, $actorName, $cantSend]((n='\n')+))* {endScope();}
    {
            mips.addCommentToInstructions("--------elseif exit begin -------");
            mips.addJumpExit();
            mips.addCommentToInstructions("--------elseif exit end -------");
    }
;

elseStatement[int forEachDepth, String actorName, boolean cantSend] returns [boolean hasElse] :
	e ='else'
	{
	    mips.addCommentToInstructions("--------else1 begin -------");
	    mips.jcompjpz("line"+Integer.toString($e.line));
	    mips.addCommentToInstructions("--------else1 end -------");
	    $hasElse = true;

	}

	('\n')+ {beginScope();} (statement[$forEachDepth, $actorName, $cantSend]((n='\n')+))* {endScope();}

	{
        mips.addCommentToInstructions("--------else2 begin -------");
        mips.compjp("line"+Integer.toString($n.line));
        mips.addCommentToInstructions("--------else2 end -------");

        //complete exit codes
        mips.addCommentToInstructions("--------else exit complete begin -------");
        mips.compJumpExitAndPop("line"+Integer.toString($n.line));
        mips.addCommentToInstructions("--------else exit complete end -------");

	}
	|
	{ $hasElse = false;}
;

forEachStatement[int forEachDepth, String actorName, boolean cantSend]:
	//reserving place for element on stack!
	{
	    mips.addToStack("1");
	}

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
        //------------------code generation------------------

        //----------init
        int elementOffset = 0;
        SymbolTableItem item = SymbolTable.top.get($id.text);
        if(item == null) {
            print($id.line + ") Item " + $id.text + " doesnt exist.");
        }
        else {
            SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
            elementOffset =var.getOffset()*-1;
            mips.addAddressToStack($id.text, elementOffset);

        }

        int arraySize = ((ArrayType)$ex.expressionType).getLength();
        mips.addToStack(Integer.toString(arraySize*4));
        //----------end init
        mips.initFor(elementOffset, arraySize*4);
        mips.addLabel("for" + Integer.toString($id.line));
        mips.forJz();
        //------------------end code generation------------------
    }
	{$forEachDepth++;}
	{
	    //making sure the stack doesn't change after for
//	    mips.beginScope(SymbolTable.top.getOffset(Register.SP));
        beginScope();
	}
    (statement[$forEachDepth, $actorName, $cantSend](('\n')+))*
//    {mips.endScope();}
    {endScope();}
    {
        SymbolTableItem item2 = SymbolTable.top.get($id.text);
        SymbolTableVariableItemBase var2 = (SymbolTableVariableItemBase) item2;
        int offset = var2.getOffset()*-1;

        mips.foreachStep(offset);
        mips.jump("for"+Integer.toString($id.line));
    }

    {endScope();}
    e='end' {$forEachDepth--;}
    {
        mips.compForJump("endfor"+Integer.toString($e.line));
        int arraySize2 = ((ArrayType)$ex.expressionType).getLength();
        mips.addCommentToInstructions("-----------poping for data------------");
        mips.addCommentToInstructions("pop array size from for stack");
        mips.popForStack();
        mips.addCommentToInstructions("pop element from for stack");
        mips.popForStack();
        mips.addCommentToInstructions("pop array from for stack");
        for (int i=0; i<arraySize2; i++)
            mips.popForStack();
        mips.addCommentToInstructions("pop element from real stack");
        mips.popStack();
    }
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
