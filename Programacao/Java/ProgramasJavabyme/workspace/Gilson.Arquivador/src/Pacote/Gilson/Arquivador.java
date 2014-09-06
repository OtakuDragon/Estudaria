package Pacote.Gilson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivador <E> {
	File c = null;
	


	public void setArquivo(URI endere�o,E Cole��o,String nomeDoArquivo) throws IOException{
		
		Path p =null;
		try{
		URL u = new URL(endere�o.toString() +"/"+ nomeDoArquivo +".ser");
		
		p = Paths.get(u.toURI());
		
		
		 c = new File(p.toAbsolutePath().toString());
		
		}catch(Exception e){
			
			
			Files.createFile(p.toAbsolutePath());
			
		}
		
		try (FileOutputStream fos = new FileOutputStream(c)){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(Cole��o);
			}catch(Exception e){e.printStackTrace();}
		} catch (Exception e) {
			e.printStackTrace();
		  }
	}
	
	
	public E getArquivo(URI endere�o,String nomeDoArquivo) throws MalformedURLException, URISyntaxException{
		
		E Cole��o = null;
		
         URL u = new URL(endere�o.toString()+"/" + nomeDoArquivo +".ser");
		
		Path p = Paths.get(u.toURI());
		
		
		 c = new File(p.toAbsolutePath().toString());
		
		try (FileInputStream fis = new FileInputStream(c)){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				Cole��o = (E) ois.readObject();
				
			}catch(Exception e){e.printStackTrace();}
		
		}catch(Exception e){e.printStackTrace();}
		
		return Cole��o;
		
	}
		
}


