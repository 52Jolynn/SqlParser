/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Test;

import CommonLexer;

prog : (number|date|date_value|time|time_value|timestamp|interval)+;

number : SIGNED_INTEGER|UNSIGNED_INTEGER|DECIMAL_LITERAL|APPROXIMATE_NUMERIC_LITERAL;
date : DATE_STRING;
date_value : DATE_VALUE;
time : TIME_STRING;
time_value : TIME_VALUE;
timestamp : TIMESTAMP_STRING;
interval : INTERVAL_STRING; 
