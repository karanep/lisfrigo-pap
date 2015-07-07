package main.java.com.lisfrigo.hibernate.proposta.bean;

import java.util.Date;

public class Proposta {
	private Date data;
	private int idproposta, idfunc, cliente, status, prod;
	private String observacoes;
	private double preco;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdproposta() {
		return idproposta;
	}

	public void setIdproposta(int idproposta) {
		this.idproposta = idproposta;
	}

	public int getIdfunc() {
		return idfunc;
	}

	public void setIdfunc(int idfunc) {
		this.idfunc = idfunc;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getProd() {
		return prod;
	}

	public void setProd(int prod) {
		this.prod = prod;
	}

}
