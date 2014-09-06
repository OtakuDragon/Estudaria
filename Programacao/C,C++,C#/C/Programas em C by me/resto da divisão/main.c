#include <stdio.h>
#include <stdlib.h>

main()
{int x,y;
 int r;
 float r2;
 char op='u';
 while (op!='n'){
 printf ("Escreva o numero de cima da divisao\n");
 scanf ("%d",&x);
 printf ("Escreva o numero de baixo da divisao\n");
 scanf ("%d",&y);
 r= x % y;
 r2= x/y;
 printf ("O resto da divisao e: %d\n",r);
 printf ("O resultado da divisao e: %f\n",r2);
 
 
 
}
  
  system("PAUSE");	
  return 0;
}
