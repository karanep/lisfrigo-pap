package main.java.com.lisfrigo.hibernate.cliente.dao;

import main.java.com.lisfrigo.hibernate.cliente.bean.Cliente;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Delete {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	public void util() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}

	public void delete(int id) {
		util();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Cliente cliente = (Cliente) session.get(Cliente.class, id);
		session.delete(cliente);
		tx.commit();
	}

}
