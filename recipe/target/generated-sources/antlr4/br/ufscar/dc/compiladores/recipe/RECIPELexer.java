// Generated from br\u005Cufscar\dc\compiladores\recipe\RECIPE.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.recipe;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RECIPELexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "NUMERO", "INGREDIENTE", "TEMPERO", "CADEIA", "ESC_SEQ", 
			"COMENTARIO", "WS"
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


	public RECIPELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RECIPE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3,\3-\6-\u017f\n-\r-\16-\u0180\3.\3.\7.\u0185\n.\f.\16."+
		"\u0188\13.\3/\6/\u018b\n/\r/\16/\u018c\3\60\3\60\3\60\7\60\u0192\n\60"+
		"\f\60\16\60\u0195\13\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\7\62\u019e"+
		"\n\62\f\62\16\62\u01a1\13\62\3\62\5\62\u01a4\n\62\3\62\3\62\3\62\3\62"+
		"\3\63\6\63\u01ab\n\63\r\63\16\63\u01ac\3\63\3\63\2\2\64\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\62e\63\3\2\6\4\2C\\c|\3\2$$\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u01b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5o\3\2\2"+
		"\2\7{\3\2\2\2\t\u0080\3\2\2\2\13\u0082\3\2\2\2\r\u0087\3\2\2\2\17\u008d"+
		"\3\2\2\2\21\u0092\3\2\2\2\23\u0096\3\2\2\2\25\u009a\3\2\2\2\27\u00a4\3"+
		"\2\2\2\31\u00b1\3\2\2\2\33\u00c2\3\2\2\2\35\u00c5\3\2\2\2\37\u00c7\3\2"+
		"\2\2!\u00ce\3\2\2\2#\u00d5\3\2\2\2%\u00d8\3\2\2\2\'\u00da\3\2\2\2)\u00df"+
		"\3\2\2\2+\u00e6\3\2\2\2-\u00ee\3\2\2\2/\u00f2\3\2\2\2\61\u00fc\3\2\2\2"+
		"\63\u0101\3\2\2\2\65\u0108\3\2\2\2\67\u0113\3\2\2\29\u0118\3\2\2\2;\u011a"+
		"\3\2\2\2=\u011c\3\2\2\2?\u011e\3\2\2\2A\u0126\3\2\2\2C\u012e\3\2\2\2E"+
		"\u0134\3\2\2\2G\u0139\3\2\2\2I\u0142\3\2\2\2K\u0148\3\2\2\2M\u0152\3\2"+
		"\2\2O\u015c\3\2\2\2Q\u0162\3\2\2\2S\u016a\3\2\2\2U\u0170\3\2\2\2W\u0176"+
		"\3\2\2\2Y\u017e\3\2\2\2[\u0182\3\2\2\2]\u018a\3\2\2\2_\u018e\3\2\2\2a"+
		"\u0198\3\2\2\2c\u019b\3\2\2\2e\u01aa\3\2\2\2gh\7t\2\2hi\7g\2\2ij\7e\2"+
		"\2jk\7g\2\2kl\7k\2\2lm\7v\2\2mn\7c\2\2n\4\3\2\2\2op\7h\2\2pq\7k\2\2qr"+
		"\7o\2\2rs\7a\2\2st\7t\2\2tu\7g\2\2uv\7e\2\2vw\7g\2\2wx\7k\2\2xy\7v\2\2"+
		"yz\7c\2\2z\6\3\2\2\2{|\7E\2\2|}\7c\2\2}~\7r\2\2~\177\7c\2\2\177\b\3\2"+
		"\2\2\u0080\u0081\7<\2\2\u0081\n\3\2\2\2\u0082\u0083\7P\2\2\u0083\u0084"+
		"\7q\2\2\u0084\u0085\7o\2\2\u0085\u0086\7g\2\2\u0086\f\3\2\2\2\u0087\u0088"+
		"\7V\2\2\u0088\u0089\7g\2\2\u0089\u008a\7o\2\2\u008a\u008b\7r\2\2\u008b"+
		"\u008c\7q\2\2\u008c\16\3\2\2\2\u008d\u008e\7j\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7c\2\2\u0091\20\3\2\2\2\u0092\u0093\7o\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\22\3\2\2\2\u0096\u0097\7u\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7i\2\2\u0099\24\3\2\2\2\u009a\u009b\7R\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7t\2\2\u009d\u009e\7c\2\2\u009e\u009f\7i\2\2"+
		"\u009f\u00a0\7t\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3"+
		"\7q\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7i\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7f\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2"+
		"\u00ae\u00af\7g\2\2\u00af\u00b0\7u\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7"+
		"h\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7a\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7i\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7u\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7g\2\2\u00c4\34"+
		"\3\2\2\2\u00c5\u00c6\7i\2\2\u00c6\36\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7g\2\2"+
		"\u00cc\u00cd\7t\2\2\u00cd \3\2\2\2\u00ce\u00cf\7z\2\2\u00cf\u00d0\7k\2"+
		"\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4"+
		"\7c\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7n\2\2\u00d7$\3"+
		"\2\2\2\u00d8\u00d9\7n\2\2\u00d9&\3\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7q\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7q\2\2\u00de(\3\2\2\2\u00df\u00e0"+
		"\7r\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7c\2\2\u00e3"+
		"\u00e4\7f\2\2\u00e4\u00e5\7c\2\2\u00e5*\3\2\2\2\u00e6\u00e7\7c\2\2\u00e7"+
		"\u00e8\7a\2\2\u00e8\u00e9\7i\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7u\2\2"+
		"\u00eb\u00ec\7v\2\2\u00ec\u00ed\7q\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7e\2"+
		"\2\u00ef\u00f0\7j\2\2\u00f0\u00f1\7c\2\2\u00f1.\3\2\2\2\u00f2\u00f3\7"+
		"u\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7\u00f8\7o\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7u\2\2\u00fa"+
		"\u00fb\7c\2\2\u00fb\60\3\2\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7q\2\2\u00fe"+
		"\u00ff\7r\2\2\u00ff\u0100\7c\2\2\u0100\62\3\2\2\2\u0101\u0102\7O\2\2\u0102"+
		"\u0103\7g\2\2\u0103\u0104\7v\2\2\u0104\u0105\7q\2\2\u0105\u0106\7f\2\2"+
		"\u0106\u0107\7q\2\2\u0107\64\3\2\2\2\u0108\u0109\7h\2\2\u0109\u010a\7"+
		"k\2\2\u010a\u010b\7o\2\2\u010b\u010c\7a\2\2\u010c\u010d\7o\2\2\u010d\u010e"+
		"\7g\2\2\u010e\u010f\7v\2\2\u010f\u0110\7q\2\2\u0110\u0111\7f\2\2\u0111"+
		"\u0112\7q\2\2\u0112\66\3\2\2\2\u0113\u0114\7c\2\2\u0114\u0115\7u\2\2\u0115"+
		"\u0116\7u\2\2\u0116\u0117\7g\2\2\u01178\3\2\2\2\u0118\u0119\7*\2\2\u0119"+
		":\3\2\2\2\u011a\u011b\7.\2\2\u011b<\3\2\2\2\u011c\u011d\7+\2\2\u011d>"+
		"\3\2\2\2\u011e\u011f\7e\2\2\u011f\u0120\7q\2\2\u0120\u0121\7|\2\2\u0121"+
		"\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7j\2\2\u0124\u0125\7g\2\2"+
		"\u0125@\3\2\2\2\u0126\u0127\7o\2\2\u0127\u0128\7k\2\2\u0128\u0129\7u\2"+
		"\2\u0129\u012a\7v\2\2\u012a\u012b\7w\2\2\u012b\u012c\7t\2\2\u012c\u012d"+
		"\7g\2\2\u012dB\3\2\2\2\u012e\u012f\7e\2\2\u012f\u0130\7q\2\2\u0130\u0131"+
		"\7t\2\2\u0131\u0132\7v\2\2\u0132\u0133\7g\2\2\u0133D\3\2\2\2\u0134\u0135"+
		"\7d\2\2\u0135\u0136\7c\2\2\u0136\u0137\7v\2\2\u0137\u0138\7c\2\2\u0138"+
		"F\3\2\2\2\u0139\u013a\7f\2\2\u013a\u013b\7g\2\2\u013b\u013c\7u\2\2\u013c"+
		"\u013d\7e\2\2\u013d\u013e\7c\2\2\u013e\u013f\7p\2\2\u013f\u0140\7u\2\2"+
		"\u0140\u0141\7g\2\2\u0141H\3\2\2\2\u0142\u0143\7r\2\2\u0143\u0144\7c\2"+
		"\2\u0144\u0145\7u\2\2\u0145\u0146\7u\2\2\u0146\u0147\7q\2\2\u0147J\3\2"+
		"\2\2\u0148\u0149\7R\2\2\u0149\u014a\7c\2\2\u014a\u014b\7q\2\2\u014b\u014c"+
		"\7a\2\2\u014c\u014d\7f\2\2\u014d\u014e\7g\2\2\u014e\u014f\7a\2\2\u014f"+
		"\u0150\7N\2\2\u0150\u0151\7q\2\2\u0151L\3\2\2\2\u0152\u0153\7e\2\2\u0153"+
		"\u0154\7q\2\2\u0154\u0155\7d\2\2\u0155\u0156\7g\2\2\u0156\u0157\7t\2\2"+
		"\u0157\u0158\7v\2\2\u0158\u0159\7w\2\2\u0159\u015a\7t\2\2\u015a\u015b"+
		"\7c\2\2\u015bN\3\2\2\2\u015c\u015d\7c\2\2\u015d\u015e\7t\2\2\u015e\u015f"+
		"\7t\2\2\u015f\u0160\7q\2\2\u0160\u0161\7|\2\2\u0161P\3\2\2\2\u0162\u0163"+
		"\7t\2\2\u0163\u0164\7k\2\2\u0164\u0165\7u\2\2\u0165\u0166\7q\2\2\u0166"+
		"\u0167\7v\2\2\u0167\u0168\7v\2\2\u0168\u0169\7q\2\2\u0169R\3\2\2\2\u016a"+
		"\u016b\7r\2\2\u016b\u016c\7k\2\2\u016c\u016d\7e\2\2\u016d\u016e\7c\2\2"+
		"\u016e\u016f\7t\2\2\u016fT\3\2\2\2\u0170\u0171\7t\2\2\u0171\u0172\7c\2"+
		"\2\u0172\u0173\7n\2\2\u0173\u0174\7c\2\2\u0174\u0175\7t\2\2\u0175V\3\2"+
		"\2\2\u0176\u0177\7e\2\2\u0177\u0178\7q\2\2\u0178\u0179\7t\2\2\u0179\u017a"+
		"\7v\2\2\u017a\u017b\7c\2\2\u017b\u017c\7t\2\2\u017cX\3\2\2\2\u017d\u017f"+
		"\4\62;\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181Z\3\2\2\2\u0182\u0186\4C\\\2\u0183\u0185\t\2\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\\\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\4c|\2\u018a\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"^\3\2\2\2\u018e\u0193\7$\2\2\u018f\u0192\5a\61\2\u0190\u0192\n\3\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196"+
		"\u0197\7$\2\2\u0197`\3\2\2\2\u0198\u0199\7^\2\2\u0199\u019a\7$\2\2\u019a"+
		"b\3\2\2\2\u019b\u019f\7&\2\2\u019c\u019e\n\4\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a4\7\17\2\2\u01a3\u01a2\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7\f\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a8\b\62\2\2\u01a8d\3\2\2\2\u01a9\u01ab\t\5\2\2\u01aa\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\b\63\2\2\u01aff\3\2\2\2\f\2\u0180\u0184\u0186"+
		"\u018c\u0191\u0193\u019f\u01a3\u01ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}