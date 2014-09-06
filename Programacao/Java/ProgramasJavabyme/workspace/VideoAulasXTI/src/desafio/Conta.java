package desafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Conta {	
	
	private String cliente;
	private double saldo;
	
	public Conta(String cliente, double saldo){
		setCliente(cliente);
		setSaldo(saldo);
		
		
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setSaldo(double saldo) {//deposita
		this.saldo += saldo;
	}
	
	public void saca(double saldo) {
		this.saldo -= saldo;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void transferePara(Conta destino, double valor){
		destino.saldo += valor;
		this.saldo -= valor;
		
		
	}
	
	public static void setListaDeContas(Conta[] contas){
	
		Path path = Paths.get("D:/Users/Gilson/Desktop/Contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		int cont;
		
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
			
			for(cont=0; cont<contas.length;cont++){
			w.write(cont+" = " + contas[cont].getCliente()+"=" 
					+ "\t" + contas[cont].getSaldo()+"="+"=="+ "\n"	);
			
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static Conta[] getListaDeContas(){
		
		Path path = Paths.get("D:/Users/Gilson/Desktop/Contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		int cont=0;
		String linha = null;
		String text = " ";
		Conta[] retorno = new Conta[3];
		try(BufferedReader r = Files.newBufferedReader(path, utf8)){
			
		

			while((linha = r.readLine())!= null){
				String[] splitData = linha.split("=");
				retorno[cont] = new Conta(splitData[1],Double.parseDouble(splitData[2]));
				cont++;
				/*text = text + linha;*/
				}



				

				
			
			
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		/*String[] splitContas = text.split("==");
		String[] splitData = splitContas[0].split("=");
		String[] splitData1= splitContas[1].split("=");
		String[] splitData2= splitContas[2].split("=");
		
		Conta[] retorno = new Conta[3];
		
		retorno[0] = new Conta(splitData[1],Double.parseDouble(splitData[2]));
		retorno[1] = new Conta(splitData1[1],Double.parseDouble(splitData[2]));
		retorno[2] = new Conta(splitData2[1],Double.parseDouble(splitData[2]));
		*/
		return retorno;
	} 
	
	

	

}
