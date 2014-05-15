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

prog
:
	sql_schema_statement
	| sql_data_statement
	| sql_transaction_statement
	| sql_connection_statement
	| sql_session_statement
	| sql_dynamic_statement
	| sql_diagnostics_statement
;

sql_schema_statement
:
	sql_schema_definition_statement
	| sql_schema_manipulation_statement
;

sql_schema_definition_statement // ddl
:
	schema_definition
	| table_definition
	| view_definition
	| grant_definition
	| domain_definition
	| character_set_definition
	| collation_definition
	| translation_definition
	| assertion_definition
;
//schema definition
schema_definition : 'CREATE' 'SCHEMA' schema_name_clause schema_character_set_specification? schema_element+;
schema_name_clause
:
	schema_name
	| 'AUTHORIZATION' schema_authorization_identifier
	| schema_name 'AUTHORIZATION' schema_authorization_identifier
;
schema_authorization_identifier : authorization_identifier;
schema_character_set_specification : 'DEFAULT' 'CHARACTER' 'SET' character_set_specification;
schema_character_set_name : character_set_name;
schema_element
:
	domain_definition
	| table_definition
	| view_definition
	| grant_definition
	| assertion_definition
	| character_set_definition
	| collation_definition
	| translation_definition
;

//table definition
table_definition : 'CREATE' (('GLOBAL'|'LOCAL') 'TEMPORARY')? 'TABLE' table_name table_element_list ('ON' 'COMMIT' ('DELETE'|'PRESERVE') 'ROWS')?;

//view definition
view_definition : 'CREATE' 'VIEW' table_name (LEFT_PAREN view_column_list RIGHT_PAREN)? 'AS' query_expression ('WITH' levels_clause? 'CHECK' 'OPTION')?;
view_column_list : column_name_list;
levels_clause : 'CASCADED'|'LOCAL';

//domain definition
domain_definition : 'CREATE' 'DOMAIN' 'AS'? data_type default_clause? domain_constraint? collate_clause?;
domain_constraint : constraint_name_definition? check_constraint_definition constraint_attributes;

//assertion definition
assertion_definition : 'CREATE' 'ASSERTION' constraint_name assertion_check constraint_attributes?;
assertion_check : 'CHECK' LEFT_PAREN search_condition RIGHT_PAREN;

//character set definition
character_set_definition : 'CREATE' 'CHARACTER' 'SET' character_set_name 'AS'? character_set_source (collate_clause|limited_collation_definition)?;
character_set_source : 'GET' existing_character_set_name;
existing_character_set_name
:
	standard_character_repertoire_name
	| implementation_defined_character_repertoire_name
	| schema_character_set_name
;

//grant definition
grant_definition : 'GRANT' privileges 'ON' object_name 'TO' grantee (COMMA grantee)* ('WITH' 'GRANT' 'OPTION')?;
privileges : 'ALL' 'PRIVILEGES'|action_list;
action_list : action (COMMA action)*;
action : 'SELECT'|'DELETE'|('INSERT'|'UPDATE'|'REFERENCES') (LEFT_PAREN privileges_column_list RIGHT_PAREN)?|'USAGE';
privileges_column_list : column_name_list;
object_name :'TABLE'? table_name|'DOMAIN' domain_name|'COLLATION' collation_name|'CHARACTER' 'SET' character_set_name|'TRANSLATION' translation_name;
grantee : 'PUBLIC'|authorization_identifier;

//collation definition
collation_definition : 'CREATE' 'COLLATION' collation_name 'FOR' character_set_specification 'FROM' collation_source pad_attribute?;
collation_source
:
	collation_sequence_definition
	| translation_collation
;
collation_sequence_definition
:
	external_collation
	| schema_collation_name
	| 'DESC' LEFT_PAREN collation_name RIGHT_PAREN
	| 'DEFAULT'
;
external_collation : 'EXTERNAL' LEFT_PAREN QUOTE external_collation_name QUOTE RIGHT_PAREN;
external_collation_name
:
	standard_collation_name
	| implementation_defined_collation_name
;
standard_collation_name : collation_name;
implementation_defined_collation_name : collation_name;
schema_collation_name : collation_name;
translation_collation : 'TRANSLATION' translation_name ('THEN' 'COLLATION' collation_name)?;
limited_collation_definition : 'COLLATION' 'FROM' collation_source;
pad_attribute : 'NO' 'PAD'|'PAD' 'SPACE';

