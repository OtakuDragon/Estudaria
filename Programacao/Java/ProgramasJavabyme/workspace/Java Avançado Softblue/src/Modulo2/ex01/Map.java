package Modulo2.ex01;

import java.util.ArrayList;
import java.util.List;

public class Map<C,V> {
	private List<C> arrayChaves = new ArrayList<C>();
	private List<V> arrayValores = new ArrayList<V>();
	
public boolean put(C chave, V valor){
		
	boolean retorno = false;
	int index=0;
	 if(arrayChaves.contains(chave)){
		    arrayChaves.add(index, chave);
			arrayValores.add(index,valor);
			index++;
			retorno = false;
			
		}else{
			arrayChaves.add(index, chave);
			arrayValores.add(index,valor);
			index++;
			retorno = true;
			
		}
	 
		return retorno;
	
	
  }


public V get(C chave){

	
	 if(arrayChaves.contains(chave)){
			return  arrayValores.get(arrayChaves.indexOf(chave));
			
		}else{return null;}
		
}



public void clear(){
	
	arrayChaves.removeAll(arrayChaves);
	arrayValores.removeAll(arrayValores);
	
	
	
}












}
