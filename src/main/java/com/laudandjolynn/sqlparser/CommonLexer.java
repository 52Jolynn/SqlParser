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
		UNSIGNED_INTEGER=1, SIGNED_INTEGER=2, UNSIGNED_NUMERIC_LITERAL=3, SIGNED_NUMERIC_LITERAL=4, 
		SPACE=5, TAB=6, NEWLINE=7, SIGN=8, PLUS_SIGN=9, MINUS_SIGN=10, DOUBLE_QUOTE=11, 
		PERCENT=12, AMPERSAND=13, QUOTE=14, LEFT_PAREN=15, RIGHT_PAREN=16, ASTERISK=17, 
		COMMA=18, PERIOD=19, SOLIDUS=20, COLON=21, SEMICOLON=22, LESS_THAN=23, 
		LESS_THAN_OR_EQ=24, EQ=25, NOT_EQ=26, GREATER_THAN=27, GREATER_THAN_OR_EQ=28, 
		QUESTION_MARK=29, UNDERSCORE=30, VERTICAL_BAR=31, LEFT_BRACKET=32, RIGHT_BRACKET=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"UNSIGNED_INTEGER", "SIGNED_INTEGER", "UNSIGNED_NUMERIC_LITERAL", "SIGNED_NUMERIC_LITERAL", 
		"SPACE", "TAB", "NEWLINE", "SIGN", "PLUS_SIGN", "MINUS_SIGN", "DOUBLE_QUOTE", 
		"PERCENT", "AMPERSAND", "QUOTE", "LEFT_PAREN", "RIGHT_PAREN", "ASTERISK", 
		"COMMA", "PERIOD", "SOLIDUS", "COLON", "SEMICOLON", "LESS_THAN", "LESS_THAN_OR_EQ", 
		"EQ", "NOT_EQ", "GREATER_THAN", "GREATER_THAN_OR_EQ", "QUESTION_MARK", 
		"UNDERSCORE", "VERTICAL_BAR", "LEFT_BRACKET", "RIGHT_BRACKET", "ZERO", 
		"DIGIT", "ALPHA", "IDENTIFIER_BEGINNING_LETTER", "IDENTIFIER_BEGINNING_LETTER_LOOSE", 
		"HEX", "UNICODE", "BIT", "SEXAGESIMAL", "EXPONENT", "MANTISSA", "EXACT_NUMERIC_LITERAL", 
		"APPROXIMATE_NUMERIC_LITERAL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\5\2h\n\2\3"+
		"\3\3\3\3\3\3\4\3\4\5\4o\n\4\3\5\5\5r\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\5"+
		"\b{\n\b\3\b\3\b\3\t\3\t\5\t\u0081\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\5\33\u00aa\n\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\5+\u00d6\n+\3,\3,\3-\3-\3"+
		".\3.\3.\5.\u00df\n.\5.\u00e1\n.\3.\3.\3.\5.\u00e6\n.\3/\3/\3/\3/\2\2\60"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2\3\2\13\3\2\63;\3\2\62"+
		";\4\2C\\c|\5\2C\\aac|\b\2\60\60C\\aac|\u0082\u0082\0\0\5\2\62;CHch\3\2"+
		"\62\63\3\2\62\67\4\2GGgg\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7n\3\2\2\2\tq\3\2\2\2\13u\3\2\2\2\rw\3"+
		"\2\2\2\17z\3\2\2\2\21\u0080\3\2\2\2\23\u0082\3\2\2\2\25\u0084\3\2\2\2"+
		"\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37"+
		"\u008e\3\2\2\2!\u0090\3\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0096\3"+
		"\2\2\2)\u0098\3\2\2\2+\u009a\3\2\2\2-\u009c\3\2\2\2/\u009e\3\2\2\2\61"+
		"\u00a0\3\2\2\2\63\u00a3\3\2\2\2\65\u00a9\3\2\2\2\67\u00ab\3\2\2\29\u00ad"+
		"\3\2\2\2;\u00b0\3\2\2\2=\u00b2\3\2\2\2?\u00b4\3\2\2\2A\u00b6\3\2\2\2C"+
		"\u00b8\3\2\2\2E\u00ba\3\2\2\2G\u00bc\3\2\2\2I\u00be\3\2\2\2K\u00c0\3\2"+
		"\2\2M\u00c2\3\2\2\2O\u00c4\3\2\2\2Q\u00c6\3\2\2\2S\u00ce\3\2\2\2U\u00d5"+
		"\3\2\2\2W\u00d7\3\2\2\2Y\u00d9\3\2\2\2[\u00e5\3\2\2\2]\u00e7\3\2\2\2_"+
		"h\7\62\2\2`d\t\2\2\2ac\t\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"eh\3\2\2\2fd\3\2\2\2g_\3\2\2\2g`\3\2\2\2h\4\3\2\2\2ij\5\21\t\2jk\5\3\2"+
		"\2k\6\3\2\2\2lo\5[.\2mo\5]/\2nl\3\2\2\2nm\3\2\2\2o\b\3\2\2\2pr\5\21\t"+
		"\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\5\7\4\2t\n\3\2\2\2uv\7\"\2\2v\f\3\2"+
		"\2\2wx\7\13\2\2x\16\3\2\2\2y{\7\17\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|"+
		"}\7\f\2\2}\20\3\2\2\2~\u0081\5\23\n\2\177\u0081\5\25\13\2\u0080~\3\2\2"+
		"\2\u0080\177\3\2\2\2\u0081\22\3\2\2\2\u0082\u0083\7-\2\2\u0083\24\3\2"+
		"\2\2\u0084\u0085\7/\2\2\u0085\26\3\2\2\2\u0086\u0087\7$\2\2\u0087\30\3"+
		"\2\2\2\u0088\u0089\7\'\2\2\u0089\32\3\2\2\2\u008a\u008b\7(\2\2\u008b\34"+
		"\3\2\2\2\u008c\u008d\7)\2\2\u008d\36\3\2\2\2\u008e\u008f\7*\2\2\u008f"+
		" \3\2\2\2\u0090\u0091\7+\2\2\u0091\"\3\2\2\2\u0092\u0093\7,\2\2\u0093"+
		"$\3\2\2\2\u0094\u0095\7.\2\2\u0095&\3\2\2\2\u0096\u0097\7\60\2\2\u0097"+
		"(\3\2\2\2\u0098\u0099\7\61\2\2\u0099*\3\2\2\2\u009a\u009b\7<\2\2\u009b"+
		",\3\2\2\2\u009c\u009d\7=\2\2\u009d.\3\2\2\2\u009e\u009f\7>\2\2\u009f\60"+
		"\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2\7?\2\2\u00a2\62\3\2\2\2\u00a3"+
		"\u00a4\7?\2\2\u00a4\64\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00aa\7@\2\2\u00a7"+
		"\u00a8\7#\2\2\u00a8\u00aa\7?\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\66\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7@\2"+
		"\2\u00ae\u00af\7?\2\2\u00af:\3\2\2\2\u00b0\u00b1\7A\2\2\u00b1<\3\2\2\2"+
		"\u00b2\u00b3\7a\2\2\u00b3>\3\2\2\2\u00b4\u00b5\7~\2\2\u00b5@\3\2\2\2\u00b6"+
		"\u00b7\7]\2\2\u00b7B\3\2\2\2\u00b8\u00b9\7_\2\2\u00b9D\3\2\2\2\u00ba\u00bb"+
		"\7\62\2\2\u00bbF\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bdH\3\2\2\2\u00be\u00bf"+
		"\t\4\2\2\u00bfJ\3\2\2\2\u00c0\u00c1\t\5\2\2\u00c1L\3\2\2\2\u00c2\u00c3"+
		"\t\6\2\2\u00c3N\3\2\2\2\u00c4\u00c5\t\7\2\2\u00c5P\3\2\2\2\u00c6\u00c7"+
		"\7w\2\2\u00c7\u00c8\7W\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\5O(\2\u00ca"+
		"\u00cb\5O(\2\u00cb\u00cc\5O(\2\u00cc\u00cd\5O(\2\u00cdR\3\2\2\2\u00ce"+
		"\u00cf\t\b\2\2\u00cfT\3\2\2\2\u00d0\u00d1\t\t\2\2\u00d1\u00d6\t\3\2\2"+
		"\u00d2\u00d6\t\3\2\2\u00d3\u00d4\78\2\2\u00d4\u00d6\7\62\2\2\u00d5\u00d0"+
		"\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6V\3\2\2\2\u00d7"+
		"\u00d8\5\5\3\2\u00d8X\3\2\2\2\u00d9\u00da\5[.\2\u00daZ\3\2\2\2\u00db\u00e0"+
		"\5\3\2\2\u00dc\u00de\5\'\24\2\u00dd\u00df\5\3\2\2\u00de\u00dd\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e3\5\'\24\2\u00e3\u00e4\5\3\2\2"+
		"\u00e4\u00e6\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\\\3"+
		"\2\2\2\u00e7\u00e8\5Y-\2\u00e8\u00e9\t\n\2\2\u00e9\u00ea\5W,\2\u00ea^"+
		"\3\2\2\2\16\2dgnqz\u0080\u00a9\u00d5\u00de\u00e0\u00e5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}