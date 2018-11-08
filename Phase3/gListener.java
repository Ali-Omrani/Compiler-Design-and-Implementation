// Generated from g.g4 by ANTLR 4.7

    import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(gParser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(gParser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#actorDef}.
	 * @param ctx the parse tree
	 */
	void enterActorDef(gParser.ActorDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#actorDef}.
	 * @param ctx the parse tree
	 */
	void exitActorDef(gParser.ActorDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#actorBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterActorBodyStatement(gParser.ActorBodyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#actorBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitActorBodyStatement(gParser.ActorBodyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(gParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(gParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(gParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(gParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dataDef}.
	 * @param ctx the parse tree
	 */
	void enterDataDef(gParser.DataDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dataDef}.
	 * @param ctx the parse tree
	 */
	void exitDataDef(gParser.DataDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(gParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(gParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#receiverDef}.
	 * @param ctx the parse tree
	 */
	void enterReceiverDef(gParser.ReceiverDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#receiverDef}.
	 * @param ctx the parse tree
	 */
	void exitReceiverDef(gParser.ReceiverDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#argumentDef}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDef(gParser.ArgumentDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#argumentDef}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDef(gParser.ArgumentDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#receiverBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterReceiverBodyStatement(gParser.ReceiverBodyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#receiverBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitReceiverBodyStatement(gParser.ReceiverBodyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#scopeStatement}.
	 * @param ctx the parse tree
	 */
	void enterScopeStatement(gParser.ScopeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#scopeStatement}.
	 * @param ctx the parse tree
	 */
	void exitScopeStatement(gParser.ScopeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(gParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(gParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(gParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(gParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(gParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(gParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignmentExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpressionTmp(gParser.AssignmentExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignmentExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpressionTmp(gParser.AssignmentExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(gParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(gParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#orExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterOrExpressionTmp(gParser.OrExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#orExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitOrExpressionTmp(gParser.OrExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(gParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(gParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#andExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterAndExpressionTmp(gParser.AndExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#andExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitAndExpressionTmp(gParser.AndExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#equalityCmpExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCmpExpression(gParser.EqualityCmpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#equalityCmpExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCmpExpression(gParser.EqualityCmpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#equalityCmpExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCmpExpressionTmp(gParser.EqualityCmpExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#equalityCmpExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCmpExpressionTmp(gParser.EqualityCmpExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(gParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(gParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#comparisonExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionTmp(gParser.ComparisonExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#comparisonExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionTmp(gParser.ComparisonExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(gParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(gParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#addExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterAddExpressionTmp(gParser.AddExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#addExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitAddExpressionTmp(gParser.AddExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(gParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(gParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#multExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterMultExpressionTmp(gParser.MultExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#multExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitMultExpressionTmp(gParser.MultExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(gParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(gParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#notExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterNotExpressionTmp(gParser.NotExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#notExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitNotExpressionTmp(gParser.NotExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(gParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(gParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrayAccessExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpressionTmp(gParser.ArrayAccessExpressionTmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrayAccessExpressionTmp}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpressionTmp(gParser.ArrayAccessExpressionTmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpression(gParser.OtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpression(gParser.OtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#quitStatement}.
	 * @param ctx the parse tree
	 */
	void enterQuitStatement(gParser.QuitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#quitStatement}.
	 * @param ctx the parse tree
	 */
	void exitQuitStatement(gParser.QuitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void enterSendStatement(gParser.SendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void exitSendStatement(gParser.SendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(gParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(gParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(gParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(gParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(gParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(gParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(gParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(gParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elseIfelse}.
	 * @param ctx the parse tree
	 */
	void enterElseIfelse(gParser.ElseIfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elseIfelse}.
	 * @param ctx the parse tree
	 */
	void exitElseIfelse(gParser.ElseIfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(gParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(gParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(gParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(gParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(gParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(gParser.ElseStatementContext ctx);
}