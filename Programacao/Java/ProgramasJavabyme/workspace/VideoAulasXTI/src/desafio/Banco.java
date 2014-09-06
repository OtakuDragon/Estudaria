package desafio;

public class Banco {

	
	public static void main(String[] args) {
	
		
		Conta[] DaArray = new Conta[3];
		
		DaArray[0] = new Conta("Gilson",10000);
		DaArray[1] = new Conta("Thais",12000);
		DaArray[2] = new Conta("Camila",15000);
		
		Conta.setListaDeContas(DaArray);
		
		Conta[] teste = Conta.getListaDeContas();
		
		
		System.out.println(teste[1].getCliente() +" "+ teste[1].getSaldo());
		
	
		
		
		
		
		
		
		

	}

}
