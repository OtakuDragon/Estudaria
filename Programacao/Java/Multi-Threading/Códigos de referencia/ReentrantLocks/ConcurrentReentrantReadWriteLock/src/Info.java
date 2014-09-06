import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Info {

	private String info = "AAAAAAAAAA";
	private Random random = new Random();
	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	private Lock rl = rwl.readLock();
	private Lock wl = rwl.writeLock();
	
	public String getInfo() {
		rl.lock();
		try {
			return info;
		} finally {
			rl.unlock();
		}
	}
	
	public void setInfo() {
		wl.lock();
		try {
			info = "";
			
			for (int i = 0; i < 10; i++) {
				char c = (char) (random.nextInt(26) + 65);
				info += c;
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} finally {
			wl.unlock();
		}
	}
}
