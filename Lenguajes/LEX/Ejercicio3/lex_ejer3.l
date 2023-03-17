/*Reconocer los números, los símbolos y los caracteres de una calculadora - Victor Cespedes*/
%%
"+" { printf("MAS\n"); }
"-" { printf("MENOS\n"); }
"*" { printf("POR\n"); }
"/" { printf("DIVIDIDO\n"); }
"|" { printf("ABSOLUTO\n"); }
"=" { printf("IGUAL\n"); }
"%" { printf("MODULO\n"); }
[0-9]+ { printf("NUMERO %s\n", yytext); }
\n { printf("\n"); }
[ \t] { }
. { printf("Mystery character %s\n", yytext); }
%%
