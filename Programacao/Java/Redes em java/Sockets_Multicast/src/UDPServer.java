import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;


public class UDPServer {

	public static void main(String[] args) throws Exception {
		
		//Cria um socket UDP na porta 3000 que pode ser utilizado para multicasting
		MulticastSocket socket = new MulticastSocket(3000);
		
		//Junta o socket ao grupo 228.5.6.7
		socket.joinGroup(InetAddress.getByName("228.5.6.7"));
		
		//Buffer para armazenamento do conteúdo do datagrama
		byte[] buff = new byte[1024];
		
		//Aguarda o recebimento de um datagrama
		DatagramPacket dp = new DatagramPacket(buff, buff.length);
		socket.receive(dp);
		
		//Cria uma string com o conteúdo vindo do datagrama
		String dado = new String(dp.getData(), 0, dp.getLength());
		
		System.out.println(dado);
		
		//Sai do grupo
		socket.leaveGroup(InetAddress.getByName("228.5.6.7"));
		
		//Fecha o socket
		socket.close();
	}
}
