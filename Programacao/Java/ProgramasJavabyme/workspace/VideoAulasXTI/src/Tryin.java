import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Tryin {


	public static void main(String[] args) throws IOException {
		Path caminho = Paths.get("D:/Users/Gilson/Desktop/Texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;
	try(BufferedWriter w = Files.newBufferedWriter(caminho, utf8)){
		w.write("Escreva isso");
		
		
		
	}catch(IOException e){
		e.getMessage();
	}
	
	BufferedWriter w = Files.newBufferedWriter(caminho, utf8);
	try{
		w.write("Escreva isso");
		w.flush();
		
		
		
	}catch(IOException e){
		e.getMessage();
	}finally{w.close();}
		
		
	}
}
