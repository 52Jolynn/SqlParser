/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar Sql92CommonLexer;

import CommonLexer;

fragment
    COMMENT_INTRODUCER : MINUS_SIGN MINUS_SIGN MINUS_SIGN*;
//语言定义
fragment
    ADA : 'ADA';
fragment
    C : 'C';
fragment
    COBOL : 'COBOL';
fragment
    FORTRAN : 'FORTRAN';
fragment
    MUMPS : 'MUMPS';
fragment
    PASCAL : 'PASCAL';
fragment
    PLI : 'PLI';

//非单引号字符
fragment
    NONQUOTE_CHARACTER : ~'\'';
//非双引号字符
fragment
    NONDOUBLEQUOTE_CHARACTER : ~'"';
//'' 单引号
fragment
    QUOTE_SYMBOL : QUOTE QUOTE;
//"" 双引号
fragment
    DOUBLEQUOTE_SYMBOL : DOUBLE_QUOTE DOUBLE_QUOTE;
fragment
    CHARACTER_REPRESENTATION : NONQUOTE_CHARACTER|QUOTE_SYMBOL;

//操作符
NOT_EQ : '<>';
GREATER_THAN_OR_EQ : '>=';
LESS_THAN_OR_QE : '<=';
CONCATENATION : '||';
DOUBLE_PERIOD : '..';

NULL : 'NULL';
DEFAULT : 'DEFAULT';
SOME : 'SOME';
ANY : 'ANY';
ALL : 'ALL';
DISTINCT : 'DISTINCT';
AVG : 'AVG';
SUM : 'SUM';
MIN : 'MIN';
MAX : 'MAX';
COUNT : 'COUNT';

//单引号二进制串
QUOTE_BIT : QUOTE BIT+ QUOTE;
//单引号十六进制串
QUOTE_HEX : QUOTE HEX HEX HEX HEX QUOTE;//'FFEE'
LANGUAGE_NAME : ADA|C|COBOL|FORTRAN|MUMPS|PASCAL|PLI;
//单引号字符串
QUOTE_STRING : QUOTE CHARACTER_REPRESENTATION* QUOTE;
//标识符
SQL_LANGUAGE_IDENTIFIER : ALPHA (UNDERSCORE|DIGIT|ALPHA)*;
	