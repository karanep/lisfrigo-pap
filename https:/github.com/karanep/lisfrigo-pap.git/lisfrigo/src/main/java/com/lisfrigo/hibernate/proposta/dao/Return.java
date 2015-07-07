package main.java.com.lisfrigo.hibernate.proposta.dao;

import java.util.Date;

import main.java.com.lisfrigo.hibernate.cliente.bean.Cliente;
import main.java.com.lisfrigo.hibernate.funcionario.bean.Funcionario;
import main.java.com.lisfrigo.hibernate.produto.bean.Produto;
import main.java.com.lisfrigo.hibernate.proposta.bean.Proposta;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Return {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private Funcionario func;
	private Proposta p;
	private Cliente cliente;
	private Produto prod;
	private int i;
	private String s;
	private Date d;
	
	public void util() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}
	public Date data(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		p=(Proposta) session.get(Proposta.class, idP);
		this.d=p.getData();
		return d;
	}
	public String observacoes(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		p=(Proposta) session.get(Proposta.class, idP);
		this.s=p.getObservacoes();
		return s;
	}
	public String funcionario(int idP) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		p = (Proposta) session.get(Proposta.class, idP);
		this.i=p.getIdfunc();
		func=(Funcionario) session.get(Funcionario.class, i);
		this.s=func.getNome();
		return s;
	}
	public String cliente(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		p = (Proposta) session.get(Proposta.class, idP);
		this.i=p.getCliente();
		cliente=(Cliente) session.get(Cliente.class, idP);
		this.s=cliente.getNome();
		return s;
	}
	public String produto(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		p = (Proposta) session.get(Proposta.class, idP);
		prod=(Produto) session.get(Produto.class, idP);
		this.s=prod.getNome();
		return s;
	}
	

	

}
