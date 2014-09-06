import java.util.concurrent.locks.ReentrantLock;


/*
 * Conta bancária
 */
public class ContaBancaria {

	private double saldo;
	
	/*
	 * O objetivo do lock é permitir que apenas um cliente saque ou deposite de cada vez, evitando
	 * o problema da concorrência no acesso ao atributo 'saldo'
	 */
	private ReentrantLock l = new ReentrantLock();

	/*
	 * Deposita um valor na conta
	 */
	public void depositar(double valor) {
		l.lock();
		try {
			saldo += valor;
		} finally {
			l.unlock();
		}
	}
	
	/*
	 * Saca uma valor da conta
	 */
	public void sacar(double valor) {
		l.lock();
		try {
			saldo -= valor;
		} finally {
			l.unlock();
		}
	}

	public double getSaldo() {
		return saldo;
	}
}
