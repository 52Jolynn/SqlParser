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
		SIGNED_NUMERIC_LITERAL=30, UNSIGNED_NUMERIC_LITERAL=31, IDENTIFIER=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '"
	};
	public static final String[] ruleNames = {
		"SPACE", "TAB", "NEWLINE", "SIGN", "PLUS_SIGN", "MINUS_SIGN", "DOUBLE_QUOTE", 
		"PERCENT", "AMPERSAND", "QUOTE", "LEFT_PAREN", "RIGHT_PAREN", "ASTERISK", 
		"COMMA", "PERIOD", "SOLIDUS", "COLON", "SEMICOLON", "LESS_THAN", "LESS_THAN_OR_EQ", 
		"EQ", "NOT_EQ", "GREATER_THAN", "GREATER_THAN_OR_EQ", "QUESTION_MARK", 
		"UNDERSCORE", "VERTICAL_BAR", "LEFT_BRACKET", "RIGHT_BRACKET", "ZERO", 
		"DIGIT", "ALPHA", "IDENTIFIER_BEGINNING_LETTER", "IDENTIFIER_BEGINNING_LETTER_LOOSE", 
		"IDENTIFIER_FOLLOW_BEGIN_LETTER", "HEX", "UNICODE", "BIT", "SEXAGESIMAL", 
		"DECIMAL", "UNSIGNED_INTEGER", "EXACT_NUMERIC_LITERAL", "APPROXIMATE_NUMERIC_LITERAL", 
		"EXPONENT", "MANTISSA", "SIGNED_NUMERIC_LITERAL", "UNSIGNED_NUMERIC_LITERAL", 
		"IDENTIFIER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\5\4i\n"+
		"\4\3\4\3\4\3\5\3\5\5\5o\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u0098\n\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\5(\u00c6\n(\3)\3)\6)\u00ca"+
		"\n)\r)\16)\u00cb\3*\3*\3*\7*\u00d1\n*\f*\16*\u00d4\13*\5*\u00d6\n*\3+"+
		"\3+\5+\u00da\n+\3+\5+\u00dd\n+\3,\3,\3,\3,\3-\5-\u00e4\n-\3-\3-\3.\3."+
		"\3/\3/\3/\5/\u00ed\n/\3\60\3\60\5\60\u00f1\n\60\3\61\3\61\7\61\u00f5\n"+
		"\61\f\61\16\61\u00f8\13\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U"+
		"\2W\2Y\2[\2] _!a\"\3\2\f\3\2\62;\4\2C\\c|\5\2C\\aac|\b\2\60\60C\\aac|"+
		"\u0082\u0082\0\0\n\2&&\60\60\62;C\\aac|\u0082\u0082\0\0\5\2\62;CHch\3"+
		"\2\62\63\3\2\62\67\3\2\63;\4\2GGgg\u00f6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7h\3\2\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3"+
		"\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31"+
		"~\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2!\u0086\3"+
		"\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0091"+
		"\3\2\2\2-\u0097\3\2\2\2/\u0099\3\2\2\2\61\u009b\3\2\2\2\63\u009e\3\2\2"+
		"\2\65\u00a0\3\2\2\2\67\u00a2\3\2\2\29\u00a4\3\2\2\2;\u00a6\3\2\2\2=\u00a8"+
		"\3\2\2\2?\u00aa\3\2\2\2A\u00ac\3\2\2\2C\u00ae\3\2\2\2E\u00b0\3\2\2\2G"+
		"\u00b2\3\2\2\2I\u00b4\3\2\2\2K\u00b6\3\2\2\2M\u00be\3\2\2\2O\u00c5\3\2"+
		"\2\2Q\u00c7\3\2\2\2S\u00d5\3\2\2\2U\u00dc\3\2\2\2W\u00de\3\2\2\2Y\u00e3"+
		"\3\2\2\2[\u00e7\3\2\2\2]\u00e9\3\2\2\2_\u00f0\3\2\2\2a\u00f2\3\2\2\2c"+
		"d\7\"\2\2d\4\3\2\2\2ef\7\13\2\2f\6\3\2\2\2gi\7\17\2\2hg\3\2\2\2hi\3\2"+
		"\2\2ij\3\2\2\2jk\7\f\2\2k\b\3\2\2\2lo\5\13\6\2mo\5\r\7\2nl\3\2\2\2nm\3"+
		"\2\2\2o\n\3\2\2\2pq\7-\2\2q\f\3\2\2\2rs\7/\2\2s\16\3\2\2\2tu\7$\2\2u\20"+
		"\3\2\2\2vw\7\'\2\2w\22\3\2\2\2xy\7(\2\2y\24\3\2\2\2z{\7)\2\2{\26\3\2\2"+
		"\2|}\7*\2\2}\30\3\2\2\2~\177\7+\2\2\177\32\3\2\2\2\u0080\u0081\7,\2\2"+
		"\u0081\34\3\2\2\2\u0082\u0083\7.\2\2\u0083\36\3\2\2\2\u0084\u0085\7\60"+
		"\2\2\u0085 \3\2\2\2\u0086\u0087\7\61\2\2\u0087\"\3\2\2\2\u0088\u0089\7"+
		"<\2\2\u0089$\3\2\2\2\u008a\u008b\7=\2\2\u008b&\3\2\2\2\u008c\u008d\7>"+
		"\2\2\u008d(\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7?\2\2\u0090*\3\2\2"+
		"\2\u0091\u0092\7?\2\2\u0092,\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0098\7"+
		"@\2\2\u0095\u0096\7#\2\2\u0096\u0098\7?\2\2\u0097\u0093\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098.\3\2\2\2\u0099\u009a\7@\2\2\u009a\60\3\2\2\2\u009b"+
		"\u009c\7@\2\2\u009c\u009d\7?\2\2\u009d\62\3\2\2\2\u009e\u009f\7A\2\2\u009f"+
		"\64\3\2\2\2\u00a0\u00a1\7a\2\2\u00a1\66\3\2\2\2\u00a2\u00a3\7~\2\2\u00a3"+
		"8\3\2\2\2\u00a4\u00a5\7]\2\2\u00a5:\3\2\2\2\u00a6\u00a7\7_\2\2\u00a7<"+
		"\3\2\2\2\u00a8\u00a9\7\62\2\2\u00a9>\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab"+
		"@\3\2\2\2\u00ac\u00ad\t\3\2\2\u00adB\3\2\2\2\u00ae\u00af\t\4\2\2\u00af"+
		"D\3\2\2\2\u00b0\u00b1\t\5\2\2\u00b1F\3\2\2\2\u00b2\u00b3\t\6\2\2\u00b3"+
		"H\3\2\2\2\u00b4\u00b5\t\7\2\2\u00b5J\3\2\2\2\u00b6\u00b7\7w\2\2\u00b7"+
		"\u00b8\7W\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5I%\2\u00ba\u00bb\5I%\2"+
		"\u00bb\u00bc\5I%\2\u00bc\u00bd\5I%\2\u00bdL\3\2\2\2\u00be\u00bf\t\b\2"+
		"\2\u00bfN\3\2\2\2\u00c0\u00c1\t\t\2\2\u00c1\u00c6\t\2\2\2\u00c2\u00c6"+
		"\t\2\2\2\u00c3\u00c4\78\2\2\u00c4\u00c6\7\62\2\2\u00c5\u00c0\3\2\2\2\u00c5"+
		"\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6P\3\2\2\2\u00c7\u00c9\5\37\20"+
		"\2\u00c8\u00ca\5? \2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00ccR\3\2\2\2\u00cd\u00d6\5=\37\2\u00ce"+
		"\u00d2\t\n\2\2\u00cf\u00d1\5? \2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2"+
		"\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d6T\3\2\2\2\u00d7"+
		"\u00d9\5S*\2\u00d8\u00da\5Q)\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00dd\3\2\2\2\u00db\u00dd\5Q)\2\u00dc\u00d7\3\2\2\2\u00dc\u00db"+
		"\3\2\2\2\u00ddV\3\2\2\2\u00de\u00df\5[.\2\u00df\u00e0\t\13\2\2\u00e0\u00e1"+
		"\5Y-\2\u00e1X\3\2\2\2\u00e2\u00e4\5\t\5\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5S*\2\u00e6Z\3\2\2\2\u00e7\u00e8"+
		"\5U+\2\u00e8\\\3\2\2\2\u00e9\u00ec\5\t\5\2\u00ea\u00ed\5U+\2\u00eb\u00ed"+
		"\5W,\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed^\3\2\2\2\u00ee\u00f1"+
		"\5U+\2\u00ef\u00f1\5W,\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"`\3\2\2\2\u00f2\u00f6\5E#\2\u00f3\u00f5\5G$\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7b\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\20\2hn\u0097\u00c5\u00cb\u00d2\u00d5\u00d9\u00dc"+
		"\u00e3\u00ec\u00f0\u00f6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}