package Modulo04.exemploFutureTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Mom {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("Omg i can't believe my daughter's b-day is tomorrow");
		Thread.sleep(2000);
		System.out.println("wait... i can't remember how old she will become");
		Thread.sleep(2000);
		System.out.println("Omfg wich number will i put on the cake then?");
		Thread.sleep(2000);
		System.out.println("COOOOOOOOOusinnnnn come here");
		Thread.sleep(2000);
		System.out.println("Go on amanda's facebook and check how old she will become tomorrow please?");
		Thread.sleep(2000);
		System.out.println("really? you dont know? what kind of mother is you??");
		Thread.sleep(2000);
		System.out.println("STFU and go already");
		Thread.sleep(2000);
		System.out.println("okay,okay..");
		Thread.sleep(2000);
		
		ExecutorService e = Executors.newSingleThreadExecutor();
		FutureTask checkAge = new FutureTask(new Cousin());
		e.execute(checkAge);
		e.shutdown();
		
		while (!e.isTerminated()){
			
			System.out.println("wtf is taking him so long...");
			Thread.sleep(3000);
		}
		
		System.out.println("here here Aunt i got it");
		Thread.sleep(2000);
		System.out.println("Finally what is it?");
		Thread.sleep(2000);
		System.out.println("it's " + checkAge.get());
		Thread.sleep(2000);
		System.out.println("Nice thank you!");
		Thread.sleep(2000);
		

	}

}
