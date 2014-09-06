package Modulo2.ex02;

public class ServiceFactory {

	public static <T extends Service> T newInstance(Class<T> clazz) throws InstantiationException, IllegalAccessException{
		Class c = clazz;
		T obj = (T) c.newInstance();
		return obj;
				
	} 

}
