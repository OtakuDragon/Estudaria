#include <stdio.h>
#include <stdlib.h>

int main()
{
FILE *himym,*sp,*twd,*ahs,*tbbt,*tahm,*roe,*fg,*got,*bb,*nrt;
int i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12=0;
/*himym=fopen("himym.txt","w");
sp=fopen("sp.txt","w");
twd=fopen("twd.txt","w");
ahs=fopen("ahs.txt","w");
tbbt=fopen("tbbt.txt","w");
tahm=fopen("tahm.txt","w");
roe=fopen("roe.txt","w");
fg=fopen("fg.txt","w");
got=fopen("got.txt","w");
bb=fopen("bb.txt","w");
nrt=fopen("nrt.txt","w");

fclose (himym);
fclose (sp);
fclose (twd);
fclose (ahs);
fclose (tbbt);
fclose (tahm);
fclose (roe);
fclose (fg);
fclose (got);
fclose (bb);
fclose (nrt);*/
while (i12!=12){
himym=fopen("himym.txt","r");
sp=fopen("sp.txt","r");
twd=fopen("twd.txt","r");
ahs=fopen("ahs.txt","r");
tbbt=fopen("tbbt.txt","r");
tahm=fopen("tahm.txt","r");
roe=fopen("roe.txt","r");
fg=fopen("fg.txt","r");
got=fopen("got.txt","r");
bb=fopen("bb.txt","r");
nrt=fopen("nrt.txt","r");

fscanf (himym,"%d",&i1);
fscanf (sp,"%d",&i2);
fscanf (twd,"%d",&i3);
fscanf (ahs,"%d",&i4);
fscanf (tbbt,"%d",&i5);
fscanf (tahm,"%d",&i6);
fscanf (roe,"%d",&i7);
fscanf (fg,"%d",&i8);
fscanf (got,"%d",&i9);
fscanf (bb,"%d",&i10);
fscanf (nrt,"%d",&i11);




system ("CLS");
printf ("==Series==\n\n");
printf ("Escolha um seriado\n\n");
printf ("1) How i met your mother: 8 x %d\n",i1);
printf ("2) Supernatural: 8 x %d\n",i2);
printf ("3) The walking dead: 4 x %d\n",i3);
printf ("4) American horror story: 3 x %d\n",i4);
printf ("5) The big bang theory: 6 x %d\n",i5);
printf ("6) Two and a half man: 10 x %d\n",i6);
printf ("7) Rules of engagement: 7 x %d\n",i7);
printf ("8) Family guy: 11 x %d\n",i8);
printf ("9) Game of thrones: 3 x %d\n",i9);
printf ("10) Breaking bad: 5 x %d\n",i10);
printf ("11) Naruto: %d\n",i11);
printf ("12) Sair\n");
printf ("opcao: ");
scanf ("%d",&i12);
fflush (stdin);
char op;
switch (i12){
       
       case 1: 
        system ("cls");    
        fclose (himym);
        printf ("===How i met your mother===\n\n");
        printf ("Episodio atual: 8 x %d \n",i1);
        printf ("Novo episodio as: nao sei\n\n");
        himym=fopen("himym.txt","r+");
        printf ("Voce acabou de assistir um episodio de How i met your mother? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (himym,"%d",i1+1);
        printf ("\nAgora voce esta no 8 x %d\n\n",i1+1);
        fclose (himym);
        system ("pause");
        } else {fclose (himym); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break; 
        
        case 2: 
        system ("cls");    
        fclose (sp);
        printf ("===Supernatural===\n\n");
        printf ("Episodio atual: 8 x %d \n",i2);
        printf ("Novo episodio as: Quintas\n\n");
        sp=fopen("sp.txt","r+");
        printf ("Voce acabou de assistir um episodio de Supernatural? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (sp,"%d",i2+1);
        printf ("\nAgora voce esta no 8 x %d\n\n",i2+1);
        fclose (sp);
        system ("pause");
        } else {fclose (sp); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break; 
        
        case 3: 
        system ("cls");    
        fclose (twd);
        printf ("===The walking dead===\n\n");
        printf ("Episodio atual: 4 x %d \n",i3);
        printf ("Novo episodio as: Segundas\n\n");
        twd=fopen("twd.txt","r+");
        printf ("Voce acabou de assistir um episodio de The walking dead? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (twd,"%d",i3+1);
        printf ("\nAgora voce esta no 3 x %d\n\n",i3+1);
        fclose (twd);
        system ("pause");
        } else {fclose (twd); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break;  
        
        case 4: 
        system ("cls");    
        fclose (ahs);
        printf ("===American horror story===\n\n");
        printf ("Episodio atual: 3 x %d \n",i4);
        printf ("Novo episodio as: Quintas\n\n");
        ahs=fopen("ahs.txt","r+");
        printf ("Voce acabou de assistir um episodio de American horror story? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (ahs,"%d",i4+1);
        printf ("\nAgora voce esta no 3 x %d\n\n",i4+1);
        fclose (ahs);
        system ("pause");
        } else {fclose (ahs); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break; 
        
        case 5: 
        system ("cls");    
        fclose (tbbt);
        printf ("===The big bang theory===\n\n");
        printf ("Episodio atual: 6 x %d \n",i5);
        printf ("Novo episodio as: Sextas\n\n");
        tbbt=fopen("tbbt.txt","r+");
        printf ("Voce acabou de assistir um episodio de The big bang theory? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (tbbt,"%d",i5+1);
        printf ("\nAgora voce esta no 6 x %d\n\n",i5+1);
        fclose (tbbt);
        system ("pause");
        } else {fclose (tbbt); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break;    
       
        case 6: 
        system ("cls");    
        fclose (tahm);
        printf ("===Two and a half man===\n\n");
        printf ("Episodio atual: 10 x %d \n",i6);
        printf ("Novo episodio as: Sabados\n\n");
        tahm=fopen("tahm.txt","r+");
        printf ("Voce acabou de assistir um episodio de Two and a half man? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (tahm,"%d",i6+1);
        printf ("\nAgora voce esta no 10 x %d\n\n",i6+1);
        fclose (tahm);
        system ("pause");
        } else {fclose (tahm); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break; 
        
        case 7: 
        system ("cls");    
        fclose (roe);
        printf ("===Rules of engagement===\n\n");
        printf ("Episodio atual: 7 x %d \n",i7);
        printf ("Novo episodio as: nao sei\n\n");
        roe=fopen("roe.txt","r+");
        printf ("Voce acabou de assistir um episodio de Rules of engagement? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (roe,"%d",i7+1);
        printf ("\nAgora voce esta no 7 x %d\n\n",i7+1);
        fclose (roe);
        system ("pause");
        } else {fclose (roe); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break; 
        
        case 8: 
        system ("cls");    
        fclose (fg);
        printf ("===Family guy===\n\n");
        printf ("Episodio atual: 11 x %d \n",i8);
        printf ("Novo episodio as: nao sei\n\n");
        fg=fopen("fg.txt","r+");
        printf ("Voce acabou de assistir um episodio de Family guy? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (fg,"%d",i8+1);
        printf ("\nAgora voce esta no 11 x %d\n\n",i8+1);
        fclose (fg);
        system ("pause");
        } else {fclose (fg); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break;
        
        case 9: 
        system ("cls");    
        fclose (got);
        printf ("===Game of thrones===\n\n");
        printf ("Episodio atual: 3 x %d \n",i9);
        printf ("Novo episodio as: nao sei\n\n");
        got=fopen("got.txt","r+");
        printf ("Voce acabou de assistir um episodio de Game of thrones? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (got,"%d",i9+1);
        printf ("\nAgora voce esta no 3 x %d\n\n",i9+1);
        fclose (got);
        system ("pause");
        } else {fclose (got); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break;
        
        case 10: 
        system ("cls");    
        fclose (bb);
        printf ("===Breaking bad===\n\n");
        printf ("Episodio atual: 5 x %d \n",i10);
        printf ("Novo episodio as: nao sei\n\n");
        bb=fopen("bb.txt","r+");
        printf ("Voce acabou de assistir um episodio de Breaking bad? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (bb,"%d",i10+1);
        printf ("\nAgora voce esta no 5 x %d\n\n",i10+1);
        fclose (bb);
        system ("pause");
        } else {fclose (bb); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break;
        
        case 11: 
        system ("cls");    
        fclose (nrt);
        printf ("===Naruto===\n\n");
        printf ("Episodio atual: %d \n",i11);
        printf ("Novo episodio as: nao sei\n\n");
        nrt=fopen("nrt.txt","r+");
        printf ("Voce acabou de assistir um episodio de Naruto? (s/n)\n");
        scanf ("%c",&op);
        
        if (op=='s'){
        fprintf (nrt,"%d",i11+1);
        printf ("\nAgora voce esta no %d\n\n",i11+1);
        fclose (nrt);
        system ("pause");
        } else {fclose (nrt); printf ("\nNada foi alterado\n\n"); system ("pause");}
        break;
       
       
       
       
       
       
       }
       
}













system ("cls");
printf ("Programa encerrado\n");

  
  system("PAUSE");	
  return 0;
}
