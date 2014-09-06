package CalcGUI;

import java.awt.BorderLayout;
import java.awt.Container;



import javax.swing.*;



public class Calculadora {

	
	static JFrame janela = new JFrame("Calculadora");
	static Tela tela = new Tela();
	
	static Teclado teclado = new Teclado();

	public static Tela getTela() {
		return tela;
	}
	
	public static void main(String[] args) {
	

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300,300);
		janela.setVisible(true);
		Container c = janela.getContentPane();
		
		
		c.add(BorderLayout.NORTH,tela);
		c.add(BorderLayout.CENTER,teclado);
		
		
		
		
		

	}

}
