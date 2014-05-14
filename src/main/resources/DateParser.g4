/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar DateParser;

options {
    tokenVocab=DateLexer;
}

date_string : DATE_STRING;
time_string : TIME_STRING;
datetime : date_string time_string;
timestamp_string : TIMESTAMP_STRING;
interval_string : INTERVAL_STRING;
day_time_literal : DAY_TIME_LITERAL;
