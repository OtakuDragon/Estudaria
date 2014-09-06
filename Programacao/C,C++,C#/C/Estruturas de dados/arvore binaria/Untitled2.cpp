#include<stdio.h> 
#include<stdlib.h> 
#include<string.h>

struct arv_bin{ 
  int info; 
  struct arv_bin *esq, *dir; 
};

arv_bin *raiz;

arv_bin *visita_arvore(arv_bin *ra,arv_bin *r,int pvalor){
 if (r==NULL){
    r = (arv_bin *)malloc(sizeof(arv_bin));
     if(r==NULL){
       printf("\nErro. Nao ha memoria para alocar\n");
       system("Pause");
       exit(0);
     }//fim do if r==null
    r->esq = NULL;
    r->dir = NULL;
    r->info = pvalor;          
    
    if(ra==NULL){
      printf("\nEsse numero adicionado e a raiz\n");
      system("Pause");
      return r; 
    }//fim do if ra==null
    if(pvalor<ra->info){
     ra->esq = r;
     printf("\nEsse numero foi adicionado a esquerda de %d\n",ra->info);
    }//fim do if de comparação pvalor
    else{
       ra->dir = r;
       printf("Esse numero foi adicionado a direita de %d\n",ra->info);
    }//fim do else
    system("Pause");
    return r; 
  }//fim do if r
  if(pvalor<r->info){
   visita_arvore(r,r->esq,pvalor);
  }
  else{
   visita_arvore(r,r->dir,pvalor);  
  }   
}//fim da arv_bin

//metodo incluir

void incluir(void){
 int Valor;
 printf("\nDigite o valor para incluir-> ");
 scanf("%d",&Valor);
 if(raiz==NULL)
   raiz = visita_arvore(raiz,raiz,Valor);
 else
  visita_arvore(raiz,raiz,Valor);
}//fim do metodo incluir

void preordem(arv_bin *pNo){
    if (pNo != NULL){
       printf("%d - ", pNo->info);
       preordem(pNo->esq);
       preordem(pNo->dir);
    }
}

void posordem(arv_bin *pNo){
    if (pNo != NULL){
       posordem(pNo->esq);
       posordem(pNo->dir);
       printf("%d - ", pNo->info);
    }
}


int main(void){
   int opcao;raiz=NULL;
   while(1){
   system("cls");
   printf("\nMenu");
   printf("\n\n 1 - Inserir");
   printf("\n\n 2 - Pre-Ordem");
   printf("\n\n 3 - Pos-Ordem");

   scanf("%d",&opcao);
   switch(opcao){
    case 1:
     incluir();
    break;
    case 2:
     preordem(raiz);
     system("pause");
    break;   
    case 3:
     posordem(raiz);
     system("pause");      
    break; 
   }//fim do switch
   
//return 0;   
}
} //fim do main
