// Generated from SimpleJava.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleJavaParser}.
 */
public interface SimpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(SimpleJavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(SimpleJavaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SimpleJavaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SimpleJavaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SimpleJavaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SimpleJavaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimpleJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimpleJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SimpleJavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SimpleJavaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SimpleJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SimpleJavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SimpleJavaParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SimpleJavaParser.OperatorContext ctx);
}