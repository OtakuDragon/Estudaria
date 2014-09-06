import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Combo extends JFrame implements ItemListener {

	Combo(){
		super();
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			if (e.getItem().toString().equals("opção 1")){
				System.out.println("opção 1 foi escolhida");
				
			}else if (e.getItem().toString().equals("opção 2")){
				System.out.println("opção 2 foi escolhida");
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Combo janela = new Combo();
		JComboBox<String> caixa = new JComboBox<>();
		Container c = janela.getContentPane();
		caixa.addItem("opção 1");
		caixa.addItem("opção 2");
		caixa.addItemListener(janela);
	
	
		c.add(BorderLayout.NORTH,caixa);

	}

	

}
