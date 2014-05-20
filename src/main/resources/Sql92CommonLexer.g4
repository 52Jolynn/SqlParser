/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar Sql92CommonLexer;

import CommonLexer;

fragment
    COMMENT_INTRODUCER : MINUS_SIGN MINUS_SIGN MINUS_SIGN*;

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

fragment
    CHARACTER_REPRESENTATION : ~'\''|'\'\'';

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

SEPERATOR : (COMMENT | WHITE_SPACE | NEWLINE) -> skip;
fragment
    COMMENT : COMMENT_INTRODUCER QUOTE_STRING* NEWLINE;//comment

QUOTE_BIT : QUOTE BIT+ QUOTE;
QUOTE_HEX : QUOTE HEX HEX HEX HEX QUOTE;//'FFEE'
LANGUAGE_NAME : ADA|C|COBOL|FORTRAN|MUMPS|PASCAL|PLI;
QUOTE_STRING : QUOTE CHARACTER_REPRESENTATION* QUOTE;
SQL_LANGUAGE_IDENTIFIER : ALPHA (UNDERSCORE|DIGIT|ALPHA)*;
