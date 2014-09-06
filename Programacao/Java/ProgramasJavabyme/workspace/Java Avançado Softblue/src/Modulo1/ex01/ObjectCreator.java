package Modulo1.ex01;

import java.lang.reflect.Method;
@SuppressWarnings("unchecked")
public class ObjectCreator  {
	
	public static <T> T create(Class<T> clazz) throws Exception{
		
		Class<T> c = clazz;
		
		T obj = (T) c.newInstance();
		
		Method[] metodos = c.getDeclaredMethods();
		
		for (Method method : metodos) {
			Init ann = method.getAnnotation(Init.class);
			
			if(ann!= null && ann.runOnInstantiation()==true){
				
				 method.invoke(obj,  null);//para tirar este warning adicione um cast de null para um array object
				 							//(Object[]) null
				 

				
				
			}
			
		}
		
		return obj;
		
		
	}

}
