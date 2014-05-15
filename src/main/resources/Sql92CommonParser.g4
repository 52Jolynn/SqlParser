/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar Sql92CommonParser;

options {
    tokenVocab=Sql92CommonLexer;
}

import DateParser;

identifier : (UNDERSCORE character_set_specification)? actual_identifier;
actual_identifier : regular_identifier|delimited_identifier;

regular_identifier : identifier_body;
identifier_body : identifier_start (UNDERSCORE|identifier_part)*;
identifier_start : ALPHA;
identifier_part : identifier_start|DIGIT;

delimited_identifier : DOUBLE_QUOTE delimited_identifier_body DOUBLE_QUOTE;
delimited_identifier_body : delimited_identifier_part+;
delimited_identifier_part : NONDOUBLEQUOTE_CHARACTER|DOUBLEQUOTE_SYMBOL;

//SCHEMA NAME
schema_name : (catalog_name PERIOD)? unqualified_schema_name;
catalog_name : identifier;
unqualified_schema_name : identifier;

character_string_literal : (UNDERSCORE character_set_specification)? quote_string (seperator+ quote_string)*;
character_set_specification
:
	standard_character_repertoire_name
	| implementation_defined_character_repertoire_name
	| user_defined_character_repertoire_name
	| standard_universal_character_form_of_use_name
	| implementation_defined_universal_character_form_of_use_name
;
character_set_name : (schema_name PERIOD)? SQL_LANGUAGE_IDENTIFIER;
standard_character_repertoire_name : character_set_name;
implementation_defined_character_repertoire_name : character_set_name;
user_defined_character_repertoire_name : character_set_name;
standard_universal_character_form_of_use_name : character_set_name;
implementation_defined_universal_character_form_of_use_name : character_set_name;

//table
table_name
:
	qualified_name
	| qualified_local_table_name
;

//constraint 约束
constraint_name_definition : 'CONSTRAINT' constraint_name;
constraint_name : qualified_name;//约束名
unique_specification : 'UNIQUE'|'PRIMARY' 'KEY';
references_specification : 'REFERENCES' referenced_table_and_columns ('MATCH' match_type)? referential_triggered_action?;
referenced_table_and_columns : table_name (LEFT_PAREN reference_column_list RIGHT_PAREN)?;
reference_column_list : column_name_list;
match_type : 'FULL'|'PARTIAL';
referential_triggered_action
:
	update_rule delete_rule?
	| delete_rule update_rule?
;
update_rule : 'ON' 'UPDATE' referential_action;
delete_rule : 'ON' 'DELETE' referential_action;
referential_action : 'CASCADE'|'SET' ('NULL'|'DEFAULT')|'NO' 'ACTION';
constraint_attributes : constraint_check_time ('NOT'? 'DEFERRABLE')?|'NOT'? 'DEFERRABLE' constraint_check_time?;
constraint_check_time : 'INITIALLY' ('DEFERRED'|'IMMEDIATE');
unique_constraint_definition : unique_specification LEFT_PAREN unique_column_list RIGHT_PAREN;
unique_column_list : column_name_list;
referential_constraint_definition : 'FOREIGN' 'KEY' LEFT_PAREN referencing_columns RIGHT_PAREN references_specification;
referencing_columns : reference_column_list;

//collate_clause
collate_clause : 'COLLATE' collation_name;
collation_name : qualified_name;

//as clause
as_clause : 'AS' column_name;

//group by clause
group_by_clause : 'GROUP' 'BY' grouping_column_reference_list;
grouping_column_reference_list : grouping_column_reference (COMMA grouping_column_reference)*;
grouping_column_reference : column_reference collate_clause?;

//order by clause
order_by_clause : 'ORDER' 'BY' sort_specification_list;
sort_specification_list : sort_specification (COMMA sort_specification)*;
sort_specification : sort_key collate_clause? ordering_specification?;
sort_key : column_name|UNSIGNED_INTEGER;
ordering_specification : 'ASC'|'DESC';
updatability_clause : 'FOR' ('READ' 'ONLY'|'UPDATE' ('OF' column_name_list)?);

