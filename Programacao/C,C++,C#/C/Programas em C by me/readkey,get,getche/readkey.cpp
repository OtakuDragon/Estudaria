#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
/* Este programa usa conio.h . Se você não tiver a conio, ele
não funcionará no Unix */
main ()
{
char Ch;
Ch=getch(); //getch = readkey sem mostrar a tecla pressionada /getche = readkey mostra a tecla pressionada
printf ("Voce pressionou a tecla %c",Ch);


system ("PAUSE");
}
