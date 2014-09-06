package Modulo08.ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CDDAO {
	Connection c;
	
	public CDDAO(Connection c){

		this.c = c;
	}
	void create(CD cd) throws SQLException{
		String sql = "INSERT INTO CD VALUES(?,?,?,?)";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1,cd.getId());
		stmt.setString(2,cd.getNome());
		stmt.setString(3,cd.getCategoria().getCategoria().toString());
		stmt.setString(4,cd.getConteudo());
		stmt.executeUpdate();
		stmt.close();	
		
	} 
	void delete(int id) throws SQLException{
		String sql = "DELETE FROM CD WHERE ID = "+id;
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.executeUpdate();
		stmt.close();
		
		
		
	} 
	void update(CD cd) throws SQLException{
		String sql = "UPDATE CD SET ID = "+cd.getId()+", NOME = \'"+cd.getNome() + "\', CATEGORIA = \'"+cd.getCategoria().getCategoria()+"\', CONTEUDO = \'"+cd.getConteudo()+"\' WHERE ID =" +cd.getId();
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.executeUpdate();
		stmt.close();
	
	}
	CD load(int id) throws SQLException{
		int idrs = 0;
		String nome = null;
		String categoria = null;
		String conteudo = null;
		Categoria c2 = null;
		String sql = "SELECT * FROM CD WHERE ID = "+id;
		PreparedStatement stmt = c.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()){
			idrs = rs.getInt("ID");
			nome = rs.getString("NOME");
			categoria = rs.getString("CATEGORIA");
			conteudo = rs.getString("CONTEUDO");
		}
		
		if(categoria.equals("S")){
			c2 = Categoria.SOFTWARE;
		}else if(categoria.equals("M")){
			c2 = Categoria.MUSICA;
		}else{ c2 = Categoria.BACKUP;}
		
		CD cd = new CD(idrs,nome,c2,conteudo);
		stmt.close();
		return cd;
		}
	
	List<CD> findCDsByCategoria(Categoria categoria) throws SQLException{
		String sql = "SELECT * FROM CD WHERE CATEGORIA = \'"+categoria.getCategoria()+"\'";
		PreparedStatement stmt = c.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		int idrs = 0;
		String nome = null;
		String categoria2 = null;
		String conteudo = null;
		List<CD> lista = new ArrayList<CD>();
		
		while (rs.next()){
			idrs = rs.getInt("ID");
			nome = rs.getString("NOME");
			categoria2 = rs.getString("CATEGORIA");
			conteudo = rs.getString("CONTEUDO");
			CD cd = new CD(idrs,nome,categoria,conteudo);
			lista.add(cd);
		}
		
		stmt.close();
		return lista;}

}
