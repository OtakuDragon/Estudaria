#include <stdio.h>
#include <stdlib.h>
/* Escreva um programa que leia uma string, conte quantos caracteres
desta string sao iguais a 'a' e substitua os que forem iguais a 'a' por 'b'. O
programa deve imprimir o número de caracteres modificados e a string
modificada. */
int main()
{char string[100];
 int cont=0,cont2;
printf ("Escreva uma string\n");
gets (string);
for (cont=0; string[cont]!='\0'; cont=cont+1){
                                           if (string[cont]=='a'){cont2=cont2+1;
                                                                string[cont]='b';}
                                         
                                         }
printf ("O numero de caracteres iguais a: a  foi de, %d\n",cont2 );
printf ("A nova string e: %s\n",string);
  
  system("PAUSE");	
  return 0;
}
