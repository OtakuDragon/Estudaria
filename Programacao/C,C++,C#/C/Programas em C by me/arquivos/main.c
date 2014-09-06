#include <stdio.h>
#include <stdlib.h>

int main()
{
FILE *arquivo;
char o,p,a[10],b[10];
int i,i2;
scanf ("%s",&a);
//if (arquivo==NULL){
arquivo = fopen("file.txt","w");
if (arquivo == NULL){printf ("fail");}else{
            fputs (&a,arquivo);
            //fprintf (arquivo,"%d",i);
            /*fputc('12',arquivo);
            fputc('a',arquivo);*/
            fclose (arquivo);
            
            
                                          }
            
                // }
  arquivo = fopen ("file.txt","r");
  


//o=fgetc(arquivo);
//p=fgetc(arquivo);
//fscanf(arquivo,"%d",&i2);
fgets (&b,10,arquivo);
printf ("%s",b);
fclose (arquivo);
  system("PAUSE");	
  return 0;
}
