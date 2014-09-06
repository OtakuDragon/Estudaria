#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <conio.c>
#include <time.h>

//contar todas as operações, criar um vetor com posição igual a o numero da operação e registrar o numero da conta em que a operação foi realizada, somada de 2000 para deposito e de 3000 para saque
//Programa de banco
//[1] Cadastrar conta
//[2] Depositar
//[3] Sacar
//[4] Saldo
//[5] Sair

//obs: Dois Cpfs iguais nao podem ser registrados (detalhe: contador de cadastros deve ser resetado)
//Declaracao de variaveis fora da estrutura de repeticao

struct cadastro {
        char nome[100][20];
     long int cpf[100];
     long int tel[100];
        int senha[100];
        float saldo[100];
        }cadastro_cliente;


main()
{
 int op,cdstcont=1,l,containicial=0,conta,contarepeat,contafgt,cpffgt;
 int pw,contop=0,o;
 float saque,deposito;
 int contaop[1000]; 
 float valores[1000];
 int oprea[200];
 int opfeita[100];
 //Atribuindo todos os cpfs vazios a zero para comparacao no cadastro
 for (l=0; l<=99;l++) { cadastro_cliente.cpf[l]=0;cadastro_cliente.saldo[l]=0,00; oprea[l]=0;opfeita[l]=0;} 
 
 do {  
 contarepeat=0;   
 system ("CLS");
    printf ("           Bem Vindo ao Banco\n");
printf ("          --------------------\n\n");
printf ("           Escolha uma opcao\n\n");
printf (" [1] Cadastrar conta\n ");
printf ("[2] Depositar\n ");
printf ("[3] Sacar\n ");
printf ("[4] Saldo\n ");
printf ("[5] Esqueceu sua senha?\n ");
printf ("[6] Extrato\n ");
printf ("[7] Sair\n ");
scanf ("%d",&op);
  
 switch (op){
         
         case 1: system ("CLS");
         printf ("Cadastro de conta\n");
         printf ("-----------------\n\n");
         printf ("Digite seu nome completo:");
         scanf ("%s",&cadastro_cliente.nome[cdstcont]);
         fflush (stdin);
         printf ("Digite seu CPF: ");
         fflush (stdin);
         scanf ("%d",&cadastro_cliente.cpf[cdstcont]);
         fflush (stdin);
         printf ("Digite o seu telefone (somente numeros): (061) ");
         scanf ("%d",&cadastro_cliente.tel[cdstcont]);
          fflush (stdin);
         printf ("Digite sua senha (em numeros apenas): ");
         scanf ("%d",&cadastro_cliente.senha[cdstcont]);
         
          fflush (stdin);
          
         for (l=0; l<=cdstcont-1;l++) { if (cadastro_cliente.cpf[cdstcont]==cadastro_cliente.cpf[l]){contarepeat=1;}}
                                                                   if (contarepeat==0){
                                                                   printf ("\nConta registrada com sucesso!\n");
                                                                                printf("\nO numero da conta e %d\n\n",cdstcont);
                                                                                cdstcont++;
                                                                                containicial=1;
                                                                                system("PAUSE");
                                                                                } else {printf ("Esta conta ja existe\n");system ("PAUSE");}
                 break;                                                 
                                                                  
   case 2: system ("CLS");
           printf ("Depositar\n");  
           printf ("---------\n\n");
           printf ("Qual e o numero da sua conta?"); 
           scanf ("%d",&conta);
           fflush (stdin);
           printf ("\n");
           printf ("Qual e a sua senha?");
           scanf ("%d",&pw);
           fflush (stdin);
           
           if (containicial==1 && pw==cadastro_cliente.senha[conta]){
                                system ("CLS");
                                printf ("Bem vindo, %s\n",cadastro_cliente.nome[conta]);
                                printf ("Seu saldo atual e de R$ %.2f\n\n",cadastro_cliente.saldo[conta]);
                                printf ("Qual e o valor do deposito?\n");
                                printf ("R$ ");
                                scanf ("%f",&deposito);
                                if (deposito>0) {cadastro_cliente.saldo[conta]=cadastro_cliente.saldo[conta]+deposito;
                                                  printf ("deposito realizado com sucesso\n");
                                                  valores[contop]=deposito;
                                                  contaop[contop]=conta+2000; 
                                                  contop++;
                                                  opfeita[conta]=1;
                                                  system ("PAUSE");} else {printf ("Deposito invalido\n");
                                                                           system ("PAUSE");}
                                
                                
                                
                                } else {printf ("Senha incorreta ou conta inexistente\n");
                                             system ("PAUSE");}
                                
                                break;
                                
   case 3: system ("CLS");
        printf ("Sacar\n");  
           printf ("---------\n\n");
           printf ("Qual e o numero da sua conta?"); 
           scanf ("%d",&conta);
           fflush (stdin);
           printf ("\n");
           printf ("Qual e a sua senha?");
           scanf ("%d",&pw);
           fflush (stdin);
           if  (containicial==1 && pw==cadastro_cliente.senha[conta]){
                                system ("CLS");
                                printf ("Bem vindo, %s\n",cadastro_cliente.nome[conta]);
                                printf ("Seu saldo atual e de R$ %.2f\n\n",cadastro_cliente.saldo[conta]);
                                printf ("Qual e o valor do saque?\n");
                                printf ("R$ ");
                                scanf ("%f",&saque);
                                if (saque>0 && saque<=cadastro_cliente.saldo[conta])  {cadastro_cliente.saldo[conta]=cadastro_cliente.saldo[conta]-saque;
                                                                                          printf ("Saque Realizado com sucesso\n");
                                                                                          valores[contop]=saque;
                                                                                          contaop[contop]=conta+3000; 
                                                                                          contop++;
                                                                                          opfeita[conta]=1;
                                                                                          system ("PAUSE");} else {printf ("Saque invalido ou saldo insuficiente\n"); system ("PAUSE");}
                                
                                
                                
                                } else {printf ("Senha incorreta ou conta inexistente\n");
                                        system ("PAUSE");}
                                
                                break;
         
                                
  case 4:  system ("CLS");
           printf ("Saldo\n");  
           printf ("---------\n\n");
           printf ("Qual e o numero da sua conta?"); 
           scanf ("%d",&conta);
           fflush (stdin);
           printf ("\n");
           printf ("Qual e a sua senha?");
           scanf ("%d",&pw);
           fflush (stdin);
           if (containicial==1 && pw==cadastro_cliente.senha[conta]){
                                system ("CLS");
                                printf ("Bem vindo, %s\n",cadastro_cliente.nome[conta]);
                                printf ("Seu saldo atual e de R$ %.2f\n\n",cadastro_cliente.saldo[conta]);
                                system ("PAUSE");
                                                                                              
                               } else {printf ("Senha incorreta ou conta inexistente\n");
                                       system ("PAUSE");}
         break;
         
         
         
         
         case 5: 
                system ("CLS");
                 printf ("Recuperacao de senha\n");
                 printf ("--------------------\n\n");
                 printf ("Qual e o numero da sua conta?");
                 scanf  ("%d",&contafgt);
                 printf ("\n");
                 printf ("Qual e o seu Cpf?\n");
                 scanf ("%d",&cpffgt);
                 printf ("\n");
                 if (cadastro_cliente.cpf[contafgt]==cpffgt) {printf ("Bem vindo, %s\n",cadastro_cliente.nome[contafgt]);
                                                              printf ("sua senha e: %d \n",cadastro_cliente.senha[contafgt]);
                                                              printf ("Guarde ela com seguranca\n");
                                                              system ("PAUSE");}
                     break;
  
        case 6: system ("CLS");
                printf ("Extrato\n");
                printf ("-------\n\n");
                printf ("Qual e o numero da sua conta?"); 
                scanf ("%d",&conta);
                fflush (stdin);
                printf ("\n");
                printf ("Qual e a sua senha?");
                scanf ("%d",&pw);
                fflush (stdin);
           if  (containicial==1 && pw==cadastro_cliente.senha[conta]){
               printf ("Bem vindo, %s\n",cadastro_cliente.nome[conta]);
               printf ("As operacoes realizadas na sua conta foram:\n");           
               for (o=0; o<=contop;o++) {if (contaop[o]-2000 == conta || contaop[o]-3000 == conta)
                oprea[o]=o;
                }
               }else {printf ("\nSenha incorreta ou Conta inexistente\n");}
               for (o=0; o<contop;o++){if (contaop[oprea[o]]-2000 == conta){printf ("Deposito: %.2f\n",valores[oprea[o]]); }
               else if (contaop[oprea[o]]-3000 == conta){printf ("Saque: %.2f\n",valores[oprea[o]]); } }
               else if (opfeita[conta]==0){printf ("\nNenhuma movimentacao foi realizada\n");}
               system ("PAUSE");
                break;
                
  
         }
         } while (op!=7);    
         
         
         
        
         
         
         
         
         
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
             
  

