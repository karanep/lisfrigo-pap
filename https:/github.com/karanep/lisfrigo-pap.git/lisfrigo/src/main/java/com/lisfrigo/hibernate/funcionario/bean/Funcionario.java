package main.java.com.lisfrigo.hibernate.funcionario.bean;

public class Funcionario {
	private int idFunc;
	private String nome;
	private int iddepartamento;
	
	public Funcionario(){}

	public int getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}
	

}
