#include <stdio.h>
#include <stdlib.h>
//Fazer um programa ler um vetor de inteiros e positivos e imprimir quantas vezes aparece o 
//numero 1, 3 e 4, nesta ordem. O vetor tera no maximo 100 posicoes. Sair do programa quando 
//for digitado -1.
int main()
{int vetor[100];
 int numero=0,cont=1,cont2=0,v1,v2,v3;
do{
     printf ("Digite o numero da posicao %d",cont);
     printf ("\n");
     scanf ("%d",&numero);
     if (numero>=0 && numero!=-1){vetor[cont]=numero;} else {printf ("\nNumero negativo digitado\n");system("PAUSE");}
     
     if (vetor[cont]==4){
                         v1=cont-1;
                         if (vetor[v1]==3){
                                           v2=cont-2;
                                           if (vetor[v2]==1){cont2++;}}}
     cont++;}while (numero!=-1);
     
     printf ("\nO numero de vezes que 1 3 e 4 aparecem em sequencia nesse vetor e de: %d\n",cont2);
  system("PAUSE");	
  return 0;
}
