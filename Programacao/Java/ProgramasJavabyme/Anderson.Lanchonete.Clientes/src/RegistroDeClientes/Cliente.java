package RegistroDeClientes;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Cliente implements Serializable {
	public String nome;
	public String endere�o;
	public String telefone;
	
	public Cliente(String nome,String endere�o,String telefone){
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone= telefone;
	}

}