//translation definition
translation_definition : 'CREATE' 'TRANSLATION' translation_name 'FOR' source_character_set_specification 'TO' character_set_specification 'FROM' translation_source;
source_character_set_specification : character_set_specification;
target_character_set_specification : character_set_specification;
translation_source : translation_specification;
translation_specification : external_translation|'IDENTITY'|schema_translation_name;
external_translation : 'EXTERNAL' LEFT_PAREN QUOTE external_translation_name QUOTE RIGHT_PAREN;
external_translation_name
:
	standard_translation_name
	| implementation_defined_translation_name
;
standard_translation_name : translation_name;
implementation_defined_translation_name : translation_name;
schema_translation_name : translation_name;

sql_schema_manipulation_statement //dml
:
	drop_schema_statement
	| alter_table_statement
	| drop_table_statement
	| drop_view_statement
	| revoke_statement
	| alter_domain_statement
	| drop_domain_statement
	| drop_character_set_statement
	| drop_collation_statement
	| drop_translation_statement
	| drop_assertion_statement
;

//drop schema
drop_schema_statement : 'DROP' 'SCHEMA' schema_name drop_behaviour;
drop_behaviour : 'CASCADE'|'RESTRICT';

//alter table
alter_table_statement : 'ALTER' 'TABLE' table_name alter_table_action;
alter_table_action
:
	add_column_definition
	| alter_column_definition
	| drop_column_definition
	| add_table_constraint_definition
	| drop_table_constraint_definition
;
add_column_definition : 'ADD' 'COLUMN'? column_definition;
//add table constraint
add_table_constraint_definition : 'ADD' table_constraint_definition;

alter_column_definition : 'ALTER' 'COLUMN'? column_name alter_column_action;
alter_column_action
:
	set_column_default_clause
	| drop_column_default_clause
;
set_column_default_clause : 'SET' default_clause;
drop_column_default_clause : 'DROP' 'DEFAULT';

//drop column
drop_column_definition : 'DROP' 'COLUMN'? column_name drop_behaviour;

//drop table constraint
drop_table_constraint_definition : 'DROP' 'CONSTRAINT' constraint_name drop_behaviour;

//drop table
drop_table_statement : 'DROP' 'TABLE' table_name drop_behaviour;

//drop view
drop_view_statement : 'DROP' 'VIEW' table_name drop_behaviour;

//revoke statement
revoke_statement : 'REVOKE' ('GRANT' 'OPTION' 'FOR')? privileges 'ON' object_name 'FROM' grantee (COMMA grantee)* drop_behaviour;

//drop domain
drop_domain_statement : 'DROP' 'DOMAIN' domain_name drop_behaviour;

//drop character set
drop_character_set_statement : 'DROP' 'CHARACTER' 'SET' character_set_name;

//drop collation
drop_collation_statement : 'DROP' 'COLLATION' collation_name;

//drop translation
drop_translation_statement : 'DROP' 'TRANSLATION' translation_name;

//drop assertion
drop_assertion_statement : 'DROP' 'ASSERTION' constraint_name;

//alter domain
alter_domain_statement : 'ALTER' 'DOMAIN' domain_name alter_domain_action;
alter_domain_action
:
	set_domain_default_clause
	| drop_domain_default_clause
	| add_domain_constraint_definition
	| drop_domain_constraint_definition
;
set_domain_default_clause : 'SET' default_clause;
drop_domain_default_clause : 'DROP' 'DEFAULT';
add_domain_constraint_definition : 'ADD' domain_constraint;
drop_domain_constraint_definition : 'DROP' 'CONSTRAINT' constraint_name;

//sql data
sql_data_statement
:
	open_statement
	| fetch_statement
	| close_statement
	| select_statement
	| sql_data_change_statement
;
//open stmt
open_statement : 'OPEN' cursor_name;

//fetch stmt
fetch_statement : 'FETCH' (fetch_orientation? 'FROM')? cursor_name 'INTO' fetch_target_list;
fetch_orientation
:
	'NEXT'
	| 'PRIOR'
	| 'FIRST'
	| 'LAST'
	| ('ABSOLUTE' | 'RELATIVE') simple_value_specification
;

simple_value_specification
:
	parameter_name
	| embedded_variable_name
	| literal
