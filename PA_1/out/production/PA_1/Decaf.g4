grammar Decaf;

// Lexer rules for keywords
CLASS: 'class';
VOID: 'void';
INT: 'int';
BOOLEAN: 'boolean';
IF: 'if';
ELSE: 'else';
WHILE:'while';
FOR: 'for';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';
CALLOUT: 'callout';

// Other lexer rules
fragment ALPHA: [a-zA-Z_];
ID: ALPHA (ALPHA | DIGIT)*;
CHAR_LITERAL: '\'' CHAR_ '\''; // Use single quotes for character literals
STRING_LITERAL: '"' (CHAR_ | ESC_SEQ)* '"'; // Fix string literal rule
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
LEFT_PAR: '(';
RIGHT_PAR: ')';
COMMA: ',';
SEMICOLON: ';';
ASSIGN_OP: '=';
INC_then_ASSIGN: '+=';
DEC_then_ASSIGN: '-=';
ARITHMETIC_OP: '+' | '-' | '*' | '/' | '%';
REL_OP: '<' | '>' | '<=' | '>=';
EQ_OP: '==' | '!=';
COND_OP_AND: '&&';
COND_OP_OR: '||';
WHITESPACE: [ \t\n] -> skip;

// Lexer rules for literals
fragment HEX_DIGIT: [0-9a-fA-F];
HEX: '0x' HEX_DIGIT+;
In: DIGIT+;
BOOL: 'true' | 'false';

// Parser rules
program     : 'class' 'Program' '{' ( variable | method )* '}' EOF;
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

expression  : methodCall | location | literal | ID
            | expression operation expression
            | ( '-' | '!' ) expression
            | '(' expression ')'
            ;

location    : ( ID | ID '[' expression ']' )( '.' location )? ;
argument    : (expression) (',' expression)* ;
methodCall  : ( ID | CALLOUT ) '(' ( argument | ) ')' ;
initializer : location '=' expression ;

operation   : ARITHMETIC_OP | REL_OP | COND_OP_AND | COND_OP_OR ;

literal     : HEX | In | STRING_LITERAL | CHAR_LITERAL | BOOL ;

// Fragments
fragment CHAR_    : ( ~['"\\] | '\\' ["'\\tn]) ; // Corrected CHAR fragment
fragment ESC_SEQ  : '\\' . ; // Escape sequence fragment
fragment DIGIT    : [0-9]+;