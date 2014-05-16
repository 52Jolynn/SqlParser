// Generated from D:/Work/Code/Intelij IDEA/SqlParser/src/main/resources\CommonLexer.g4 by ANTLR 4.x
package com.laudandjolynn.sqlparser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, TAB=2, NEWLINE=3, SIGN=4, PLUS_SIGN=5, MINUS_SIGN=6, DOUBLE_QUOTE=7, 
		PERCENT=8, AMPERSAND=9, QUOTE=10, LEFT_PAREN=11, RIGHT_PAREN=12, ASTERISK=13, 
		COMMA=14, PERIOD=15, SOLIDUS=16, COLON=17, SEMICOLON=18, LESS_THAN=19, 
		LESS_THAN_OR_EQ=20, EQ=21, NOT_EQ=22, GREATER_THAN=23, GREATER_THAN_OR_EQ=24, 
		QUESTION_MARK=25, UNDERSCORE=26, VERTICAL_BAR=27, LEFT_BRACKET=28, RIGHT_BRACKET=29, 
		IDENTIFIER=30, NUMBER=31, SIGNED_NUMERIC_LITERAL=32, UNSIGNED_NUMERIC_LITERAL=33, 
		EXACT_NUMERIC_LITERAL=34, APPROXIMATE_NUMERIC_LITERAL=35, SIGNED_INTEGER=36, 
		UNSIGNED_INTEGER=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'"
	};
	public static final String[] ruleNames = {
		"SPACE", "TAB", "NEWLINE", "SIGN", "PLUS_SIGN", "MINUS_SIGN", "DOUBLE_QUOTE", 
		"PERCENT", "AMPERSAND", "QUOTE", "LEFT_PAREN", "RIGHT_PAREN", "ASTERISK", 
		"COMMA", "PERIOD", "SOLIDUS", "COLON", "SEMICOLON", "LESS_THAN", "LESS_THAN_OR_EQ", 
		"EQ", "NOT_EQ", "GREATER_THAN", "GREATER_THAN_OR_EQ", "QUESTION_MARK", 
		"UNDERSCORE", "VERTICAL_BAR", "LEFT_BRACKET", "RIGHT_BRACKET", "ZERO", 
		"DIGIT", "ALPHA", "IDENTIFIER_BEGINNING_LETTER", "IDENTIFIER_BEGINNING_LETTER_LOOSE", 
		"IDENTIFIER_FOLLOW_BEGIN_LETTER", "HEX", "UNICODE", "BIT", "SEXAGESIMAL", 
		"EXPONENT", "MANTISSA", "DECIMAL", "IDENTIFIER", "NUMBER", "SIGNED_NUMERIC_LITERAL", 
		"UNSIGNED_NUMERIC_LITERAL", "EXACT_NUMERIC_LITERAL", "APPROXIMATE_NUMERIC_LITERAL", 
		"SIGNED_INTEGER", "UNSIGNED_INTEGER"
	};


	public CommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0102\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\4\5\4m\n\4\3\4\3\4\3\5\3\5\5\5s\n\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\5\27\u009c\n\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\5(\u00ca"+
		"\n(\3)\5)\u00cd\n)\3)\3)\3*\3*\3+\3+\6+\u00d5\n+\r+\16+\u00d6\3,\3,\7"+
		",\u00db\n,\f,\16,\u00de\13,\3-\3-\3.\5.\u00e3\n.\3.\3.\3/\3/\5/\u00e9"+
		"\n/\3\60\3\60\5\60\u00ed\n\60\3\60\5\60\u00f0\n\60\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u00fc\n\63\f\63\16\63\u00ff\13\63"+
		"\5\63\u0101\n\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W Y![\""+
		"]#_$a%c&e\'\3\2\f\3\2\62;\4\2C\\c|\5\2C\\aac|\b\2\60\60C\\aac|\u0082\u0082"+
		"\0\0\n\2&&\60\60\62;C\\aac|\u0082\u0082\0\0\5\2\62;CHch\3\2\62\63\3\2"+
		"\62\67\4\2GGgg\3\2\63;\u0102\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2"+
		"\2\2\7l\3\2\2\2\tr\3\2\2\2\13t\3\2\2\2\rv\3\2\2\2\17x\3\2\2\2\21z\3\2"+
		"\2\2\23|\3\2\2\2\25~\3\2\2\2\27\u0080\3\2\2\2\31\u0082\3\2\2\2\33\u0084"+
		"\3\2\2\2\35\u0086\3\2\2\2\37\u0088\3\2\2\2!\u008a\3\2\2\2#\u008c\3\2\2"+
		"\2%\u008e\3\2\2\2\'\u0090\3\2\2\2)\u0092\3\2\2\2+\u0095\3\2\2\2-\u009b"+
		"\3\2\2\2/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2"+
		"\2\2\67\u00a6\3\2\2\29\u00a8\3\2\2\2;\u00aa\3\2\2\2=\u00ac\3\2\2\2?\u00ae"+
		"\3\2\2\2A\u00b0\3\2\2\2C\u00b2\3\2\2\2E\u00b4\3\2\2\2G\u00b6\3\2\2\2I"+
		"\u00b8\3\2\2\2K\u00ba\3\2\2\2M\u00c2\3\2\2\2O\u00c9\3\2\2\2Q\u00cc\3\2"+
		"\2\2S\u00d0\3\2\2\2U\u00d2\3\2\2\2W\u00d8\3\2\2\2Y\u00df\3\2\2\2[\u00e2"+
		"\3\2\2\2]\u00e8\3\2\2\2_\u00ef\3\2\2\2a\u00f1\3\2\2\2c\u00f5\3\2\2\2e"+
		"\u0100\3\2\2\2gh\7\"\2\2h\4\3\2\2\2ij\7\13\2\2j\6\3\2\2\2km\7\17\2\2l"+
		"k\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\f\2\2o\b\3\2\2\2ps\5\13\6\2qs\5\r\7"+
		"\2rp\3\2\2\2rq\3\2\2\2s\n\3\2\2\2tu\7-\2\2u\f\3\2\2\2vw\7/\2\2w\16\3\2"+
		"\2\2xy\7$\2\2y\20\3\2\2\2z{\7\'\2\2{\22\3\2\2\2|}\7(\2\2}\24\3\2\2\2~"+
		"\177\7)\2\2\177\26\3\2\2\2\u0080\u0081\7*\2\2\u0081\30\3\2\2\2\u0082\u0083"+
		"\7+\2\2\u0083\32\3\2\2\2\u0084\u0085\7,\2\2\u0085\34\3\2\2\2\u0086\u0087"+
		"\7.\2\2\u0087\36\3\2\2\2\u0088\u0089\7\60\2\2\u0089 \3\2\2\2\u008a\u008b"+
		"\7\61\2\2\u008b\"\3\2\2\2\u008c\u008d\7<\2\2\u008d$\3\2\2\2\u008e\u008f"+
		"\7=\2\2\u008f&\3\2\2\2\u0090\u0091\7>\2\2\u0091(\3\2\2\2\u0092\u0093\7"+
		">\2\2\u0093\u0094\7?\2\2\u0094*\3\2\2\2\u0095\u0096\7?\2\2\u0096,\3\2"+
		"\2\2\u0097\u0098\7>\2\2\u0098\u009c\7@\2\2\u0099\u009a\7#\2\2\u009a\u009c"+
		"\7?\2\2\u009b\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c.\3\2\2\2\u009d\u009e"+
		"\7@\2\2\u009e\60\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\u00a1\7?\2\2\u00a1\62"+
		"\3\2\2\2\u00a2\u00a3\7A\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7a\2\2\u00a5"+
		"\66\3\2\2\2\u00a6\u00a7\7~\2\2\u00a78\3\2\2\2\u00a8\u00a9\7]\2\2\u00a9"+
		":\3\2\2\2\u00aa\u00ab\7_\2\2\u00ab<\3\2\2\2\u00ac\u00ad\7\62\2\2\u00ad"+
		">\3\2\2\2\u00ae\u00af\t\2\2\2\u00af@\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1"+
		"B\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3D\3\2\2\2\u00b4\u00b5\t\5\2\2\u00b5"+
		"F\3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7H\3\2\2\2\u00b8\u00b9\t\7\2\2\u00b9"+
		"J\3\2\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7W\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\5I%\2\u00be\u00bf\5I%\2\u00bf\u00c0\5I%\2\u00c0\u00c1\5I%\2\u00c1"+
		"L\3\2\2\2\u00c2\u00c3\t\b\2\2\u00c3N\3\2\2\2\u00c4\u00c5\t\t\2\2\u00c5"+
		"\u00ca\t\2\2\2\u00c6\u00ca\t\2\2\2\u00c7\u00c8\78\2\2\u00c8\u00ca\7\62"+
		"\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"P\3\2\2\2\u00cb\u00cd\5\t\5\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5e\63\2\u00cfR\3\2\2\2\u00d0\u00d1\5"+
		"_\60\2\u00d1T\3\2\2\2\u00d2\u00d4\5\37\20\2\u00d3\u00d5\5? \2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"V\3\2\2\2\u00d8\u00dc\5E#\2\u00d9\u00db\5G$\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddX\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00df\u00e0\5[.\2\u00e0Z\3\2\2\2\u00e1\u00e3\5\t"+
		"\5\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\5]/\2\u00e5\\\3\2\2\2\u00e6\u00e9\5_\60\2\u00e7\u00e9\5a\61\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9^\3\2\2\2\u00ea\u00ec\5e\63\2"+
		"\u00eb\u00ed\5U+\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00f0\5U+\2\u00ef\u00ea\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"`\3\2\2\2\u00f1\u00f2\5S*\2\u00f2\u00f3\t\n\2\2\u00f3\u00f4\5Q)\2\u00f4"+
		"b\3\2\2\2\u00f5\u00f6\5\t\5\2\u00f6\u00f7\5e\63\2\u00f7d\3\2\2\2\u00f8"+
		"\u0101\5=\37\2\u00f9\u00fd\t\13\2\2\u00fa\u00fc\5? \2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00f9\3\2"+
		"\2\2\u0101f\3\2\2\2\20\2lr\u009b\u00c9\u00cc\u00d6\u00dc\u00e2\u00e8\u00ec"+
		"\u00ef\u00fd\u0100\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}