import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Aplicacao {

	public static void main(String[] args) throws Exception {
		
		//Cria um pool de 2 threads
		ExecutorService e = Executors.newFixedThreadPool(2);
		
		//Cria a conta bancária
		ContaBancaria conta = new ContaBancaria();
		
		//Cria os clientes
		Cliente c1 = new Cliente(conta);
		Cliente c2 = new Cliente(conta);
		
		//Executa os clientes em threads separadas
		e.execute(c1);
		e.execute(c2);
		
		//Solicita a destruição das threads
		e.shutdown();
		
		//Enquanto as threads não terminarem de executar, aguarda num loop
		while (!e.isTerminated()) {
			Thread.sleep(1000);
		}
		
		//Se chegou aqui, é porque ambos os clientes terminaram
		
		//Obtém o saldo da conta
		double saldo = conta.getSaldo();
		
		System.out.println(saldo);
	}
}
