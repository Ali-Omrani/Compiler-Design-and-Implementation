// Generated from g2.g4 by ANTLR 4.7

    import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link g2Parser}.
 */
public interface g2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link g2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(g2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(g2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(g2Parser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(g2Parser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#actorDef}.
	 * @param ctx the parse tree
	 */
	void enterActorDef(g2Parser.ActorDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#actorDef}.
	 * @param ctx the parse tree
	 */
	void exitActorDef(g2Parser.ActorDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#actorBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterActorBodyStatement(g2Parser.ActorBodyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#actorBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitActorBodyStatement(g2Parser.ActorBodyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(g2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(g2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(g2Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(g2Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(g2Parser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(g2Parser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#dataDef}.
	 * @param ctx the parse tree
	 */
	void enterDataDef(g2Parser.DataDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#dataDef}.
	 * @param ctx the parse tree
	 */
	void exitDataDef(g2Parser.DataDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(g2Parser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(g2Parser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#receiverDef}.
	 * @param ctx the parse tree
	 */
	void enterReceiverDef(g2Parser.ReceiverDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#receiverDef}.
	 * @param ctx the parse tree
	 */
	void exitReceiverDef(g2Parser.ReceiverDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#argumentDef}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDef(g2Parser.ArgumentDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#argumentDef}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDef(g2Parser.ArgumentDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#receiverBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterReceiverBodyStatement(g2Parser.ReceiverBodyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#receiverBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitReceiverBodyStatement(g2Parser.ReceiverBodyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(g2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(g2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#scopeStatement}.
	 * @param ctx the parse tree
	 */
	void enterScopeStatement(g2Parser.ScopeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#scopeStatement}.
	 * @param ctx the parse tree
	 */
	void exitScopeStatement(g2Parser.ScopeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(g2Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(g2Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(g2Parser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(g2Parser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(g2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(g2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(g2Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(g2Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#assignmentExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpressionTmp(g2Parser.AssignmentExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#assignmentExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpressionTmp(g2Parser.AssignmentExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(g2Parser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(g2Parser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#orExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterOrExpressionTmp(g2Parser.OrExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#orExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitOrExpressionTmp(g2Parser.OrExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(g2Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(g2Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#andExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterAndExpressionTmp(g2Parser.AndExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#andExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitAndExpressionTmp(g2Parser.AndExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#equalityCmpExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCmpExpression(g2Parser.EqualityCmpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#equalityCmpExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCmpExpression(g2Parser.EqualityCmpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#equalityCmpExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCmpExpressionTmp(g2Parser.EqualityCmpExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#equalityCmpExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCmpExpressionTmp(g2Parser.EqualityCmpExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(g2Parser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(g2Parser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#comparisonExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionTmp(g2Parser.ComparisonExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#comparisonExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionTmp(g2Parser.ComparisonExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(g2Parser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(g2Parser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#addExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterAddExpressionTmp(g2Parser.AddExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#addExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitAddExpressionTmp(g2Parser.AddExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(g2Parser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(g2Parser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#multExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterMultExpressionTmp(g2Parser.MultExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#multExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitMultExpressionTmp(g2Parser.MultExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(g2Parser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(g2Parser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#notExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterNotExpressionTmp(g2Parser.NotExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#notExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitNotExpressionTmp(g2Parser.NotExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(g2Parser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(g2Parser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#arrayAccessExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpressionTmp(g2Parser.ArrayAccessExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#arrayAccessExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpressionTmp(g2Parser.ArrayAccessExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpression(g2Parser.OtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpression(g2Parser.OtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#quitStatement}.
	 * @param ctx the parse tree
	 */
	void enterQuitStatement(g2Parser.QuitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#quitStatement}.
	 * @param ctx the parse tree
	 */
	void exitQuitStatement(g2Parser.QuitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void enterSendStatement(g2Parser.SendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void exitSendStatement(g2Parser.SendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(g2Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(g2Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(g2Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(g2Parser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(g2Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(g2Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(g2Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(g2Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#elseIfelse}.
	 * @param ctx the parse tree
	 */
	void enterElseIfelse(g2Parser.ElseIfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#elseIfelse}.
	 * @param ctx the parse tree
	 */
	void exitElseIfelse(g2Parser.ElseIfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(g2Parser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(g2Parser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(g2Parser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(g2Parser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link g2Parser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(g2Parser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link g2Parser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(g2Parser.ElseStatementContext ctx);
}