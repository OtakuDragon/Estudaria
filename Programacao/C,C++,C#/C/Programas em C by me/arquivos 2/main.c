#include <stdio.h>
#include <stdlib.h>

int main()
{
FILE *namedb,*fst;
char nome[10];
int i,boo;
fst=fopen ("first.txt","r");
fscanf (fst,"%d",&boo);
fclose(fst);



if (boo!=1){
namedb=fopen ("nomes.txt","w");
for (i=0;i<=2; i++){
printf ("Digite um nome:\n");
gets (nome);
fputs (&nome,namedb);
} 
fst=fopen("first.txt","r+");
fprintf (fst,"%d",1);
fclose (fst);
fclose (namedb);
}
char var[10];
namedb=fopen ("nomes.txt","r");
while (feof(namedb)==0){
      fgets(&var,10,namedb);
      printf ("%s",var);}
  system("PAUSE");	
  return 0;
}
