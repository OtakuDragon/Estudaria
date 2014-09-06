#include <stdio.h>
#include <stdlib.h>
#include "log.h"

int main()
{double b,v,r;
 char begin,end;
 float intbegin,intend;
 
 
printf ("O intervalo comeca aberto ou fechado? (o/c)")
scanf ("%c",begin);
printf ("\n");
printf ("Qual e o valor inicial do intervalo?"); 
scanf ("%f",intbegin);
printf ("Qual e o valor final do intervalo?"); 
scanf ("%f",intend);

 
 
  printf ("Qual e a base do log?\n ");
  scanf ("%lf",&b);
  printf ("\nQual e o valor do log?\n");
  scanf ("%lf",&v);
  
 
  
  printf ("%lf",logaritmo(v,b));
  
  system("PAUSE");	
  return 0;
}