;
fetch_target_list : target_specification (COMMA target_specification)*;
target_specification
:
	parameter_specification
	| variable_specification
;

//close stmt
close_statement : 'CLOSE' cursor_name;

//select
select_statement : 'SELECT' set_qualifier? select_list 'INTO' select_target_list table_expression;
select_list
:
	ASTERISK
	| select_sublist (COMMA select_sublist)*
;
select_sublist :derived_column|qualifier PERIOD ASTERISK;
derived_column : value_expression as_clause;

select_target_list : target_specification (COMMA target_specification)*;
table_expression : from_clause where_clause? group_by_clause? having_clause?;

//from clause
from_clause : 'FROM' table_reference (COMMA table_reference)*;
table_reference
:
	table_name correlation_specification?
	| derived_table correlation_specification
	| joined_table
;
correlation_specification : 'AS'? correlation_name (LEFT_PAREN derived_column_list RIGHT_PAREN)?;
derived_column_list : column_name_list;
derived_table : table_subquery;
joined_table
:
	cross_join
	| qualified_join
	| LEFT_PAREN joined_table RIGHT_PAREN
;
cross_join : table_reference 'CROSS' 'JOIN' table_reference;
qualified_join : table_reference 'NATURAL'? join_type? 'JOIN' table_reference join_specification?;
join_type : 'INNER'|outer_join_type 'OUTER'?|'UNION';
outer_join_type : 'LEFT'|'RIGHT'|'FULL';
join_specification
:
	join_condition
	| named_columns_join
;
join_condition : 'ON' search_condition;
named_columns_join : 'USING' LEFT_PAREN join_column_list RIGHT_PAREN;
join_column_list : column_name_list;

//where clause
where_clause : 'WHERE' search_condition;

//having clause
having_clause : 'HAVING' search_condition;

//update、insert、delete

sql_data_change_statement
:
	delete_statement_positioned
	| delete_statement_searched
	| insert_statement
	| update_statement_position
	| update_statement_searched
;

//delete
delete_statement_positioned : 'DELETE' 'FROM' table_name 'WHERE' 'CURRENT' 'OF' cursor_name;
delete_statement_searched : 'DELETE' 'FROM' table_name ('WHERE' search_condition)?;

//insert
insert_statement : 'INSERT' 'INTO' table_name insert_columns_and_source;
insert_columns_and_source
:
	(LEFT_PAREN insert_column_list RIGHT_PAREN)? query_expression
	| 'DEFAULT' 'VALUES'
;
insert_column_list : column_name_list;

//update
update_statement_position : 'UPDATE' table_name 'SET' set_clause_list 'WHERE' 'CURRENT' 'OF' cursor_name;
set_clause_list : set_clause (COMMA set_clause)*;
set_clause : object_column EQ update_source;
object_column : column_name;
update_source : value_expression|null_specification|'DEFAULT';
update_statement_searched : 'UPDATE' table_name 'SET' set_clause_list ('WHERE' search_condition)?;

//sql transaction
sql_transaction_statement
:
	sql_transaction_statement
	| set_constraints_mode_statement
	| commit_statement
	| rollback_statement
;
set_transaction_statement : 'SET' 'TRANSACTION' trasaction_mode (COMMA trasaction_mode)*;
trasaction_mode
:
	isolation_level
	| transaction_access_mode
	| diagnostics_size
;
isolation_level : 'ISOLATION' 'LEVEL' level_of_isolation;
level_of_isolation : 'READ' ('UNCOMMITTED'|'COMMITTED')|'REPEATABLE' 'READ'|'SERIALIZABLE';
transaction_access_mode : 'READ' ('ONLY'|'WRITE');
diagnostics_size : 'DIAGNOSTICS' 'SIZE' number_of_conditions;
number_of_conditions : simple_value_specification;
set_constraints_mode_statement : 'SET' 'CONSTRAINT' constraint_name_list ('DEFERRED'|'IMMEDATE');
constraint_name_list : 'ALL'|constraint_name (COMMA constraint_name)*;
commit_statement : 'COMMIT' 'WORK'?;
rollback_statement : 'ROLLBACK' 'WORK'?;

//sql connection
sql_connection_statement
:
	connect_statement
	| set_connection_statement
	| disconnect_statement
