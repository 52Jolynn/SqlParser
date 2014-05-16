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
		ADA=1, C=2, COBOL=3, FORTRAN=4, MUMPS=5, PASCAL=6, PLI=7, NOT_EQ=8, GREATER_THAN_OR_EQ=9, 
		LESS_THAN_OR_QE=10, CONCATENATION=11, DOUBLE_PERIOD=12, NULL=13, DEFAULT=14, 
		SOME=15, ANY=16, ALL=17, DISTINCT=18, AVG=19, SUM=20, MIN=21, MAX=22, 
		COUNT=23, NONQUOTE_CHARACTER=24, NONDOUBLEQUOTE_CHARACTER=25, QUOTE_SYMBOL=26, 
		DOUBLEQUOTE_SYMBOL=27, LANGUAGE_NAME=28, GENERAL_IDENTIFIER=29, SQL_LANGUAGE_IDENTIFIER=30, 
		SPACE=31, TAB=32, NEWLINE=33, SIGN=34, PLUS_SIGN=35, MINUS_SIGN=36, DOUBLE_QUOTE=37, 
		PERCENT=38, AMPERSAND=39, QUOTE=40, LEFT_PAREN=41, RIGHT_PAREN=42, ASTERISK=43, 
		COMMA=44, PERIOD=45, SOLIDUS=46, COLON=47, SEMICOLON=48, LESS_THAN=49, 
		LESS_THAN_OR_EQ=50, EQ=51, GREATER_THAN=52, QUESTION_MARK=53, UNDERSCORE=54, 
		VERTICAL_BAR=55, LEFT_BRACKET=56, RIGHT_BRACKET=57, IDENTIFIER=58, NUMBER=59, 
		SIGNED_NUMERIC_LITERAL=60, UNSIGNED_NUMERIC_LITERAL=61, EXACT_NUMERIC_LITERAL=62, 
		APPROXIMATE_NUMERIC_LITERAL=63, SIGNED_INTEGER=64, UNSIGNED_INTEGER=65;
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
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'"
	};
	public static final String[] ruleNames = {
		"ADA", "C", "COBOL", "FORTRAN", "MUMPS", "PASCAL", "PLI", "NOT_EQ", "GREATER_THAN_OR_EQ", 
		"LESS_THAN_OR_QE", "CONCATENATION", "DOUBLE_PERIOD", "NULL", "DEFAULT", 
		"SOME", "ANY", "ALL", "DISTINCT", "AVG", "SUM", "MIN", "MAX", "COUNT", 
		"NONQUOTE_CHARACTER", "NONDOUBLEQUOTE_CHARACTER", "COMMENT_INTRODUCER", 
		"QUOTE_SYMBOL", "DOUBLEQUOTE_SYMBOL", "LANGUAGE_NAME", "GENERAL_IDENTIFIER", 
		"SQL_LANGUAGE_IDENTIFIER", "SPACE", "TAB", "NEWLINE", "SIGN", "PLUS_SIGN", 
		"MINUS_SIGN", "DOUBLE_QUOTE", "PERCENT", "AMPERSAND", "QUOTE", "LEFT_PAREN", 
		"RIGHT_PAREN", "ASTERISK", "COMMA", "PERIOD", "SOLIDUS", "COLON", "SEMICOLON", 
		"LESS_THAN", "LESS_THAN_OR_EQ", "EQ", "GREATER_THAN", "QUESTION_MARK", 
		"UNDERSCORE", "VERTICAL_BAR", "LEFT_BRACKET", "RIGHT_BRACKET", "ZERO", 
		"DIGIT", "ALPHA", "IDENTIFIER_BEGINNING_LETTER", "IDENTIFIER_BEGINNING_LETTER_LOOSE", 
		"IDENTIFIER_FOLLOW_BEGIN_LETTER", "HEX", "UNICODE", "BIT", "SEXAGESIMAL", 
		"EXPONENT", "MANTISSA", "DECIMAL", "IDENTIFIER", "NUMBER", "SIGNED_NUMERIC_LITERAL", 
		"UNSIGNED_NUMERIC_LITERAL", "EXACT_NUMERIC_LITERAL", "APPROXIMATE_NUMERIC_LITERAL", 
		"SIGNED_INTEGER", "UNSIGNED_INTEGER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2C\u01cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\7\33\u0116\n\33\f\33\16\33\u0119\13\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0128\n\36"+
		"\3\37\3\37\3\37\3\37\7\37\u012e\n\37\f\37\16\37\u0131\13\37\3 \3 \3 \3"+
		" \7 \u0137\n \f \16 \u013a\13 \3!\3!\3\"\3\"\3#\5#\u0141\n#\3#\3#\3$\3"+
		"$\5$\u0147\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-"+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3E\3E\3"+
		"E\5E\u0195\nE\3F\5F\u0198\nF\3F\3F\3G\3G\3H\3H\6H\u01a0\nH\rH\16H\u01a1"+
		"\3I\3I\7I\u01a6\nI\fI\16I\u01a9\13I\3J\3J\3K\5K\u01ae\nK\3K\3K\3L\3L\5"+
		"L\u01b4\nL\3M\3M\5M\u01b8\nM\3M\5M\u01bb\nM\3N\3N\3N\3N\3O\3O\3O\3P\3"+
		"P\3P\7P\u01c7\nP\fP\16P\u01ca\13P\5P\u01cc\nP\2\2Q\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\2\67\349\35;\36=\37? A!C\"E#G$I%K&"+
		"M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w\2y\2{\2}"+
		"\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f"+
		"\2\u0091<\u0093=\u0095>\u0097?\u0099@\u009bA\u009dB\u009fC\3\2\16\3\2"+
		"))\3\2$$\3\2\62;\4\2C\\c|\5\2C\\aac|\b\2\60\60C\\aac|\u0082\u0082\0\0"+
		"\n\2&&\60\60\62;C\\aac|\u0082\u0082\0\0\5\2\62;CHch\3\2\62\63\3\2\62\67"+
		"\4\2GGgg\3\2\63;\u01d8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3\u00a1\3\2\2\2\5\u00a5\3\2\2"+
		"\2\7\u00a7\3\2\2\2\t\u00ad\3\2\2\2\13\u00b5\3\2\2\2\r\u00bb\3\2\2\2\17"+
		"\u00c2\3\2\2\2\21\u00c6\3\2\2\2\23\u00c9\3\2\2\2\25\u00cc\3\2\2\2\27\u00cf"+
		"\3\2\2\2\31\u00d2\3\2\2\2\33\u00d5\3\2\2\2\35\u00da\3\2\2\2\37\u00e2\3"+
		"\2\2\2!\u00e7\3\2\2\2#\u00eb\3\2\2\2%\u00ef\3\2\2\2\'\u00f8\3\2\2\2)\u00fc"+
		"\3\2\2\2+\u0100\3\2\2\2-\u0104\3\2\2\2/\u0108\3\2\2\2\61\u010e\3\2\2\2"+
		"\63\u0110\3\2\2\2\65\u0112\3\2\2\2\67\u011a\3\2\2\29\u011d\3\2\2\2;\u0127"+
		"\3\2\2\2=\u0129\3\2\2\2?\u0132\3\2\2\2A\u013b\3\2\2\2C\u013d\3\2\2\2E"+
		"\u0140\3\2\2\2G\u0146\3\2\2\2I\u0148\3\2\2\2K\u014a\3\2\2\2M\u014c\3\2"+
		"\2\2O\u014e\3\2\2\2Q\u0150\3\2\2\2S\u0152\3\2\2\2U\u0154\3\2\2\2W\u0156"+
		"\3\2\2\2Y\u0158\3\2\2\2[\u015a\3\2\2\2]\u015c\3\2\2\2_\u015e\3\2\2\2a"+
		"\u0160\3\2\2\2c\u0162\3\2\2\2e\u0164\3\2\2\2g\u0166\3\2\2\2i\u0169\3\2"+
		"\2\2k\u016b\3\2\2\2m\u016d\3\2\2\2o\u016f\3\2\2\2q\u0171\3\2\2\2s\u0173"+
		"\3\2\2\2u\u0175\3\2\2\2w\u0177\3\2\2\2y\u0179\3\2\2\2{\u017b\3\2\2\2}"+
		"\u017d\3\2\2\2\177\u017f\3\2\2\2\u0081\u0181\3\2\2\2\u0083\u0183\3\2\2"+
		"\2\u0085\u0185\3\2\2\2\u0087\u018d\3\2\2\2\u0089\u0194\3\2\2\2\u008b\u0197"+
		"\3\2\2\2\u008d\u019b\3\2\2\2\u008f\u019d\3\2\2\2\u0091\u01a3\3\2\2\2\u0093"+
		"\u01aa\3\2\2\2\u0095\u01ad\3\2\2\2\u0097\u01b3\3\2\2\2\u0099\u01ba\3\2"+
		"\2\2\u009b\u01bc\3\2\2\2\u009d\u01c0\3\2\2\2\u009f\u01cb\3\2\2\2\u00a1"+
		"\u00a2\7C\2\2\u00a2\u00a3\7F\2\2\u00a3\u00a4\7C\2\2\u00a4\4\3\2\2\2\u00a5"+
		"\u00a6\7E\2\2\u00a6\6\3\2\2\2\u00a7\u00a8\7E\2\2\u00a8\u00a9\7Q\2\2\u00a9"+
		"\u00aa\7D\2\2\u00aa\u00ab\7Q\2\2\u00ab\u00ac\7N\2\2\u00ac\b\3\2\2\2\u00ad"+
		"\u00ae\7H\2\2\u00ae\u00af\7Q\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7V\2\2"+
		"\u00b1\u00b2\7T\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7P\2\2\u00b4\n\3\2"+
		"\2\2\u00b5\u00b6\7O\2\2\u00b6\u00b7\7W\2\2\u00b7\u00b8\7O\2\2\u00b8\u00b9"+
		"\7R\2\2\u00b9\u00ba\7U\2\2\u00ba\f\3\2\2\2\u00bb\u00bc\7R\2\2\u00bc\u00bd"+
		"\7C\2\2\u00bd\u00be\7U\2\2\u00be\u00bf\7E\2\2\u00bf\u00c0\7C\2\2\u00c0"+
		"\u00c1\7N\2\2\u00c1\16\3\2\2\2\u00c2\u00c3\7R\2\2\u00c3\u00c4\7N\2\2\u00c4"+
		"\u00c5\7K\2\2\u00c5\20\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8\7@\2\2\u00c8"+
		"\22\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca\u00cb\7?\2\2\u00cb\24\3\2\2\2\u00cc"+
		"\u00cd\7>\2\2\u00cd\u00ce\7?\2\2\u00ce\26\3\2\2\2\u00cf\u00d0\7~\2\2\u00d0"+
		"\u00d1\7~\2\2\u00d1\30\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\7\60\2"+
		"\2\u00d4\32\3\2\2\2\u00d5\u00d6\7P\2\2\u00d6\u00d7\7W\2\2\u00d7\u00d8"+
		"\7N\2\2\u00d8\u00d9\7N\2\2\u00d9\34\3\2\2\2\u00da\u00db\7F\2\2\u00db\u00dc"+
		"\7G\2\2\u00dc\u00dd\7H\2\2\u00dd\u00de\7C\2\2\u00de\u00df\7W\2\2\u00df"+
		"\u00e0\7N\2\2\u00e0\u00e1\7V\2\2\u00e1\36\3\2\2\2\u00e2\u00e3\7U\2\2\u00e3"+
		"\u00e4\7Q\2\2\u00e4\u00e5\7O\2\2\u00e5\u00e6\7G\2\2\u00e6 \3\2\2\2\u00e7"+
		"\u00e8\7C\2\2\u00e8\u00e9\7P\2\2\u00e9\u00ea\7[\2\2\u00ea\"\3\2\2\2\u00eb"+
		"\u00ec\7C\2\2\u00ec\u00ed\7N\2\2\u00ed\u00ee\7N\2\2\u00ee$\3\2\2\2\u00ef"+
		"\u00f0\7F\2\2\u00f0\u00f1\7K\2\2\u00f1\u00f2\7U\2\2\u00f2\u00f3\7V\2\2"+
		"\u00f3\u00f4\7K\2\2\u00f4\u00f5\7P\2\2\u00f5\u00f6\7E\2\2\u00f6\u00f7"+
		"\7V\2\2\u00f7&\3\2\2\2\u00f8\u00f9\7C\2\2\u00f9\u00fa\7X\2\2\u00fa\u00fb"+
		"\7I\2\2\u00fb(\3\2\2\2\u00fc\u00fd\7U\2\2\u00fd\u00fe\7W\2\2\u00fe\u00ff"+
		"\7O\2\2\u00ff*\3\2\2\2\u0100\u0101\7O\2\2\u0101\u0102\7K\2\2\u0102\u0103"+
		"\7P\2\2\u0103,\3\2\2\2\u0104\u0105\7O\2\2\u0105\u0106\7C\2\2\u0106\u0107"+
		"\7Z\2\2\u0107.\3\2\2\2\u0108\u0109\7E\2\2\u0109\u010a\7Q\2\2\u010a\u010b"+
		"\7W\2\2\u010b\u010c\7P\2\2\u010c\u010d\7V\2\2\u010d\60\3\2\2\2\u010e\u010f"+
		"\n\2\2\2\u010f\62\3\2\2\2\u0110\u0111\n\3\2\2\u0111\64\3\2\2\2\u0112\u0113"+
		"\5K&\2\u0113\u0117\5K&\2\u0114\u0116\5K&\2\u0115\u0114\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\66\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\5S*\2\u011b\u011c\5S*\2\u011c8\3\2\2\2\u011d"+
		"\u011e\5M\'\2\u011e\u011f\5M\'\2\u011f:\3\2\2\2\u0120\u0128\5\3\2\2\u0121"+
		"\u0128\5\5\3\2\u0122\u0128\5\7\4\2\u0123\u0128\5\t\5\2\u0124\u0128\5\13"+
		"\6\2\u0125\u0128\5\r\7\2\u0126\u0128\5\17\b\2\u0127\u0120\3\2\2\2\u0127"+
		"\u0121\3\2\2\2\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128<\3\2\2\2\u0129\u012f"+
		"\5{>\2\u012a\u012e\5o8\2\u012b\u012e\5y=\2\u012c\u012e\5{>\2\u012d\u012a"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130>\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0132\u0138\5{>\2\u0133\u0137\5o8\2\u0134\u0137\5y=\2\u0135\u0137\5{"+
		">\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139@\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013b\u013c\7\"\2\2\u013cB\3\2\2\2\u013d\u013e\7"+
		"\13\2\2\u013eD\3\2\2\2\u013f\u0141\7\17\2\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\f\2\2\u0143F\3\2\2\2"+
		"\u0144\u0147\5I%\2\u0145\u0147\5K&\2\u0146\u0144\3\2\2\2\u0146\u0145\3"+
		"\2\2\2\u0147H\3\2\2\2\u0148\u0149\7-\2\2\u0149J\3\2\2\2\u014a\u014b\7"+
		"/\2\2\u014bL\3\2\2\2\u014c\u014d\7$\2\2\u014dN\3\2\2\2\u014e\u014f\7\'"+
		"\2\2\u014fP\3\2\2\2\u0150\u0151\7(\2\2\u0151R\3\2\2\2\u0152\u0153\7)\2"+
		"\2\u0153T\3\2\2\2\u0154\u0155\7*\2\2\u0155V\3\2\2\2\u0156\u0157\7+\2\2"+
		"\u0157X\3\2\2\2\u0158\u0159\7,\2\2\u0159Z\3\2\2\2\u015a\u015b\7.\2\2\u015b"+
		"\\\3\2\2\2\u015c\u015d\7\60\2\2\u015d^\3\2\2\2\u015e\u015f\7\61\2\2\u015f"+
		"`\3\2\2\2\u0160\u0161\7<\2\2\u0161b\3\2\2\2\u0162\u0163\7=\2\2\u0163d"+
		"\3\2\2\2\u0164\u0165\7>\2\2\u0165f\3\2\2\2\u0166\u0167\7>\2\2\u0167\u0168"+
		"\7?\2\2\u0168h\3\2\2\2\u0169\u016a\7?\2\2\u016aj\3\2\2\2\u016b\u016c\7"+
		"@\2\2\u016cl\3\2\2\2\u016d\u016e\7A\2\2\u016en\3\2\2\2\u016f\u0170\7a"+
		"\2\2\u0170p\3\2\2\2\u0171\u0172\7~\2\2\u0172r\3\2\2\2\u0173\u0174\7]\2"+
		"\2\u0174t\3\2\2\2\u0175\u0176\7_\2\2\u0176v\3\2\2\2\u0177\u0178\7\62\2"+
		"\2\u0178x\3\2\2\2\u0179\u017a\t\4\2\2\u017az\3\2\2\2\u017b\u017c\t\5\2"+
		"\2\u017c|\3\2\2\2\u017d\u017e\t\6\2\2\u017e~\3\2\2\2\u017f\u0180\t\7\2"+
		"\2\u0180\u0080\3\2\2\2\u0181\u0182\t\b\2\2\u0182\u0082\3\2\2\2\u0183\u0184"+
		"\t\t\2\2\u0184\u0084\3\2\2\2\u0185\u0186\7w\2\2\u0186\u0187\7W\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\5\u0083B\2\u0189\u018a\5\u0083B\2\u018a\u018b"+
		"\5\u0083B\2\u018b\u018c\5\u0083B\2\u018c\u0086\3\2\2\2\u018d\u018e\t\n"+
		"\2\2\u018e\u0088\3\2\2\2\u018f\u0190\t\13\2\2\u0190\u0195\t\4\2\2\u0191"+
		"\u0195\t\4\2\2\u0192\u0193\78\2\2\u0193\u0195\7\62\2\2\u0194\u018f\3\2"+
		"\2\2\u0194\u0191\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u008a\3\2\2\2\u0196"+
		"\u0198\5G$\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2"+
		"\2\u0199\u019a\5\u009fP\2\u019a\u008c\3\2\2\2\u019b\u019c\5\u0099M\2\u019c"+
		"\u008e\3\2\2\2\u019d\u019f\5]/\2\u019e\u01a0\5y=\2\u019f\u019e\3\2\2\2"+
		"\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u0090"+
		"\3\2\2\2\u01a3\u01a7\5\177@\2\u01a4\u01a6\5\u0081A\2\u01a5\u01a4\3\2\2"+
		"\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u0092"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\5\u0095K\2\u01ab\u0094\3\2\2"+
		"\2\u01ac\u01ae\5G$\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b0\5\u0097L\2\u01b0\u0096\3\2\2\2\u01b1\u01b4\5\u0099"+
		"M\2\u01b2\u01b4\5\u009bN\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4"+
		"\u0098\3\2\2\2\u01b5\u01b7\5\u009fP\2\u01b6\u01b8\5\u008fH\2\u01b7\u01b6"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01bb\5\u008fH"+
		"\2\u01ba\u01b5\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u009a\3\2\2\2\u01bc\u01bd"+
		"\5\u008dG\2\u01bd\u01be\t\f\2\2\u01be\u01bf\5\u008bF\2\u01bf\u009c\3\2"+
		"\2\2\u01c0\u01c1\5G$\2\u01c1\u01c2\5\u009fP\2\u01c2\u009e\3\2\2\2\u01c3"+
		"\u01cc\5w<\2\u01c4\u01c8\t\r\2\2\u01c5\u01c7\5y=\2\u01c6\u01c5\3\2\2\2"+
		"\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cc"+
		"\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01c3\3\2\2\2\u01cb\u01c4\3\2\2\2\u01cc"+
		"\u00a0\3\2\2\2\25\2\u0117\u0127\u012d\u012f\u0136\u0138\u0140\u0146\u0194"+
		"\u0197\u01a1\u01a7\u01ad\u01b3\u01b7\u01ba\u01c8\u01cb\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}