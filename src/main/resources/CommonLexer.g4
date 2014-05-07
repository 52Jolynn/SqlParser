/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar CommonLexer;

//����
NUMBER : MINUS_SIGN? UNSIGNED_INTEGER EXPONENT? //1, -1, 1e10, -1e10, 1e-10, -1e-10
       | MINUS_SIGN? FLOAT //1.0, -1.0, 1.2e10, -1.2e10, 1.2e-10, -1.2e-10
       ;

SIGNED_INTEGER : NUM_SIGN UNSIGNED_INTEGER;//�з�������
UNSIGNED_INTEGER : '0' | [1-9] [0-9]*;//�޷�������
FLOAT : UNSIGNED_INTEGER '.' UNSIGNED_INTEGER EXPONENT?;//��������
EXPONENT : [Ee] NUM_SIGN? UNSIGNED_INTEGER;//ָ��

SPACE : ' '; //�ո�
TAB : '\t'; //tab
NEWLINE : '\r'? '\n';//���з�

NUM_SIGN : PLUS_SIGN | MINUS_SIGN;
PLUS_SIGN : '+';
MINUS_SIGN : '-';

fragment
    ZERO : '0'; //��
fragment
    DIGIT : [0-9]; //����
fragment
    ALPHA : [a-zA-Z]; //Ӣ����ĸ
fragment
    IDENTIFIER_BEGINNING_LETTER : [a-zA-Z_]; //��ʶ����ʼ��ĸ
fragment
    //���ɵı�ʶ����ʼ��ĸ��Ӣ����ĸ���»��ߡ������ַ�����������ĸ
    IDENTIFIER_BEGINNING_LETTER_LOOSE : [a-zA-Z_\u0080...\uFFFE];
fragment
    HEX : [0-9a-fA-F]; //ʮ������
fragment
    UNICODE : 'u' HEX HEX HEX HEX;//unicode
fragment
    BIT : [01];//������