;
connect_statement : 'CONNECT' 'TO' connection_target;
connection_target : sql_server_name ('AS' connection_name)? ('USER' user_name)?|'DEFAULT';
sql_server_name : simple_value_specification;
connection_name : simple_value_specification;
user_name : simple_value_specification;
set_connection_statement : 'SET' 'CONNECTION' connection_object;
connection_object : 'DEFAULT'|connection_name;
disconnect_statement : 'DISCONNECT' disconnect_object;
disconnect_object : connection_object|'ALL'|'CURRENT';

//sql session
sql_session_statement
:
	set_catalog_statement
	| set_schema_statement
	| set_names_statement
	| set_session_authorization_identifier_statement
	| set_local_time_zone_statement
;
//session attritubes
set_catalog_statement :'SET' 'CATALOG' value_specification;
value_specification
:
	literal
	| general_value_specification
;
//session attributes
set_schema_statement : 'SET' 'SCHEMA' value_specification;
set_names_statement : 'SET' 'NAMES' value_specification;
set_session_authorization_identifier_statement : 'SET' 'SESSION' 'AUTHORIZATION' value_specification;
set_local_time_zone_statement : 'SET' 'TIME' 'ZONE' set_time_zone_value;
set_time_zone_value
:
	interval_value_expression
	| 'LOCAL'
;

//sql dynamic
sql_dynamic_statement
:
	system_descriptor_statement
	| prepare_statement
	| deallocate_prepared_statement
	| describe_statement
	| execute_statement
	| execute_immediate_statemnet
	| sql_dynamic_data_statement
;
system_descriptor_statement
:
	allocate_descriptor_statement
	| deallocate_descriptor_statement
	| set_descriptor_statement
	| get_descriptor_statement
;

//allocate descriptor
allocate_descriptor_statement : 'ALLOCATE' 'DESCRIPTOR' descriptor_name ('WITH' 'MAX' occurences)?;
descriptor_name : scope_option simple_value_specification;
scope_option : 'GLOABL'|'LOCAL';
occurences : simple_value_specification;

//deallocate descriptor
deallocate_descriptor_statement : 'DEALLOCATE' 'DESCRIPTOR' descriptor_name;

//set descriptor
set_descriptor_statement : 'SET' 'DESCRIPTOR' descriptor_name set_descriptor_information;
set_descriptor_information : set_count|'VALUE' item_number set_item_information (COMMA set_item_information)*;
set_count : 'COUNT' EQ simple_value_specification_1;
simple_value_specification_1 : simple_value_specification;
item_number : simple_value_specification;
set_item_information : descriptor_item_name EQ simple_value_specification_2;
descriptor_item_name
:
	'TYPE'
	| 'LENGTH'
	| 'OCTET' 'LENGTH'
	| 'RETURNED' 'LENGTH'
	| 'RETURNED' 'OCTET' 'LENGTH'
	| 'PRECISION'
	| 'SCALE'
	| 'DATETIME' 'INTERVAL' 'CODE'
	| 'DATETIME' 'INTERVAL' 'PRECISION'
	| 'NULLABLE'
	| 'INDICATOR'
	| 'DATA'
	| 'NAME'
	| 'UNNAMED'
	| 'COLLATION' 'CATALOG'
	| 'COLLATION' 'SCHEMA'
	| 'COLLATION' 'NAME'
	| 'CHARACTER' 'SET' 'CATALOG'
	| 'CHARACTER' 'SET' 'SCHEMA'
	| 'CHARACTER' 'SET' 'NAME'
;
simple_value_specification_2 : simple_value_specification;

//get descriptor
get_descriptor_statement : 'GET' 'DESCRIPTOR' descriptor_name get_descriptor_information;
get_descriptor_information : get_count|'VALUE' item_number get_item_information (COMMA get_item_information)*;
get_count : simple_target_specification_1 EQ 'COUNT';
simple_target_specification_1 : simple_target_specification;
get_item_information : simple_target_specification_2 EQ  descriptor_item_name;
simple_target_specification_2 : simple_target_specification;

//prepare statement
prepare_statement : 'PREPARE' sql_statement_name 'FROM' sql_statement_variable;
sql_statement_name : statement_name|extended_statement_name;
extended_statement_name : scope_option? simple_value_specification;
sql_statement_variable : simple_value_specification;

//deallocate prepared statement
deallocate_prepared_statement : 'DEALLOCATE' 'PREPARE' sql_statement_name;

