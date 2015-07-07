package main.java.com.lisfrigo.hibernate.distrito.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import main.java.com.lisfrigo.hibernate.cliente.bean.Cliente;
import main.java.com.lisfrigo.hibernate.distrito.bean.Distrito;

public class MostrarDistrito {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private Distrito d;
	private String a;
	private int b;
	public void util() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}
	public void mostraNome(){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		d = (Distrito) session.get(Distrito.class, 4);
		this.a=d.getNome();
		System.out.println(a);

	}
	
	
	

}
