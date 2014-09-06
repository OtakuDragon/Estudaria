#include <stdio.h>
#include <stdlib.h>
/* Para matrizes:
   * carregar uma Matriz[5,5];
   * calcular a soma de todos os elementos;
   * achar o maior elemento do vetor;
   * achar o menor elemento do vetor;
   * calcular a media dos valores da matriz
   * gera outra matriz, multiplicando todos os elementos da matriz por 5;
   * mostrar os valores da matriz gerada; */
main()
{int mat[5][5];
 int i=0,o=0;
 
 for (i=0; i<=5;i++) {
                          for (o=0; o<=5;o++) {
                                                    scanf ("%d",&mat[o][i]);
                                                    }
                          }
  
  system("PAUSE");	
 
}
