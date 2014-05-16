parser grammar CommonParser;

options{
    tokenVocab=CommonLexer;
}

//数字
number : NUMERIC_LITERAL;
