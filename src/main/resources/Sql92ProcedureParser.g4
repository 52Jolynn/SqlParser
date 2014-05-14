/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar Sql92ProcedureParser;

options {
    tokenVocab=Sql92CommonLexer;
}

import Sql92CommonParser;

procedure : 'PROCEDURE' procedure_name parameter_declaration_list SEMICOLON sql_procedure_statement SEMICOLON;
procedure_name : identifier;
parameter_declaration_list :;
parameter_declaration : parameter_name data_type | status_parameter;
status_parameter : 'SQLCODE'|'SQLSTATE';
sql_procedure_statement :;
