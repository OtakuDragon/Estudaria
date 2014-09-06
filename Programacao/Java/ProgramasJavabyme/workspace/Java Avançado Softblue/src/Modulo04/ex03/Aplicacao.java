package Modulo04.ex03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Aplicacao {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		int numeroProdutores = 2;
		int numeroConsumidores = 1;
		
		
		ExecutorService c = Executors.newFixedThreadPool(numeroProdutores + numeroConsumidores );
		
		Consumidor c1 = new Consumidor();
		FutureTask a = new FutureTask(c1);
		
		c.execute(a);
		
		for(int i=0;i<numeroConsumidores;i++){
			
			
			c.execute(new Produtor());
			
		}
		
		c.shutdown();
		
	//	System.out.println(a.get());

	}

}
