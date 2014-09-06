import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPServer {

	public static void main(String[] args) throws Exception {
		
		//Cria um socket UDP na porta 3000
		DatagramSocket socket = new DatagramSocket(3000);
		
		//Buffer para armazenamento do conteúdo do datagrama
		byte[] buff = new byte[1024];
		
		//Aguarda o recebimento de um datagrama
		DatagramPacket dp = new DatagramPacket(buff, buff.length);
		socket.receive(dp);
		
		//Cria uma string com o conteúdo vindo do datagrama
		String dado = new String(dp.getData(), 0, dp.getLength());
		
		System.out.println(dado);
		
		//Fecha o socket
		socket.close();
	}
}
