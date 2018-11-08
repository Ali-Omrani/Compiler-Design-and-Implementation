grammar g;

@members{
    void print(String str){
        System.out.println(str);
    }
}

program:
	{print("program");}
	(actor | '\n')*
;

actor :
  {print("actor");}
	actorDef(actorBodyStatement)* 'end' ('\n'|EOF)
;

actorDef:
	'actor'name=Id'<'CONST_INT'>'('\n')+
	{print("actorDef : " + $name.text);}
;

actorBodyStatement:
  {print("actorBodyStatement");}
	(dataDef('\n')+ | receiver)
;

type:
	(arrayType | varType) {print("type");}
;

arrayType:
	varType('['CONST_INT']')+ {print("arrayType");}
;


varType:
	type_str=('int' | 'char') {print("varType : "+ $type_str.text);}
;

dataDef:
	{print("dataDef");}
	(subDef',')* subDef
;

subDef:
	type Id {print("subDef : "+$Id.text);} '=' '{'(expression ',')* expression'}'|
	type Id {print("subDef : "+$Id.text);} '=' '{''}'|
    type Id {print("subDef : "+$Id.text);} '='expression | 
    type Id {print("subDef : "+$Id.text);}
;

receiver:
	{print("receiver");}
	receiverDef(receiverBodyStatement)* 'end' ('\n')+
;

receiverDef:
	'receiver' Id {print("receiverDef : " + $Id.text);} '(' argumentDef ')' ('\n')+
;

argumentDef:
	{print("argumentDef");}
	(type Id',')* type Id |
;

receiverBodyStatement:
	{print("receiverBodyStatement");}
	statement('\n')+
;

statement :
	{print("statement");}
	scopeStatement | sendStatement | ifStatement| forEachStatement| quitStatement | breakStatement | writeStatement | expression | dataDef
;

scopeStatement:
	{print("scopeStatement");}
	'begin' (('\n')+) (statement(('\n')+))* 'end'
;

breakStatement :
	{print("break");}
	'break'
;

writeStatement :
	{print("writeStatement");}
	'write' '('arguments')'
;

expression :
	{print("expression");}
	assignmentExpression
;

assignmentExpression :
	{print("assignmentExpression");}
	orExpression assignmentExpressionTmp
;

assignmentExpressionTmp:
	op='='{print("assignmentExpressionTmp : " + $op.text);}  orExpression assignmentExpressionTmp |

;

orExpression :
	{print("orExpression");}
	andExpression orExpressionTmp
;

orExpressionTmp :

	op='or'{print("orExpressionTmp : " + $op.text);} andExpression orExpressionTmp
	|
;

andExpression :
	{print("andExpression");}
	equalityCmpExpression andExpressionTmp
;

andExpressionTmp :
	op='and' {print("addExpressionTmp : " + $op.text);} equalityCmpExpression andExpressionTmp |
;

equalityCmpExpression :
	{print("equalityCmpExpression");}
	comparisonExpression equalityCmpExpressionTmp
;

equalityCmpExpressionTmp :

	op=('=='|'<>')  {print("equalityCmpExpressionTmp : "+ $op.text);} comparisonExpression equalityCmpExpressionTmp |
;

comparisonExpression :
	{print("comparisonExpression");}
	addExpression comparisonExpressionTmp
;

comparisonExpressionTmp :

	op=('<'|'>'){print("comparisonExpressionTmp : " + $op.text);} addExpression comparisonExpressionTmp |
;

addExpression :
	{print("addExpression");}
	multExpression addExpressionTmp
;

addExpressionTmp:
	op=('+'|'-') {print("addExpressionTmp : " + $op.text);} multExpression addExpressionTmp |
;


multExpression:
	{print("multExpression");}
	notExpression multExpressionTmp
;

multExpressionTmp:
	op=('*'|'/') {print("multExpressionTmp : " + $op.text);} notExpression multExpressionTmp |
;

notExpression:
	{print("notExpression");}
	notExpressionTmp arrayAccessExpression
;

notExpressionTmp:
	{print("notExpressionTmp : " + '-');} op='-' notExpressionTmp  |
;

arrayAccessExpression :
	{print("arrayAccessExpression");}
	otherExpression arrayAccessExpressionTmp
;

arrayAccessExpressionTmp:
		{print("arrayAccessExpressionTmp : []");}
		'['expression arrayAccessExpressionTmp']'arrayAccessExpressionTmp
    |
;

otherExpression    :
    (
    functionCall {print("otherExpression functionCall" );}
    |   CONST_INT {print("otherExpression CONST_INT" );}
    |	CONST_STRING {print("otherExpression CONST_STRING" );}
    |	CONST_CHAR {print("otherExpression CONST_CHAR" );}
    |   Id {print("otherExpression Id" );}
    |  {print("otherExpression : ()");} '(' expression ')'
    )
    ;

quitStatement :
	{print("quit");}
	'quit'
;


sendStatement :
	{print("sendStatement");}
	('sender'|'self'|Id)'<<' functionCall
;

functionCall:
	{print("functionCall");}
	('read'|Id)'('arguments')'
;

arguments :
	{print("arguments");}
	(argument',')* argument|
;

argument:
	{print("argument");}
	expression |
;

ifStatement:
	{print("ifStatement");}
	'if' expression ('\n')+ (statement(('\n')+))*  elseIfelse 'end'
;

elseIfelse:
	{print("elseIfelse");}
	(elseIf)* (elseStatement)
;

forEachStatement:
	{print("forEachStatement");}
	'foreach' Id 'in' Id ('\n')+ (statement(('\n')+))* 'end'
;

elseIf:
	{print("elseIf");}
	'elseif' expression ('\n')+ (statement(('\n')+))*

;

elseStatement:
	{print("elseStatement");}
	'else' ('\n')+ (statement(('\n')+))*|
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
