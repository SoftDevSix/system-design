// Generated from SimpleJava.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(SimpleJavaParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SimpleJavaParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SimpleJavaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SimpleJavaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SimpleJavaParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SimpleJavaParser.OperatorContext ctx);
}