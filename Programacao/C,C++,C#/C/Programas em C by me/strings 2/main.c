#include <stdio.h>
#include <stdlib.h>

int main()
{char str1[5];
 char str2[5];
 
 printf ("Digite uma string") ;
 gets (str1);
 
  printf ("Digite outra string") ;
 gets (str2);
 
 printf ("string 1: %s string 2 %s letras %c %c\n",str1,str2,str1[1],str2[1]);
 
  
  system("PAUSE");	
  return 0;
}
