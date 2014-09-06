import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;



public class Semaforo implements Runnable {
	
	private boolean aberto = false;
	private ReentrantLock l = new ReentrantLock();
	private Condition c = l.newCondition();

	@Override
	public void run() {
		while (true) {
			l.lock();
			try {
				aberto = !aberto;
				System.out.println("Semáforo aberto: " + aberto);
				
				if (aberto) {
					c.signalAll();
				}
			} finally {
				l.unlock();
			}
			
			try {
				Thread.sleep(1000 + (int)(Math.random() * 4000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void atravessar(int id) {
		l.lock();
		try {
			while (!aberto) {
				System.out.println("[Carro " + id + "] Aguardando");
				try {
					c.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("[Carro " + id + "] Atravessou");
		} finally {
			l.unlock();
		}
	}
}
