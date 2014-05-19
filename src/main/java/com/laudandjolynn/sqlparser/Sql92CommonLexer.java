// Generated from D:/Work/Code/Intelij IDEA/SqlParser/src/main/resources\Sql92CommonLexer.g4 by ANTLR 4.x
package com.laudandjolynn.sqlparser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sql92CommonLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT_EQ=1, GREATER_THAN_OR_EQ=2, LESS_THAN_OR_QE=3, CONCATENATION=4, DOUBLE_PERIOD=5, 
		NULL=6, DEFAULT=7, SOME=8, ANY=9, ALL=10, DISTINCT=11, AVG=12, SUM=13, 
		MIN=14, MAX=15, COUNT=16, QUOTE_BIT=17, QUOTE_HEX=18, LANGUAGE_NAME=19, 
		QUOTE_STRING=20, SQL_LANGUAGE_IDENTIFIER=21, SPACE=22, TAB=23, NEWLINE=24, 
		SIGN=25, PLUS_SIGN=26, MINUS_SIGN=27, DOUBLE_QUOTE=28, PERCENT=29, AMPERSAND=30, 
		QUOTE=31, LEFT_PAREN=32, RIGHT_PAREN=33, ASTERISK=34, COMMA=35, PERIOD=36, 
		SOLIDUS=37, COLON=38, SEMICOLON=39, LESS_THAN=40, LESS_THAN_OR_EQ=41, 
		EQ=42, GREATER_THAN=43, QUESTION_MARK=44, UNDERSCORE=45, VERTICAL_BAR=46, 
		LEFT_BRACKET=47, RIGHT_BRACKET=48, SIGNED_NUMERIC_LITERAL=49, UNSIGNED_NUMERIC_LITERAL=50, 
		IDENTIFIER=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'"
	};
	public static final String[] ruleNames = {
		"COMMENT_INTRODUCER", "ADA", "C", "COBOL", "FORTRAN", "MUMPS", "PASCAL", 
		"PLI", "NONQUOTE_CHARACTER", "NONDOUBLEQUOTE_CHARACTER", "QUOTE_SYMBOL", 
		"DOUBLEQUOTE_SYMBOL", "CHARACTER_REPRESENTATION", "NOT_EQ", "GREATER_THAN_OR_EQ", 
		"LESS_THAN_OR_QE", "CONCATENATION", "DOUBLE_PERIOD", "NULL", "DEFAULT", 
		"SOME", "ANY", "ALL", "DISTINCT", "AVG", "SUM", "MIN", "MAX", "COUNT", 
		"QUOTE_BIT", "QUOTE_HEX", "LANGUAGE_NAME", "QUOTE_STRING", "SQL_LANGUAGE_IDENTIFIER", 
		"SPACE", "TAB", "NEWLINE", "SIGN", "PLUS_SIGN", "MINUS_SIGN", "DOUBLE_QUOTE", 
		"PERCENT", "AMPERSAND", "QUOTE", "LEFT_PAREN", "RIGHT_PAREN", "ASTERISK", 
		"COMMA", "PERIOD", "SOLIDUS", "COLON", "SEMICOLON", "LESS_THAN", "LESS_THAN_OR_EQ", 
		"EQ", "GREATER_THAN", "QUESTION_MARK", "UNDERSCORE", "VERTICAL_BAR", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "ZERO", "DIGIT", "ALPHA", "IDENTIFIER_BEGINNING_LETTER", 
		"IDENTIFIER_BEGINNING_LETTER_LOOSE", "IDENTIFIER_FOLLOW_BEGIN_LETTER", 
		"HEX", "UNICODE", "BIT", "SEXAGESIMAL", "DECIMAL", "UNSIGNED_INTEGER", 
		"EXACT_NUMERIC_LITERAL", "APPROXIMATE_NUMERIC_LITERAL", "EXPONENT", "MANTISSA", 
		"SIGNED_NUMERIC_LITERAL", "UNSIGNED_NUMERIC_LITERAL", "IDENTIFIER"
	};


	public Sql92CommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sql92CommonLexer.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u01dd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\7\2\u00a7"+
		"\n\2\f\2\16\2\u00aa\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\5\16\u00dd\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\6\37\u0129\n\37\r\37"+
		"\16\37\u012a\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u013d"+
		"\n!\3\"\3\"\7\"\u0141\n\"\f\"\16\"\u0144\13\"\3\"\3\"\3#\3#\3#\3#\7#\u014c"+
		"\n#\f#\16#\u014f\13#\3$\3$\3%\3%\3&\5&\u0156\n&\3&\3&\3\'\3\'\5\'\u015c"+
		"\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3"+
		"C\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3H\3H\3H\3H\3H\5H\u01aa\n"+
		"H\3I\3I\6I\u01ae\nI\rI\16I\u01af\3J\3J\3J\7J\u01b5\nJ\fJ\16J\u01b8\13"+
		"J\5J\u01ba\nJ\3K\3K\5K\u01be\nK\3K\5K\u01c1\nK\3L\3L\3L\3L\3M\5M\u01c8"+
		"\nM\3M\3M\3N\3N\3O\3O\3O\5O\u01d1\nO\3P\3P\5P\u01d5\nP\3Q\3Q\7Q\u01d9"+
		"\nQ\fQ\16Q\u01dc\13Q\2\2R\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2"+
		"\27\2\31\2\33\2\35\3\37\4!\5#\6%\7\'\b)\t+\n-\13/\f\61\r\63\16\65\17\67"+
		"\209\21;\22=\23?\24A\25C\26E\27G\30I\31K\32M\33O\34Q\35S\36U\37W Y![\""+
		"]#_$a%c&e\'g(i)k*m+o,q-s.u/w\60y\61{\62}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097"+
		"\2\u0099\2\u009b\2\u009d\63\u009f\64\u00a1\65\3\2\16\3\2))\3\2$$\3\2\62"+
		";\4\2C\\c|\5\2C\\aac|\b\2\60\60C\\aac|\u0082\u0082\0\0\n\2&&\60\60\62"+
		";C\\aac|\u0082\u0082\0\0\5\2\62;CHch\3\2\62\63\3\2\62\67\3\2\63;\4\2G"+
		"Ggg\u01d9\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\3\u00a3\3\2\2\2\5\u00ab\3\2\2"+
		"\2\7\u00af\3\2\2\2\t\u00b1\3\2\2\2\13\u00b7\3\2\2\2\r\u00bf\3\2\2\2\17"+
		"\u00c5\3\2\2\2\21\u00cc\3\2\2\2\23\u00d0\3\2\2\2\25\u00d2\3\2\2\2\27\u00d4"+
		"\3\2\2\2\31\u00d7\3\2\2\2\33\u00dc\3\2\2\2\35\u00de\3\2\2\2\37\u00e1\3"+
		"\2\2\2!\u00e4\3\2\2\2#\u00e7\3\2\2\2%\u00ea\3\2\2\2\'\u00ed\3\2\2\2)\u00f2"+
		"\3\2\2\2+\u00fa\3\2\2\2-\u00ff\3\2\2\2/\u0103\3\2\2\2\61\u0107\3\2\2\2"+
		"\63\u0110\3\2\2\2\65\u0114\3\2\2\2\67\u0118\3\2\2\29\u011c\3\2\2\2;\u0120"+
		"\3\2\2\2=\u0126\3\2\2\2?\u012e\3\2\2\2A\u013c\3\2\2\2C\u013e\3\2\2\2E"+
		"\u0147\3\2\2\2G\u0150\3\2\2\2I\u0152\3\2\2\2K\u0155\3\2\2\2M\u015b\3\2"+
		"\2\2O\u015d\3\2\2\2Q\u015f\3\2\2\2S\u0161\3\2\2\2U\u0163\3\2\2\2W\u0165"+
		"\3\2\2\2Y\u0167\3\2\2\2[\u0169\3\2\2\2]\u016b\3\2\2\2_\u016d\3\2\2\2a"+
		"\u016f\3\2\2\2c\u0171\3\2\2\2e\u0173\3\2\2\2g\u0175\3\2\2\2i\u0177\3\2"+
		"\2\2k\u0179\3\2\2\2m\u017b\3\2\2\2o\u017e\3\2\2\2q\u0180\3\2\2\2s\u0182"+
		"\3\2\2\2u\u0184\3\2\2\2w\u0186\3\2\2\2y\u0188\3\2\2\2{\u018a\3\2\2\2}"+
		"\u018c\3\2\2\2\177\u018e\3\2\2\2\u0081\u0190\3\2\2\2\u0083\u0192\3\2\2"+
		"\2\u0085\u0194\3\2\2\2\u0087\u0196\3\2\2\2\u0089\u0198\3\2\2\2\u008b\u019a"+
		"\3\2\2\2\u008d\u01a2\3\2\2\2\u008f\u01a9\3\2\2\2\u0091\u01ab\3\2\2\2\u0093"+
		"\u01b9\3\2\2\2\u0095\u01c0\3\2\2\2\u0097\u01c2\3\2\2\2\u0099\u01c7\3\2"+
		"\2\2\u009b\u01cb\3\2\2\2\u009d\u01cd\3\2\2\2\u009f\u01d4\3\2\2\2\u00a1"+
		"\u01d6\3\2\2\2\u00a3\u00a4\5Q)\2\u00a4\u00a8\5Q)\2\u00a5\u00a7\5Q)\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\4\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7C\2\2\u00ac\u00ad"+
		"\7F\2\2\u00ad\u00ae\7C\2\2\u00ae\6\3\2\2\2\u00af\u00b0\7E\2\2\u00b0\b"+
		"\3\2\2\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7Q\2\2\u00b3\u00b4\7D\2\2\u00b4"+
		"\u00b5\7Q\2\2\u00b5\u00b6\7N\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7H\2\2\u00b8"+
		"\u00b9\7Q\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc\7T\2\2"+
		"\u00bc\u00bd\7C\2\2\u00bd\u00be\7P\2\2\u00be\f\3\2\2\2\u00bf\u00c0\7O"+
		"\2\2\u00c0\u00c1\7W\2\2\u00c1\u00c2\7O\2\2\u00c2\u00c3\7R\2\2\u00c3\u00c4"+
		"\7U\2\2\u00c4\16\3\2\2\2\u00c5\u00c6\7R\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8"+
		"\7U\2\2\u00c8\u00c9\7E\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb\7N\2\2\u00cb"+
		"\20\3\2\2\2\u00cc\u00cd\7R\2\2\u00cd\u00ce\7N\2\2\u00ce\u00cf\7K\2\2\u00cf"+
		"\22\3\2\2\2\u00d0\u00d1\n\2\2\2\u00d1\24\3\2\2\2\u00d2\u00d3\n\3\2\2\u00d3"+
		"\26\3\2\2\2\u00d4\u00d5\5Y-\2\u00d5\u00d6\5Y-\2\u00d6\30\3\2\2\2\u00d7"+
		"\u00d8\5S*\2\u00d8\u00d9\5S*\2\u00d9\32\3\2\2\2\u00da\u00dd\5\23\n\2\u00db"+
		"\u00dd\5\27\f\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\34\3\2\2"+
		"\2\u00de\u00df\7>\2\2\u00df\u00e0\7@\2\2\u00e0\36\3\2\2\2\u00e1\u00e2"+
		"\7@\2\2\u00e2\u00e3\7?\2\2\u00e3 \3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6"+
		"\7?\2\2\u00e6\"\3\2\2\2\u00e7\u00e8\7~\2\2\u00e8\u00e9\7~\2\2\u00e9$\3"+
		"\2\2\2\u00ea\u00eb\7\60\2\2\u00eb\u00ec\7\60\2\2\u00ec&\3\2\2\2\u00ed"+
		"\u00ee\7P\2\2\u00ee\u00ef\7W\2\2\u00ef\u00f0\7N\2\2\u00f0\u00f1\7N\2\2"+
		"\u00f1(\3\2\2\2\u00f2\u00f3\7F\2\2\u00f3\u00f4\7G\2\2\u00f4\u00f5\7H\2"+
		"\2\u00f5\u00f6\7C\2\2\u00f6\u00f7\7W\2\2\u00f7\u00f8\7N\2\2\u00f8\u00f9"+
		"\7V\2\2\u00f9*\3\2\2\2\u00fa\u00fb\7U\2\2\u00fb\u00fc\7Q\2\2\u00fc\u00fd"+
		"\7O\2\2\u00fd\u00fe\7G\2\2\u00fe,\3\2\2\2\u00ff\u0100\7C\2\2\u0100\u0101"+
		"\7P\2\2\u0101\u0102\7[\2\2\u0102.\3\2\2\2\u0103\u0104\7C\2\2\u0104\u0105"+
		"\7N\2\2\u0105\u0106\7N\2\2\u0106\60\3\2\2\2\u0107\u0108\7F\2\2\u0108\u0109"+
		"\7K\2\2\u0109\u010a\7U\2\2\u010a\u010b\7V\2\2\u010b\u010c\7K\2\2\u010c"+
		"\u010d\7P\2\2\u010d\u010e\7E\2\2\u010e\u010f\7V\2\2\u010f\62\3\2\2\2\u0110"+
		"\u0111\7C\2\2\u0111\u0112\7X\2\2\u0112\u0113\7I\2\2\u0113\64\3\2\2\2\u0114"+
		"\u0115\7U\2\2\u0115\u0116\7W\2\2\u0116\u0117\7O\2\2\u0117\66\3\2\2\2\u0118"+
		"\u0119\7O\2\2\u0119\u011a\7K\2\2\u011a\u011b\7P\2\2\u011b8\3\2\2\2\u011c"+
		"\u011d\7O\2\2\u011d\u011e\7C\2\2\u011e\u011f\7Z\2\2\u011f:\3\2\2\2\u0120"+
		"\u0121\7E\2\2\u0121\u0122\7Q\2\2\u0122\u0123\7W\2\2\u0123\u0124\7P\2\2"+
		"\u0124\u0125\7V\2\2\u0125<\3\2\2\2\u0126\u0128\5Y-\2\u0127\u0129\5\u008d"+
		"G\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5Y-\2\u012d>\3\2\2\2\u012e"+
		"\u012f\5Y-\2\u012f\u0130\5\u0089E\2\u0130\u0131\5\u0089E\2\u0131\u0132"+
		"\5\u0089E\2\u0132\u0133\5\u0089E\2\u0133\u0134\5Y-\2\u0134@\3\2\2\2\u0135"+
		"\u013d\5\5\3\2\u0136\u013d\5\7\4\2\u0137\u013d\5\t\5\2\u0138\u013d\5\13"+
		"\6\2\u0139\u013d\5\r\7\2\u013a\u013d\5\17\b\2\u013b\u013d\5\21\t\2\u013c"+
		"\u0135\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u0137\3\2\2\2\u013c\u0138\3\2"+
		"\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"B\3\2\2\2\u013e\u0142\5Y-\2\u013f\u0141\5\33\16\2\u0140\u013f\3\2\2\2"+
		"\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\5Y-\2\u0146D\3\2\2\2\u0147\u014d"+
		"\5\u0081A\2\u0148\u014c\5u;\2\u0149\u014c\5\177@\2\u014a\u014c\5\u0081"+
		"A\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014eF\3\2\2\2"+
		"\u014f\u014d\3\2\2\2\u0150\u0151\7\"\2\2\u0151H\3\2\2\2\u0152\u0153\7"+
		"\13\2\2\u0153J\3\2\2\2\u0154\u0156\7\17\2\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7\f\2\2\u0158L\3\2\2\2"+
		"\u0159\u015c\5O(\2\u015a\u015c\5Q)\2\u015b\u0159\3\2\2\2\u015b\u015a\3"+
		"\2\2\2\u015cN\3\2\2\2\u015d\u015e\7-\2\2\u015eP\3\2\2\2\u015f\u0160\7"+
		"/\2\2\u0160R\3\2\2\2\u0161\u0162\7$\2\2\u0162T\3\2\2\2\u0163\u0164\7\'"+
		"\2\2\u0164V\3\2\2\2\u0165\u0166\7(\2\2\u0166X\3\2\2\2\u0167\u0168\7)\2"+
		"\2\u0168Z\3\2\2\2\u0169\u016a\7*\2\2\u016a\\\3\2\2\2\u016b\u016c\7+\2"+
		"\2\u016c^\3\2\2\2\u016d\u016e\7,\2\2\u016e`\3\2\2\2\u016f\u0170\7.\2\2"+
		"\u0170b\3\2\2\2\u0171\u0172\7\60\2\2\u0172d\3\2\2\2\u0173\u0174\7\61\2"+
		"\2\u0174f\3\2\2\2\u0175\u0176\7<\2\2\u0176h\3\2\2\2\u0177\u0178\7=\2\2"+
		"\u0178j\3\2\2\2\u0179\u017a\7>\2\2\u017al\3\2\2\2\u017b\u017c\7>\2\2\u017c"+
		"\u017d\7?\2\2\u017dn\3\2\2\2\u017e\u017f\7?\2\2\u017fp\3\2\2\2\u0180\u0181"+
		"\7@\2\2\u0181r\3\2\2\2\u0182\u0183\7A\2\2\u0183t\3\2\2\2\u0184\u0185\7"+
		"a\2\2\u0185v\3\2\2\2\u0186\u0187\7~\2\2\u0187x\3\2\2\2\u0188\u0189\7]"+
		"\2\2\u0189z\3\2\2\2\u018a\u018b\7_\2\2\u018b|\3\2\2\2\u018c\u018d\7\62"+
		"\2\2\u018d~\3\2\2\2\u018e\u018f\t\4\2\2\u018f\u0080\3\2\2\2\u0190\u0191"+
		"\t\5\2\2\u0191\u0082\3\2\2\2\u0192\u0193\t\6\2\2\u0193\u0084\3\2\2\2\u0194"+
		"\u0195\t\7\2\2\u0195\u0086\3\2\2\2\u0196\u0197\t\b\2\2\u0197\u0088\3\2"+
		"\2\2\u0198\u0199\t\t\2\2\u0199\u008a\3\2\2\2\u019a\u019b\7w\2\2\u019b"+
		"\u019c\7W\2\2\u019c\u019d\3\2\2\2\u019d\u019e\5\u0089E\2\u019e\u019f\5"+
		"\u0089E\2\u019f\u01a0\5\u0089E\2\u01a0\u01a1\5\u0089E\2\u01a1\u008c\3"+
		"\2\2\2\u01a2\u01a3\t\n\2\2\u01a3\u008e\3\2\2\2\u01a4\u01a5\t\13\2\2\u01a5"+
		"\u01aa\t\4\2\2\u01a6\u01aa\t\4\2\2\u01a7\u01a8\78\2\2\u01a8\u01aa\7\62"+
		"\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u0090\3\2\2\2\u01ab\u01ad\5c\62\2\u01ac\u01ae\5\177@\2\u01ad\u01ac\3"+
		"\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u0092\3\2\2\2\u01b1\u01ba\5}?\2\u01b2\u01b6\t\f\2\2\u01b3\u01b5\5\177"+
		"@\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01b1\3\2"+
		"\2\2\u01b9\u01b2\3\2\2\2\u01ba\u0094\3\2\2\2\u01bb\u01bd\5\u0093J\2\u01bc"+
		"\u01be\5\u0091I\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1"+
		"\3\2\2\2\u01bf\u01c1\5\u0091I\2\u01c0\u01bb\3\2\2\2\u01c0\u01bf\3\2\2"+
		"\2\u01c1\u0096\3\2\2\2\u01c2\u01c3\5\u009bN\2\u01c3\u01c4\t\r\2\2\u01c4"+
		"\u01c5\5\u0099M\2\u01c5\u0098\3\2\2\2\u01c6\u01c8\5M\'\2\u01c7\u01c6\3"+
		"\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\5\u0093J\2"+
		"\u01ca\u009a\3\2\2\2\u01cb\u01cc\5\u0095K\2\u01cc\u009c\3\2\2\2\u01cd"+
		"\u01d0\5M\'\2\u01ce\u01d1\5\u0095K\2\u01cf\u01d1\5\u0097L\2\u01d0\u01ce"+
		"\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u009e\3\2\2\2\u01d2\u01d5\5\u0095K"+
		"\2\u01d3\u01d5\5\u0097L\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u00a0\3\2\2\2\u01d6\u01da\5\u0085C\2\u01d7\u01d9\5\u0087D\2\u01d8\u01d7"+
		"\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u00a2\3\2\2\2\u01dc\u01da\3\2\2\2\26\2\u00a8\u00dc\u012a\u013c\u0142"+
		"\u014b\u014d\u0155\u015b\u01a9\u01af\u01b6\u01b9\u01bd\u01c0\u01c7\u01d0"+
		"\u01d4\u01da\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}