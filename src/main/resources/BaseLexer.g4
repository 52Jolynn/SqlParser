lexer grammar BaseLexer;

//Basic Definitions of Characters Used, Tokens, Symbols, Etc.
SQL_TERMINAL_CHARACTER
:
	SQL_LANGUAGE_CHARACTER
	| SQL_EMBEDDED_LANGUAGE_CHARACTER
;

SQL_LANGUAGE_CHARACTER
:
	SIMPLE_LATIN_LETTER
	| DIGIT
	| SQL_SPECIAL_CHARACTER
;

fragment
SIMPLE_LATIN_LETTER
:
	SIMPLE_LATIN_UPPER_CASE_LETTER
	| SIMPLE_LATIN_LOWER_CASE_LETTER
;

fragment
A_ : 'a' 'A'
;
fragment
B_ : 'b' 'B'
;
fragment
C_ : 'c' 'C'
;
fragment
D_ : 'd' 'D'
;
fragment
E_ : 'e' 'E'
;
fragment
F_ : 'f' 'F'
;
fragment
G_ : 'g' 'G'
;
fragment
H_ : 'h' 'H'
;
fragment
I_ : 'i' 'I'
;
fragment
J_ : 'j' 'J'
;
fragment
K_ : 'k' 'K'
;
fragment
L_ : 'l' 'L'
;
fragment
M_ : 'm' 'M'
;
fragment
N_ : 'n' 'N'
;
fragment
O_ : 'o' 'O'
;
fragment
P_ : 'p' 'P'
;
fragment
Q_ : 'q' 'Q'
;
fragment
R_ : 'r' 'R'
;
fragment
S_ : 's' 'S'
;
fragment
T_ : 't' 'T'
;
fragment
U_ : 'u' 'U'
;
fragment
V_ : 'v' 'V'
;
fragment
W_ : 'w' 'W'
;
fragment
X_ : 'x' 'X'
;
fragment
Y_ : 'y' 'Y'
;
fragment
Z_ : 'z' 'Z'
;

fragment
SIMPLE_LATIN_UPPER_CASE_LETTER
:
	[A-Z]
;
fragment
SIMPLE_LATIN_LOWER_CASE_LETTER
:
	[a-z]
;

SQL_EMBEDDED_LANGUAGE_CHARACTER
:
	LEFT_BRACKET
	| RIGHT_BRACKET
;

SQL_SPECIAL_CHARACTER
:
	SPACE
	| DOUBLE_QUOTE
	| PERCENT
	| AMPERSAND
	| QUOTE
	| LEFT_PAREN
	| RIGHT_PAREN
	| ASTERISK
	| PLUS_SIGN
	| COMMA
	| MINUS_SIGN
	| PERIOD
	| SOLIDUS
	| COLON
	| SEMICOLON
	| LESS_THAN_OPERATOR
	| GREATER_THAN_OPERATOR
	| EQUALS_OPERATOR
	| QUESTION_MARK
	| UNDERSCORE
	| VERTICAL_BAR
;

WHILE_SPACE : ' ' -> skip; //SPACE
TAB : '\t' -> skip; //tab
NEWLINE : '\r'? '\n' -> skip;//BREAK LINE

//正负号
SIGN : PLUS_SIGN | MINUS_SIGN;
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
LESS_THAN_OPERATOR : '<';
LESS_THAN_OR_EQUALS_OPERATOR : '<=';
EQUALS_OPERATOR : '=';
NOT_EQUALS : '<>'|'!=';
GREATER_THAN_OPERATOR : '>';
GREATER_THAN_OR_EQUALS_OPERATOR : '>=';
QUESTION_MARK : '?';
UNDERSCORE : '_';
VERTICAL_BAR : '|';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';
CONCATENATION_OPERATOR : '||';
DOUBLE_PERIOD : PERIOD PERIOD;
/*
TOKEN
:
	NONDELIMITER_TOKEN
	| DELIMITER_TOKEN
;

NONDELIMITER_TOKEN
:
	REGULAR_IDENTIFIER
	| KEY_WORD
	| UNSIGNED_NUMERIC_LITERAL
	| NATIONAL_CHARACTER_STRING_LITERAL
	| BIT_STRING_LITERAL
	| HEX_STRING_LITERAL
;
 */


