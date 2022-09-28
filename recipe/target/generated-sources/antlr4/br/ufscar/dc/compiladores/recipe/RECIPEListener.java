// Generated from br\u005Cufscar\dc\compiladores\recipe\RECIPE.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.recipe;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RECIPEParser}.
 */
public interface RECIPEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#receita}.
	 * @param ctx the parse tree
	 */
	void enterReceita(RECIPEParser.ReceitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#receita}.
	 * @param ctx the parse tree
	 */
	void exitReceita(RECIPEParser.ReceitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#capa}.
	 * @param ctx the parse tree
	 */
	void enterCapa(RECIPEParser.CapaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#capa}.
	 * @param ctx the parse tree
	 */
	void exitCapa(RECIPEParser.CapaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(RECIPEParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(RECIPEParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#tempo_prep}.
	 * @param ctx the parse tree
	 */
	void enterTempo_prep(RECIPEParser.Tempo_prepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#tempo_prep}.
	 * @param ctx the parse tree
	 */
	void exitTempo_prep(RECIPEParser.Tempo_prepContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#unidade_tempo}.
	 * @param ctx the parse tree
	 */
	void enterUnidade_tempo(RECIPEParser.Unidade_tempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#unidade_tempo}.
	 * @param ctx the parse tree
	 */
	void exitUnidade_tempo(RECIPEParser.Unidade_tempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#paragrafo}.
	 * @param ctx the parse tree
	 */
	void enterParagrafo(RECIPEParser.ParagrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#paragrafo}.
	 * @param ctx the parse tree
	 */
	void exitParagrafo(RECIPEParser.ParagrafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterIngredientes(RECIPEParser.IngredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitIngredientes(RECIPEParser.IngredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterLista_ingredientes(RECIPEParser.Lista_ingredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitLista_ingredientes(RECIPEParser.Lista_ingredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#medida_solido}.
	 * @param ctx the parse tree
	 */
	void enterMedida_solido(RECIPEParser.Medida_solidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#medida_solido}.
	 * @param ctx the parse tree
	 */
	void exitMedida_solido(RECIPEParser.Medida_solidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#medida_liq}.
	 * @param ctx the parse tree
	 */
	void enterMedida_liq(RECIPEParser.Medida_liqContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#medida_liq}.
	 * @param ctx the parse tree
	 */
	void exitMedida_liq(RECIPEParser.Medida_liqContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#lista_tempero}.
	 * @param ctx the parse tree
	 */
	void enterLista_tempero(RECIPEParser.Lista_temperoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#lista_tempero}.
	 * @param ctx the parse tree
	 */
	void exitLista_tempero(RECIPEParser.Lista_temperoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#tipo_colher}.
	 * @param ctx the parse tree
	 */
	void enterTipo_colher(RECIPEParser.Tipo_colherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#tipo_colher}.
	 * @param ctx the parse tree
	 */
	void exitTipo_colher(RECIPEParser.Tipo_colherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(RECIPEParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(RECIPEParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(RECIPEParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(RECIPEParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdAsse}.
	 * @param ctx the parse tree
	 */
	void enterCmdAsse(RECIPEParser.CmdAsseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdAsse}.
	 * @param ctx the parse tree
	 */
	void exitCmdAsse(RECIPEParser.CmdAsseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdCozinhe}.
	 * @param ctx the parse tree
	 */
	void enterCmdCozinhe(RECIPEParser.CmdCozinheContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdCozinhe}.
	 * @param ctx the parse tree
	 */
	void exitCmdCozinhe(RECIPEParser.CmdCozinheContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdMisture}.
	 * @param ctx the parse tree
	 */
	void enterCmdMisture(RECIPEParser.CmdMistureContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdMisture}.
	 * @param ctx the parse tree
	 */
	void exitCmdMisture(RECIPEParser.CmdMistureContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdCorte}.
	 * @param ctx the parse tree
	 */
	void enterCmdCorte(RECIPEParser.CmdCorteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdCorte}.
	 * @param ctx the parse tree
	 */
	void exitCmdCorte(RECIPEParser.CmdCorteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdBata}.
	 * @param ctx the parse tree
	 */
	void enterCmdBata(RECIPEParser.CmdBataContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdBata}.
	 * @param ctx the parse tree
	 */
	void exitCmdBata(RECIPEParser.CmdBataContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdDescanse}.
	 * @param ctx the parse tree
	 */
	void enterCmdDescanse(RECIPEParser.CmdDescanseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdDescanse}.
	 * @param ctx the parse tree
	 */
	void exitCmdDescanse(RECIPEParser.CmdDescanseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdPasso}.
	 * @param ctx the parse tree
	 */
	void enterCmdPasso(RECIPEParser.CmdPassoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdPasso}.
	 * @param ctx the parse tree
	 */
	void exitCmdPasso(RECIPEParser.CmdPassoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdPao_de_Lo}.
	 * @param ctx the parse tree
	 */
	void enterCmdPao_de_Lo(RECIPEParser.CmdPao_de_LoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdPao_de_Lo}.
	 * @param ctx the parse tree
	 */
	void exitCmdPao_de_Lo(RECIPEParser.CmdPao_de_LoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdCobertura}.
	 * @param ctx the parse tree
	 */
	void enterCmdCobertura(RECIPEParser.CmdCoberturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdCobertura}.
	 * @param ctx the parse tree
	 */
	void exitCmdCobertura(RECIPEParser.CmdCoberturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdArroz}.
	 * @param ctx the parse tree
	 */
	void enterCmdArroz(RECIPEParser.CmdArrozContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdArroz}.
	 * @param ctx the parse tree
	 */
	void exitCmdArroz(RECIPEParser.CmdArrozContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#cmdBaseRisotto}.
	 * @param ctx the parse tree
	 */
	void enterCmdBaseRisotto(RECIPEParser.CmdBaseRisottoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#cmdBaseRisotto}.
	 * @param ctx the parse tree
	 */
	void exitCmdBaseRisotto(RECIPEParser.CmdBaseRisottoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#tipo_corte}.
	 * @param ctx the parse tree
	 */
	void enterTipo_corte(RECIPEParser.Tipo_corteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#tipo_corte}.
	 * @param ctx the parse tree
	 */
	void exitTipo_corte(RECIPEParser.Tipo_corteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RECIPEParser#tempo}.
	 * @param ctx the parse tree
	 */
	void enterTempo(RECIPEParser.TempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RECIPEParser#tempo}.
	 * @param ctx the parse tree
	 */
	void exitTempo(RECIPEParser.TempoContext ctx);
}