//describe statement
describe_statement : describe_input_statement|describe_output_statement;
describe_input_statement : 'DESCRIBE' 'INPUT' sql_statement_name using_descriptor;
using_descriptor : ('USING'|'INTO') 'SQL' 'DESCRIPTOR' descriptor_name;
describe_output_statement : 'DESCRIBE' 'OUTPUT' sql_statement_name using_descriptor;

//execute statement
execute_statement : 'EXECUTE' sql_statement_name result_using_clause? parameter_using_clause?;
result_using_clause : using_clause;
parameter_using_clause : using_clause;
using_clause : using_arguments | using_descriptor;
using_arguments : ('USING'|'INTO') argument (COMMA argument)*;
argument : target_specification;

//execute immediate statement
execute_immediate_statemnet : 'EXECUTE' 'IMMEDIATE' sql_statement_variable;

//sql dynamic data statement

sql_dynamic_data_statement
:
	allocate_cursor_statement
	| dynamic_open_statement
	| dynamic_close_statement
	| dynamic_fetch_statement
	| dynamic_delete_statement_positioned
	| dynamic_update_statement_positioned
;
allocate_cursor_statement : 'ALLOCATE' extended_cursor_name 'INSENSITIVE'? 'SCROLL'? 'CURSOR' 'FOR' extended_statement_name;
extended_cursor_name : scope_option? simple_value_specification;

dynamic_open_statement : 'OPEN' dynamic_cursor_name using_clause?;
dynamic_cursor_name : cursor_name|extended_cursor_name;

dynamic_close_statement : 'CLOSE' dynamic_cursor_name;

dynamic_fetch_statement : 'FETCH' (fetch_orientation? 'FROM')? dynamic_cursor_name;

dynamic_delete_statement_positioned : 'DELETE' 'FROM' table_name 'WHERE' 'CURRENT' 'OF' dynamic_cursor_name;
dynamic_update_statement_positioned : 'UPDATE' table_name 'SET' set_clause (COMMA set_clause)* 'WHERE' 'CURRENT' 'OF' dynamic_cursor_name;

//sql diagnostics
sql_diagnostics_statement : get_diagnostics_statement;
get_diagnostics_statement : 'GET' 'DIAGNOSTICS' sql_diagnostics_information;
sql_diagnostics_information : statement_information|condition_information;
statement_information : statement_information_item (COMMA statement_information_item)*;
statement_information_item : simple_target_specification EQ statement_information_item_name;
statement_information_item_name : 'NUMBER'|'MORE'|'COMMAND' 'FUNCTION'|'DYNAMIC' 'FUNCTION'|'ROW' 'COUNT';
condition_information : 'EXCEPTION' condition_number condition_information_item (COMMA condition_information_item)*;
condition_number : simple_value_specification;
condition_information_item : simple_target_specification EQ condition_information_item_name;
condition_information_item_name
:
	'CONDITION' 'NUMBER'
	| 'RETURNED' 'SQLSTATE'
	| ('CLASS'|'SUBCLASS') 'ORIGIN'
	| ('SERVER'|'CONNECTION') 'NAME'
	| 'CONSTRAINT' ('CATALOG'|'SCHEMA'|'NAME')
	| ('CATALOG'|'SCHEMA'|'TABLE'|'COLUMN') 'NAME'
	| 'MESSAGE' ('TEXT'|'LENGTH'|'OCTET' 'LENGTH')
;

//subquery 子查询
subquery : LEFT_PAREN query_expression RIGHT_PAREN;	
query_expression : non_join_query_expression|joined_table;
non_join_query_expression
:
	non_join_query_term
	| query_expression ('UNION'|'EXCEPT') 'ALL'? corresponding_spec? query_term
;
non_join_query_term
:
	non_join_query_primary
	| query_term 'INTERSECT' 'ALL'? corresponding_spec? query_primary
;
corresponding_spec : 'CORRESPONDING' ('BY' LEFT_PAREN corresponding_column_list RIGHT_PAREN)?;
corresponding_column_list : column_name_list;
non_join_query_primary
:
	simple_table
	| LEFT_PAREN non_join_query_expression RIGHT_PAREN
;
simple_table
:
	query_specification
	| table_value_constructor
	| explicit_table
