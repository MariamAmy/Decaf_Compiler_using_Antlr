grammar Decaf;

// Lexer
fragment CHAR_  : ( ~['"\\] | '\\' ["'\\tn] ) ;
fragment LETTER : ( 'a'..'z' | 'A'..'Z' ) ;
fragment DIGIT  : '0'..'9' ;


COMMENTS : '//' ~( '\n' )* -> skip ;
WS       : [ \t\r\n\f]+ -> skip ;
BOOL     : 'true' | 'false' ;

KEYWORD  : 'def' | 'if' | 'else' | 'while' | 'return' | 'break' | 'continue' | 'int' | 'boolean' | 'void' | 'for'
         | 'class' | 'new' | 'Program' | 'callout' | 'interface' | 'extends' | 'implements' | 'this' | 'string'
         | 'float' | 'null' | 'double' | BOOL
         ;
SYMBOL   : '(' | '{' | '[' | ']' | '}' | ')' | ',' | ';' | '=' | '*' | '/' | '+' | '-' | '%' | '<' '>' | '<='
         | '>=' | '<' | '>' | '==' | '!=' | '&&' | '||' | '!'
         ;

ID       : LETTER ( LETTER | DIGIT | '_' )* ;
HEX      : '0x' [0-9a-fA-F]+ ;
CHAR     : '\'' CHAR_ '\'' ;
STRING   : '"' CHAR_* '"' ;
INT      : '-'? DIGIT+ ;

// Parser
program     : 'class' 'Program' '{' ( variable | method )* '}' ;
block       : '{' ( variable | statement )* '}' ;


method      : type ID '(' ( parameter (',' parameter)* )? ')' block ;
variable    : type ID ';' | type ID '[' ( INT | HEX ) ']' ';' ;
parameter   : type ID | type ID '[' ']' ;
type        : 'int' | 'boolean' | 'void' ;


statement   : 'for' '(' (initializer ';')? expression (';' initializer)? ')' block
            | 'if' '(' expression ')' block ( 'else' block )?
            | 'for' initializer ',' expression block
            | 'while' '(' expression ')' block
            | ( expression | initializer )? ';'
            | 'return' ( expression | ) ';'
            | block
            ;
expression  : methodCall | location | literal | KEYWORD
            | expression operation expression
            | ( '-' | '!' ) expression
            | '(' expression ')'
            ;


location    : ( ID | ID '[' expression ']' )( '.' location )? ;
argument    : (expression) (',' expression)* ;
methodCall  : ( ID | KEYWORD ) '(' ( argument | ) ')' ;
initializer : location '=' expression ;


operation   : relational | arithematic | conditional ;
relational  : '<' | '>' | '<=' | '>=' | '==' | '!=' | '+=' | '-=';
arithematic : '**' | '*' | '/' | '+' | '-' ;
conditional : '&&' | '||' ;


literal     : HEX | INT | STRING | CHAR | BOOL ;