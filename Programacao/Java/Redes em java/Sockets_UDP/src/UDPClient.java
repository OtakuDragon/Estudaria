import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPClient {

	public static void main(String[] args) throws Exception {
		
		//Cria um objeto que possibilta o envio de um datagrama (UDP n�o tem conex�o)
		DatagramSocket socket = new DatagramSocket();
		
		//Texto em bytes a ser enviado no datagrama
		String valor = "isto � um texto";
		byte[] bytes = valor.getBytes();
		
		//Local e porta onde est� o servidor UDP
		int porta = 3000;
		InetAddress addr = InetAddress.getLocalHost();
		
		//Cria o datagrama e envia para o servidor
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length, addr, porta);
		socket.send(dp);
		
		//Fecha o servidor
		socket.close();
	}
}