;
query_specification : 'SELECT' set_qualifier? select_list table_expression;
table_value_constructor : 'VALUES table_value_constructor_list';
table_value_constructor_list : row_value_constructor (COMMA row_value_constructor);
explicit_table : 'TABLE' table_name;
query_term
:
	non_join_query_term
	| joined_table
;
query_primary : non_join_query_primary|joined_table;

//table definition 表声明
table_element_list : LEFT_PAREN table_element (COMMA table_element)* RIGHT_PAREN;
table_element : column_definition table_constraint_definition;

//column definition 列声明
column_definition : column_name (data_type|domain_name) default_clause? column_constraint_definition* collate_clause?;
//column constraint 列约束
column_constraint_definition : constraint_name_definition? column_constraint constraint_attributes?;
column_constraint
:
	'NOT' 'NULL'
	| unique_specification
	| references_specification
	| check_constraint_definition
;
check_constraint_definition : 'CHECK' LEFT_PAREN search_condition RIGHT_PAREN;

//table constraint 表约束
table_constraint_definition : constraint_name_definition? table_constraint constraint_check_time?;
table_constraint
:
	unique_constraint_definition
	| referential_constraint_definition
	| check_constraint_definition
;

//search condition 布尔值表达式
search_condition
:
	boolean_term
	| search_condition 'OR' boolean_term
;
boolean_term
:
	boolean_factor
	| boolean_term 'AND' boolean_factor
;
boolean_factor : 'NOT'? boolean_test;
boolean_test : boolean_primary ('IS' 'NOT'? truth_value)?;
boolean_primary
:
	predicate
	| LEFT_PAREN search_condition RIGHT_PAREN
;
//predicate
predicate
:
	comparision_predicate
	| between_predicate
	| in_predicate
	| like_predicate
	| null_predicate
	| quantified_comparision_predicate
	| exists_predicate
	| match_predicate
	| overlaps_predicate
;
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
row_value_constructor
:
	row_value_constructor_element
	| LEFT_PAREN row_value_constructor_list RIGHT_PAREN
	| row_subquery
;
row_value_constructor_1 : row_value_constructor;
row_value_constructor_2 : row_value_constructor;
row_value_constructor_element
:
	value_expression
	| null_specification
	| default_specification
;
row_value_constructor_list : row_value_constructor_element (COMMA row_value_constructor_element)*;
row_subquery : subquery;

//value expression 值表达式
value_expression
:
	numeric_value_expression
	| string_value_expression
	| datetime_value_expression
	| interval_value_expression
;
numeric_value_expression : term|numeric_value_expression (PLUS_SIGN|MINUS_SIGN) term;
string_value_expression
:
	character_value_expression
	| bit_value_expression
;
datetime_value_expression
:
	datetime_term
	| interval_value_expression PLUS_SIGN datetime_term
	| datetime_value_expression (PLUS_SIGN|MINUS_SIGN) interval_term
;
interval_value_expression
:
	interval_term
	| interval_value_expression_1 (PLUS_SIGN|MINUS_SIGN) interval_term_1
	| LEFT_PAREN datetime_value_expression MINUS_SIGN datetime_term RIGHT_PAREN interval_qualifier
;
//term
term : factor|term (ASTERISK|SOLIDUS) factor;
factor : SIGN? numeric_primary;
numeric_primary
:
	value_expression_primary
	| numeric_value_function
;
value_expression_primary
:
	unsigned_value_specification
	| column_reference
	| set_function_specification
	| scalar_subquery
	| case_expression
	| cast_specification
;
set_function_specification
:
	'COUNT' LEFT_PAREN ASTERISK RIGHT_PAREN
	| general_set_function
;
general_set_function : set_function_type LEFT_PAREN set_qualifier? value_expression RIGHT_PAREN;
scalar_subquery : subquery;
case_expression : case_abbreviation|case_specification;
cast_specification : 'CAST' LEFT_PAREN cast_operand 'AS' cast_target RIGHT_PAREN;

//case 表达式
case_abbreviation : 'NULLIF' LEFT_PAREN value_expression COMMA value_expression RIGHT_PAREN
	| 'COALESCE' LEFT_PAREN value_expression (COMMA value_expression)* RIGHT_PAREN
	;
case_specification
:
	simple_case
	| searched_case