fragment
REGULAR_IDENTIFIER
:
	IDENTIFIER_BODY
;

fragment
IDENTIFIER_BODY 
:	
	IDENTIFIER_START ( UNDERSCORE | IDENTIFIER_PART )*
;

fragment
IDENTIFIER_START
:
	UNDERSCORE
	| SIMPLE_LATIN_LETTER
;

fragment
IDENTIFIER_PART
:
	IDENTIFIER_START
	| DIGIT
;
/*
KEY_WORD
:
	RESERVED_WORD
	| NON_RESERVED_WORD
;
 */
 
 /*
  * RESERVED_WORD
  */  
ABSOLUTE : A_ B_ S_ O_ L_ U_ T_ E_  ;
ACTION : A_ C_ T_ I_ O_ N_  ;
ADD : A_ D_ D_  ;
ALL : A_ L_ L_  ;
ALLOCATE : A_ L_ L_ O_ C_ A_ T_ E_  ;
ALTER : A_ L_ T_ E_ R_  ;
AND : A_ N_ D_  ;
ANY : A_ N_ Y_  ;
ARE : A_ R_ E_  ;
AS : A_ S_  ;
ASC : A_ S_ C_  ;
ASSERTION : A_ S_ S_ E_ R_ T_ I_ O_ N_  ;
AT : A_ T_  ;
AUTHORIZATION : A_ U_ T_ H_ O_ R_ I_ Z_ A_ T_ I_ O_ N_  ;
AVG : A_ V_ G_  ;
BEGIN : B_ E_ G_ I_ N_  ;
BETWEEN : B_ E_ T_ W_ E_ E_ N_  ;
BIT : B_ I_ T_  ;
BIT_LENGTH : B_ I_ T_ UNDERSCORE L_ E_ N_ G_ T_ H_  ;
BOTH : B_ O_ T_ H_  ;
BY : B_ Y_  ;
CASCADE : C_ A_ S_ C_ A_ D_ E_  ;
CASCADED : C_ A_ S_ C_ A_ D_ E_ D_  ;
CASE : C_ A_ S_ E_  ;
CAST : C_ A_ S_ T_  ;
CATALOG : C_ A_ T_ A_ L_ O_ G_  ;
CHAR : C_ H_ A_ R_  ;
CHARACTER : C_ H_ A_ R_ A_ C_ T_ E_ R_  ;
CHARACTER_LENGTH : C_ H_ A_ R_ A_ C_ T_ E_ R_ UNDERSCORE L_ E_ N_ G_ T_ H_  ;
CHAR_LENGTH : C_ H_ A_ R_ UNDERSCORE L_ E_ N_ G_ T_ H_  ;
CHECK : C_ H_ E_ C_ K_  ;
CLOSE : C_ L_ O_ S_ E_  ;
COALESCE : C_ O_ A_ L_ E_ S_ C_ E_  ;
COLLATE : C_ O_ L_ L_ A_ T_ E_  ;
COLLATION : C_ O_ L_ L_ A_ T_ I_ O_ N_  ;
COLUMN : C_ O_ L_ U_ M_ N_  ;
COMMIT : C_ O_ M_ M_ I_ T_  ;
CONNECT : C_ O_ N_ N_ E_ C_ T_  ;
CONNECTION : C_ O_ N_ N_ E_ C_ T_ I_ O_ N_  ;
CONSTRAINT : C_ O_ N_ S_ T_ R_ A_ I_ N_ T_  ;
CONSTRAINTS : C_ O_ N_ S_ T_ R_ A_ I_ N_ T_ S_  ;
CONTINUE : C_ O_ N_ T_ I_ N_ U_ E_  ;
CONVERT : C_ O_ N_ V_ E_ R_ T_  ;
CORRESPONDING : C_ O_ R_ R_ E_ S_ P_ O_ N_ D_ I_ N_ G_  ;
CREATE : C_ R_ E_ A_ T_ E_  ;
CROSS : C_ R_ O_ S_ S_  ;
CURRENT : C_ U_ R_ R_ E_ N_ T_  ;
CURRENT_DATE : C_ U_ R_ R_ E_ N_ T_ UNDERSCORE D_ A_ T_ E_  ;
CURRENT_TIME : C_ U_ R_ R_ E_ N_ T_ UNDERSCORE T_ I_ M_ E_  ;
CURRENT_TIMESTAMP : C_ U_ R_ R_ E_ N_ T_ UNDERSCORE T_ I_ M_ E_ S_ T_ A_ M_ P_  ;
CURRENT_USER : C_ U_ R_ R_ E_ N_ T_ UNDERSCORE U_ S_ E_ R_  ;
CURSOR : C_ U_ R_ S_ O_ R_  ;
DATE : D_ A_ T_ E_  ;
DAY : D_ A_ Y_  ;
DEALLOCATE : D_ E_ A_ L_ L_ O_ C_ A_ T_ E_  ;
DEC : D_ E_ C_  ;
DECIMAL : D_ E_ C_ I_ M_ A_ L_  ;
DECLARE : D_ E_ C_ L_ A_ R_ E_  ;
DEFAULT : D_ E_ F_ A_ U_ L_ T_  ;
DEFERRABLE : D_ E_ F_ E_ R_ R_ A_ B_ L_ E_  ;
DEFERRED : D_ E_ F_ E_ R_ R_ E_ D_  ;
DELETE : D_ E_ L_ E_ T_ E_  ;
DESC : D_ E_ S_ C_  ;
DESCRIBE : D_ E_ S_ C_ R_ I_ B_ E_  ;
DESCRIPTOR : D_ E_ S_ C_ R_ I_ P_ T_ O_ R_  ;
DIAGNOSTICS : D_ I_ A_ G_ N_ O_ S_ T_ I_ C_ S_  ;
DISCONNECT : D_ I_ S_ C_ O_ N_ N_ E_ C_ T_  ;
DISTINCT : D_ I_ S_ T_ I_ N_ C_ T_  ;
DOMAIN : D_ O_ M_ A_ I_ N_  ;
DOUBLE : D_ O_ U_ B_ L_ E_  ;
DROP : D_ R_ O_ P_  ;
ELSE : E_ L_ S_ E_  ;
END : E_ N_ D_  ;
END_EXEC : E_ N_ D_ E_ X_ E_ C_  ;
ESCAPE : E_ S_ C_ A_ P_ E_  ;
EXCEPT : E_ X_ C_ E_ P_ T_  ;
EXCEPTION : E_ X_ C_ E_ P_ T_ I_ O_ N_  ;
EXEC : E_ X_ E_ C_  ;
EXECUTE : E_ X_ E_ C_ U_ T_ E_  ;
EXISTS : E_ X_ I_ S_ T_ S_  ;
EXTERNAL : E_ X_ T_ E_ R_ N_ A_ L_  ;
EXTRACT : E_ X_ T_ R_ A_ C_ T_  ;
FALSE : F_ A_ L_ S_ E_  ;
FETCH : F_ E_ T_ C_ H_  ;
FIRST : F_ I_ R_ S_ T_  ;
FLOAT : F_ L_ O_ A_ T_  ;
FOR : F_ O_ R_  ;
FOREIGN : F_ O_ R_ E_ I_ G_ N_  ;
FOUND : F_ O_ U_ N_ D_  ;
FROM : F_ R_ O_ M_  ;
FULL : F_ U_ L_ L_  ;
GET : G_ E_ T_  ;
GLOBAL : G_ L_ O_ B_ A_ L_  ;
GO : G_ O_  ;
GOTO : G_ O_ T_ O_  ;
GRANT : G_ R_ A_ N_ T_  ;
GROUP : G_ R_ O_ U_ P_  ;
HAVING : H_ A_ V_ I_ N_ G_  ;
HOUR : H_ O_ U_ R_  ;
IDENTITY : I_ D_ E_ N_ T_ I_ T_ Y_  ;
IMMEDIATE : I_ M_ M_ E_ D_ I_ A_ T_ E_  ;
IN : I_ N_  ;
INDICATOR : I_ N_ D_ I_ C_ A_ T_ O_ R_  ;
INITIALLY : I_ N_ I_ T_ I_ A_ L_ L_ Y_  ;
INNER : I_ N_ N_ E_ R_  ;
INPUT : I_ N_ P_ U_ T_  ;
INSENSITIVE : I_ N_ S_ E_ N_ S_ I_ T_ I_ V_ E_  ;
INSERT : I_ N_ S_ E_ R_ T_  ;
INT : I_ N_ T_  ;
INTEGER : I_ N_ T_ E_ G_ E_ R_  ;
INTERSECT : I_ N_ T_ E_ R_ S_ E_ C_ T_  ;
INTERVAL : I_ N_ T_ E_ R_ V_ A_ L_  ;
INTO : I_ N_ T_ O_  ;
IS : I_ S_  ;
ISOLATION : I_ S_ O_ L_ A_ T_ I_ O_ N_  ;
JOIN : J_ O_ I_ N_  ;
KEY : K_ E_ Y_  ;
LANGUAGE : L_ A_ N_ G_ U_ A_ G_ E_  ;
LAST : L_ A_ S_ T_  ;
LEADING : L_ E_ A_ D_ I_ N_ G_  ;
LEFT : L_ E_ F_ T_  ;
LEVEL : L_ E_ V_ E_ L_  ;
LIKE : L_ I_ K_ E_  ;
LOCAL : L_ O_ C_ A_ L_  ;
LOWER : L_ O_ W_ E_ R_  ;
MATCH : M_ A_ T_ C_ H_  ;
MAX : M_ A_ X_  ;
MIN : M_ I_ N_  ;
MINUTE : M_ I_ N_ U_ T_ E_  ;
MODULE : M_ O_ D_ U_ L_ E_  ;
MONTH : M_ O_ N_ T_ H_  ;
NAMES : N_ A_ M_ E_ S_  ;
NATIONAL : N_ A_ T_ I_ O_ N_ A_ L_  ;
NATURAL : N_ A_ T_ U_ R_ A_ L_  ;
NCHAR : N_ C_ H_ A_ R_  ;
NEXT : N_ E_ X_ T_  ;
NO : N_ O_  ;
NOT : N_ O_ T_  ;
NULL : N_ U_ L_ L_  ;
NULLIF : N_ U_ L_ L_ I_ F_  ;
NUMERIC : N_ U_ M_ E_ R_ I_ C_  ;
OCTET_LENGTH : O_ C_ T_ E_ T_ UNDERSCORE L_ E_ N_ G_ T_ H_  ;
OF : O_ F_  ;
ON : O_ N_  ;
ONLY : O_ N_ L_ Y_  ;
OPEN : O_ P_ E_ N_  ;
OPTION : O_ P_ T_ I_ O_ N_  ;
OR : O_ R_  ;
ORDER : O_ R_ D_ E_ R_  ;
OUTER : O_ U_ T_ E_ R_  ;
OUTPUT : O_ U_ T_ P_ U_ T_  ;
OVERLAPS : O_ V_ E_ R_ L_ A_ P_ S_  ;
PAD : P_ A_ D_  ;
PARTIAL : P_ A_ R_ T_ I_ A_ L_  ;
POSITION : P_ O_ S_ I_ T_ I_ O_ N_  ;
PRECISION : P_ R_ E_ C_ I_ S_ I_ O_ N_  ;
PREPARE : P_ R_ E_ P_ A_ R_ E_  ;
PRESERVE : P_ R_ E_ S_ E_ R_ V_ E_  ;
PRIMARY : P_ R_ I_ M_ A_ R_ Y_  ;
PRIOR : P_ R_ I_ O_ R_  ;
PRIVILEGES : P_ R_ I_ V_ I_ L_ E_ G_ E_ S_  ;
PROCEDURE : P_ R_ O_ C_ E_ D_ U_ R_ E_  ;
PUBLIC : P_ U_ B_ L_ I_ C_  ;
READ : R_ E_ A_ D_  ;
REAL : R_ E_ A_ L_  ;
REFERENCES : R_ E_ F_ E_ R_ E_ N_ C_ E_ S_  ;
RELATIVE : R_ E_ L_ A_ T_ I_ V_ E_  ;
RESTRICT : R_ E_ S_ T_ R_ I_ C_ T_  ;
REVOKE : R_ E_ V_ O_ K_ E_  ;
RIGHT : R_ I_ G_ H_ T_  ;
ROLLBACK : R_ O_ L_ L_ B_ A_ C_ K_  ;
ROWS : R_ O_ W_ S_  ;
SCHEMA : S_ C_ H_ E_ M_ A_  ;
SCROLL : S_ C_ R_ O_ L_ L_  ;
SECOND : S_ E_ C_ O_ N_ D_  ;
SECTION : S_ E_ C_ T_ I_ O_ N_  ;
SELECT : S_ E_ L_ E_ C_ T_  ;
SESSION : S_ E_ S_ S_ I_ O_ N_  ;
SESSION_USER : S_ E_ S_ S_ I_ O_ N_ UNDERSCORE U_ S_ E_ R_  ;
SET : S_ E_ T_  ;
SIZE : S_ I_ Z_ E_  ;
SMALLINT : S_ M_ A_ L_ L_ I_ N_ T_  ;
SOME : S_ O_ M_ E_  ;
SPACE : S_ P_ A_ C_ E_  ;
SQL : S_ Q_ L_  ;
SQLCODE : S_ Q_ L_ C_ O_ D_ E_  ;
SQLERROR : S_ Q_ L_ E_ R_ R_ O_ R_  ;
SQLSTATE : S_ Q_ L_ S_ T_ A_ T_ E_  ;
SUBSTRING : S_ U_ B_ S_ T_ R_ I_ N_ G_  ;
SUM : S_ U_ M_  ;
SYSTEM_USER : S_ Y_ S_ T_ E_ M_ UNDERSCORE U_ S_ E_ R_  ;
TABLE : T_ A_ B_ L_ E_  ;
TEMPORARY : T_ E_ M_ P_ O_ R_ A_ R_ Y_  ;
THEN : T_ H_ E_ N_  ;
TIME : T_ I_ M_ E_  ;
TIMESTAMP : T_ I_ M_ E_ S_ T_ A_ M_ P_  ;
TIMEZONE_HOUR : T_ I_ M_ E_ Z_ O_ N_ E_ UNDERSCORE H_ O_ U_ R_  ;
TIMEZONE_MINUTE : T_ I_ M_ E_ Z_ O_ N_ E_ UNDERSCORE M_ I_ N_ U_ T_ E_  ;
TO : T_ O_  ;
TRAILING : T_ R_ A_ I_ L_ I_ N_ G_  ;
TRANSACTION : T_ R_ A_ N_ S_ A_ C_ T_ I_ O_ N_  ;
TRANSLATE : T_ R_ A_ N_ S_ L_ A_ T_ E_  ;
TRANSLATION : T_ R_ A_ N_ S_ L_ A_ T_ I_ O_ N_  ;
TRIM : T_ R_ I_ M_  ;
TRUE : T_ R_ U_ E_  ;
UNION : U_ N_ I_ O_ N_  ;
UNIQUE : U_ N_ I_ Q_ U_ E_  ;
UNKNOWN : U_ N_ K_ N_ O_ W_ N_  ;
UPDATE : U_ P_ D_ A_ T_ E_  ;
UPPER : U_ P_ P_ E_ R_  ;
USAGE : U_ S_ A_ G_ E_  ;
USER : U_ S_ E_ R_  ;
USING : U_ S_ I_ N_ G_  ;
VALUE : V_ A_ L_ U_ E_  ;
VALUES : V_ A_ L_ U_ E_ S_  ;
VARCHAR : V_ A_ R_ C_ H_ A_ R_  ;
VARYING : V_ A_ R_ Y_ I_ N_ G_  ;
VIEW : V_ I_ E_ W_  ;
WHEN : W_ H_ E_ N_  ;
WHENEVER : W_ H_ E_ N_ E_ V_ E_ R_  ;
WHERE : W_ H_ E_ R_ E_  ;
WITH : W_ I_ T_ H_  ;
WORK : W_ O_ R_ K_  ;
WRITE : W_ R_ I_ T_ E_  ;
YEAR : Y_ E_ A_ R_  ;
ZONE : Z_ O_ N_ E_  ;


