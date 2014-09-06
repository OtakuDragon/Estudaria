package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Servidor {

	/**
	 * @param args
	 * @throws IOException 
	 */
	static List<Socket> Clientes;
	static ExecutorService executor;
	
	public static void main(String[] args) throws IOException {
	
		//cria um servidor e uma lista de sockets
		final ServerSocket server = new ServerSocket(5000);
		ReentrantLock chave = new ReentrantLock();
		Clientes = new ArrayList<Socket>();
		executor = Executors.newFixedThreadPool(10);
		
		
		
		while(true){
			
		try{
		chave.lock();
		
		
		//espera a entrada de um cliente
		final Socket s = server.accept();
		
		
		OutputStream os = s.getOutputStream();
	
		//se ele nao existir na lista ele é adicionado
		if(! Clientes.contains(os)){
			
			Clientes.add(s);
			
		}
		//cria e executa uma thread que espera inputs do cliente
		//e envia este input para todos os sockets na lista
		executor.execute(new Runnable(){

			public void run() {
			while (true){
				Socket s1 = s;
				InputStream isThread = null;
				try {
					isThread = s1.getInputStream();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				String msg = null;
				BufferedReader in = new BufferedReader(new InputStreamReader(isThread));
				
				try {
					if (!s1.isClosed()){
					
					msg = in.readLine();
					
					if (msg==null){
						Clientes.remove(s1);
						
						
						return;
					}
					
					}
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				
				
				for (Socket sock : Clientes) {
					if (!sock.isClosed()){
						PrintStream out = null;
						try {
							out = new PrintStream(sock.getOutputStream());
						} catch (IOException e) {
							
							e.printStackTrace();
						}
						
						out.println(msg);	
						
						
					}else{Clientes.remove(sock);}
				}
				
				
				
				
				
				
				
				
			}
			
			
				
			}
			
		});
		
		
		
		}finally{chave.unlock();}
		
		
		
		
		}
	}

}
