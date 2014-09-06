package Modulo08.ex01;

public enum Categoria {
	SOFTWARE('S'),
	MUSICA('M'),
	BACKUP('B');

private char categoria;
	
	private Categoria(char c) {
		this.categoria = c;
	}

Character getCategoria(){
	return categoria;
}
}
