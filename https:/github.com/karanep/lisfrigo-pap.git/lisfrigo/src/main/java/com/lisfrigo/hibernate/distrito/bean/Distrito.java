package main.java.com.lisfrigo.hibernate.distrito.bean;

public class Distrito {
	private int iddistrito;
	private String nome;
	private Distrito distrito;
	public Distrito(){}
	

	public Distrito getDistrito() {
		return distrito;
	}


	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}


	public int getIddistrito() {
		return iddistrito;
	}

	public void setIddistrito(int iddistrito) {
		this.iddistrito = iddistrito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
