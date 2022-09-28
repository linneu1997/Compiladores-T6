// Generated from br\u005Cufscar\dc\compiladores\recipe\RECIPE.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.recipe;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RECIPEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RECIPEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#receita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceita(RECIPEParser.ReceitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#capa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapa(RECIPEParser.CapaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(RECIPEParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#tempo_prep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo_prep(RECIPEParser.Tempo_prepContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#unidade_tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnidade_tempo(RECIPEParser.Unidade_tempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#paragrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagrafo(RECIPEParser.ParagrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredientes(RECIPEParser.IngredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_ingredientes(RECIPEParser.Lista_ingredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#medida_solido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedida_solido(RECIPEParser.Medida_solidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#medida_liq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedida_liq(RECIPEParser.Medida_liqContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#lista_tempero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_tempero(RECIPEParser.Lista_temperoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#tipo_colher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_colher(RECIPEParser.Tipo_colherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(RECIPEParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(RECIPEParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdAsse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAsse(RECIPEParser.CmdAsseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdCozinhe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCozinhe(RECIPEParser.CmdCozinheContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdMisture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdMisture(RECIPEParser.CmdMistureContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdCorte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCorte(RECIPEParser.CmdCorteContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdBata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdBata(RECIPEParser.CmdBataContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdDescanse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdDescanse(RECIPEParser.CmdDescanseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdPasso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPasso(RECIPEParser.CmdPassoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdPao_de_Lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPao_de_Lo(RECIPEParser.CmdPao_de_LoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdCobertura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCobertura(RECIPEParser.CmdCoberturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdArroz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdArroz(RECIPEParser.CmdArrozContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#cmdBaseRisotto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdBaseRisotto(RECIPEParser.CmdBaseRisottoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#tipo_corte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_corte(RECIPEParser.Tipo_corteContext ctx);
	/**
	 * Visit a parse tree produced by {@link RECIPEParser#tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo(RECIPEParser.TempoContext ctx);
}