#include <stdio.h>
#include <stdlib.h>
struct p1{
       int top;
       int itens[10];
       }
 init(struct p1 *ponteiro){
     ponteiro->top=-1;
     }
int empty(struct p1 *ponteiro){
    if (ponteiro->top==-1)
    return 1;
    else
    return 0;
}
void push(struct p1 *ponteiro,int x){
     if (ponteiro->top==9){
                           printf ("\n stack overflow! \n");
                           exit (1);
                           }else {
                                 ponteiro->top++;
                                 ponteiro->itens[ponteiro->top]=x;
                                 }
                                 }
int pop (struct p1 *ponteiro){
    if (empty(ponteiro)){
                          printf ("\nstack underflow!\n");
                          exit(10);}else{return ponteiro->itens[ponteiro->top--];}
                          }

int main()
{struct p1 p;
init (&p);

push(&p,1);
push(&p,3);

if (empty(&p)){
               push (&p,9);
               }else{
                     init(&p);
                     }
push (&p,5);
push (&p,pop(&p));
push (&p,1);
push (&p,11);

while (empty(&p)!=1){ printf ("%d,",pop(&p));}

  system("PAUSE");	
  return 0;
}
