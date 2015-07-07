package main.java.com.lisfrigo.hibernate.entrega.bean;

import java.util.Date;

public class Entrega {
	private int identrega, idtrans, idcliente, idprops;
	private String data;

	public int getIdentrega() {
		return identrega;
	}

	public void setIdentrega(int identrega) {
		this.identrega = identrega;
	}

	public int getIdtrans() {
		return idtrans;
	}

	public void setIdtrans(int idtrans) {
		this.idtrans = idtrans;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getIdprops() {
		return idprops;
	}

	public void setIdprops(int idprops) {
		this.idprops = idprops;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
