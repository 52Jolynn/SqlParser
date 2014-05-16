/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar CommonLexer;

@header {
package com.laudandjolynn.sqlparser;
}

//数字
UNSIGNED_INTEGER : '0' | [1-9] [0-9]*; //无符号整数
SIGNED_INTEGER : SIGN UNSIGNED_INTEGER; //有符号整数
UNSIGNED_NUMERIC_LITERAL : EXACT_NUMERIC_LITERAL|APPROXIMATE_NUMERIC_LITERAL; //无符号数
SIGNED_NUMERIC_LITERAL : SIGN? UNSIGNED_NUMERIC_LITERAL;//有符号数

SPACE : ' '; //空格
TAB : '\t'; //tab
NEWLINE : '\r'? '\n';//换行符

SIGN : PLUS_SIGN | MINUS_SIGN;//正负号
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
LESS_THAN_OR_EQ : '<=';
EQ : '=';
NOT_EQ : '<>'|'!=';
GREATER_THAN : '>';
GREATER_THAN_OR_EQ : '>=';
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
    UNICODE : 'uU' HEX HEX HEX HEX; //unicode
fragment
    BIT : [01]; //二进制
fragment
    SEXAGESIMAL : [0-5] [0-9]|[0-9]|'60'; //六十进制
fragment 
    EXPONENT : SIGNED_INTEGER; //指数
fragment
    MANTISSA : EXACT_NUMERIC_LITERAL; //尾数
fragment
    EXACT_NUMERIC_LITERAL : UNSIGNED_INTEGER (PERIOD UNSIGNED_INTEGER?)?|PERIOD UNSIGNED_INTEGER;//精确数(有理数)
fragment 
    APPROXIMATE_NUMERIC_LITERAL : MANTISSA [Ee] EXPONENT; //近似数,科学计数法表示
    