/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar Sql92Parser;

options {
    tokenVocab=Sql92CommonLexer;
}

import Sql92CommonParser;

prog : ;
//subquery 子查询
subquery :;	
query_expression :;

sql_schema_statement :;
sql_data_statement :;
sql_transaction_statement :;
sql_connection_statement :;
sql_session_statement :;
sql_dynamic_statement :;
sql_diagnostics_statement :;

//table definition 表声明
table_element_list : LEFT_PAREN table_element (COMMA table_element)* RIGHT_PAREN;
table_element : column_definition table_constraint_definition;

//column definition 列声明
column_definition : column_name (data_type|domain_name) default_clause? column_constraint_definition* collate_clause?;
//column constraint 列约束
column_constraint_definition : constraint_name_definition? column_constraint constraint_attributes?;
column_constraint : 'NOT' 'NULL'|unique_specification|references_specification|check_constraint_definition;
check_constraint_definition : 'CHECK' LEFT_PAREN search_condition RIGHT_PAREN;

//table constraint 表约束
table_constraint_definition : constraint_name_definition? table_constraint constraint_check_time?;
table_constraint : unique_constraint_definition|referential_constraint_definition|check_constraint_definition;

//search condition 布尔值表达式
search_condition : boolean_term|search_condition 'OR' boolean_term;
boolean_term : boolean_factor|boolean_term 'AND' boolean_factor;
boolean_factor : 'NOT'? boolean_test;
boolean_test : boolean_primary ('IS' 'NOT'? truth_value)?;
boolean_primary : predicate | LEFT_PAREN search_condition RIGHT_PAREN;
//predicate
predicate : comparision_predicate|between_predicate|in_predicate|like_predicate|null_predicate|quantified_comparision_predicate|exists_predicate|match_predicate|overlaps_predicate;
comparision_predicate : row_value_constructor comp_op row_value_constructor;
between_predicate : row_value_constructor 'NOT'? 'BETWEEN' row_value_constructor 'AND' row_value_constructor;
//in predicate
in_predicate : row_value_constructor 'NOT'? 'IN' in_predicate_value;
in_predicate_value : table_subquery|LEFT_PAREN in_value_list RIGHT_PAREN;
in_value_list : value_expression (COMMA value_expression)*;
//like predicate
like_predicate : match_value 'NOT'? 'LIKE' pattern ('ESCAPE' escape_character)?;
match_value : character_value_expression;
pattern : character_value_expression;
escape_character : character_value_expression;
//null predicate
null_predicate : 'IS' 'NOT'? 'NULL';
//quantified comparision predicate
quantified_comparision_predicate : row_value_constructor comp_op quantifier table_subquery;
//exists predicate
exists_predicate : 'EXISTS' table_subquery;
table_subquery : subquery;
//match predicate
match_predicate : row_value_constructor 'MATCH' 'UNIQUE'? ('PARTIAL'|'FULL')? table_subquery;
//overlaps predicate
overlaps_predicate : row_value_constructor_1 'OVERLAPS' row_value_constructor_2;
row_value_constructor : row_value_constructor_element|LEFT_PAREN row_value_constructor_list RIGHT_PAREN|row_subquery;
row_value_constructor_1 : row_value_constructor;
row_value_constructor_2 : row_value_constructor;
row_value_constructor_element : value_expression|null_specification|default_specification;
row_value_constructor_list : row_value_constructor_element (COMMA row_value_constructor_element)*;
row_subquery : subquery;

//value expression 值表达式
value_expression : numeric_value_expression|string_value_expression|datetime_value_expression|interval_value_expression;
numeric_value_expression : term|numeric_value_expression (PLUS_SIGN|MINUS_SIGN) term;
string_value_expression : character_value_expression|bit_value_expression;
datetime_value_expression : datetime_term|interval_value_expression PLUS_SIGN datetime_term|datetime_value_expression (PLUS_SIGN|MINUS_SIGN) interval_term;
interval_value_expression : interval_term|interval_value_expression_1 (PLUS_SIGN|MINUS_SIGN) interval_term_1|LEFT_PAREN datetime_value_expression MINUS_SIGN datetime_term RIGHT_PAREN interval_qualifier;
//term
term : factor|term (ASTERISK|SOLIDUS) factor;
factor : SIGN? numeric_primary;
numeric_primary : value_expression_primary|numeric_value_function;
value_expression_primary : unsigned_value_specification|column_reference|set_function_specification|scalar_subquery|case_expression|cast_specification;
set_function_specification : 'COUNT' LEFT_PAREN ASTERISK RIGHT_PAREN|general_set_function;
general_set_function : set_function_type LEFT_PAREN set_qualifier? value_expression RIGHT_PAREN;
scalar_subquery : subquery;
case_expression : case_abbreviation|case_specification;
cast_specification : 'CAST' LEFT_PAREN cast_operand 'AS' cast_target RIGHT_PAREN;

