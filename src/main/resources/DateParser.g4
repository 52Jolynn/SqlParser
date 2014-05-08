/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar DateParser;

options {
    tokenVocab=DateLexer;
}

date : DATE_RULE;
time : TIME_STRING;
datetime : date time;
timestamp : TIMESTAMP_STRING;
interval : INTERVAL_STRING;
day_time : DAY_TIME_LITERAL;
