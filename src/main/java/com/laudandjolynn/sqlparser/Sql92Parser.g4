/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar Sql92Parser;
options {
    tokenVocab=Sql92CommonLexer;
}

parse : ddl
	| dml
	| dcl
	;
	
ddl :;
dml :;
dcl :;	