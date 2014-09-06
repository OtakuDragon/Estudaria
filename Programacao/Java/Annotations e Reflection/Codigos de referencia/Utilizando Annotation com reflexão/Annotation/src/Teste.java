
public class Teste {

	@Executar(arg = "abc")
	public void m1(String s) {
		System.out.println("m1 chamado: " + s);
	}
	
	public void m2(String s) {
		System.out.println("m2 chamado: " + s);
	}
	
	@Executar(arg = "def")
	public void m3(String s) {
		System.out.println("m3 chamado: " + s);
	}
}
