// Generated from c:/Users/Lucas/Desktop/analizador v2/Condicional.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CondicionalParser}.
 */
public interface CondicionalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CondicionalParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CondicionalParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondicionalParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CondicionalParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CondicionalParser#regla}.
	 * @param ctx the parse tree
	 */
	void enterRegla(CondicionalParser.ReglaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondicionalParser#regla}.
	 * @param ctx the parse tree
	 */
	void exitRegla(CondicionalParser.ReglaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CondicionalParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(CondicionalParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondicionalParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(CondicionalParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CondicionalParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(CondicionalParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondicionalParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(CondicionalParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CondicionalParser#nombre_dispositivo}.
	 * @param ctx the parse tree
	 */
	void enterNombre_dispositivo(CondicionalParser.Nombre_dispositivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondicionalParser#nombre_dispositivo}.
	 * @param ctx the parse tree
	 */
	void exitNombre_dispositivo(CondicionalParser.Nombre_dispositivoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link CondicionalParser#estado_condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondIs(CondicionalParser.CondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link CondicionalParser#estado_condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondIs(CondicionalParser.CondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condGreater}
	 * labeled alternative in {@link CondicionalParser#estado_condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondGreater(CondicionalParser.CondGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condGreater}
	 * labeled alternative in {@link CondicionalParser#estado_condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondGreater(CondicionalParser.CondGreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condLesser}
	 * labeled alternative in {@link CondicionalParser#estado_condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondLesser(CondicionalParser.CondLesserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condLesser}
	 * labeled alternative in {@link CondicionalParser#estado_condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondLesser(CondicionalParser.CondLesserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valCondicionEstado}
	 * labeled alternative in {@link CondicionalParser#valor_condicion}.
	 * @param ctx the parse tree
	 */
	void enterValCondicionEstado(CondicionalParser.ValCondicionEstadoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valCondicionEstado}
	 * labeled alternative in {@link CondicionalParser#valor_condicion}.
	 * @param ctx the parse tree
	 */
	void exitValCondicionEstado(CondicionalParser.ValCondicionEstadoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valCondicionInt}
	 * labeled alternative in {@link CondicionalParser#valor_condicion}.
	 * @param ctx the parse tree
	 */
	void enterValCondicionInt(CondicionalParser.ValCondicionIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valCondicionInt}
	 * labeled alternative in {@link CondicionalParser#valor_condicion}.
	 * @param ctx the parse tree
	 */
	void exitValCondicionInt(CondicionalParser.ValCondicionIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CondicionalParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(CondicionalParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondicionalParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(CondicionalParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code activate}
	 * labeled alternative in {@link CondicionalParser#accion_simple}.
	 * @param ctx the parse tree
	 */
	void enterActivate(CondicionalParser.ActivateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code activate}
	 * labeled alternative in {@link CondicionalParser#accion_simple}.
	 * @param ctx the parse tree
	 */
	void exitActivate(CondicionalParser.ActivateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deactivate}
	 * labeled alternative in {@link CondicionalParser#accion_simple}.
	 * @param ctx the parse tree
	 */
	void enterDeactivate(CondicionalParser.DeactivateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deactivate}
	 * labeled alternative in {@link CondicionalParser#accion_simple}.
	 * @param ctx the parse tree
	 */
	void exitDeactivate(CondicionalParser.DeactivateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code adjust}
	 * labeled alternative in {@link CondicionalParser#accion_simple}.
	 * @param ctx the parse tree
	 */
	void enterAdjust(CondicionalParser.AdjustContext ctx);
	/**
	 * Exit a parse tree produced by the {@code adjust}
	 * labeled alternative in {@link CondicionalParser#accion_simple}.
	 * @param ctx the parse tree
	 */
	void exitAdjust(CondicionalParser.AdjustContext ctx);
	/**
	 * Enter a parse tree produced by {@link CondicionalParser#activar}.
	 * @param ctx the parse tree
	 */
	void enterActivar(CondicionalParser.ActivarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondicionalParser#activar}.
	 * @param ctx the parse tree
	 */
	void exitActivar(CondicionalParser.ActivarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CondicionalParser#desactivar}.
	 * @param ctx the parse tree
	 */
	void enterDesactivar(CondicionalParser.DesactivarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondicionalParser#desactivar}.
	 * @param ctx the parse tree
	 */
	void exitDesactivar(CondicionalParser.DesactivarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CondicionalParser#ajustar}.
	 * @param ctx the parse tree
	 */
	void enterAjustar(CondicionalParser.AjustarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondicionalParser#ajustar}.
	 * @param ctx the parse tree
	 */
	void exitAjustar(CondicionalParser.AjustarContext ctx);
}