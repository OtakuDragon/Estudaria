int vetor (int x[2])
  {
     int i,acum=0,maior=0,menor=100000,media;
     for (i=0; i<=2; i++)   
      {
       scanf ("%d",&x[i]);
       acum=acum+x[i]; 
       if (x[i]>maior){maior=x[i];}
       if (x[i]<menor){menor=x[i];} 
      }
      media=acum/3;
      printf ("A soma de todos os termos do vetor e de %d\n",acum);
      printf ("O maior termo do vetor e %d\n",maior);
      printf ("O menor termo do vetor e %d\n",menor);
      printf ("A media dos termos do vetor e %d\n",media);
  }
