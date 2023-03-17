/* que reconozca algunos tokens*/
%%
"NUMBER" { printf("color"); }
"dog" { printf("perro"); }
"mystery" { printf("misterio"); }
"cat" { printf("gato"); }
"fish" { printf("pez"); }
"engine" { printf("motor"); }
"instance" { printf("instancia"); }
"class" { printf("clase"); }
"smart" { printf("elegant"); }
"problems" { printf("problemas"); }
"character" { printf("caracter"); }
"new" { printf("nuevo"); }
"line" { printf("linea"); }
"spaces" { printf("espacios"); }
"text" { printf("texto"); }
\n { printf("\n"); }
[ \t] { }
. { printf("Mystery character %s\n", yytext); }
%%
