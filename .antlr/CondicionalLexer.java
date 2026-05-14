// Generated from c:/Users/Lucas/Desktop/analizador v2/Condicional.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CondicionalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CUANDO=1, ENTONCES=2, A=3, SEM=4, ACT=5, DES=6, AJU=7, ES=8, MAY=9, MEN=10, 
		ENC=11, APA=12, ID=13, ENTERO=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CUANDO", "ENTONCES", "A", "SEM", "ACT", "DES", "AJU", "ES", "MAY", "MEN", 
			"ENC", "APA", "ID", "ENTERO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cuando'", "'entonces'", "'a'", "';'", "'activar'", "'desactivar'", 
			"'ajustar'", "'es'", "'mayor que'", "'menor que'", "'encendido'", "'apagado'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CUANDO", "ENTONCES", "A", "SEM", "ACT", "DES", "AJU", "ES", "MAY", 
			"MEN", "ENC", "APA", "ID", "ENTERO", "WS"
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


	public CondicionalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Condicional.g4"; }

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
		"\u0004\u0000\u000f\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\fz\b\f\n\f\f\f}\t\f\u0001\r\u0004\r\u0080\b\r\u000b"+
		"\r\f\r\u0081\u0001\u000e\u0004\u000e\u0085\b\u000e\u000b\u000e\f\u000e"+
		"\u0086\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0004"+
		"\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r"+
		"  \u008c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003"+
		"&\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001"+
		"\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b;\u0001\u0000\u0000"+
		"\u0000\rF\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000\u0011"+
		"Q\u0001\u0000\u0000\u0000\u0013[\u0001\u0000\u0000\u0000\u0015e\u0001"+
		"\u0000\u0000\u0000\u0017o\u0001\u0000\u0000\u0000\u0019w\u0001\u0000\u0000"+
		"\u0000\u001b\u007f\u0001\u0000\u0000\u0000\u001d\u0084\u0001\u0000\u0000"+
		"\u0000\u001f \u0005c\u0000\u0000 !\u0005u\u0000\u0000!\"\u0005a\u0000"+
		"\u0000\"#\u0005n\u0000\u0000#$\u0005d\u0000\u0000$%\u0005o\u0000\u0000"+
		"%\u0002\u0001\u0000\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005n\u0000"+
		"\u0000()\u0005t\u0000\u0000)*\u0005o\u0000\u0000*+\u0005n\u0000\u0000"+
		"+,\u0005c\u0000\u0000,-\u0005e\u0000\u0000-.\u0005s\u0000\u0000.\u0004"+
		"\u0001\u0000\u0000\u0000/0\u0005a\u0000\u00000\u0006\u0001\u0000\u0000"+
		"\u000012\u0005;\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005a\u0000"+
		"\u000045\u0005c\u0000\u000056\u0005t\u0000\u000067\u0005i\u0000\u0000"+
		"78\u0005v\u0000\u000089\u0005a\u0000\u00009:\u0005r\u0000\u0000:\n\u0001"+
		"\u0000\u0000\u0000;<\u0005d\u0000\u0000<=\u0005e\u0000\u0000=>\u0005s"+
		"\u0000\u0000>?\u0005a\u0000\u0000?@\u0005c\u0000\u0000@A\u0005t\u0000"+
		"\u0000AB\u0005i\u0000\u0000BC\u0005v\u0000\u0000CD\u0005a\u0000\u0000"+
		"DE\u0005r\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005a\u0000\u0000"+
		"GH\u0005j\u0000\u0000HI\u0005u\u0000\u0000IJ\u0005s\u0000\u0000JK\u0005"+
		"t\u0000\u0000KL\u0005a\u0000\u0000LM\u0005r\u0000\u0000M\u000e\u0001\u0000"+
		"\u0000\u0000NO\u0005e\u0000\u0000OP\u0005s\u0000\u0000P\u0010\u0001\u0000"+
		"\u0000\u0000QR\u0005m\u0000\u0000RS\u0005a\u0000\u0000ST\u0005y\u0000"+
		"\u0000TU\u0005o\u0000\u0000UV\u0005r\u0000\u0000VW\u0005 \u0000\u0000"+
		"WX\u0005q\u0000\u0000XY\u0005u\u0000\u0000YZ\u0005e\u0000\u0000Z\u0012"+
		"\u0001\u0000\u0000\u0000[\\\u0005m\u0000\u0000\\]\u0005e\u0000\u0000]"+
		"^\u0005n\u0000\u0000^_\u0005o\u0000\u0000_`\u0005r\u0000\u0000`a\u0005"+
		" \u0000\u0000ab\u0005q\u0000\u0000bc\u0005u\u0000\u0000cd\u0005e\u0000"+
		"\u0000d\u0014\u0001\u0000\u0000\u0000ef\u0005e\u0000\u0000fg\u0005n\u0000"+
		"\u0000gh\u0005c\u0000\u0000hi\u0005e\u0000\u0000ij\u0005n\u0000\u0000"+
		"jk\u0005d\u0000\u0000kl\u0005i\u0000\u0000lm\u0005d\u0000\u0000mn\u0005"+
		"o\u0000\u0000n\u0016\u0001\u0000\u0000\u0000op\u0005a\u0000\u0000pq\u0005"+
		"p\u0000\u0000qr\u0005a\u0000\u0000rs\u0005g\u0000\u0000st\u0005a\u0000"+
		"\u0000tu\u0005d\u0000\u0000uv\u0005o\u0000\u0000v\u0018\u0001\u0000\u0000"+
		"\u0000w{\u0007\u0000\u0000\u0000xz\u0007\u0001\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|\u001a\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u0080\u0007\u0002\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u001c\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\u0007\u0003\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0006\u000e\u0000\u0000\u0089\u001e\u0001\u0000\u0000\u0000\u0004"+
		"\u0000{\u0081\u0086\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}