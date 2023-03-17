%{
#include <stdio.h>
%}

%option noyywrap

%{
int acepta = 1;
%}

%%

"lambda"                { /* Inicio de expresión lambda */ }
"("                     { /* Inicio de lista de parámetros */ }
")"                     { /* Fin de lista de parámetros */ }
":"                     { /* Separador de parámetros y cuerpo */ }
"+"                     { /*Operadores */ }
"-"			{ /*Operadores */ }
"*"			{ /*Operadores */ }
"/"   		        { /*Operadores */ }		  
[0-9]+                  { /* Enteros */ }
[0-9]\.[0-9]+           { /* Flotantes */ }
[a-zA-Z]+               { /* Identificadores */ }

%%

int main(int argc, char **argv) {
    if (argc < 2) {
        printf("Nombre archivo: %s file\n", argv[0]);
        return 1;
    }
    
    FILE* file = fopen(argv[1], "r");
    if (file == NULL) {
        printf("No se pudo abrir el archivo.\n");
        return 1;
    }
      if (acepta) {
        printf("ACEPTA\n");
    } else {
        printf("NO ACEPTA\n");
    }
    
    yylex();
    fclose(file);
    return 0;
    
  
   
    
 
}


