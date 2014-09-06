
public class Cliente implements Runnable {

	private ContaBancaria conta;
	
	public Cliente(ContaBancaria conta) {
		this.conta = conta;
	}
	
	@Override
	public void run() {
		//O cliente deposita e saca 100, e faz isso 10 vezes
		try {
			for (int i = 0; i < 10; i++) {
				conta.depositar(100);
				Thread.sleep(100);
				conta.sacar(100);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
