#include <stdio.h>
#include <stdlib.h>
main ()
{
char string[100];
printf ("Digite uma string: ");
gets (string);
printf ("\n\nVoce digitou %s\n",string);
printf ("\n\n teste %c\n",string[2]);
system ("PAUSE");
}
