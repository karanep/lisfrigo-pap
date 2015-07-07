package main.java.com.lisfrigo.hibernate.transportador.dao;

import main.java.com.lisfrigo.hibernate.transportador.bean.Transportador;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Return {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private Transportador t;
	private String resultado;

	public void util() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}
	public String nome(int idT){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		t=(Transportador) session.get(Transportador.class, idT);
		this.resultado=t.getNome();
		return resultado;
	}

}
