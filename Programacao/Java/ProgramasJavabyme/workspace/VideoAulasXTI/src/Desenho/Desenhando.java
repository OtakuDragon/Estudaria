package Desenho;

import javax.swing.JOptionPane;



public class Desenhando {

	
	public static void main(String[] args) {
		
		int entrada;
		
		
		
		
		entrada = Integer.parseInt(JOptionPane.showInputDialog("Qual é o numero de linhas?"));
		
		
		
		Desenhista daVinci = new Desenhista(entrada);
		
		daVinci.pattern1();
		System.out.println("\n        ");
		daVinci.pattern2();
		daVinci.pattern3();

	}

}
