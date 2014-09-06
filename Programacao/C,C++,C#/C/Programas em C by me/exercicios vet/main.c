#include <stdio.h>
#include <stdlib.h>
/* * achar o maior elemento do vetor;
   * achar o menor elemento do vetor;
   * calcular a media dos valores do vetor
   * gera outro vetor com o primeiro vezes 3 - para cada elemento do vetor multiplicar este por 3
   * mostrar o valor do vetor gerado; */
main()
{int vet [5],vet2[5];
 int i,maior=0,menor=100000,acum=0;
 float media;
 
 
 printf ("Preencha o vetor de 3 posicoes abaixo (o quarto valor digitado nao sera valido)\n");
 for (i=0; i<=4;i++) {
      printf ("Preencha o vetor de %d posicoes: ", i);
     scanf ("%d \n",(&vet[i]));
     /*if (vet[i]<menor){menor=vet[i];}
     if (vet[i]>maior){maior=vet[i];}
     acum=(acum+vet[i]);*/
}
 
     printf ("O Maior valor digitado foi: %d \n",maior);
     printf ("O Menor valor digitado foi: %d \n",menor);
     media=acum/3;
     printf ("A media deste vetor e de: %f \n",media);
     
     for (i = 0; i <= 2;i++){vet2[i]=vet[i]*3;} 
     printf ("O vetor multiplicado por 3: \n");
     for (i = 0; i <= 2;i++){printf ("%d \n",vet2[i]);}
  
 
  
  system("PAUSE");	
  
}
