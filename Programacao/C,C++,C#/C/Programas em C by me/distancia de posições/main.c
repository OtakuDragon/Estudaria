#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct ponto 
{int  x,y;};





int main()

{struct ponto ponto2,ponto3;
 int dx,dy,modulo1,modulo2;
printf ("Digite as coordenadas do primeiro ponto\n");
printf ("x\n");
scanf ("%d",&ponto2.x);
printf ("y\n");
scanf ("%d",&ponto2.y);
printf ("Digite as coordenadas do segundo ponto\n");
printf ("x2\n");
scanf ("%d",&ponto3.x);
printf ("y2\n");
scanf ("%d",&ponto3.y);
dx=(ponto2.x)-(ponto3.x);
dy=(ponto2.y)-(ponto3.y);
modulo1 = sqrt(pow(dx,2));
modulo2 = sqrt(pow(dy,2));
printf ("A distancia entre os pontos em x e de %d e em y e de %d\n",modulo1,modulo2);
  system("PAUSE");	
  return 0;
}
