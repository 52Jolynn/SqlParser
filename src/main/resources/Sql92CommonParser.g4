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

standard_character_repertoire_name : character_set_name;
//模式名
identifier : (UNDERSCORE character_set_specification)? actual_identifier;
actual_identifier : regular_identifier|delimited_identifier;
delimited_identifier : DOUBLE_QUOTE delimited_identifier_body DOUBLE_QUOTE;
delimited_identifier_body : delimited_identifier_part+;
delimited_identifier_part : NONDOUBLEQUOTE_CHARACTER|DOUBLEQUOTE_SYMBOL;
catalog_name : identifier;
unqualified_schema_name : identifier;
schema_name : (catalog_name PERIOD)? unqualified_schema_name;

implementation_defined_character_repertoire_name : character_set_name;
user_defined_character_repertoire_name : character_set_name;
standard_universal_character_form_of_use_name : character_set_name;
implementation_defined_universal_character_form_of_use_name : character_set_name;

regular_identifier : identifier_body;
identifier_body : identifier_start (UNDERSCORE|identifier_part)*;
identifier_start : ALPHA;
identifier_part : identifier_start|DIGIT;

character_string_literal : (UNDERSCORE character_set_specification)? quote_string (seperator+ quote_string)*;
character_set_specification : standard_character_repertoire_name
                            | implementation_defined_character_repertoire_name
                            | user_defined_character_repertoire_name
                            | standard_universal_character_form_of_use_name
                            | implementation_defined_universal_character_form_of_use_name
                            ;

temporary_table_declaration : 'DECLARE' 'LOCAL' 'TEMPORARY' 'TABLE' qualified_local_table_name table_element_list ('ON' 'COMMIT' ('PRESERVE' | 'DELETE') 'ROWS')?;
qualified_local_table_name : 'MODULE' PERIOD local_table_name;
local_table_name : qualified_identifier;
qualified_identifier : identifier;
table_element_list : LEFT_PAREN table_element (COMMA table_element)* RIGHT_PAREN;
table_element : column_definition table_constraint_definition;
column_definition : column_name (data_type|domain_name) default_clause? column_constraint_definition* collate_clause?;
column_name : identifier;
collate_clause : 'COLLATE' collation_name;
collation_name : qualified_name;
cursor_name : identifier;
order_by_clause : 'ORDER' 'BY' sort_specification_list;
sort_specification_list : sort_specification (COMMA sort_specification)*;
sort_specification : sort_key collate_clause? ordering_specification?;
sort_key : column_name|UNSIGNED_INTEGER;
ordering_specification : 'ASC'|'DESC';
updatability_clause : 'FOR' ('READ' 'ONLY'|'UPDATE' ('OF' column_name_list)?);
dynamic_declare_cursor : 'DECLARE' cursor_name 'INSENSITIVE'? 'SCROLL'? 'CURSOR' 'FOR' statement_name;
statement_name : identifier;

//数据类型
length : UNSIGNED_INTEGER;
precision : UNSIGNED_INTEGER;
scale : UNSIGNED_INTEGER;
data_type :character_string_type ('CHARACTER' 'SET' character_set_specification)?|national_character_string_type|bit_string_type|numeric_type|datetime_type|interval_type;
character_string_type : (('CHARACTER' |'CHAR') 'VARYING'?|'VARCHAR') (LEFT_PAREN length RIGHT_PAREN)?;
national_character_string_type : ('NATIONAL' (('CHARACTER'|'CHAR') 'VARYING'?|'VARCHAR')|'NCHAR' 'VARYING'?) (LEFT_PAREN length RIGHT_PAREN)?;
bit_string_type : 'BIT' 'VARYING'? (LEFT_PAREN length RIGHT_PAREN)?;

//数字类型
numeric_type : exact_numeric_type|approximate_numeric_type;
exact_numeric_type : (('NUMERIC'|'DECIMAL'|'DEC') (LEFT_PAREN precision (COMMA scale)? RIGHT_PAREN)?)|'INTEGER'|'INT'|'SMALLINT';
approximate_numeric_type : 'FLOAT' (LEFT_PAREN precision RIGHT_PAREN)?|'REAL'|'DOUBLE' 'PRECISION';

