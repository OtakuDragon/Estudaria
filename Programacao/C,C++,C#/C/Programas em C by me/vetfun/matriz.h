int matriz (int h[1][1])
{int x,y,acum=0,maior=0,menor=100000;
 float media;
 for (x=0;x<=1; x++){
                      for (y=0;y<=1; y++) { scanf ("%d",&h[x][y]);
                                            acum=acum+h[x][y]; 
                                            if (h[x][y]>maior){maior=h[x][y];}
                                            if (h[x][y]<menor){menor=h[x][y];}                       }
    }
      media=acum/4;
      printf ("A soma de todos os termos do vetor e de %d\n",acum);
      printf ("O maior termo do vetor e %d\n",maior);
      printf ("O menor termo do vetor e %d\n",menor);
      printf ("A media dos termos do vetor e %f\n",media);
    
    
    
    }
