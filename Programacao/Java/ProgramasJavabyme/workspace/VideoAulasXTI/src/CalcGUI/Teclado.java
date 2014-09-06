package CalcGUI;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;

public class Teclado extends Container {
	
	static JButton um = new JButton("1");
	static JButton dois = new JButton("2");
	static JButton tres = new JButton("3");
	static JButton quatro = new JButton("4");
	static JButton cinco = new JButton("5");
	static JButton seis = new JButton("6");
	static JButton sete = new JButton("7");
	static JButton oito = new JButton("8");
	static JButton nove = new JButton("9");
	static JButton zero = new JButton("0");
	static JButton clear = new JButton("C");
	static JButton mais = new JButton("+");
	static JButton menos = new JButton("-");
	static JButton divisao = new JButton("/");
	static JButton multiplicacao = new JButton("*");
	static JButton igual = new JButton("=");

	Teclado(){
		
setLayout(new GridLayout(4,4,5,5));

 um.addActionListener(new Tratadora());
 dois.addActionListener(new Tratadora());
 tres.addActionListener(new Tratadora());
 quatro.addActionListener(new Tratadora());
 cinco.addActionListener(new Tratadora());
 seis.addActionListener(new Tratadora());
 sete.addActionListener(new Tratadora());
 oito.addActionListener(new Tratadora());
 nove.addActionListener(new Tratadora());
 zero.addActionListener(new Tratadora());
 mais.addActionListener(new Tratadora());
 menos.addActionListener(new Tratadora());
 multiplicacao.addActionListener(new Tratadora());
 divisao.addActionListener(new Tratadora());
 igual.addActionListener(new Tratadora());
 clear.addActionListener(new Tratadora());
 
		
		add(sete);
		add(oito);
		add(nove);
		add(divisao);
		add(quatro);
		add(cinco);
		add(seis);
		add(multiplicacao);
		add(um);
		add(dois);
		add(tres);
	    add(menos);
		add(zero);
		add(clear);
		add(igual);
		add(mais);
	}

}
