
public class DesafioFibonacci {

	/**
	 * @Author Gilson Carlos Lopes
	 * 
	 * Esse programa imprimira a sequencia fibonacci
	 * até o elemento 50
	 */
	public static void main(String[] args) {
		
		int i;
		long elem = 0;
		long elem2 = 1;
		long elem3;
		System.out.println(elem);
		System.out.println(elem2);
		for (i=1; i<=50;i++){
			elem3 = elem + elem2;
			System.out.println(elem3);
			
			elem = elem2;
			elem2=elem3;
			
			
		}
		
		

	}

}
