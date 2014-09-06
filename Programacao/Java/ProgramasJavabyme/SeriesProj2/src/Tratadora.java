import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class Tratadora implements ActionListener {
	int cont;
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		for (cont = 0;cont<SeriesGUI.seriesUPDT.size();cont++ ){
			
			if (e.getSource() == SeriesGUI.seriesUPDT.get(cont).mais){
				
				if(JOptionPane.showConfirmDialog(null, "Você acabou de assistir um episodio de " + SeriesGUI.seriesUPDT.get(cont).nome +" ?", "Assistiu?", JOptionPane.YES_NO_OPTION)== 0){
					Integer episodio = Integer.parseInt(SeriesGUI.seriesUPDT.get(cont).episodio.getText());
					episodio++;
					String novoEpisodio = episodio.toString();
					SeriesGUI.seriesUPDT.get(cont).episodio.setText(novoEpisodio);
					
					JOptionPane.showMessageDialog(null,"Você agora esta no episodio " + SeriesGUI.seriesUPDT.get(cont).temporada.getText() +" x " + SeriesGUI.seriesUPDT.get(cont).episodio.getText() +" \n de "+ SeriesGUI.seriesUPDT.get(cont).nome  );
					
					
				}else{JOptionPane.showMessageDialog(null,"Nada foi alterado");}
				
				
			}else if (e.getSource() == SeriesGUI.seriesUPDT.get(cont).finale){
				
				if(JOptionPane.showConfirmDialog(null, "Você acabou de assistir uma temporada de " + SeriesGUI.seriesUPDT.get(cont).nome +" ?", "Finale", JOptionPane.YES_NO_OPTION)== 0){
					Integer temporada	= Integer.parseInt(SeriesGUI.seriesUPDT.get(cont).temporada.getText());
					temporada++;
					String novaTemporada = temporada.toString();
					SeriesGUI.seriesUPDT.get(cont).temporada.setText(novaTemporada);
					SeriesGUI.seriesUPDT.get(cont).episodio.setText("1");
					
					JOptionPane.showMessageDialog(null,"Você agora esta na Temporada " + SeriesGUI.seriesUPDT.get(cont).temporada.getText() +" x " + SeriesGUI.seriesUPDT.get(cont).episodio.getText() +" \n de "+ SeriesGUI.seriesUPDT.get(cont).nome  );

				}else{JOptionPane.showMessageDialog(null,"Nada foi alterado");}
				
				
			}
			
		}
	}

}
