package Modulo08.ex01;

public class CD {

	private int id;
	private String nome;
	private Categoria categoria;
	private String conteudo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CD(int id, String nome, Categoria categoria, String conteudo) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.conteudo = conteudo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
