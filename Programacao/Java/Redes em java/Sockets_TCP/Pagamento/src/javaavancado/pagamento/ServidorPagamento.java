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
		
		//o loop serve para que o servidor sempre aguarde novas requisições depois de atender um cliente
		while(true) {
			Socket clientSocket = null;
			
			try {
				System.out.println("Aguardando requisições...");
				clientSocket = serverSocket.accept();
				
				//constroi os objetos 'in' e 'out' para facilitar o manuseio dos dados
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				PrintStream out = new PrintStream(clientSocket.getOutputStream());
				
				//na primeira linha vem a operação que deve ser realizada
				String op = in.readLine();
				
				if(op.equals("PAGAMENTO")) {
					efetuarPagamento(in, out);
				} else {
					//implementar outras operações...
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
	 * Processa a operação de efetuar pagamentos
	 * @param in Entrada de dados do socket
	 * @param out Saída de dados do socket
	 */
	private void efetuarPagamento(BufferedReader in, PrintStream out) {
		//lê o número de pagamentos que serão efetuados
		int numPagtos;
		try {
			numPagtos = Integer.parseInt(in.readLine());
		} catch (IOException e) {
			out.println("FALHA " + e.getMessage());
			return;
		}
		
		//define um padrão para formatação da data
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
		
		//cada um dos pagamentos que são forncedidos pelo cliente é processado separadamente
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
				System.out.println("Número cartão: " + numeroCartao);
				System.out.println("Data validade cartão: " + dataValidadeCartao);
				System.out.println("Número parcelas: " + numParcelas);
				System.out.println("Valor compra: " + valorCompra);
				
				//processar o pagamento...
				System.out.println("Processando o pagamento...");
				//aqui deve ir o código de processamento do pagamento, irrelevante neste momento
				Thread.sleep(1000);
				
				//retorno da resposta ao cliente (status da operação)
				out.println("OK");
				
				System.out.println();
			} catch (Exception e) {
				//caso ocorra um erro, o status de falha é enviado ao cliente
				out.println("FALHA " + e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		//instancia o objeto do servidor e inicia
		new ServidorPagamento().iniciar();
	}
}
