package main.java.com.lisfrigo.hibernate.entrega.dao;

import main.java.com.lisfrigo.hibernate.cliente.bean.Cliente;
import main.java.com.lisfrigo.hibernate.proposta.bean.Proposta;
import main.java.com.lisfrigo.hibernate.transportador.bean.Transportador;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Return {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private Transportador trans;
	private Cliente cliente;
	private Proposta props;
	private String a;
	private int b;
	private Proposta p;

	public void util() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}
	
	public String trans(int idT){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		trans=(Transportador) session.get(Transportador.class, idT);
		this.a=trans.getNome();
		return a;
	}
	
	public String cliente(int idC){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		cliente=(Cliente) session.get(Cliente.class, idC);
		this.a=cliente.getNome();
		return a;
	}
	public int props(int idprops){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		p=(Proposta) session.get(Proposta.class, idprops);
		this.b=p.getIdproposta();
		return b;
	}

}