//default clause
default_clause :'DEFAULT' default_option;
default_option
:
	literal
	| datetime_value_function
	| 'USER'
	| 'CURRENT_USER'
	| 'SESSION_USER'
	| 'SYSTEM_USER'
	| 'NULL'
;
literal
:
	SIGNED_NUMERIC_LITERAL
	| general_literal
;
unsigned_literal
:
	UNSIGNED_NUMERIC_LITERAL
	| general_literal
;
general_literal
:
	character_string_literal
	| national_character_string_literal
	| bit_string_literal
	| hex_string_literal
	| datetime_literal
	| interval_literal
;
//national character string literal
national_character_string_literal : 'N' quote_string (seperator+ quote_string)*;
//bit string literal
bit_string_literal : 'B' quote_bit (seperator+ quote_bit)*; //B0 1 2 3
//hex string literal
hex_string_literal : 'X' quote_hex (seperator+ quote_hex)*; //XFFEE FFEA ACEF

//datetime literal
datetime_literal
:
	date_literal
	| time_literal
	| timestamp_literal
;
date_literal : 'DATE' date_string;
time_literal : 'TIME' time_string;
timestamp_literal : 'TIMESTAMP' timestamp_string;
//interval literal
interval_literal : 'INTERVAL' SIGN? interval_string interval_qualifier;

//datetime value function
datetime_value_function
:
	current_date_value_function
	| current_time_value_function
	| current_timestamp_value_function
;
current_date_value_function : 'CURRENT_DATE';
current_time_value_function : 'CURRENT_TIME' (LEFT_PAREN time_precision RIGHT_PAREN)?;
current_timestamp_value_function : 'CURRENT_TIMESTAMP' (LEFT_PAREN timestamp_precision RIGHT_PAREN)?;

//column definition 列声明
column_name : identifier;
column_name_list : column_name (COMMA column_name)*;

//data type 数据类型
data_type
:
	character_string_type ('CHARACTER' 'SET' character_set_specification)?
	| national_character_string_type
	| bit_string_type
	| numeric_type
	| datetime_type
	| interval_type
;
//character string type
character_string_type : (('CHARACTER' |'CHAR') 'VARYING'?|'VARCHAR') (LEFT_PAREN length RIGHT_PAREN)?;
//national character string type
national_character_string_type : ('NATIONAL' (('CHARACTER'|'CHAR') 'VARYING'?|'VARCHAR')|'NCHAR' 'VARYING'?) (LEFT_PAREN length RIGHT_PAREN)?;
//bit string type
bit_string_type : 'BIT' 'VARYING'? (LEFT_PAREN length RIGHT_PAREN)?;

//numeric type
numeric_type
:
	exact_numeric_type
	| approximate_numeric_type
;
exact_numeric_type : (('NUMERIC'|'DECIMAL'|'DEC') (LEFT_PAREN precision (COMMA scale)? RIGHT_PAREN)?)|'INTEGER'|'INT'|'SMALLINT';
approximate_numeric_type : 'FLOAT' (LEFT_PAREN precision RIGHT_PAREN)?|'REAL'|'DOUBLE' 'PRECISION';
//datetime type
datetime_type : 'DATE'|('TIME' (LEFT_PAREN time_precision RIGHT_PAREN)?|'TIMESTAMP' (LEFT_PAREN timestamp_precision RIGHT_PAREN)?) ('WITH' 'TIME' 'ZONE')?;
time_fractional_seconds_precision : UNSIGNED_INTEGER; 
time_precision : time_fractional_seconds_precision;
timestamp_precision : time_fractional_seconds_precision;
//interval type
interval_type : 'INTERVAL' interval_qualifier;
interval_qualifier
:
	start_field 'TO' end_field
	| sigle_datetime_field
;
start_field : non_second_datetime_field (LEFT_PAREN interval_leading_field_precision RIGHT_PAREN)?;
non_second_datetime_field
:
	'YEAR'
	| 'MONTH'
	| 'DAY'
	| 'HOUR'
	| 'MINUTE'
;
interval_leading_field_precision : UNSIGNED_INTEGER;
end_field
:
	non_second_datetime_field
	| 'SECOND' LEFT_PAREN interval_fractional_seconds_precision RIGHT_PAREN
