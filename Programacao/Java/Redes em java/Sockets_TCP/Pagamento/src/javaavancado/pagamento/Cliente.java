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
		
		//constroi os objetos 'in' e 'out' para facilitar a manipulação dos dados
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream out = new PrintStream(socket.getOutputStream());
		
		System.out.println("Enviando dados do pagamento ao servidor...");
		
		//começa enviando o nome da operação
		out.println("PAGAMENTO");
		
		//envia o número de pagamentos
		out.println(1);
		
		//envia os dados necessários, separados por ';'
		out.println("João da Silva;345623456789543210;10/2012;2;512.45");
		
		//aguarda até que o servidor envie um status da transação
		System.out.println("Aguardando retorno do status da operação...");
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
