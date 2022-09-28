// Generated from br\u005Cufscar\dc\compiladores\recipe\RECIPE.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.recipe;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RECIPEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, NUMERO=44, INGREDIENTE=45, 
		TEMPERO=46, CADEIA=47, COMENTARIO=48, WS=49;
	public static final int
		RULE_receita = 0, RULE_capa = 1, RULE_nome = 2, RULE_tempo_prep = 3, RULE_unidade_tempo = 4, 
		RULE_paragrafo = 5, RULE_ingredientes = 6, RULE_lista_ingredientes = 7, 
		RULE_medida_solido = 8, RULE_medida_liq = 9, RULE_lista_tempero = 10, 
		RULE_tipo_colher = 11, RULE_metodo = 12, RULE_cmd = 13, RULE_cmdAsse = 14, 
		RULE_cmdCozinhe = 15, RULE_cmdMisture = 16, RULE_cmdCorte = 17, RULE_cmdBata = 18, 
		RULE_cmdDescanse = 19, RULE_cmdPasso = 20, RULE_cmdPao_de_Lo = 21, RULE_cmdCobertura = 22, 
		RULE_cmdArroz = 23, RULE_cmdBaseRisotto = 24, RULE_tipo_corte = 25, RULE_tempo = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"receita", "capa", "nome", "tempo_prep", "unidade_tempo", "paragrafo", 
			"ingredientes", "lista_ingredientes", "medida_solido", "medida_liq", 
			"lista_tempero", "tipo_colher", "metodo", "cmd", "cmdAsse", "cmdCozinhe", 
			"cmdMisture", "cmdCorte", "cmdBata", "cmdDescanse", "cmdPasso", "cmdPao_de_Lo", 
			"cmdCobertura", "cmdArroz", "cmdBaseRisotto", "tipo_corte", "tempo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'receita'", "'fim_receita'", "'Capa'", "':'", "'Nome'", "'Tempo'", 
			"'hora'", "'min'", "'seg'", "'Paragrafo'", "'Ingredientes'", "'fim_ingredientes'", 
			"'de'", "'g'", "'colher'", "'xicara'", "'ml'", "'l'", "'copo'", "'pitada'", 
			"'a_gosto'", "'cha'", "'sobremesa'", "'sopa'", "'Metodo'", "'fim_metodo'", 
			"'asse'", "'('", "','", "')'", "'cozinhe'", "'misture'", "'corte'", "'bata'", 
			"'descanse'", "'passo'", "'Pao_de_Lo'", "'cobertura'", "'arroz'", "'risotto'", 
			"'picar'", "'ralar'", "'cortar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUMERO", "INGREDIENTE", 
			"TEMPERO", "CADEIA", "COMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RECIPE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RECIPEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ReceitaContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public Tempo_prepContext tempo_prep() {
			return getRuleContext(Tempo_prepContext.class,0);
		}
		public IngredientesContext ingredientes() {
			return getRuleContext(IngredientesContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RECIPEParser.EOF, 0); }
		public CapaContext capa() {
			return getRuleContext(CapaContext.class,0);
		}
		public List<ParagrafoContext> paragrafo() {
			return getRuleContexts(ParagrafoContext.class);
		}
		public ParagrafoContext paragrafo(int i) {
			return getRuleContext(ParagrafoContext.class,i);
		}
		public ReceitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterReceita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitReceita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitReceita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceitaContext receita() throws RecognitionException {
		ReceitaContext _localctx = new ReceitaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			nome();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(56);
				capa();
				}
			}

			setState(59);
			tempo_prep();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(60);
				paragrafo();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			ingredientes();
			setState(67);
			metodo();
			setState(68);
			match(T__1);
			setState(69);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(RECIPEParser.CADEIA, 0); }
		public CapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCapa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCapa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCapa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapaContext capa() throws RecognitionException {
		CapaContext _localctx = new CapaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_capa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__2);
			setState(72);
			match(T__3);
			setState(73);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(RECIPEParser.CADEIA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__4);
			setState(76);
			match(T__3);
			setState(77);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tempo_prepContext extends ParserRuleContext {
		public List<TempoContext> tempo() {
			return getRuleContexts(TempoContext.class);
		}
		public TempoContext tempo(int i) {
			return getRuleContext(TempoContext.class,i);
		}
		public Tempo_prepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_prep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterTempo_prep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitTempo_prep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitTempo_prep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tempo_prepContext tempo_prep() throws RecognitionException {
		Tempo_prepContext _localctx = new Tempo_prepContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tempo_prep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__5);
			setState(80);
			match(T__3);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				tempo();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unidade_tempoContext extends ParserRuleContext {
		public Unidade_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidade_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterUnidade_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitUnidade_tempo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitUnidade_tempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unidade_tempoContext unidade_tempo() throws RecognitionException {
		Unidade_tempoContext _localctx = new Unidade_tempoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unidade_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParagrafoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(RECIPEParser.CADEIA, 0); }
		public ParagrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterParagrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitParagrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitParagrafo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagrafoContext paragrafo() throws RecognitionException {
		ParagrafoContext _localctx = new ParagrafoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paragrafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__9);
			setState(89);
			match(T__3);
			setState(90);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IngredientesContext extends ParserRuleContext {
		public List<Lista_ingredientesContext> lista_ingredientes() {
			return getRuleContexts(Lista_ingredientesContext.class);
		}
		public Lista_ingredientesContext lista_ingredientes(int i) {
			return getRuleContext(Lista_ingredientesContext.class,i);
		}
		public List<Lista_temperoContext> lista_tempero() {
			return getRuleContexts(Lista_temperoContext.class);
		}
		public Lista_temperoContext lista_tempero(int i) {
			return getRuleContext(Lista_temperoContext.class,i);
		}
		public IngredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterIngredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitIngredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitIngredientes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredientesContext ingredientes() throws RecognitionException {
		IngredientesContext _localctx = new IngredientesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ingredientes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__10);
			setState(93);
			match(T__3);
			setState(95); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(94);
					lista_ingredientes();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << NUMERO) | (1L << TEMPERO))) != 0)) {
				{
				{
				setState(99);
				lista_tempero();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_ingredientesContext extends ParserRuleContext {
		public TerminalNode INGREDIENTE() { return getToken(RECIPEParser.INGREDIENTE, 0); }
		public Medida_solidoContext medida_solido() {
			return getRuleContext(Medida_solidoContext.class,0);
		}
		public Medida_liqContext medida_liq() {
			return getRuleContext(Medida_liqContext.class,0);
		}
		public Lista_ingredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterLista_ingredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitLista_ingredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitLista_ingredientes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_ingredientesContext lista_ingredientes() throws RecognitionException {
		Lista_ingredientesContext _localctx = new Lista_ingredientesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lista_ingredientes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(107);
				medida_solido();
				}
				break;
			case 2:
				{
				setState(108);
				medida_liq();
				}
				break;
			}
			setState(111);
			match(T__12);
			setState(112);
			match(INGREDIENTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Medida_solidoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(RECIPEParser.NUMERO, 0); }
		public Tipo_colherContext tipo_colher() {
			return getRuleContext(Tipo_colherContext.class,0);
		}
		public Medida_solidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medida_solido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterMedida_solido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitMedida_solido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitMedida_solido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Medida_solidoContext medida_solido() throws RecognitionException {
		Medida_solidoContext _localctx = new Medida_solidoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_medida_solido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(NUMERO);
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(115);
				match(T__13);
				}
				break;
			case T__14:
				{
				setState(116);
				match(T__14);
				setState(117);
				tipo_colher();
				}
				break;
			case T__15:
				{
				setState(118);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Medida_liqContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(RECIPEParser.NUMERO, 0); }
		public Medida_liqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medida_liq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterMedida_liq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitMedida_liq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitMedida_liq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Medida_liqContext medida_liq() throws RecognitionException {
		Medida_liqContext _localctx = new Medida_liqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_medida_liq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(NUMERO);
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_temperoContext extends ParserRuleContext {
		public Token peso;
		public Token pitada;
		public Token a_gosto;
		public TerminalNode NUMERO() { return getToken(RECIPEParser.NUMERO, 0); }
		public TerminalNode TEMPERO() { return getToken(RECIPEParser.TEMPERO, 0); }
		public Tipo_colherContext tipo_colher() {
			return getRuleContext(Tipo_colherContext.class,0);
		}
		public Lista_temperoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_tempero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterLista_tempero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitLista_tempero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitLista_tempero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_temperoContext lista_tempero() throws RecognitionException {
		Lista_temperoContext _localctx = new Lista_temperoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lista_tempero);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(NUMERO);
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(125);
					((Lista_temperoContext)_localctx).peso = match(T__13);
					}
					break;
				case T__14:
					{
					setState(126);
					match(T__14);
					setState(127);
					tipo_colher();
					}
					break;
				case T__15:
					{
					setState(128);
					match(T__15);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131);
				match(T__12);
				setState(132);
				match(TEMPERO);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((Lista_temperoContext)_localctx).pitada = match(T__19);
				setState(134);
				match(TEMPERO);
				}
				break;
			case TEMPERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(TEMPERO);
				setState(136);
				((Lista_temperoContext)_localctx).a_gosto = match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_colherContext extends ParserRuleContext {
		public Tipo_colherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_colher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterTipo_colher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitTipo_colher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitTipo_colher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_colherContext tipo_colher() throws RecognitionException {
		Tipo_colherContext _localctx = new Tipo_colherContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo_colher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetodoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__24);
			setState(142);
			match(T__3);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) {
				{
				{
				setState(143);
				cmd();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdAsseContext cmdAsse() {
			return getRuleContext(CmdAsseContext.class,0);
		}
		public CmdCozinheContext cmdCozinhe() {
			return getRuleContext(CmdCozinheContext.class,0);
		}
		public CmdMistureContext cmdMisture() {
			return getRuleContext(CmdMistureContext.class,0);
		}
		public CmdCorteContext cmdCorte() {
			return getRuleContext(CmdCorteContext.class,0);
		}
		public CmdBataContext cmdBata() {
			return getRuleContext(CmdBataContext.class,0);
		}
		public CmdDescanseContext cmdDescanse() {
			return getRuleContext(CmdDescanseContext.class,0);
		}
		public CmdPassoContext cmdPasso() {
			return getRuleContext(CmdPassoContext.class,0);
		}
		public CmdPao_de_LoContext cmdPao_de_Lo() {
			return getRuleContext(CmdPao_de_LoContext.class,0);
		}
		public CmdCoberturaContext cmdCobertura() {
			return getRuleContext(CmdCoberturaContext.class,0);
		}
		public CmdArrozContext cmdArroz() {
			return getRuleContext(CmdArrozContext.class,0);
		}
		public CmdBaseRisottoContext cmdBaseRisotto() {
			return getRuleContext(CmdBaseRisottoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmd);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				cmdAsse();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				cmdCozinhe();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				cmdMisture();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				cmdCorte();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				cmdBata();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				cmdDescanse();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				cmdPasso();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				cmdPao_de_Lo();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				cmdCobertura();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 10);
				{
				setState(160);
				cmdArroz();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				cmdBaseRisotto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAsseContext extends ParserRuleContext {
		public Token temperatura;
		public TerminalNode INGREDIENTE() { return getToken(RECIPEParser.INGREDIENTE, 0); }
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(RECIPEParser.NUMERO, 0); }
		public CmdAsseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAsse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdAsse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdAsse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdAsse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAsseContext cmdAsse() throws RecognitionException {
		CmdAsseContext _localctx = new CmdAsseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdAsse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__26);
			setState(165);
			match(T__27);
			setState(166);
			match(INGREDIENTE);
			setState(167);
			match(T__28);
			setState(168);
			tempo();
			setState(169);
			match(T__28);
			setState(170);
			((CmdAsseContext)_localctx).temperatura = match(NUMERO);
			setState(171);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCozinheContext extends ParserRuleContext {
		public TerminalNode INGREDIENTE() { return getToken(RECIPEParser.INGREDIENTE, 0); }
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public CmdCozinheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCozinhe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdCozinhe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdCozinhe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdCozinhe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCozinheContext cmdCozinhe() throws RecognitionException {
		CmdCozinheContext _localctx = new CmdCozinheContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdCozinhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__30);
			setState(174);
			match(T__27);
			setState(175);
			match(INGREDIENTE);
			setState(176);
			match(T__28);
			setState(177);
			tempo();
			setState(178);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdMistureContext extends ParserRuleContext {
		public List<TerminalNode> INGREDIENTE() { return getTokens(RECIPEParser.INGREDIENTE); }
		public TerminalNode INGREDIENTE(int i) {
			return getToken(RECIPEParser.INGREDIENTE, i);
		}
		public CmdMistureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdMisture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdMisture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdMisture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdMisture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdMistureContext cmdMisture() throws RecognitionException {
		CmdMistureContext _localctx = new CmdMistureContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdMisture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__31);
			setState(181);
			match(T__27);
			setState(182);
			match(INGREDIENTE);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				match(T__28);
				setState(184);
				match(INGREDIENTE);
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__28 );
			setState(189);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCorteContext extends ParserRuleContext {
		public TerminalNode INGREDIENTE() { return getToken(RECIPEParser.INGREDIENTE, 0); }
		public Tipo_corteContext tipo_corte() {
			return getRuleContext(Tipo_corteContext.class,0);
		}
		public CmdCorteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCorte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdCorte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdCorte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdCorte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCorteContext cmdCorte() throws RecognitionException {
		CmdCorteContext _localctx = new CmdCorteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdCorte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__32);
			setState(192);
			match(T__27);
			setState(193);
			match(INGREDIENTE);
			setState(194);
			match(T__28);
			setState(195);
			tipo_corte();
			setState(196);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdBataContext extends ParserRuleContext {
		public List<TerminalNode> INGREDIENTE() { return getTokens(RECIPEParser.INGREDIENTE); }
		public TerminalNode INGREDIENTE(int i) {
			return getToken(RECIPEParser.INGREDIENTE, i);
		}
		public CmdBataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdBata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdBata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdBata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdBata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdBataContext cmdBata() throws RecognitionException {
		CmdBataContext _localctx = new CmdBataContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdBata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__33);
			setState(199);
			match(T__27);
			setState(200);
			match(INGREDIENTE);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				match(T__28);
				setState(202);
				match(INGREDIENTE);
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__28 );
			setState(207);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDescanseContext extends ParserRuleContext {
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public CmdDescanseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDescanse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdDescanse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdDescanse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdDescanse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdDescanseContext cmdDescanse() throws RecognitionException {
		CmdDescanseContext _localctx = new CmdDescanseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdDescanse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__34);
			setState(210);
			match(T__27);
			setState(211);
			tempo();
			setState(212);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPassoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(RECIPEParser.CADEIA, 0); }
		public CmdPassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPasso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdPasso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdPasso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdPassoContext cmdPasso() throws RecognitionException {
		CmdPassoContext _localctx = new CmdPassoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdPasso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__35);
			setState(215);
			match(T__27);
			setState(216);
			match(CADEIA);
			setState(217);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPao_de_LoContext extends ParserRuleContext {
		public CmdPao_de_LoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPao_de_Lo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdPao_de_Lo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdPao_de_Lo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdPao_de_Lo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdPao_de_LoContext cmdPao_de_Lo() throws RecognitionException {
		CmdPao_de_LoContext _localctx = new CmdPao_de_LoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdPao_de_Lo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__36);
			setState(220);
			match(T__27);
			setState(221);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCoberturaContext extends ParserRuleContext {
		public CmdCoberturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCobertura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdCobertura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdCobertura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdCobertura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCoberturaContext cmdCobertura() throws RecognitionException {
		CmdCoberturaContext _localctx = new CmdCoberturaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdCobertura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__37);
			setState(224);
			match(T__27);
			setState(225);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdArrozContext extends ParserRuleContext {
		public CmdArrozContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdArroz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdArroz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdArroz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdArroz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdArrozContext cmdArroz() throws RecognitionException {
		CmdArrozContext _localctx = new CmdArrozContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdArroz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__38);
			setState(228);
			match(T__27);
			setState(229);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdBaseRisottoContext extends ParserRuleContext {
		public CmdBaseRisottoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdBaseRisotto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterCmdBaseRisotto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitCmdBaseRisotto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitCmdBaseRisotto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdBaseRisottoContext cmdBaseRisotto() throws RecognitionException {
		CmdBaseRisottoContext _localctx = new CmdBaseRisottoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdBaseRisotto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__39);
			setState(232);
			match(T__27);
			setState(233);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_corteContext extends ParserRuleContext {
		public Tipo_corteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_corte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterTipo_corte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitTipo_corte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitTipo_corte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_corteContext tipo_corte() throws RecognitionException {
		Tipo_corteContext _localctx = new Tipo_corteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipo_corte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(RECIPEParser.NUMERO, 0); }
		public Unidade_tempoContext unidade_tempo() {
			return getRuleContext(Unidade_tempoContext.class,0);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RECIPEListener ) ((RECIPEListener)listener).exitTempo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RECIPEVisitor ) return ((RECIPEVisitor<? extends T>)visitor).visitTempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(NUMERO);
			setState(238);
			unidade_tempo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u00f3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\5\2<\n\2\3\2\3\2\7\2@\n\2\f"+
		"\2\16\2C\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\6\5U\n\5\r\5\16\5V\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\6\bb\n"+
		"\b\r\b\16\bc\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\t\3\t\5\tp\n\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nz\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0084\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\16\3"+
		"\16\3\16\7\16\u0093\n\16\f\16\16\16\u0096\13\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a5\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\6\22\u00bc\n\22\r\22\16\22\u00bd\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\6\24\u00ce"+
		"\n\24\r\24\16\24\u00cf\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\3\2\t\13\3\2\22"+
		"\25\3\2\30\32\3\2+-\2\u00f0\28\3\2\2\2\4I\3\2\2\2\6M\3\2\2\2\bQ\3\2\2"+
		"\2\nX\3\2\2\2\fZ\3\2\2\2\16^\3\2\2\2\20o\3\2\2\2\22t\3\2\2\2\24{\3\2\2"+
		"\2\26\u008b\3\2\2\2\30\u008d\3\2\2\2\32\u008f\3\2\2\2\34\u00a4\3\2\2\2"+
		"\36\u00a6\3\2\2\2 \u00af\3\2\2\2\"\u00b6\3\2\2\2$\u00c1\3\2\2\2&\u00c8"+
		"\3\2\2\2(\u00d3\3\2\2\2*\u00d8\3\2\2\2,\u00dd\3\2\2\2.\u00e1\3\2\2\2\60"+
		"\u00e5\3\2\2\2\62\u00e9\3\2\2\2\64\u00ed\3\2\2\2\66\u00ef\3\2\2\289\7"+
		"\3\2\29;\5\6\4\2:<\5\4\3\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=A\5\b\5\2>@\5"+
		"\f\7\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\5"+
		"\16\b\2EF\5\32\16\2FG\7\4\2\2GH\7\2\2\3H\3\3\2\2\2IJ\7\5\2\2JK\7\6\2\2"+
		"KL\7\61\2\2L\5\3\2\2\2MN\7\7\2\2NO\7\6\2\2OP\7\61\2\2P\7\3\2\2\2QR\7\b"+
		"\2\2RT\7\6\2\2SU\5\66\34\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t"+
		"\3\2\2\2XY\t\2\2\2Y\13\3\2\2\2Z[\7\f\2\2[\\\7\6\2\2\\]\7\61\2\2]\r\3\2"+
		"\2\2^_\7\r\2\2_a\7\6\2\2`b\5\20\t\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2dh\3\2\2\2eg\5\26\f\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik"+
		"\3\2\2\2jh\3\2\2\2kl\7\16\2\2l\17\3\2\2\2mp\5\22\n\2np\5\24\13\2om\3\2"+
		"\2\2on\3\2\2\2pq\3\2\2\2qr\7\17\2\2rs\7/\2\2s\21\3\2\2\2ty\7.\2\2uz\7"+
		"\20\2\2vw\7\21\2\2wz\5\30\r\2xz\7\22\2\2yu\3\2\2\2yv\3\2\2\2yx\3\2\2\2"+
		"z\23\3\2\2\2{|\7.\2\2|}\t\3\2\2}\25\3\2\2\2~\u0083\7.\2\2\177\u0084\7"+
		"\20\2\2\u0080\u0081\7\21\2\2\u0081\u0084\5\30\r\2\u0082\u0084\7\22\2\2"+
		"\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\7\17\2\2\u0086\u008c\7\60\2\2\u0087\u0088\7\26\2"+
		"\2\u0088\u008c\7\60\2\2\u0089\u008a\7\60\2\2\u008a\u008c\7\27\2\2\u008b"+
		"~\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008c\27\3\2\2\2\u008d"+
		"\u008e\t\4\2\2\u008e\31\3\2\2\2\u008f\u0090\7\33\2\2\u0090\u0094\7\6\2"+
		"\2\u0091\u0093\5\34\17\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\7\34\2\2\u0098\33\3\2\2\2\u0099\u00a5\5\36\20\2\u009a"+
		"\u00a5\5 \21\2\u009b\u00a5\5\"\22\2\u009c\u00a5\5$\23\2\u009d\u00a5\5"+
		"&\24\2\u009e\u00a5\5(\25\2\u009f\u00a5\5*\26\2\u00a0\u00a5\5,\27\2\u00a1"+
		"\u00a5\5.\30\2\u00a2\u00a5\5\60\31\2\u00a3\u00a5\5\62\32\2\u00a4\u0099"+
		"\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4"+
		"\u009d\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2"+
		"\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\35\3\2\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\7\36\2\2\u00a8\u00a9\7/\2"+
		"\2\u00a9\u00aa\7\37\2\2\u00aa\u00ab\5\66\34\2\u00ab\u00ac\7\37\2\2\u00ac"+
		"\u00ad\7.\2\2\u00ad\u00ae\7 \2\2\u00ae\37\3\2\2\2\u00af\u00b0\7!\2\2\u00b0"+
		"\u00b1\7\36\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7\37\2\2\u00b3\u00b4\5"+
		"\66\34\2\u00b4\u00b5\7 \2\2\u00b5!\3\2\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8"+
		"\7\36\2\2\u00b8\u00bb\7/\2\2\u00b9\u00ba\7\37\2\2\u00ba\u00bc\7/\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7 \2\2\u00c0#\3\2\2\2\u00c1\u00c2"+
		"\7#\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c5\7\37\2\2\u00c5"+
		"\u00c6\5\64\33\2\u00c6\u00c7\7 \2\2\u00c7%\3\2\2\2\u00c8\u00c9\7$\2\2"+
		"\u00c9\u00ca\7\36\2\2\u00ca\u00cd\7/\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00ce"+
		"\7/\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7 \2\2\u00d2\'\3\2\2\2"+
		"\u00d3\u00d4\7%\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00d6\5\66\34\2\u00d6\u00d7"+
		"\7 \2\2\u00d7)\3\2\2\2\u00d8\u00d9\7&\2\2\u00d9\u00da\7\36\2\2\u00da\u00db"+
		"\7\61\2\2\u00db\u00dc\7 \2\2\u00dc+\3\2\2\2\u00dd\u00de\7\'\2\2\u00de"+
		"\u00df\7\36\2\2\u00df\u00e0\7 \2\2\u00e0-\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2"+
		"\u00e3\7\36\2\2\u00e3\u00e4\7 \2\2\u00e4/\3\2\2\2\u00e5\u00e6\7)\2\2\u00e6"+
		"\u00e7\7\36\2\2\u00e7\u00e8\7 \2\2\u00e8\61\3\2\2\2\u00e9\u00ea\7*\2\2"+
		"\u00ea\u00eb\7\36\2\2\u00eb\u00ec\7 \2\2\u00ec\63\3\2\2\2\u00ed\u00ee"+
		"\t\5\2\2\u00ee\65\3\2\2\2\u00ef\u00f0\7.\2\2\u00f0\u00f1\5\n\6\2\u00f1"+
		"\67\3\2\2\2\17;AVchoy\u0083\u008b\u0094\u00a4\u00bd\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}