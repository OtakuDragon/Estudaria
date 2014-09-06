package pacote1;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

import Pacote.Gilson.Arquivador;

public class Teste {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 * @throws IOException 
	 */
	static URL c;
	public Teste(){
		
	c =	getClass().getResource("resource");
	
	
		
		
	}
	public static void main(String[] args) throws URISyntaxException, IOException {
		
		new Teste();
		
		//String[] nomes = {"gilson","camila"};
		
		 URL l = Teste.c;
		
		Arquivador a = new Arquivador<String[]>();
		
		//a.setArquivo(l.toURI(),nomes,"Nomes");
		
		String[] nomes =  (String[]) a.getArquivo(l.toURI(),"Nomes");
		
		JOptionPane.showMessageDialog(null,nomes[0] + nomes[1]);
		
		
		
		


	}

}
