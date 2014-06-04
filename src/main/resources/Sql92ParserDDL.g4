grammar Sql92ParserDDL;
import BaseLexer;

//开发过程暂时占位
undo:	'0Xundo' ;

character_string_literal    :
     ( introducer character_set_specification )? QUOTE ( CHARACTER_REPRESENTATION )* QUOTE SEPARATOR*  QUOTE CHARACTER_REPRESENTATION* QUOTE*
     ;
     
/*character_set_specification ::=
    standard_character_repertoire_name
	| implementation_defined_character_repertoire_name
	| user_defined_character_repertoire_name
	| standard_universal_character_form_of_use_name
	| implementation_defined_universal_character_form_of_use_name 
	*  == character_set_name
	* */
character_set_specification
:
	character_set_name
;

character_set_name
:	(schema_name PERIOD)? sql_language_identifier
;

sql_language_identifier    
:
	SQL_LANGUAGE_IDENTIFIER_START ( UNDERSCORE | SQL_LANGUAGE_IDENTIFIER_PART )*
;

SQL_LANGUAGE_IDENTIFIER_START
:
	SIMPLE_LATIN_LETTER
;

SQL_LANGUAGE_IDENTIFIER_PART
:
	SIMPLE_LATIN_LETTER
	| DIGIT
;

implementation_defined_character_repertoire_name
:
	character_set_name
;

user_defined_character_repertoire_name
:
	character_set_name
;

standard_universal_character_form_of_use_name
:
	character_set_name
;

implementation_defined_universal_character_form_of_use_name
:
	character_set_name
;

date_string    :   QUOTE date_value QUOTE
;
date_value    :   years_value MINUS_SIGN months_value MINUS_SIGN days_value
;
years_value    :   DATETIME_VALUE
;
DATETIME_VALUE    :   UNSIGNED_INTEGER
;
months_value    :   DATETIME_VALUE
;
days_value    :   DATETIME_VALUE
;
time_string    :   QUOTE time_value time_zone_interval? QUOTE
;
time_value    :   hours_value COLON minutes_value COLON seconds_value
;
hours_value    :   DATETIME_VALUE
;
minutes_value    :   DATETIME_VALUE
;
seconds_value    :   seconds_integer_value ( PERIOD seconds_fraction? )?
;
seconds_integer_value    :   UNSIGNED_INTEGER
;
seconds_fraction    :   UNSIGNED_INTEGER
;
time_zone_interval    :   SIGN hours_value COLON minutes_value
;
timestamp_string    :   QUOTE date_value WHILE_SPACE time_value time_zone_interval? QUOTE
;
interval_string    :   QUOTE ( year_month_literal | day_time_literal ) QUOTE
;
year_month_literal    : 
         years_value
     |     ( years_value MINUS_SIGN )? months_value
;
day_time_literal : day_time_interval | time_interval
;
day_time_interval : 
         days_value ( WHILE_SPACE hours_value ( COLON minutes_value ( COLON seconds_value )? )? )?
;
time_interval    : 
         hours_value ( COLON minutes_value ( COLON seconds_value )? )?
     |     minutes_value (COLON seconds_value)?
     |     seconds_value
;

regular_identifier
:
	IDENTIFIER_BODY
;

introducer
:
	UNDERSCORE
;

identifier
:
	(
		introducer character_set_specification
	)? ACTUAL_IDENTIFIER
;

fragment
ACTUAL_IDENTIFIER
:
	REGULAR_IDENTIFIER
	| DELIMITED_IDENTIFIER
;

fragment
DELIMITED_IDENTIFIER
:
	DOUBLE_QUOTE DELIMITED_IDENTIFIER_BODY DOUBLE_QUOTE
;

fragment
DELIMITED_IDENTIFIER_BODY
:
	DELIMITED_IDENTIFIER_PART*
;

fragment
DELIMITED_IDENTIFIER_PART
:
	NONDOUBLEQUOTE_CHARACTER
	| DOUBLEQUOTE_SYMBOL
;
fragment
NONDOUBLEQUOTE_CHARACTER
:
	~'"'
;
fragment
DOUBLEQUOTE_SYMBOL
:
	DOUBLE_QUOTE DOUBLE_QUOTE
;

catalog_name
:
	identifier
;

