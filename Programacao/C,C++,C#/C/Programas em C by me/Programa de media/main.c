//exemplo de programa com concatenado
#include <stdio.h>
#include <stdlib.h> 

  main(){
  float n,n1,media;
  char m[12];
  printf ("Nome: ");       
  scanf ("%s",&m);
  printf ("Digite a nota 1 do %s: ",m);
  scanf ("%f",&n);
  printf ("Digite a nota 2 do %s: ",m);
  scanf ("%f",&n1);
  media=(n+n1)/2;
  
  if (media<3) {printf ("Aluno %s esta Reprovado\n",m);}
   if (media>3 && media<6) {printf ("Aluno %s esta em Recuperacao\n",m);}
    if (media>=6) {printf ("Aluno %s esta Aprovado\n",m);}
  
  
 
 

    system ("pause");          
}
