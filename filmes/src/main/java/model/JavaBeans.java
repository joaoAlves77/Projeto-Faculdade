package model;

public class JavaBeans {
	private String id;
	private String nome;
	private String autor;
	private String descricao;
	
	public JavaBeans() {
		super();
	}
	
	public JavaBeans(String id, String nome, String autor, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.descricao = descricao;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
