package arvores;

import java.util.ArrayList;

public class No {
	
	static ArrayList<No> tree = new ArrayList<No>();
	
	public static void setRaiz(String valor){
	
		tree.add(new No(valor));
		tree.get(0).dir = null;
		tree.get(0).esq = null;
		
	}
	
	public static void addNo(String valor){
		if(!tree.isEmpty()){
			tree.add(new No(valor));
			
			
			
		}
		
	}
	
	No(String valor){
		this.valor = valor;
		
	}
	
	
	String valor;
	No esq,dir;
	

}


