package Modulo04.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Corrida {
	
	public static int distancia = 300;
	private boolean acabou = false;
	static int participantes = 10;
	public static List<Sapo> ranking = new ArrayList<Sapo>();
	
	public void setAcabou(boolean acabou) {
		this.acabou = acabou;
	}
	public boolean isAcabou() {
		return acabou;
	}
	
	public int getDistancia() {
		return distancia;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Corrida maratona = new Corrida();
		
		ExecutorService e = Executors.newFixedThreadPool(participantes);
		
		for(int i=0;i< participantes;i++){
			e.execute(new Sapo("sapo" + i,maratona));
			
		}
		
		
		e.shutdown();
		while(!e.isTerminated()){
			Thread.sleep(2000);
			
			
		}
		
		
		
		System.out.println("###Ranking### \n\n");
		
		for ( Sapo s : ranking) {
			System.out.println("#" + s.posiçao +" " + s.nome );
			
		}

	}

}