;
interval_fractional_seconds_precision : UNSIGNED_INTEGER;
sigle_datetime_field : non_second_datetime_field (LEFT_PAREN interval_leading_field_precision RIGHT_PAREN)?|'SECOND' (LEFT_PAREN interval_leading_field_precision (COMMA LEFT_PAREN interval_fractional_seconds_precision RIGHT_PAREN)? RIGHT_PAREN)?;

general_value_specification
:
	parameter_specification
	| dynamic_parameter_specification
	| variable_specification
	| 'USER'
	| 'CURRENT_USER'
	| 'SESSION_USER'
	| 'SYSTEM_USER'
	| 'VALUE'
;
parameter_specification : parameter_name indicator_parameter?;
indicator_parameter : 'INDICATOR' parameter_name;
dynamic_parameter_specification : QUESTION_MARK;
variable_specification : embedded_variable_name indicator_variable?;
indicator_variable : 'INDICATOR'? embedded_variable_name;
embedded_variable_name : COLON host_identifier;
host_identifier
:
	ada_host_identifier
	| c_host_identifier
	| cobol_host_identifier
	| fortran_host_identifier
	| mumps_host_identifier
	| pascal_host_identifier
	| pli_host_identifier
;
ada_host_identifier : GENERAL_IDENTIFIER;
c_host_identifier : GENERAL_IDENTIFIER;
cobol_host_identifier : GENERAL_IDENTIFIER;
fortran_host_identifier : GENERAL_IDENTIFIER;
mumps_host_identifier : GENERAL_IDENTIFIER;
pascal_host_identifier : GENERAL_IDENTIFIER;
pli_host_identifier : GENERAL_IDENTIFIER;
simple_target_specification : parameter_name|embedded_variable_name;

unsigned_value_specification
:
	unsigned_literal
	| general_value_specification
;

language_clause : 'LANGUAGE' LANGUAGE_NAME;
extract_field
:
	datetime_field
	| time_zone_field
;

datetime_field
:
	non_second_datetime_field
	| 'SECOND'
;

time_zone_field
:
	'TIMEZONE_HOUR'
	| 'TIMEZONE_MINUTE'
;
cast_target
:
	domain_name
	| data_type
;

trim_specification
:
	'LEADING'
	| 'TRAILING'
	| 'BOTH'
;

truth_value
:
	'TRUE'
	| 'FALSE'
	| 'UNKNOWN'
;
null_specification : NULL;
default_specification : DEFAULT;

comp_op
:
	EQ
	| NOT_EQ
	| LESS_THAN
	| GREATER_THAN
	| LESS_THAN_OR_EQ
	| GREATER_THAN_OR_EQ
;

set_function_type
:
	AVG
	| MAX
	| MIN
	| SUM
	| COUNT
;

set_qualifier : DISTINCT | ALL;

quantifier : all | some;

all :ALL;

some : SOME | ANY;

length : UNSIGNED_INTEGER;
precision : UNSIGNED_INTEGER;
scale : UNSIGNED_INTEGER;

authorization_identifier : identifier;
cursor_name : identifier;
correlation_name : identifier;
statement_name : identifier;
qualified_identifier : identifier;
local_table_name : qualified_identifier;
qualifier
:
	table_name
	| correlation_name
;
qualified_local_table_name : 'MODULE' PERIOD local_table_name;
column_reference : (qualifier PERIOD)? column_name;

domain_name : qualified_name;
qualified_name : (schema_name PERIOD)? qualified_identifier;
parameter_name : COLON identifier;//参数
form_of_use_conversion : qualified_name;
translation_name : qualified_name;

seperator : comment|SPACE|NEWLINE;//分隔符
comment : COMMENT_INTRODUCER quote_string* NEWLINE;//注释

//单引号字符串
quote_string : QUOTE character_representation* QUOTE;
character_representation : NONQUOTE_CHARACTER|QUOTE_SYMBOL;
//单引号二进制串
quote_bit : QUOTE BIT* QUOTE;
//单引号十六进制串
quote_hex : QUOTE (HEX HEX HEX HEX)? QUOTE;//'FFEE' or ''
