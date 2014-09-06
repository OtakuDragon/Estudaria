package CalcGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JTextField;

public class Tela extends JTextField {

	Tela(){
		super();
	   setHorizontalAlignment(JTextField.RIGHT);
		
         Font f = getFont();
		setEditable(false);
		setBackground(Color.WHITE);
		setText("testando");
		
		
		setFont(new Font(f.getFamily(),Font.PLAIN,26));
		
	}
	

}
