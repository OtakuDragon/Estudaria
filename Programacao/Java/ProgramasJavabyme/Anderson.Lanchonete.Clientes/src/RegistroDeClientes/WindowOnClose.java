package RegistroDeClientes;


import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class WindowOnClose implements WindowListener {

	public void windowOpened(WindowEvent e) {
		
		
	}

	public void windowClosing(WindowEvent e) {
		
		if(JOptionPane.showConfirmDialog(null, "Deseja sair?", "Fechar?", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
		
		try(FileOutputStream fos = new FileOutputStream(GUICliente.caminho)){
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(GUICliente.bancoDeDados);
				
				oos.close();
			
			
		}catch(IOException ex){
			
			
			ex.printStackTrace();
			
		}
		
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		}
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


}
