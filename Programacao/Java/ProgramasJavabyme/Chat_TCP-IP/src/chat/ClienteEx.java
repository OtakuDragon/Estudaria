package chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteEx {

	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("25.231.250.126",5000);
		
		PrintStream out = new PrintStream(s.getOutputStream());
		
		out.println("Teste");
		out.close();
		s.close();
		

	}

}
