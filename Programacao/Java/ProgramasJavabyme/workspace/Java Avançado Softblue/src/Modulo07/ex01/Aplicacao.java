package Modulo07.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Aplicacao {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Config c = new Config(new File("Arquivo.txt"));
		c.setProperty("nome", "Gilson");
		c.setProperty("Virgem?", true);
		
		System.out.println(c.getPropertyAsBoolean("Virgem?"));
		

	}

}
