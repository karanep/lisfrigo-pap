package main.java.com.lisfrigo.hibernate.departamento.dao;

import main.java.com.lisfrigo.hibernate.departamento.bean.Departamento;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Return {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private String res;
	private int resint;
	private Departamento d;

	private void util() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}
	public int iddept(int idD){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		d=(Departamento) session.get(Departamento.class, idD);
		this.resint=d.getIddep();
		return resint;
	}
	public String nome(int idD){
		util();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		d=(Departamento) session.get(Departamento.class, idD);
		this.res=d.getNome();
		return res;
	}
	

}
