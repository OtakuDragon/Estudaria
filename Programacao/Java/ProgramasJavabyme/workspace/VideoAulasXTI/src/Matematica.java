
public class Matematica {
	
  int raiz(int numero){
	int  impar = 1;
	int cont=0;
	
	 while (numero>0){
		
		 numero = numero - impar;
		 cont++;
		 impar +=2;
		
		 
		 if (numero<0){
			 cont--;
			 break;
		 }
		 
		 
	 }
	 return cont;
	 
	}

}
