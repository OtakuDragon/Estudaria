
public class Televisao {

	private boolean ligada;
	private int canal;
	
	public void ligar() {
		ligada = true;
		System.out.println("Televis�o ligada");
	}
	
	public void desligar() {
		ligada = false;
		System.out.println("Televis�o desligada");
	}
	
	public void mudarCanal(int canal) {
		this.canal = canal;
		System.out.println("Novo canal: " + canal);
	}
}
