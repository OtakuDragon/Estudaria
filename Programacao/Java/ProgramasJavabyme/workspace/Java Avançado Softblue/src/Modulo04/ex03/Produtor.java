package Modulo04.ex03;

import java.util.Random;

public class Produtor implements Runnable {

	Random r = new Random(100);
	public static boolean vazio;
	@Override
	public void run() {
		Buffer.setDado(r.nextInt()+1);
		System.out.println("O Valor foi produzido");
		Buffer.vazio=false;
		Buffer.c.signalAll();
		
		
	}
}
