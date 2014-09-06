import java.lang.reflect.Method;


public class Aplicacao {

	public static void main(String[] args) throws Exception {
		Teste t = new Teste();
		executar(t);
	}

	private static void executar(Object o) throws Exception {
	
		Class c = o.getClass();
		
		Method[] methods = c.getDeclaredMethods();
		
		for (Method m : methods) {
			Executar e = m.getAnnotation(Executar.class);
			
			if (e != null) {
				m.invoke(o, e.arg());
			}
		}
	}
}