/*
 * NON_RESERVED_WORD
 */
ADA : A_ D_ A_  ;
C : C_  ;
CATALOG_NAME : C_ A_ T_ A_ L_ O_ G_ UNDERSCORE N_ A_ M_ E_  ;
CHARACTER_SET_CATALOG : C_ H_ A_ R_ A_ C_ T_ E_ R_ UNDERSCORE S_ E_ T_ UNDERSCORE C_ A_ T_ A_ L_ O_ G_  ;
CHARACTER_SET_NAME : C_ H_ A_ R_ A_ C_ T_ E_ R_ UNDERSCORE S_ E_ T_ UNDERSCORE N_ A_ M_ E_  ;
CHARACTER_SET_SCHEMA : C_ H_ A_ R_ A_ C_ T_ E_ R_ UNDERSCORE S_ E_ T_ UNDERSCORE S_ C_ H_ E_ M_ A_  ;
CLASS_ORIGIN : C_ L_ A_ S_ S_ UNDERSCORE O_ R_ I_ G_ I_ N_  ;
COBOL : C_ O_ B_ O_ L_  ;
COLLATION_CATALOG : C_ O_ L_ L_ A_ T_ I_ O_ N_ UNDERSCORE C_ A_ T_ A_ L_ O_ G_  ;
COLLATION_NAME : C_ O_ L_ L_ A_ T_ I_ O_ N_ UNDERSCORE N_ A_ M_ E_  ;
COLLATION_SCHEMA : C_ O_ L_ L_ A_ T_ I_ O_ N_ UNDERSCORE S_ C_ H_ E_ M_ A_  ;
COLUMN_NAME : C_ O_ L_ U_ M_ N_ UNDERSCORE N_ A_ M_ E_  ;
COMMAND_FUNCTION : C_ O_ M_ M_ A_ N_ D_ UNDERSCORE F_ U_ N_ C_ T_ I_ O_ N_  ;
COMMITTED : C_ O_ M_ M_ I_ T_ T_ E_ D_  ;
CONDITION_NUMBER : C_ O_ N_ D_ I_ T_ I_ O_ N_ UNDERSCORE N_ U_ M_ B_ E_ R_  ;
CONNECTION_NAME : C_ O_ N_ N_ E_ C_ T_ I_ O_ N_ UNDERSCORE N_ A_ M_ E_  ;
CONSTRAINT_CATALOG : C_ O_ N_ S_ T_ R_ A_ I_ N_ T_ UNDERSCORE C_ A_ T_ A_ L_ O_ G_  ;
CONSTRAINT_NAME : C_ O_ N_ S_ T_ R_ A_ I_ N_ T_ UNDERSCORE N_ A_ M_ E_  ;
CONSTRAINT_SCHEMA : C_ O_ N_ S_ T_ R_ A_ I_ N_ T_ UNDERSCORE S_ C_ H_ E_ M_ A_  ;
CURSOR_NAME : C_ U_ R_ S_ O_ R_ UNDERSCORE N_ A_ M_ E_  ;
DATA : D_ A_ T_ A_  ;
DATETIME_INTERVAL_CODE : D_ A_ T_ E_ T_ I_ M_ E_ UNDERSCORE I_ N_ T_ E_ R_ V_ A_ L_ UNDERSCORE C_ O_ D_ E_  ;
DATETIME_INTERVAL_PRECISION : D_ A_ T_ E_ T_ I_ M_ E_ UNDERSCORE I_ N_ T_ E_ R_ V_ A_ L_ UNDERSCORE P_ R_ E_ C_ I_ S_ I_ O_ N_  ;
DYNAMIC_FUNCTION : D_ Y_ N_ A_ M_ I_ C_ UNDERSCORE F_ U_ N_ C_ T_ I_ O_ N_  ;
FORTRAN :F_ O_ R_ T_ R_ A_ N_  ;
LENGTH : L_ E_ N_ G_ T_ H_  ;
MESSAGE_LENGTH : M_ E_ S_ S_ A_ G_ E_ UNDERSCORE L_ E_ N_ G_ T_ H_  ;
MESSAGE_OCTET_LENGTH : M_ E_ S_ S_ A_ G_ E_ UNDERSCORE O_ C_ T_ E_ T_ UNDERSCORE L_ E_ N_ G_ T_ H_  ;
MESSAGE_TEXT : M_ E_ S_ S_ A_ G_ E_ UNDERSCORE T_ E_ X_ T_  ;
MORE : M_ O_ R_ E_  ;
MUMPS : M_ U_ M_ P_ S_  ;
NAME : N_ A_ M_ E_  ;
NULLABLE : N_ U_ L_ L_ A_ B_ L_ E_  ;
NUMBER : N_ U_ M_ B_ E_ R_  ;
PASCAL : P_ A_ S_ C_ A_ L_  ;
PLI : P_ L_ I_  ;
REPEATABLE : R_ E_ P_ E_ A_ T_ A_ B_ L_ E_  ;
RETURNED_LENGTH : R_ E_ T_ U_ R_ N_ E_ D_ UNDERSCORE L_ E_ N_ G_ T_ H_  ;
RETURNED_OCTET_LENGTH : R_ E_ T_ U_ R_ N_ E_ D_ UNDERSCORE O_ C_ T_ E_ T_ UNDERSCORE L_ E_ N_ G_ T_ H_  ;
RETURNED_SQLSTATE : R_ E_ T_ U_ R_ N_ E_ D_ UNDERSCORE S_ Q_ L_ S_ T_ A_ T_ E_  ;
ROW_COUNT : R_ O_ W_ UNDERSCORE C_ O_ U_ N_ T_  ;
SCALE : S_ C_ A_ L_ E_  ;
SCHEMA_NAME : S_ C_ H_ E_ M_ A_ UNDERSCORE N_ A_ M_ E_  ;
SERIALIZABLE : S_ E_ R_ I_ A_ L_ I_ Z_ A_ B_ L_ E_  ;
SERVER_NAME : S_ E_ R_ V_ E_ R_ UNDERSCORE N_ A_ M_ E_  ;
SUBCLASS_ORIGIN : S_ U_ B_ C_ L_ A_ S_ S_ UNDERSCORE O_ R_ I_ G_ I_ N_  ;
TABLE_NAME : T_ A_ B_ L_ E_ UNDERSCORE N_ A_ M_ E_  ;
TYPE : T_ Y_ P_ E_  ;
UNCOMMITTED : U_ N_ C_ O_ M_ M_ I_ T_ T_ E_ D_  ;
UNNAMED : U_ N_ N_ A_ M_ E_ D_  ;

