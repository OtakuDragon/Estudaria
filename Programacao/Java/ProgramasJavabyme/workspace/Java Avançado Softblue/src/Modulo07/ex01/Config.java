package Modulo07.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Config  {
	
	File arquivo;
	Properties configs = new Properties();
	
	public Config(File arquivo) throws FileNotFoundException, IOException {
		
		this.arquivo = arquivo;
		
		if(arquivo.exists()){
			FileInputStream fis = new FileInputStream(arquivo);
			configs.load(fis);
			fis.close();
			
		}else{
			
			FileOutputStream fos = new FileOutputStream(arquivo);
			configs.store(fos,"Arquivo gerado automaticamente");
			fos.close();
			

			}
		
	}
	
	String getPropertyAsString(String name){
		if(configs.containsKey(name)){
			return	configs.getProperty(name);
		}
		return null;
	
		
	}
	Integer getPropertyAsInteger(String name){
		if(configs.containsKey(name)){
		return Integer.parseInt(configs.getProperty(name));
		}
		return null;
	}
	Boolean getPropertyAsBoolean(String name){
		if(configs.containsKey(name)){
		return Boolean.parseBoolean(configs.getProperty(name));
		}
		return null;
	}
	void setProperty(String name, String value) throws IOException{
		
		configs.setProperty(name, value);
		
		FileOutputStream fos = new FileOutputStream(arquivo);
		configs.store(fos,"Arquivo gerado automaticamente");
		fos.close();
		
		FileInputStream fis = new FileInputStream(arquivo);
		configs.load(fis);
		fis.close();
		
		
	}
	void setProperty(String name, Integer value) throws IOException{
		
		configs.setProperty(name, value.toString());
		
		FileOutputStream fos = new FileOutputStream(arquivo);
		configs.store(fos,"Arquivo gerado automaticamente");
		fos.close();
		
		FileInputStream fis = new FileInputStream(arquivo);
		configs.load(fis);
		fis.close();
	}
	void setProperty(String name, Double value) throws IOException{

		configs.setProperty(name, value.toString());
		
		FileOutputStream fos = new FileOutputStream(arquivo);
		configs.store(fos,"Arquivo gerado automaticamente");
		fos.close();
		
		FileInputStream fis = new FileInputStream(arquivo);
		configs.load(fis);
		fis.close();
	}
	void setProperty(String name, Boolean value) throws IOException{

		configs.setProperty(name, value.toString());
		
		FileOutputStream fos = new FileOutputStream(arquivo);
		configs.store(fos,"Arquivo gerado automaticamente");
		fos.close();
		
		FileInputStream fis = new FileInputStream(arquivo);
		configs.load(fis);
		fis.close();
	}
	

}
