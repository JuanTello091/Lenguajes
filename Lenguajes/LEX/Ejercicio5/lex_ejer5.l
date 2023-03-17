/*Reconocer los números, los símbolos y los caracteres de una calculadora - Victor Cespedes*/
/*un número complejo es la suma de un número real con un número imaginario*/
%%
[- + 0-9]*[i-jI-J]+[- + 0-9]* { printf("IMAGINARIO --> %s\n", yytext); }
[- + 0-9]+[i-jI-J]*[- + 0-9]*[+]+[- + 0-9]*[i-jI-J]+[- + 0-9]* { printf("COMPLEJO --> %s\n", yytext); }
[- + 0-9]*[i-jI-J]+[- + 0-9]*[+]+[- + 0-9]+[i-jI-J]*[- + 0-9]* { printf("COMPLEJO --> %s\n", yytext); }
\n { printf("\n"); }
[ \t] {}
. { printf("NO ES COMPLEJO NI IMAGINARIO --> %c\n", *yytext); }
%%