//时间类型
datetime_type : 'DATE'|('TIME' (LEFT_PAREN time_precision RIGHT_PAREN)?|'TIMESTAMP' (LEFT_PAREN timestamp_precision RIGHT_PAREN)?) ('WITH' 'TIME' 'ZONE')?;
time_fractional_seconds_precision : UNSIGNED_INTEGER; 
time_precision : time_fractional_seconds_precision;
timestamp_precision : time_fractional_seconds_precision;
interval_type : 'INTERVAL' interval_qualifier;
interval_qualifier : start_field 'TO' end_field|sigle_datetime_field;
start_field : non_second_datetime_field (LEFT_PAREN interval_leading_field_precision RIGHT_PAREN)?;
non_second_datetime_field : 'YEAR'|'MONTH'|'DAY'|'HOUR'|'MINUTE';
interval_leading_field_precision : UNSIGNED_INTEGER;
end_field : non_second_datetime_field|'SECOND' LEFT_PAREN interval_fractional_seconds_precision RIGHT_PAREN;
interval_fractional_seconds_precision : UNSIGNED_INTEGER;
sigle_datetime_field : non_second_datetime_field (LEFT_PAREN interval_leading_field_precision RIGHT_PAREN)?|'SECOND' (LEFT_PAREN interval_leading_field_precision (COMMA LEFT_PAREN interval_fractional_seconds_precision RIGHT_PAREN)? RIGHT_PAREN)?;

domain_name : qualified_name;
qualified_name : (schema_name PERIOD)? qualified_identifier;
default_clause :'DEFAULT' default_option;
default_option : literal|datetime_value_function|'USER'|'CURRENT_USER'|'SESSION_USER'|'SYSTEM_USER'|'NULL';
literal : SIGNED_NUMERIC_LITERAL|general_literal;
general_literal : character_string_literal|national_character_string_literal|bit_string_literal|hex_string_literal|datetime_literal|interval_literal;
datetime_literal : date_literal|time_literal|timestamp_literal;
date_literal : 'DATE' date_string;
time_literal : 'TIME' time_string;
timestamp_literal : 'TIMESTAMP' timestamp_string;

interval_literal : 'INTERVAL' SIGN? interval_string interval_qualifier;

datetime_value_function : current_date_value_function|current_time_value_function|current_timestamp_value_function;
current_date_value_function : 'CURRENT_DATE';
current_time_value_function : 'CURRENT_TIME' (LEFT_PAREN time_precision RIGHT_PAREN)?;
current_timestamp_value_function : 'CURRENT_TIMESTAMP' (LEFT_PAREN timestamp_precision RIGHT_PAREN)?;

//列约束
column_constraint_definition : constraint_name_definition? column_constraint constraint_attributes?;
constraint_name_definition : 'CONSTRAINT' constraint_name;
constraint_name : qualified_name;//约束名
column_constraint : 'NOT' 'NULL'|unique_specification|references_specification|check_constraint_definition;
unique_specification : 'UNIQUE'|'PRIMARY' 'KEY';
references_specification : 'REFERENCES' referenced_table_and_columns ('MATCH' match_type)? referential_triggered_action?;
referenced_table_and_columns : table_name (LEFT_PAREN reference_column_list RIGHT_PAREN)?;
table_name : qualified_name|qualified_local_table_name;
reference_column_list : column_name_list;
column_name_list : column_name (COMMA column_name)*;
match_type : 'FULL'|'PARTIAL';
referential_triggered_action : update_rule delete_rule?|delete_rule update_rule?;
update_rule : 'ON' 'UPDATE' referential_action;
delete_rule : 'ON' 'DELETE' referential_action;
referential_action : 'CASCADE'|'SET' ('NULL'|'DEFAULT')|'NO' 'ACTION';
check_constraint_definition : 'CHECK' LEFT_PAREN search_condition RIGHT_PAREN;
constraint_attributes : constraint_check_time ('NOT'? 'DEFERRABLE')?|'NOT'? 'DEFERRABLE' constraint_check_time?;
constraint_check_time : 'INITIALLY' ('DEFERRED'|'IMMEDIATE');
//表约束
table_constraint_definition : constraint_name_definition? table_constraint constraint_check_time?;
table_constraint : unique_constraint_definition|referential_constraint_definition|check_constraint_definition;
unique_constraint_definition : unique_specification LEFT_PAREN unique_column_list RIGHT_PAREN;
unique_column_list : column_name_list;
referential_constraint_definition : 'FOREIGN' 'KEY' LEFT_PAREN referencing_columns RIGHT_PAREN references_specification;
referencing_columns : reference_column_list;

//布尔值表达式
search_condition : boolean_term|search_condition 'OR' boolean_term;
boolean_term : boolean_factor|boolean_term 'AND' boolean_factor;
boolean_factor : 'NOT'? boolean_test;
boolean_test : boolean_primary ('IS' 'NOT'? truth_value)?;
boolean_primary : predicate | LEFT_PAREN search_condition RIGHT_PAREN;
truth_value : 'TRUE'|'FALSE'|'UNKNOWN';

