/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar Sql92CommonLexer;

import CommonLexer;

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

//非单引号字符
NONQUOTE_CHARACTER : ~'\'';
//非双引号字符
NONDOUBLEQUOTE_CHARACTER : ~'"';

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

//'' 单引号
QUOTE_SYMBOL : QUOTE QUOTE;
//"" 双引号
DOUBLEQUOTE_SYMBOL : DOUBLE_QUOTE DOUBLE_QUOTE;
LANGUAGE_NAME : ADA|C|COBOL|FORTRAN|MUMPS|PASCAL|PLI;
GENERAL_IDENTIFIER : ALPHA (UNDERSCORE|DIGIT|ALPHA)*;
//标识符
SQL_LANGUAGE_IDENTIFIER : ALPHA (UNDERSCORE|DIGIT|ALPHA)*;
	