package Modulo04.ex03;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Consumidor implements Callable<Integer> {
	
	

	@Override
	public Integer call() throws Exception {
	
	
     while(Buffer.vazio){
    	 Buffer.d.await();
    	 
     }
     
     Buffer.setDado(0);
     System.out.println("O Valor foi consumido");
	return Buffer.getDado();
    
		
		
		
		
	}
}