//SQL Module###catalog
/*
<module>    ::= 
         <module name clause> <language clause> <module authorization clause>
         [ <temporary table declaration> ... ]
         <module contents> ...

<module name clause>    ::= 
         MODULE [ <module name> ] [ <module character set specification> ]

<module name>    ::=   <identifier>

<module character set specification>    ::=   NAMES ARE <character set specification>

<language clause>    ::=   LANGUAGE <language name>

<language name>    ::=   ADA | C | COBOL | FORTRAN | MUMPS | PASCAL | PLI

<module authorization clause>    ::= 
         SCHEMA <schema name>
     |     AUTHORIZATION <module authorization identifier>
     |     SCHEMA <schema name> AUTHORIZATION <module authorization identifier>

<module authorization identifier>    ::=   <authorization identifier>

<authorization identifier>    ::=   <identifier>

<temporary table declaration>    ::= 
     DECLARE LOCAL TEMPORARY TABLE <qualified local table name> <table element list> [ ON COMMIT { PRESERVE | DELETE } ROWS ]
*/
qualified_local_table_name
:
	MODULE PERIOD local_table_name
;

local_table_name
:
	qualified_identifier
;

qualified_identifier
:
	identifier
;
/*
<table element list>    ::=   <left paren> <table element> [ { <comma> <table element> }... ] <right paren>

<table element>    ::=   <column definition> | <table constraint definition>

<column definition>    ::= 
         <column name> { <data type> | <domain name> } [ <default clause> ] [ <column constraint definition> ... ] [ <collate clause> ]
 */
column_name
:
	identifier
;

//DATA TYPE ###catalog
data_type
:   character_string_type (CHARACTER SET character_set_specification)?
     |     national_character_string_type
     |     bit_string_type
     |     numeric_type
     |     datetime_type
     |     interval_type
;

character_string_type
:      CHARACTER ( LEFT_PAREN length RIGHT_PAREN )?
       |     CHAR ( LEFT_PAREN length RIGHT_PAREN )?
       |     CHARACTER VARYING ( LEFT_PAREN length RIGHT_PAREN )?
       |     CHAR VARYING ( LEFT_PAREN length RIGHT_PAREN )?
       |     VARCHAR ( LEFT_PAREN length RIGHT_PAREN )?
;

length
:   UNSIGNED_INTEGER
;

national_character_string_type
:    NATIONAL CHARACTER ( LEFT_PAREN length RIGHT_PAREN )?
     |     NATIONAL CHAR ( LEFT_PAREN length RIGHT_PAREN )?
     |     NCHAR ( LEFT_PAREN length RIGHT_PAREN )?
     |     NATIONAL CHARACTER VARYING ( LEFT_PAREN length RIGHT_PAREN )?
     |     NATIONAL CHAR VARYING ( LEFT_PAREN length RIGHT_PAREN )?
     |     NCHAR VARYING ( LEFT_PAREN length RIGHT_PAREN )?
;

bit_string_type
:    
	BIT ( LEFT_PAREN length RIGHT_PAREN )?
    |     BIT VARYING ( LEFT_PAREN length RIGHT_PAREN )?
;

numeric_type
:
	exact_numeric_type
	| approximate_numeric_type
;

exact_numeric_type
:   NUMERIC ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )?
     |     DECIMAL ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )?
     |     DEC ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )?
     |     INTEGER
     |     INT
     |     SMALLINT
;

precision
:
	UNSIGNED_INTEGER
;

scale
:
	UNSIGNED_INTEGER
;

approximate_numeric_type
:
	FLOAT ( LEFT_PAREN precision RIGHT_PAREN )?
	| REAL
	| DOUBLE PRECISION
;


datetime_type
:
     DATE 
     | TIME ( LEFT_PAREN time_precision RIGHT_PAREN )? (WITH TIME ZONE)?
     | TIMESTAMP ( LEFT_PAREN timestamp_precision RIGHT_PAREN )? ( WITH TIME ZONE )?
;

time_precision:time_fractional_seconds_precision;

time_fractional_seconds_precision    :UNSIGNED_INTEGER;

timestamp_precision:time_fractional_seconds_precision;

interval_type: INTERVAL interval_qualifier;

interval_qualifier:start_field TO end_field
     | single_datetime_field
;

start_field : 
     non_second_datetime_field ( LEFT_PAREN interval_leading_field_precision RIGHT_PAREN )?
;

