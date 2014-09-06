#include <stdio.h>
#include <stdlib.h>
struct teste {int i,j;
              int *p,*q;  }
main()
{struct teste infoTeste;
 infoTeste.i=3;
 infoTeste.j=5;
 struct teste *ponteiroTeste;
 infoTeste.p =&infoTeste.i;
 infoTeste.q =&infoTeste.j;
 ponteiroTeste=&infoTeste;
 
 printf (" %x\n",ponteiroTeste->q);
 
 
 /* i=3,j=5,p=&i, q=&j,ponteiroTeste=&infoTeste*/
  
  system("PAUSE");	

}
