package Modulo08.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/db";
		Connection conn = DriverManager.getConnection(url, "otakudragon", "1234");
		CDDAO obj = new CDDAO(conn);
		
		
		//obj.create(new CD(2,"Calipso2",Categoria.MUSICA,"dança do calipso 2"));
		//obj.update(new CD(1,"Metalica",Categoria.MUSICA,"rock"));
		//obj.delete(1);
		//CD cd = obj.load(1);
		List<CD> lista = obj.findCDsByCategoria(Categoria.MUSICA);
		
		CD cd1 = lista.get(0);
		System.out.println(cd1.getNome());
		CD cd2 = lista.get(1);
		System.out.println(cd2.getNome());
		
		
		conn.close();
	}

}
