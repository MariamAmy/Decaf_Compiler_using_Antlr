// Generated from /home/mariam/year 4/year 4 sem 2/Compilers/Lab/Project/PA_2/src/Decaf.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DecafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(DecafParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(DecafParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DecafParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DecafParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(DecafParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(DecafParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DecafParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DecafParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DecafParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DecafParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DecafParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DecafParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(DecafParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(DecafParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(DecafParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(DecafParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(DecafParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(DecafParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(DecafParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(DecafParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(DecafParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(DecafParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(DecafParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(DecafParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#arithematic}.
	 * @param ctx the parse tree
	 */
	void enterArithematic(DecafParser.ArithematicContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#arithematic}.
	 * @param ctx the parse tree
	 */
	void exitArithematic(DecafParser.ArithematicContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(DecafParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(DecafParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DecafParser.LiteralContext ctx);
}