
public abstract class Conteudo {
 protected static final double XP_PADRAO = 10d;
 
 private String titulo;
 private String descricao;
 
//Classe abstrata que devera ser implementada pelas filhas
//Que implementarem essa classe.
 public abstract double calcularXp();

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
} 
 
}