//Literal Numbers, Strings, Dates and Times
//有符号数
SIGNED_NUMERIC_LITERAL : SIGN (EXACT_NUMERIC_LITERAL | APPROXIMATE_NUMERIC_LITERAL);
//无符号数
UNSIGNED_NUMERIC_LITERAL : EXACT_NUMERIC_LITERAL | APPROXIMATE_NUMERIC_LITERAL;
//精确数
EXACT_NUMERIC_LITERAL 
:	
	UNSIGNED_INTEGER ( PERIOD (UNSIGNED_INTEGER)? )? | PERIOD UNSIGNED_INTEGER
;

//近似数,科学计数法表示
fragment
APPROXIMATE_NUMERIC_LITERAL
:
	MANTISSA E_ EXPONENT
;
//尾数
fragment
MANTISSA
:
	EXACT_NUMERIC_LITERAL
;
//指数
fragment
EXPONENT
:
	SIGNED_INTEGER
;
fragment
SIGNED_INTEGER
:
	SIGN? UNSIGNED_INTEGER
;
//无符号数

UNSIGNED_INTEGER
:	
	DIGIT+
;
fragment
DIGIT
:
	[0-9]
;

//非单引号字符
fragment
    NONQUOTE_CHARACTER : ~'\'';


NATIONAL_CHARACTER_STRING_LITERAL:
         N_ QUOTE CHARACTER_REPRESENTATION* QUOTE ( SEPARATOR* QUOTE CHARACTER_REPRESENTATION* QUOTE )*
         ;

CHARACTER_REPRESENTATION : NONQUOTE_CHARACTER | QUOTE_SYMBOL;

QUOTE_SYMBOL    :   QUOTE QUOTE;

SEPARATOR    : ( COMMENT | WHILE_SPACE | NEWLINE )+;

COMMENT    : CHARACTER_REPRESENTATION COMMENT_CHARACTER* NEWLINE;

COMMENT_INTRODUCER :  MINUS_SIGN MINUS_SIGN MINUS_SIGN*;

COMMENT_CHARACTER   : NONQUOTE_CHARACTER | QUOTE;

BIT_STRING_LITERAL    
:
	B_ QUOTE BIT_* QUOTE ( SEPARATOR* QUOTE BIT_* QUOTE )*
;

fragment
BIT_
:	[01]
;

HEX_STRING_LITERAL
: 
	X_ QUOTE HEXIT* QUOTE ( SEPARATOR* QUOTE HEXIT* QUOTE )*
;

fragment
HEXIT
:	[0-9a-zA-Z]
;