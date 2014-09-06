
public class Aplicacao {

	public static void main(String[] args) {
		
		System.out.println("Parâmetros de linha de comando: " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + " => " + args[i]);
		}
	}
}