non_second_datetime_field:YEAR | MONTH | DAY | HOUR | MINUTE;

interval_leading_field_precision:UNSIGNED_INTEGER;

end_field:non_second_datetime_field
     | SECOND ( LEFT_PAREN interval_fractional_seconds_precision RIGHT_PAREN )
;

interval_fractional_seconds_precision    :UNSIGNED_INTEGER;

single_datetime_field:
        non_second_datetime_field ( LEFT_PAREN interval_leading_field_precision RIGHT_PAREN )?
     | SECOND ( LEFT_PAREN interval_leading_field_precision ( COMMA LEFT_PAREN interval_fractional_seconds_precision )? RIGHT_PAREN )?
;

domain_name
:    qualified_name
;
qualified_name
:    (schema_name PERIOD)? qualified_identifier
;

default_clause
:
	DEFAULT default_option
;

default_option    :
         literal
     |     datetime_value_function
     |     USER 
     |     CURRENT_USER 
     |     SESSION_USER 
     |     SYSTEM_USER 
     |     NULL
;

datetime_value_function
:
;

//Literals ###catalog

literal    : SIGNED_NUMERIC_LITERAL | general_literal;

general_literal :
         character_string_literal
     |     NATIONAL_CHARACTER_STRING_LITERAL
     |     BIT_STRING_LITERAL
     |     HEX_STRING_LITERAL
     |     datetime_literal
     |     interval_literal
;

datetime_literal    : 
         date_literal
     |     time_literal
     |     timestamp_literal
;
date_literal    :   DATE date_string
;
time_literal    :   TIME time_string
;
timestamp_literal    :   TIMESTAMP timestamp_string
;
interval_literal
:
	INTERVAL SIGN? interval_string interval_qualifier
;

//Constraints###catalog
column_constraint_definition    :
         constraint_name_definition? column_constraint constraint_attributes?
;
constraint_name_definition
:
	CONSTRAINT constraint_name
;
constraint_name
:
	qualified_name
;

column_constraint
:
	NOT NULL
	| unique_specification
	| references_specification
	| check_constraint_definition
;

unique_specification
:
UNIQUE
| PRIMARY KEY
;

references_specification
:
	REFERENCES referenced_table_and_columns ( MATCH match_type )? ( referential_triggered_action )?
;

referenced_table_and_columns
:
	table_name (LEFT_PAREN reference_column_list RIGHT_PAREN)?
;

table_name
:
	qualified_name
	| qualified_local_table_name
;

reference_column_list
:
	column_name_list
;

column_name_list
:
	column_name (COMMA column_name)*
;

match_type
:
FULL
| PARTIAL
;

referential_triggered_action
:
update_rule
(
	delete_rule
)?
| delete_rule
(
	update_rule
)?
;

update_rule
:
ON UPDATE referential_action
;

referential_action
:
CASCADE
| SET NULL
| SET DEFAULT
| NO ACTION
;

delete_rule
:
ON DELETE referential_action
;

check_constraint_definition
:
CHECK LEFT_PAREN search_condition RIGHT_PAREN
;

