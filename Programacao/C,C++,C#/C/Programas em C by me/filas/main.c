#include <stdio.h>
#include <stdlib.h>
struct ELEMENTO_FILA{
   int info;
   struct ELEMENTO_FILA *prox;
};

struct FILA{
   struct ELEMENTO_FILA *inicio;
   struct ELEMENTO_FILA *final;
};

void init(struct FILA *f) {
   f->inicio = NULL;
   f->final = NULL;
};

int empty (struct FILA *f) {
   if (f->inicio == NULL && f->final == NULL)
       return 1; // Fila vazia
   else
       return 0; // Fila NÃO vazia
};

void insert(struct FILA *f, int pValor) {
  struct ELEMENTO_FILA *novo;
  novo=(struct ELEMENTO_FILA*) malloc(sizeof(struct ELEMENTO_FILA));
  novo->info = pValor;
  novo->prox = NULL;
  if (f->final != NULL) {
      f->final->prox = novo;
  }
  f->final = novo;
  if (f->inicio == NULL) {
      f->inicio = f->final;
      }
};

int deletar(struct FILA *f) {
if (empty(f)) {
printf("\n underflow de fila ! \n");
exit(1);
} else {
int valorInicio;
valorInicio = f->inicio->info;
struct ELEMENTO_FILA *aux;
aux = f->inicio;
f->inicio = f->inicio->prox;
free(aux);
if (f->inicio == NULL) {
f->final = f->inicio;
}
return valorInicio;
}
};

void mostrar(struct FILA *f){
     struct ELEMENTO_FILA *aux;
     aux=f->inicio;
     while (aux!=NULL){
           printf ("%d,",aux->info);
           aux=aux->prox;
           
           }
           
     
     
     
     
     
     };
int mostrarmenor(struct FILA *f){
     struct ELEMENTO_FILA *aux;
     aux=f->inicio;
     int menor=9999;
     while (aux!=NULL){
           if (aux->info<menor){
                                menor=aux->info;
                                }
           aux=aux->prox;
           
           }
           
     return menor;
     
     
     
     
     };

int main()
{
int bolly=0,op,item,item2;
struct FILA minhafila;
char op2;
while (op!=6){
system ("cls");
printf ("==MENU==\n\n");
printf ("1) Inicializar a lista \n");
printf ("2) Inserir um elemento \n");
printf ("3) Remover um elemento \n");
printf ("4) Imprimir a fila \n");
printf ("5) Mostrar o menor elemento da fila \n");
printf ("6) Sair \n");
scanf ("%d",&op);
switch (op){
case 1: 
     if (bolly==0){
                   init(&minhafila);
                   bolly=1;
                   printf ("Fila inicializada com sucesso\n");
                   system ("pause");
                   }else{printf ("A Fila ja foi iniciada\n");system ("pause");}
                   break; 

case 2: 
     if (bolly==1){
                   system ("cls");
                   printf ("==Inserir==\n\n");
                   printf ("Digite um numero inteiro para inserir a lista\n");
                   scanf ("%d",&item);
                   insert(&minhafila,item);
                   printf ("Numero %d inserido com sucesso\n",item);
                   system ("pause");
                   }else{
                         system ("cls");
                         printf ("A Fila ainda nao foi iniciada\n");
                         system ("pause");
                         }
                   break;
                   
case 3:
       if (bolly==1){system("cls");
                     printf ("==Remover==\n\n");
                     printf ("deseja remover um elemento da fila? (s/n) \n");
                     fflush (stdin);
                     scanf ("%c",&op2);
                     if (op2=='s' && empty(&minhafila)== 0){item2=deletar(&minhafila);
                                   printf ("O elemento %d foi removido com sucesso \n",item2);
                                   system ("pause"); }
                                   else{printf ("nada foi alterado, Fila vazia ou operacao abortada\n");
                                   system ("pause");}
                                   }else{
                                   system ("cls");
                         printf ("A Fila ainda nao foi iniciada ou esta vazia\n");
                         system ("pause");
                         }
                   break;

case 4: if (bolly==1 && empty(&minhafila)== 0){ printf ("Os elementos da Fila sao:\n");
                       mostrar (&minhafila);
                       printf ("\n");
                       system ("pause");
     }else{
            system ("cls");
            printf ("A Fila ainda nao foi iniciada ou esta vazia\n");
            system ("pause");
                         }
                   break;
                   
case 5: if (bolly==1 && empty(&minhafila)== 0){
     system ("cls");
     printf ("==Menor elemento==\n\n");
     printf ("O menor elemento da fila eh: %d\n",mostrarmenor(&minhafila));
     system ("pause");
     
     
     
     }else{
            system ("cls");
            printf ("A Fila ainda nao foi iniciada ou esta vazia\n");
            system ("pause");
                         }
                   break;
}//fim do switch
}//fim do while

  system("PAUSE");	
  return 0;
}// fim do main
