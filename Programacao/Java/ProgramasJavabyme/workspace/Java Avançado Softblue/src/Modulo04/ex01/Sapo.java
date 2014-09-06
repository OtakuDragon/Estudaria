package Modulo04.ex01;

import java.util.Random;

public class Sapo  implements Runnable  {

	private Corrida c;
	String nome;
	int distancia =Corrida.distancia;
	int posiçao;

	Random r = new Random();
	
	public Sapo(String nome,Corrida c) {
		this.c = c;
		this.nome = nome;
		
	}
	
		
	@Override
	public void run() {
		
		while (!c.isAcabou()){
		 try {
		 	pular();
		 	descansar();
			
	    	} catch (Exception e) {
			
			e.printStackTrace();
		 }
		
		}
		
	}
	
	public void pular(){
		
		
		int pulo =r.nextInt(5) + 1;
		distancia -= pulo ;
		
		System.out.println("O sapo "+ nome + " Pulou " + pulo + " metros" );
		if (distancia<=0){
			
			if(!Corrida.ranking.contains(this)){
			Corrida.ranking.add(this);
			posiçao = Corrida.ranking.indexOf(this) + 1;
		}
		}
		if(Corrida.ranking.size() == Corrida.participantes){
			c.setAcabou(true);
			
		}
	}
	
	
	public void descansar() throws Exception{
		int descanso = (r.nextInt(3) + 1)*1000;
		Thread.sleep(descanso);
		
		System.out.println("O sapo "+ nome + " descansou " + descanso/1000 + " segundos" );
		
	}
}