search_condition
: undo
;
//Search Condition ###catalog
/*

<search condition>    ::= 
         <boolean term>
     | <search condition> OR <boolean term>

<boolean term>    ::= 
         <boolean factor>
     | <boolean term> AND <boolean factor>

<boolean factor>    ::=   [ NOT ] <boolean test>

<boolean test>    ::=   <boolean primary> [ IS [ NOT ] <truth value> ]

<boolean primary>    ::=   <predicate> | <left paren> <search condition> <right paren>

<predicate>    ::= 
         <comparison predicate>
     | <between predicate>
     | <in predicate>
     | <like predicate>
     | <null predicate>
     | <quantified comparison predicate>
     | <exists predicate>
     | <match predicate>
     | <overlaps predicate>

<comparison predicate>    ::=   <row value constructor> <comp op> <row value constructor>

<row value constructor>    ::= 
         <row value constructor element>
     | <left paren> <row value constructor list> <right paren>
     | <row subquery>

<row value constructor element>    ::= 
         <value expression>
     | <null specification>
     | <default specification>

<value expression>    ::= 
         <numeric value expression>
     | <string value expression>
     | <datetime value expression>
     | <interval value expression>

<numeric value expression>    ::= 
         <term>
     | <numeric value expression> <plus sign> <term>
     | <numeric value expression> <minus sign> <term>

<term>    ::= 
         <factor>
     | <term> <asterisk> <factor>
     | <term> <solidus> <factor>

<factor>    ::=   [ <sign> ] <numeric primary>

<numeric primary>    ::=   <value expression primary> | <numeric value function>

<value expression primary>    ::= 
         <unsigned value specification>
     | <column reference>
     | <set function specification>
     | <scalar subquery>
     | <case expression>
     | <left paren> <value expression> <right paren>
     | <cast specification>

<unsigned value specification>    ::=   <unsigned literal> | <general value specification>

<unsigned literal>    ::=   <unsigned numeric literal> | <general literal>

<general value specification>    ::= 
         <parameter specification>
     | <dynamic parameter specification>
     | <variable specification>
     | USER 
     | CURRENT_USER 
     | SESSION_USER 
     | SYSTEM_USER 
     | VALUE

<parameter specification>    ::=   <parameter name> [ <indicator parameter> ]

<parameter name>    ::=   <colon> <identifier>

<indicator parameter>    ::=   [ INDICATOR ] <parameter name>

<dynamic parameter specification>    ::=   <question mark>

<variable specification>    ::=   <embedded variable name> [ <indicator variable> ]

<embedded variable name>    ::=   <colon> <host identifier>

<host identifier>    ::= 
         <Ada host identifier>
     |     <C host identifier>
     |     <Cobol host identifier>
     |     <Fortran host identifier>
     |     <MUMPS host identifier>
     |     <Pascal host identifier>
     |     <PL/I host identifier>

<Ada host identifier>    ::=   !! See syntax rules

<C host identifier>    ::=   !! See syntax rules

<Cobol host identifier>    ::=   !! See syntax rules

<Fortran host identifier>    ::=   !! See syntax rules

<MUMPS host identifier>    ::=   !! See syntax rules

<Pascal host identifier>    ::=   !! See syntax rules

<PL/I host identifier>    ::=   !! See syntax rules

<indicator variable>    ::=   [ INDICATOR ] <embedded variable name>

<column reference>    ::=   [ <qualifier> <period> ] <column name>

<qualifier>    ::=   <table name> | <correlation name>

<correlation name>    ::=   <identifier>

<set function specification>    ::= 
         COUNT <left paren> <asterisk> <right paren>
     | <general set function>

<general set function>    ::= 
         <set function type> <left paren> [ <set quantifier> ] <value expression> <right paren>

<set function type>    ::=   AVG | MAX | MIN | SUM | COUNT

<set quantifier>    ::=   DISTINCT | ALL
*  */

//Queries ###catalog
/*

<scalar subquery>    ::=   <subquery>

<subquery>    ::=   <left paren> <query expression> <right paren>

<query expression>    ::=   <non-join query expression> | <joined table>

<non-join query expression>    ::= 
         <non-join query term>
     |     <query expression> UNION [ ALL ] [ <corresponding spec> ] <query term>
     |     <query expression> EXCEPT [ ALL ] [ <corresponding spec> ] <query term>

<non-join query term>    ::= 
         <non-join query primary>
     |     <query term> INTERSECT [ ALL ] [ <corresponding spec> ] <query primary>

<non-join query primary>    ::=   <simple table> | <left paren> <non-join query expression> <right paren>

<simple table>    ::= 
         <query specification>
     |     <table value constructor>
     |     <explicit table>

<query specification>    ::= 
         SELECT [ <set quantifier> ] <select list> <table expression>

<select list>    ::= 
         <asterisk>
     |     <select sublist> [ { <comma> <select sublist> }... ]

<select sublist>    ::=   <derived column> | <qualifier> <period> <asterisk>

<derived column>    ::=   <value expression> [ <as clause> ]

<as clause>    ::=   [ AS ] <column name>

<table expression>    ::= 
         <from clause>
         [ <where clause> ]
         [ <group by clause> ]
         [ <having clause> ]

<from clause>    ::=   FROM <table reference> [ { <comma> <table reference> }... ] Note that <correlation specification> does not appear in the ISO/IEC grammar. The notation is written out longhand several times, instead.

<table reference>    ::= 
         <table name> [ <correlation specification> ]
     | <derived table> <correlation specification>
     | <joined table>

<correlation specification>    ::= 
         [ AS ] <correlation name> [ <left paren> <derived column list> <right paren> ]

<derived column list>    ::=   <column name list>

<derived table>    ::=   <table subquery>

<table subquery>    ::=   <subquery>

<joined table>    ::= 
         <cross join>
     | <qualified join>
     | <left paren> <joined table> <right paren>

<cross join>    ::= 
         <table reference> CROSS JOIN <table reference>

<qualified join>    ::= 
         <table reference> [ NATURAL ] [ <join type> ] JOIN <table reference> [ <join specification> ]

<join type>    ::= 
         INNER 
     | <outer join type> [ OUTER ]
     | UNION

<outer join type>    ::=   LEFT | RIGHT | FULL

<join specification>    ::=   <join condition> | <named columns join>

<join condition>    ::=   ON <search condition>

<named columns join>    ::=   USING <left paren> <join column list> <right paren>

<join column list>    ::=   <column name list>

<where clause>    ::=   WHERE <search condition>

<group by clause>    ::=   GROUP BY <grouping column reference list>

<grouping column reference list>    ::= 
         <grouping column reference> [ { <comma> <grouping column reference> }... ]

<grouping column reference>    ::=   <column reference> [ <collate clause> ]
*/
collate_clause
:
	COLLATE collation_name
