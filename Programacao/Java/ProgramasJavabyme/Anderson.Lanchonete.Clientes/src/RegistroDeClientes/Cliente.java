package RegistroDeClientes;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Cliente implements Serializable {
	public String nome;
	public String endereço;
	public String telefone;
	
	public Cliente(String nome,String endereço,String telefone){
		this.nome = nome;
		this.endereço = endereço;
		this.telefone= telefone;
	}

}
