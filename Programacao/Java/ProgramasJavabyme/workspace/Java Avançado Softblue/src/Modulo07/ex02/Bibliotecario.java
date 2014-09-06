package Modulo07.ex02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Bibliotecario {
	
	RandomAccessFile raf;
	short NUM_REGISTROS;
	short ID_1;
	int POS_REGISTRO;
	public Bibliotecario() throws IOException {
		raf = new RandomAccessFile("biblioteca.bin","r");
		NUM_REGISTROS = raf.readShort();
		//primeiro ID = 1
		//primeiro POS_registro = 1024
		ID_1 = raf.readShort();
		POS_REGISTRO = raf.readInt();
	}
	
	public void pegarLivro(short ID) throws IOException{

		if (ID<=NUM_REGISTROS){
			int bytes = 2;
			
			if (ID != 1){
				
				for (int i = 1;i<ID;i++){
					bytes+= 6;
				}
			
			
			}
			
			raf.seek(bytes);
	
			short achadoID = raf.readShort();
			int POS_Registro = raf.readInt();
			
			
			raf.seek(POS_Registro);
			short achadoIDsegundo = raf.readShort();
			short TAM_NOME = raf.readShort();
			char[] NOME = new char[TAM_NOME]; 
			for(int i=0;i<TAM_NOME;i++){
			NOME[i] = raf.readChar();
			}
			String nome = new String(NOME);
			int NUM_PAGINAS =raf.readInt();
			
			System.out.println("ID: "+achadoIDsegundo+" Nome: "+nome+" Paginas: "+NUM_PAGINAS);
			
			
		}else{System.out.println("livro nao cadastrado");}
		
	}

}
