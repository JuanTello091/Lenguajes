// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SenCosTanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SenCosTanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SenCosTanParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SenCosTanParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link SenCosTanParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SenCosTanParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SenCosTanParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SenCosTanParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link SenCosTanParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(SenCosTanParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tan}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan(SenCosTanParser.TanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(SenCosTanParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(SenCosTanParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(SenCosTanParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(SenCosTanParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(SenCosTanParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SenCosTanParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(SenCosTanParser.IntContext ctx);
}