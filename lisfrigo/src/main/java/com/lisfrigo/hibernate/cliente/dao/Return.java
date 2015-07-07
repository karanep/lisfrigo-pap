package main.java.com.lisfrigo.hibernate.cliente.dao;

import java.util.Iterator;
import java.util.List;

import main.java.com.lisfrigo.hibernate.cliente.bean.Cliente;
import main.java.com.lisfrigo.hibernate.distrito.bean.Distrito;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Return {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private Cliente c;
	private String resultado;
	private int resint;
	private Distrito d;

	public void util() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}

	public String retrieveNome(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		c = (Cliente) session.get(Cliente.class, idC);
		this.resultado = c.getNome();
		return resultado;
	}

	public String returnMorada(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		c = (Cliente) session.get(Cliente.class, idC);
		this.resultado = c.getMorada();
		return resultado;
	}

	public String codpos(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		c = (Cliente) session.get(Cliente.class, idC);
		this.resultado = c.getCod_postal();
		return resultado;
	}

	public String localidade(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		c = (Cliente) session.get(Cliente.class, idC);
		this.resultado = c.getLocalidade();
		return resultado;
	}

	public String telefone(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		c = (Cliente) session.get(Cliente.class, idC);
		this.resultado = c.getTelefone();
		return resultado;
	}

	public String fax(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		c = (Cliente) session.get(Cliente.class, idC);
		this.resultado = c.getFax();
		return resultado;
	}

	public String observacoes(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		c = (Cliente) session.get(Cliente.class, idC);
		this.resultado = c.getObservacoes();
		return resultado;
	}

	public void tipoCliente(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		c=(Cliente) session.get(Cliente.class, idC);
		
	}

	public String email(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		c = (Cliente) session.get(Cliente.class, idC);
		this.resultado = c.getObservacoes();
		return resultado;
	}

	public String concelho(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		c = (Cliente) session.get(Cliente.class, idC);
		this.resultado = c.getConcelho();
		return resultado;
	}

	public String distrito(int idC) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		c = (Cliente) session.get(Cliente.class, idC);
		this.resint = c.getDistrito();
		d=(Distrito) session.get(Distrito.class, resint);
		this.resultado=d.getNome();
		return resultado;
	}
	
}
