import java.util.Random;

import javax.swing.JOptionPane;


public class JogoDoDado {

	/**
	 * @author Gilson Carlos Lopes
	 * 
	 * Esse programa cria um jogo de palpites baseado no valor aleatorio de um dado
	 */
	public static void main(String[] args) {
		Random r = new Random();
		
		int valorDoDado = -2;
		
		while (valorDoDado<1){ 
		valorDoDado= r.nextInt(7);
		}
		
		String palpite = JOptionPane.showInputDialog("Qual é o seu palpite?");
		
		Integer palpiteInt = new Integer(palpite);
		
		if (valorDoDado == palpiteInt.intValue()){
			
			JOptionPane.showMessageDialog(null, "Você acertou " + valorDoDado);
			
			
		}else {JOptionPane.showMessageDialog(null, "Você errou o numero era " + valorDoDado);}
		
		
		

	}

}