;

collation_name
:
	qualified_name
;
/*
<having clause>    ::=   HAVING <search condition>

<table value constructor>    ::=   VALUES <table value constructor list>

<table value constructor list>    ::=   <row value constructor> [ { <comma> <row value constructor> }... ]

<explicit table>    ::=   TABLE <table name>

<query term>    ::=   <non-join query term> | <joined table>

<corresponding spec>    ::=   CORRESPONDING [ BY <left paren> <corresponding column list> <right paren> ]

<corresponding column list>    ::=   <column name list>

<query primary>    ::=   <non-join query primary> | <joined table>
 * 
 */

//More about constraints ###catalog


constraint_attributes    : 
         constraint_check_time ( NOT? DEFERRABLE )?
     |     NOT? DEFERRABLE constraint_check_time?
;

constraint_check_time   :   INITIALLY DEFERRED | INITIALLY IMMEDIATE;
/*
<table constraint definition>    ::=   [ <constraint name definition> ] <table constraint> [ <constraint check time> ]

<table constraint>    ::= 
         <unique constraint definition>
     |     <referential constraint definition>
     |     <check constraint definition>

<unique constraint definition>    ::=   <unique specification> <left paren> <unique column list> <right paren>

<unique column list>    ::=   <column name list>

<referential constraint definition>    ::= 
         FOREIGN KEY <left paren> <referencing columns> <right paren> <references specification>

<referencing columns>    ::=   <reference column list>
*  */

//###############################################################
//SQL Procedures ###catalog
sql_procedure_statement
:
	sql_schema_statement
	| sql_data_statement
;

sql_schema_statement
:
	sql_schema_definition_statement
	| sql_schema_manipulation_statement
;

sql_schema_definition_statement
:
	schema_definition
;

schema_definition
:
	CREATE SCHEMA schema_name_clause schema_character_set_specification?
	schema_element*
;

schema_name_clause
:
	schema_name
	| AUTHORIZATION schema_authorization_identifier
	| schema_name AUTHORIZATION schema_authorization_identifier
;

schema_name
:
	(
		catalog_name PERIOD
	)? unqualified_schema_name
;

unqualified_schema_name
:identifier
;

schema_authorization_identifier
:
	authorization_identifier
;
authorization_identifier
:
	identifier
;

schema_character_set_specification
:
	DEFAULT CHARACTER SET character_set_specification
;

schema_element
:
	domain_definition
	| table_definition
	| view_definition
	| grant_statement
	| assertion_definition
	| character_set_definition
	| collation_definition
	| translation_definition
;

domain_definition
:
	CREATE DOMAIN domain_name AS? data_type
                 default_clause? domain_constraint? collate_clause?
;

domain_constraint : 
	constraint_name_definition? check_constraint_definition constraint_attributes?	
;


table_definition
:
	undo
;

view_definition
:
	undo
;

grant_statement
:
	undo
;

assertion_definition
:
	undo
;

character_set_definition
:
	undo
;

collation_definition
:
	undo
;

translation_definition
:
	undo
;

sql_schema_manipulation_statement
:
	undo
;

sql_data_statement
:
	undo
;