;
simple_case : 'CASE' case_operand simple_when_clause+ else_clause? 'END';
searched_case : 'CASE' searched_when_clause+ else_clause? 'END';
case_operand : value_expression;
simple_when_clause : 'WHEN' when_operand 'THEN' result;
else_clause : 'ELSE' result;
when_operand : value_expression;
result
:
	result_expression
	| 'NULL'
;
result_expression : value_expression;
searched_when_clause : 'WHEN' search_condition 'THEN' result;

//CAST
cast_operand
:
	value_expression
	| 'NULL'
;

numeric_value_function //numeric value function
:
	position_expression
	| extract_expression
	| length_expression
;
//position expression
position_expression : 'POSITION' LEFT_PAREN character_value_expression 'IN' character_value_expression RIGHT_PAREN;
//extract expression
extract_expression : 'EXTRACT' LEFT_PAREN extract_field 'FROM' extract_source RIGHT_PAREN;
extract_source : datetime_value_expression|interval_value_expression;

length_expression //length expression
:
	char_length_expression
	| octet_length_expression
	| bit_length_expression
;
char_length_expression : ('CHAR_LENGTH'|'CHARACTER_LENGTH') LEFT_PAREN string_value_expression RIGHT_PAREN;
octet_length_expression : 'OCTET_LENGTH' LEFT_PAREN string_value_expression RIGHT_PAREN;
bit_length_expression : 'BIT_LENGTH' LEFT_PAREN string_value_expression RIGHT_PAREN;
//character value expression
character_value_expression : concatentation|character_factor;
concatentation : character_value_expression CONCATENATION character_factor;
character_factor : character_primary collate_clause?;
character_primary
:
	value_expression_primary
	| string_value_function
;

string_value_function //string value function
:
	character_value_function
	| bit_value_function
;
character_value_function
:
	character_substring_function
	| fold
	| form_of_use_conversion
	| character_translation
	| trim_function
;
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
datetime_primary
:
	value_expression_primary
	| datetime_value_function
;
time_zone : 'AT' time_zone_specifier;
time_zone_specifier : 'LOCAL'|'TIME' 'ZONE' interval_value_expression;
//bit substring function
bit_substring_function : 'SUBSTRING' LEFT_PAREN bit_value_expression 'FROM' start_position ('FOR' string_length)? RIGHT_PAREN;
bit_value_expression
:
	bit_concatenation
	| bit_factor
;
bit_concatenation : bit_value_expression CONCATENATION bit_factor;
bit_factor : bit_primary;
bit_primary
:
	value_expression_primary
	| string_value_function
;

//procedure 存储过程
procedure : 'PROCEDURE' procedure_name parameter_declaration_list SEMICOLON sql_procedure_statement SEMICOLON;
procedure_name : identifier;
parameter_declaration_list : LEFT_PAREN parameter_declaration (COMMA parameter_declaration)* RIGHT_PAREN;
parameter_declaration
:
	parameter_name data_type
	| status_parameter
;
status_parameter : 'SQLCODE'|'SQLSTATE';
sql_procedure_statement
:
	sql_schema_statement
	| sql_data_statement
	| sql_transaction_statement
	| sql_connection_statement
	| sql_session_statement
	| sql_dynamic_statement
	| sql_diagnostics_statement
;

//SQL Module
module : module_name_clause language_clause module_authorization_clause temporary_table_declaration* module_contents+;
module_contents
:
	declare_cursor
	| dynamic_declare_cursor
	| procedure
;
module_name_clause : 'MODULE' module_name module_character_set_specification;
module_name : identifier;
module_character_set_specification :'NAMES' 'ARE' character_set_specification;
module_authorization_clause : 'SCHEMA' schema_name;
module_authorization_identifier : authorization_identifier;

//cursor
temporary_table_declaration : 'DECLARE' 'LOCAL' 'TEMPORARY' 'TABLE' qualified_local_table_name table_element_list ('ON' 'COMMIT' ('PRESERVE' | 'DELETE') 'ROWS')?;
declare_cursor : 'DECLARE' cursor_name 'INSENSITIVE'? 'SCROLL'? 'CURSOR' 'FOR' cursor_specification;
cursor_specification : query_expression order_by_clause? updatability_clause?;
dynamic_declare_cursor : 'DECLARE' cursor_name 'INSENSITIVE'? 'SCROLL'? 'CURSOR' 'FOR' statement_name;
	