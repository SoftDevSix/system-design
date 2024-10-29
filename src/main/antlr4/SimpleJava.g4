grammar SimpleJava;

// Parser rules
compilationUnit
    : classDeclaration EOF
    ;

classDeclaration
    : 'class' IDENTIFIER '{' methodDeclaration* '}'
    ;

methodDeclaration
    : modifier? type IDENTIFIER '(' parameterList? ')'
      '{' methodBody '}'
    ;

modifier
    : 'public'
    ;

parameterList
    : parameter (',' parameter)*
    ;

parameter
    : type IDENTIFIER
    ;

methodBody
    : statement*
    ;

statement
    : ifStatement
    | expressionStatement
    | block
    ;

ifStatement
    : 'if' '(' expression ')' statement
    ;

block
    : '{' statement* '}'
    ;

expressionStatement
    : expression ';'
    ;

expression
    : primary
    | expression operator expression
    ;

primary
    : IDENTIFIER
    | NUMBER
    | STRING
    ;

type
    : 'void'
    | 'int'
    | 'String'
    ;

operator
    : '>'
    | '<'
    | '=='
    | '+'
    | '-'
    ;

// Lexer rules
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
NUMBER     : [0-9]+ ;
STRING     : '"' .*? '"' ;
WS         : [ \t\r\n]+ -> skip ;
COMMENT    : '//' .*? '\r'? '\n' -> skip ;
ML_COMMENT : '/*' .*? '*/' -> skip ;