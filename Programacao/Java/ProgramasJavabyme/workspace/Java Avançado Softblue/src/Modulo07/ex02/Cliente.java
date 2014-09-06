package Modulo07.ex02;

import java.io.IOException;

public class Cliente {

	public static void main(String[] args) throws IOException {
		Bibliotecario papirus = new Bibliotecario();
		short id = 4;
		for(short i=1;i<=4;i++){
		papirus.pegarLivro(i);
		}
	}

}
