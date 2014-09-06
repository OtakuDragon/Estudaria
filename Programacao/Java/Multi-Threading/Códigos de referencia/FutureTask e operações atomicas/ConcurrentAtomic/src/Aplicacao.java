
public class Aplicacao {

	public static void main(String[] args) throws Exception {
	
		for(int i = 0; i < 10; i++) {
			int seq = Gerador.getNextSeq();
			System.out.println(seq);
		}
	}
}