predicate : comparision_predicate|between_predicate|in_predicate|like_predicate|null_predicate|quantified_comparision_predicate|exists_predicate|match_predicate|overlaps_predicate;
comparision_predicate : row_value_constructor comp_op row_value_constructor;
between_predicate : row_value_constructor 'NOT'? 'BETWEEN' row_value_constructor 'AND' row_value_constructor;
in_predicate : row_value_constructor 'NOT'? 'IN' in_predicate_value;
like_predicate : match_value 'NOT'? 'LIKE' pattern ('ESCAPE' escape_character)?;
null_predicate : 'IS' 'NOT'? 'NULL';
quantified_comparision_predicate : row_value_constructor comp_op quantifier table_subquery;
exists_predicate : 'EXISTS' table_subquery;
match_predicate : row_value_constructor 'MATCH' 'UNIQUE'? ('PARTIAL'|'FULL')? table_subquery;
overlaps_predicate : row_value_constructor_1 'OVERLAPS' row_value_constructor_2;

row_value_constructor : row_value_constructor_element|LEFT_PAREN row_value_constructor_list RIGHT_PAREN|row_subquery;
comp_op : EQ|NOT_EQ|LESS_THAN|GREATER_THAN|LESS_THAN_OR_EQ|GREATER_THAN_OR_EQ;
row_value_constructor_element : value_expression|null_specification|default_specification;
row_value_constructor_list : row_value_constructor_element (COMMA row_value_constructor_element)*;
row_subquery : subquery;

//值表达式
value_expression : numeric_value_expression|string_value_expression|datetime_value_expression|interval_value_expression;
numeric_value_expression : term|numeric_value_expression (PLUS_SIGN|MINUS_SIGN) term;
string_value_expression : character_value_expression|bit_value_expression;
datetime_value_expression : datetime_term|interval_value_expression PLUS_SIGN datetime_term|datetime_value_expression (PLUS_SIGN|MINUS_SIGN) interval_term;
interval_value_expression : interval_term|interval_value_expression_1 (PLUS_SIGN|MINUS_SIGN) interval_term_1|LEFT_PAREN datetime_value_expression MINUS_SIGN datetime_term RIGHT_PAREN interval_qualifier;

term : factor|term (ASTERISK|SOLIDUS) factor;
factor : SIGN? numeric_primary;
numeric_primary : value_expression_primary|numeric_value_function;
value_expression_primary : unsigned_value_specification|column_reference|set_function_specification|scalar_subquery|case_expression|cast_specification;
unsigned_value_specification : unsigned_literal|general_value_specification;
column_reference : (qualifier PERIOD)? column_name;
set_function_specification : 'COUNT' LEFT_PAREN ASTERISK RIGHT_PAREN|general_set_function;
scalar_subquery : subquery;
case_expression : case_abbreviation|case_specification;
cast_specification : 'CAST' LEFT_PAREN cast_operand 'AS' cast_target RIGHT_PAREN;
unsigned_literal : UNSIGNED_NUMERIC_LITERAL|general_literal;

//TODO fix it. support variable_specification
general_value_specification : parameter_specification|dynamic_parameter_specification|'USER'|'CURRENT_USER'|'SESSION_USER'|'SYSTEM_USER'|'VALUE';
parameter_specification : parameter_name indicator_parameter?;
indicator_parameter : 'INDICATOR' parameter_name;
dynamic_parameter_specification : QUESTION_MARK;

//case表达式
case_abbreviation : 'NULLIF' LEFT_PAREN value_expression COMMA value_expression RIGHT_PAREN
	| 'COALESCE' LEFT_PAREN value_expression (COMMA value_expression)* RIGHT_PAREN
	;
case_specification : simple_case|searched_case;
simple_case : 'CASE' case_operand simple_when_clause+ else_clause? 'END';
searched_case : 'CASE' searched_when_clause+ else_clause? 'END';
case_operand : value_expression;
simple_when_clause : 'WHEN' when_operand 'THEN' result;
else_clause : 'ELSE' result;
when_operand : value_expression;
result : result_expression | 'NULL';
result_expression : value_expression;
searched_when_clause : 'WHEN' search_condition 'THEN' result;

//CAST
cast_operand : value_expression|'NULL';
cast_target : domain_name|data_type;

