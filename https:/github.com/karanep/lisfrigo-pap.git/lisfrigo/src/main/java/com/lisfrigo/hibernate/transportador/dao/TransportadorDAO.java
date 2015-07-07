package main.java.com.lisfrigo.hibernate.transportador.dao;

import main.java.com.lisfrigo.hibernate.transportador.bean.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class TransportadorDAO {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	public void addTransportador(String nome, String armazem) {
		try {
			Transportador trans = new Transportador();
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			trans.setNome(nome);
			trans.setArmazem(armazem);
			session.save(trans);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
