package Desenho;

public class Desenhista {
		
	private int numero;
	private int cont,cont2,i,j;;
	String[] linhas = new String[100];
	String[] espacos = new String[100];
	public Desenhista(int numero){
		
			this.numero = numero;
			
			
			linhas[0]=" *";
			espacos[99]=" ";
			
			for (j=99;j>0;j--){
				espacos[j-1]= espacos[j]+" ";
			}
			
			for (i=1;i<100;i++){
			linhas[i]=linhas[i-1]+"**";
			
				
			}//fim do for
			
			
			
			}//fim do construtor
	
	public void pattern1 (){
		
		for (cont=0;cont<numero;cont++){
			for (cont2=0;cont2<numero;cont2++){
				System.out.print("*");
				
			}//fim do 2º for
			
			System.out.println("");
			
		}//fim do 1ºfor
		
	
		
	}//fim do metodo pattern1

	
	public void pattern2(){
		for (cont=0;cont<numero;cont++){
			if (cont % 2 != 0){
				System.out.print(" ");
			}	
			for (cont2=0;cont2<numero;cont2++){
				System.out.print("*");
				
			}//fim do 2º for
			
			System.out.println("");
			
			
		}//fim do 1ºfor
		
		
		
	}//fim de pattern2()
	
	
	
	public void pattern3(){
		int variavel = 0;
		for (cont=0;cont<numero;cont++){
			
			/*for (cont2=0;cont2<numero;cont2++){*/
				System.out.println(espacos[variavel] + linhas[cont]);
				//System.out.println(variavel);
				variavel++;
				
		/*	}//fim do 2º for*/
			
			
			
		}//fim do 1ºfor
		
	
		
	}//fim do metodo pattern3
		
		
		
		
		
		

	
	

}//fim da classe
