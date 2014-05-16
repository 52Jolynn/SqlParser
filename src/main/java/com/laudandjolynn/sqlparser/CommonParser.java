// Generated from G:/Code/java/SqlParser/src/main/resources\CommonParser.g4 by ANTLR 4.x
package com.laudandjolynn.sqlparser;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIGN=4, PERCENT=8, GREATER_THAN=23, PLUS_SIGN=5, DOUBLE_QUOTE=7, PERIOD=15, 
		NUMERIC_LITERAL=30, LEFT_BRACKET=28, AMPERSAND=9, TAB=2, UNDERSCORE=26, 
		SEMICOLON=18, SPACE=1, SOLIDUS=16, ASTERISK=13, NOT_EQ=22, COLON=17, GREATER_THAN_OR_EQ=24, 
		RIGHT_PAREN=12, QUOTE=10, NEWLINE=3, COMMA=14, IDENTIFIER=31, VERTICAL_BAR=27, 
		MINUS_SIGN=6, LESS_THAN_OR_EQ=20, RIGHT_BRACKET=29, QUESTION_MARK=25, 
		LESS_THAN=19, LEFT_PAREN=11, EQ=21;
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "'\t'", "NEWLINE", "SIGN", "'+'", "'-'", "'\"'", "'%'", 
		"'&'", "'''", "'('", "')'", "'*'", "','", "'.'", "'/'", "':'", "';'", 
		"'<'", "'<='", "'='", "NOT_EQ", "'>'", "'>='", "'?'", "'_'", "'|'", "'['", 
		"']'", "NUMERIC_LITERAL", "IDENTIFIER"
	};
	public static final int
		RULE_number = 0;
	public static final String[] ruleNames = {
		"number"
	};

	@Override
	public String getGrammarFileName() { return "CommonParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(CommonParser.NUMERIC_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(NUMERIC_LITERAL);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\7\4\2\t\2\3\2\3"+
		"\2\3\2\2\2\3\2\2\2\5\2\4\3\2\2\2\4\5\7 \2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}