numeric_value_function : position_expression|extract_expression|length_expression;
position_expression : 'POSITION' LEFT_PAREN character_value_expression 'IN' character_value_expression RIGHT_PAREN;
extract_expression : 'EXTRACT' LEFT_PAREN extract_field 'FROM' extract_source RIGHT_PAREN;
length_expression : char_length_expression|octet_length_expression|bit_length_expression;
character_value_expression : concatentation|character_factor;
concatentation : character_value_expression CONCATENATION character_factor;
character_factor : character_primary collate_clause?;
character_primary : value_expression_primary|string_value_function;
string_value_function : character_value_function|bit_value_function;
character_value_function : character_substring_function|fold|form_of_use_conversion|character_translation|trim_function;
bit_value_function : bit_substring_function;
character_substring_function : 'SUBSTRING' LEFT_PAREN character_value_expression 'FROM' start_position ('FOR' string_length)? RIGHT_PAREN;
start_position : numeric_value_expression;
string_length : numeric_value_expression;
fold : ('UPPER'|'LOWWER') LEFT_PAREN character_value_expression RIGHT_PAREN;
form_of_use_conversion : qualified_name;
character_translation : 'TRANSLATE' LEFT_PAREN character_value_expression 'USING' translation_name RIGHT_PAREN;
translation_name : qualified_name;
trim_function : 'TRIM' LEFT_PAREN trim_operands RIGHT_PAREN;
trim_operands : (trim_specification? trim_character)? trim_source;
trim_specification : 'LEADING'|'TRAILING'|'BOTH';
trim_character : character_value_expression;
trim_source : character_value_expression;

interval_term : interval_factor|interval_term_2 (ASTERISK|SOLIDUS) interval_factor|term ASTERISK interval_factor;
interval_factor : SIGN? interval_primary;
interval_primary : value_expression_primary interval_qualifier?;

interval_value_expression_1 : interval_value_expression;
interval_term_1 : interval_term;
interval_term_2 : interval_term;

datetime_term : datetime_factor;
datetime_factor : datetime_primary time_zone?;
datetime_primary : value_expression_primary|datetime_value_function;
time_zone : 'AT' time_zone_specifier;
time_zone_specifier : 'LOCAL'|'TIME' 'ZONE' interval_value_expression;

bit_substring_function : 'SUBSTRING' LEFT_PAREN bit_value_expression 'FROM' start_position ('FOR' string_length)? RIGHT_PAREN;
bit_value_expression : bit_concatenation|bit_factor;
bit_concatenation : bit_value_expression CONCATENATION bit_factor;
bit_factor : bit_primary;
bit_primary : value_expression_primary|string_value_function;

extract_field : datetime_field|time_zone_field;
datetime_field : non_second_datetime_field|'SECOND';
time_zone_field : 'TIMEZONE_HOUR'|'TIMEZONE_MINUTE';
extract_source : datetime_value_expression|interval_value_expression;

char_length_expression : ('CHAR_LENGTH'|'CHARACTER_LENGTH') LEFT_PAREN string_value_expression RIGHT_PAREN;
octet_length_expression : 'OCTET_LENGTH' LEFT_PAREN string_value_expression RIGHT_PAREN;
bit_length_expression : 'BIT_LENGTH' LEFT_PAREN string_value_expression RIGHT_PAREN;

in_predicate_value : table_subquery|LEFT_PAREN in_value_list RIGHT_PAREN;
table_subquery : subquery;
in_value_list : value_expression (COMMA value_expression)*;
match_value : character_value_expression;
pattern : character_value_expression;
escape_character : character_value_expression;
quantifier : all|some;
all : 'ALL';
some : 'SOME'|'ANY';
row_value_constructor_1 : row_value_constructor;
row_value_constructor_2 : row_value_constructor;

null_specification : 'NULL';
default_specification : 'DEFAULT';

//子查询
subquery :;

general_set_function : set_function_type LEFT_PAREN set_qualifier? value_expression RIGHT_PAREN;
set_function_type : 'AVG'|'MAX'|'MIN'|'SUM'|'COUNT';
set_qualifier : 'DISTINCT'|'ALL';
qualifier : table_name|correlation_name;
correlation_name : identifier;

parameter_name : COLON identifier;//参数
seperator : comment|SPACE|NEWLINE;//分隔符
comment : COMMENT_INTRODUCER quote_string* NEWLINE;//注释
character_set_name : (schema_name PERIOD)? SQL_LANGUAGE_IDENTIFIER;
national_character_string_literal : 'N' quote_string (seperator+ quote_string)*;
character_representation : NONQUOTE_CHARACTER|QUOTE_SYMBOL;

//单引号字符串
quote_string : QUOTE character_representation* QUOTE;
bit_string_literal : 'B' quote_bit (seperator+ quote_bit)*;
//单引号二进制串
quote_bit : QUOTE BIT* QUOTE;
hex_string_literal : 'X' quote_hex (seperator+ quote_hex)*;
//单引号十六进制串
quote_hex : QUOTE (HEX HEX HEX HEX)? QUOTE;
