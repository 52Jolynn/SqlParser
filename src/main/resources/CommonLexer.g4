/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar CommonLexer;

//数字
NUMBER : MINUS_SIGN? UNSIGNED_INTEGER EXPONENT? //1, -1, 1e10, -1e10, 1e-10, -1e-10
       | MINUS_SIGN? FLOAT //1.0, -1.0, 1.2e10, -1.2e10, 1.2e-10, -1.2e-10
       ;

SIGNED_INTEGER : NUM_SIGN UNSIGNED_INTEGER;//有符号整数
UNSIGNED_INTEGER : '0' | [1-9] [0-9]*;//无符号整数
FLOAT : UNSIGNED_INTEGER '.' UNSIGNED_INTEGER EXPONENT?;//正浮点数
EXPONENT : [Ee] NUM_SIGN? UNSIGNED_INTEGER;//指数

SPACE : ' '; //空格
TAB : '\t'; //tab
NEWLINE : '\r'? '\n';//换行符

NUM_SIGN : PLUS_SIGN | MINUS_SIGN;
PLUS_SIGN : '+';
MINUS_SIGN : '-';

//单字符定义
DOUBLE_QUOTE : '"';
PERCENT : '%';
AMPERSAND : '&';
QUOTE : '\'';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
ASTERISK : '*';
COMMA : ',';
PERIOD : '.';
SOLIDUS : '/';
COLON : ':';
SEMICOLON : ';';
LESS_THAN : '<';
EQ : '=';
GREATER_THAN : '>';
QUESTION_MARK : '?';
UNDERSCORE : '_';
VERTICAL_BAR : '|';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';

fragment
    ZERO : '0'; //零
fragment
    DIGIT : [0-9]; //数字
fragment
    ALPHA : [a-zA-Z]; //英文字母
fragment
    IDENTIFIER_BEGINNING_LETTER : [a-zA-Z_]; //标识符开始字母
fragment
    //宽松的标识符开始字母，英文字母、下划线、变音字符、非拉丁字母
    IDENTIFIER_BEGINNING_LETTER_LOOSE : [a-zA-Z_\u0080...\uFFFE];
fragment
    HEX : [0-9a-fA-F]; //十六进制
fragment
    UNICODE : 'u' HEX HEX HEX HEX; //unicode
fragment
    BIT : [01]; //二进制
fragment
	SEXAGESIMAL : [0-5] [0-9]|[0-9]|'60'; //六十进制 
	    
    