import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;


public class WindowL implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		if(JOptionPane.showConfirmDialog(SeriesGUI.frame, "Deseja sair?", "Fechar?", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
		
		try(FileOutputStream fos = new FileOutputStream("Series.ser")){
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(SeriesGUI.seriesUPDT);
				
				oos.close();
			
			
		}catch(IOException ex){
			
			
			ex.printStackTrace();
			
		}
		
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
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
