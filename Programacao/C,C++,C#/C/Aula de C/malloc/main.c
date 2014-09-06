#include <stdio.h>
#include <stdlib.h>

int main()
{
  int *p;
  int n,i;
  
  printf ("enter the number of pentagonal number you want n=");
  scanf("%d",&n);
  p=(int*) malloc (n*sizeof(int));
  
  if (n>=1)
  {for (i=1;i<=n;i++){
       p[i]=((3*i*i)-i)/2;
       printf ("\n pentagonal number %d is %d",i,p[i]);}}
  system("PAUSE");	
  return 0;
}
