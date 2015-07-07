package main.java.com.lisfrigo.hibernate.transportador.bean;

public class Transportador {
	private int id;
	private String nome;
	private String armazem;
	
	public Transportador(){}

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

	public String getArmazem() {
		return armazem;
	}

	public void setArmazem(String armazem) {
		this.armazem = armazem;
	}
	
	

}
