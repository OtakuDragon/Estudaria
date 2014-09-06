package javaavancado.pagamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class Cliente {

	public static void main(String[] args) throws IOException {
		
		//conecta em um socket na porta 1000 do localhost
		Socket socket = new Socket("localhost", 1000);
		
		//constroi os objetos 'in' e 'out' para facilitar a manipula��o dos dados
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream out = new PrintStream(socket.getOutputStream());
		
		System.out.println("Enviando dados do pagamento ao servidor...");
		
		//come�a enviando o nome da opera��o
		out.println("PAGAMENTO");
		
		//envia o n�mero de pagamentos
		out.println(1);
		
		//envia os dados necess�rios, separados por ';'
		out.println("Jo�o da Silva;345623456789543210;10/2012;2;512.45");
		
		//aguarda at� que o servidor envie um status da transa��o
		System.out.println("Aguardando retorno do status da opera��o...");
		String status = in.readLine();

		if(status.equals("OK")) {
			//o status foi OK
			System.out.println("Pagamentos realizados com sucesso!");
		} else {
			//os pagamentos falharam
			System.out.println("Falha nos pagamentos: " + status);
		}
		
		//fecha o socket
		socket.close();
	}
}
