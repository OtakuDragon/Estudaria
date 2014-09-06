

public class Escritor implements Runnable {

	private Info info;

	public Escritor(Info config) {
		this.info = config;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			info.setInfo();
		}
	}
}
