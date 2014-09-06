import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Aplicacao {

	public static void main(String[] args) throws Exception {
		
		listarAtributosEMetodos();
		invocarMetodo();
	}

	private static void listarAtributosEMetodos() {
		Class<Televisao> c = Televisao.class;
		
		/* Atributos */
		Field[] fields = c.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f.getName() + " => " + f.getType());
		}
		
		/* M�todos */
		Method[] methods = c.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}
	}
	
	private static void invocarMetodo() throws Exception {
		
		Class<Televisao> c = Televisao.class;
		
		//Objeto onde o m�todo ser� invocado
		Televisao tv = new Televisao();
		
		//Recebe uma refer�ncia para o m�todo
		Method m = c.getMethod("ligar", null);
		
		//Invoca o m�todo
		m.invoke(tv, null);
	}
}
