package Modulo1.ex02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Property  {
	
	public static <T> void set(Object obj, String nomeDoSetter,T param) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		
		Class<?> c = obj.getClass();
		 
		char d = Character.toUpperCase(nomeDoSetter.charAt(0));
		String nomeDoSetter2 = nomeDoSetter.replace(nomeDoSetter.charAt(0), d);
		
		Method metodo = c.getMethod("set"+nomeDoSetter2, param.getClass());
		metodo.invoke(obj, param);
		
		
		
	}
	
	public static <T> T get(Object obj,String nomeDoGetter, Class<T> retorno) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		char d = Character.toUpperCase(nomeDoGetter.charAt(0));
		String nomeDoGetter2 = nomeDoGetter.replace(nomeDoGetter.charAt(0), d);
		
		Class c = obj.getClass();
		Method[] a = c.getDeclaredMethods();
		
	
		
		Method metodo = c.getMethod("get" + nomeDoGetter2, null);
		return (T) metodo.invoke(obj, null);
		
		
		
		
	}

}
