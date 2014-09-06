#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


main()
{int x,y,i,i2=0;
printf ("Digite um numero inteiro para saber se ele eh primo:\n");
scanf ("%d",&x);
y=x/2;
for (i=2; i<=y; i++) {if (x % i == 0) {i2=i2+1;}}
i2=i2-1;
if (i2==-1) {printf ("O Numero e primo\n");}
else {printf ("O Numero nao e primo\n");} 
 
  
  system("PAUSE");	
  return 0;
}
