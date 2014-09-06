package testes;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Teste {
static String sucesso = null;
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/db";
		Connection conn = DriverManager.getConnection(url, "otakudragon", "1234");
		conn.close(); //troll
		//Cria o Arquivo.txt na pasta do projeto e escreve um texto nele 
		
		/*Path caminho = Paths.get("Arquivo.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		BufferedWriter w = Files.newBufferedWriter(caminho,utf8,StandardOpenOption.APPEND);
		w.write("Teste 1");
		w.flush();
		w.close();*/
		
		//Cria o Arquivo2.bin na pasta do projeto e escreve um texto nele 
		
		/*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Arquivo2.bin"));
		oos.writeObject("lalala");
		oos.close();*/
		
		//Recupera os recursos movidos manualmente para a 
		//pasta src do codigo por meio de stream
	
		//InputStream is1 = Teste.class.getResourceAsStream("/Arquivo.bin");
		//InputStream is2 = Teste.class.getResourceAsStream("/Arquivo2.bin");
		
		//Lê o Arquivo.txt
		
		/*Scanner s = new Scanner(is1);
		JOptionPane.showMessageDialog(null,s.nextLine());
		s.close();*/
		
		
		//Lê o arquivo serializado
		//ObjectInputStream ois = new ObjectInputStream(is2);
		//String la = (String) ois.readObject();
		//JOptionPane.showMessageDialog(null, la);
	}

}
