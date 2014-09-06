package Modulo2.ex01;

public class Teste {

	
	public static void main(String[] args) {
		Map<Integer,String> m = new Map<Integer, String>();
		
		System.out.println(m.put(1, "Gilson"));
		System.out.println(m.put(1, "camila"));
		System.out.println(m.get(1));
		m.clear();
		System.out.println(m.put(1, "Gilson"));
		
		System.out.println(m.get(1));

	}

}