//case 表达式
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
//numeric value function
numeric_value_function : position_expression|extract_expression|length_expression;
//position expression
position_expression : 'POSITION' LEFT_PAREN character_value_expression 'IN' character_value_expression RIGHT_PAREN;
//extract expression
extract_expression : 'EXTRACT' LEFT_PAREN extract_field 'FROM' extract_source RIGHT_PAREN;
extract_source : datetime_value_expression|interval_value_expression;
//length expression
length_expression : char_length_expression|octet_length_expression|bit_length_expression;
char_length_expression : ('CHAR_LENGTH'|'CHARACTER_LENGTH') LEFT_PAREN string_value_expression RIGHT_PAREN;
octet_length_expression : 'OCTET_LENGTH' LEFT_PAREN string_value_expression RIGHT_PAREN;
bit_length_expression : 'BIT_LENGTH' LEFT_PAREN string_value_expression RIGHT_PAREN;
//character value expression
character_value_expression : concatentation|character_factor;
concatentation : character_value_expression CONCATENATION character_factor;
character_factor : character_primary collate_clause?;
character_primary : value_expression_primary|string_value_function;
//string value function
string_value_function : character_value_function|bit_value_function;
character_value_function : character_substring_function|fold|form_of_use_conversion|character_translation|trim_function;
bit_value_function : bit_substring_function;
character_substring_function : 'SUBSTRING' LEFT_PAREN character_value_expression 'FROM' start_position ('FOR' string_length)? RIGHT_PAREN;
start_position : numeric_value_expression;
string_length : numeric_value_expression;
fold : ('UPPER'|'LOWWER') LEFT_PAREN character_value_expression RIGHT_PAREN;
character_translation : 'TRANSLATE' LEFT_PAREN character_value_expression 'USING' translation_name RIGHT_PAREN;
trim_function : 'TRIM' LEFT_PAREN trim_operands RIGHT_PAREN;
trim_operands : (trim_specification? trim_character)? trim_source;
trim_character : character_value_expression;
trim_source : character_value_expression;
//interval_term
interval_term : interval_factor|interval_term_2 (ASTERISK|SOLIDUS) interval_factor|term ASTERISK interval_factor;
interval_factor : SIGN? interval_primary;
interval_primary : value_expression_primary interval_qualifier?;
interval_value_expression_1 : interval_value_expression;
interval_term_1 : interval_term;
interval_term_2 : interval_term;
//datetime term
datetime_term : datetime_factor;
datetime_factor : datetime_primary time_zone?;
datetime_primary : value_expression_primary|datetime_value_function;
time_zone : 'AT' time_zone_specifier;
time_zone_specifier : 'LOCAL'|'TIME' 'ZONE' interval_value_expression;
//bit substring function
bit_substring_function : 'SUBSTRING' LEFT_PAREN bit_value_expression 'FROM' start_position ('FOR' string_length)? RIGHT_PAREN;
bit_value_expression : bit_concatenation|bit_factor;
bit_concatenation : bit_value_expression CONCATENATION bit_factor;
bit_factor : bit_primary;
bit_primary : value_expression_primary|string_value_function;

//procedure 存储过程
procedure : 'PROCEDURE' procedure_name parameter_declaration_list SEMICOLON sql_procedure_statement SEMICOLON;
procedure_name : identifier;
parameter_declaration_list : LEFT_PAREN parameter_declaration (COMMA parameter_declaration)* RIGHT_PAREN;
parameter_declaration : parameter_name data_type | status_parameter;
status_parameter : 'SQLCODE'|'SQLSTATE';
sql_procedure_statement : sql_schema_statement|sql_data_statement|sql_transaction_statement|sql_connection_statement|sql_session_statement|sql_dynamic_statement|sql_diagnostics_statement;

//SQL Module
module : module_name_clause language_clause module_authorization_clause temporary_table_declaration* module_contents+;
module_contents : declare_cursor|dynamic_declare_cursor|procedure;

//cursor
temporary_table_declaration : 'DECLARE' 'LOCAL' 'TEMPORARY' 'TABLE' qualified_local_table_name table_element_list ('ON' 'COMMIT' ('PRESERVE' | 'DELETE') 'ROWS')?;
declare_cursor : 'DECLARE' cursor_name 'INSENSITIVE'? 'SCROLL'? 'CURSOR' 'FOR' cursor_specification;
cursor_specification : query_expression order_by_clause? updatability_clause?;
dynamic_declare_cursor : 'DECLARE' cursor_name 'INSENSITIVE'? 'SCROLL'? 'CURSOR' 'FOR' statement_name;
	