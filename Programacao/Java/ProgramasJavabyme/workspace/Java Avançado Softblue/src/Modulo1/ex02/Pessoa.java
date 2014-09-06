package Modulo1.ex02;

import java.lang.reflect.InvocationTargetException;

public class Pessoa {
	String nome;
	
	public void setNome(String nome){
		this.nome=nome;
		
		
	}
	
	public String getNome(){
		return this.nome;
		
		
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Pessoa p =  new Pessoa();
		
		 Property.set(p, "nome","Gilson");
		
		System.out.println(p.nome);

		System.out.println(Property.get(p, "nome", String.class));
		
		
	}

}
