// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SenCosTanParser}.
 */
public interface SenCosTanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SenCosTanParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SenCosTanParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenCosTanParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SenCosTanParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link SenCosTanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SenCosTanParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link SenCosTanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SenCosTanParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SenCosTanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SenCosTanParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SenCosTanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SenCosTanParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link SenCosTanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(SenCosTanParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link SenCosTanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(SenCosTanParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tan}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTan(SenCosTanParser.TanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tan}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTan(SenCosTanParser.TanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(SenCosTanParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(SenCosTanParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(SenCosTanParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(SenCosTanParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(SenCosTanParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(SenCosTanParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCos(SenCosTanParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCos(SenCosTanParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSin(SenCosTanParser.SinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSin(SenCosTanParser.SinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(SenCosTanParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(SenCosTanParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(SenCosTanParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link SenCosTanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(SenCosTanParser.IntContext ctx);
}