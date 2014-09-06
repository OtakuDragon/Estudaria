import java.util.concurrent.atomic.AtomicInteger;


public class Gerador {

	/*
	 * O AtomicInteger permite realizar opera��es at�micas em um n�mero inteiro
	 */
	private static AtomicInteger seq = new AtomicInteger(0);
	
	public static int getNextSeq() {
		//retorna o resultado e depois faz o incremento
		return seq.getAndIncrement();
	}
}
