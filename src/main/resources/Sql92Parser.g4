/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar Sql92Parser;

options {
    tokenVocab=Sql92CommonLexer;
}

import Sql92CommonParser, Sql92ProcedureParser;

prog : ;
	
query_expression :;
declare_cursor : 'DECLARE' cursor_name 'INSENSITIVE'? 'SCROLL'? 'CURSOR' 'FOR' cursor_specification;
cursor_specification : query_expression order_by_clause? updatability_clause?;	

module : module_name_clause language_clause module_authorization_clause temporary_table_declaration* module_contents+;
module_name_clause : 'MODULE' module_name module_character_set_specification;
module_name : identifier;
module_character_set_specification :'NAMES' 'ARE' character_set_specification;
module_contents : declare_cursor|dynamic_declare_cursor|procedure;
module_authorization_clause : 'SCHEMA' schema_name;
module_authorization_identifier : identifier;
language_clause : 'LANGUAGE' LANGUAGE_NAME;