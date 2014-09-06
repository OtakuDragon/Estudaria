package javaavancado.pagamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Servidor que recebe pagamentos
 */
public class ServidorPagamento {
	
	/**
	 * Inicia o servidor
	 * @throws Exception
	 */
	public void iniciar() throws Exception {
		//o servidor escuta na porta 1000
		ServerSocket serverSocket = new ServerSocket(1000);
		
		//o loop serve para que o servidor sempre aguarde novas requisi��es depois de atender um cliente
		while(true) {
			Socket clientSocket = null;
			
			try {
				System.out.println("Aguardando requisi��es...");
				clientSocket = serverSocket.accept();
				
				//constroi os objetos 'in' e 'out' para facilitar o manuseio dos dados
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				PrintStream out = new PrintStream(clientSocket.getOutputStream());
				
				//na primeira linha vem a opera��o que deve ser realizada
				String op = in.readLine();
				
				if(op.equals("PAGAMENTO")) {
					efetuarPagamento(in, out);
				} else {
					//implementar outras opera��es...
				}
			
			} finally {
				//fecha o socket
				if (clientSocket != null) {
					clientSocket.close();
				}
			}
		}
	}
	
	/**
	 * Processa a opera��o de efetuar pagamentos
	 * @param in Entrada de dados do socket
	 * @param out Sa�da de dados do socket
	 */
	private void efetuarPagamento(BufferedReader in, PrintStream out) {
		//l� o n�mero de pagamentos que ser�o efetuados
		int numPagtos;
		try {
			numPagtos = Integer.parseInt(in.readLine());
		} catch (IOException e) {
			out.println("FALHA " + e.getMessage());
			return;
		}
		
		//define um padr�o para formata��o da data
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
		
		//cada um dos pagamentos que s�o forncedidos pelo cliente � processado separadamente
		for (int i = 0; i < numPagtos; i++) {
			try {
				//retorna os dados do pagamento separados por ';' e quebra em um array
				String dados = in.readLine();
				String[] tokens = dados.split(";");
				
				//extrai os dados do array de tokens
				String nomeCliente = tokens[0];
				String numeroCartao = tokens[1];
				Date dataValidadeCartao = sdf.parse(tokens[2]);
				int numParcelas = Integer.parseInt(tokens[3]);
				double valorCompra = Double.parseDouble(tokens[4]);
				
				//imprime os dados do pagamento
				System.out.println("Pagamento " + (i + 1) + ":");
				System.out.println("Nome cliente: " + nomeCliente);
				System.out.println("N�mero cart�o: " + numeroCartao);
				System.out.println("Data validade cart�o: " + dataValidadeCartao);
				System.out.println("N�mero parcelas: " + numParcelas);
				System.out.println("Valor compra: " + valorCompra);
				
				//processar o pagamento...
				System.out.println("Processando o pagamento...");
				//aqui deve ir o c�digo de processamento do pagamento, irrelevante neste momento
				Thread.sleep(1000);
				
				//retorno da resposta ao cliente (status da opera��o)
				out.println("OK");
				
				System.out.println();
			} catch (Exception e) {
				//caso ocorra um erro, o status de falha � enviado ao cliente
				out.println("FALHA " + e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		//instancia o objeto do servidor e inicia
		new ServidorPagamento().iniciar();
	}
}
