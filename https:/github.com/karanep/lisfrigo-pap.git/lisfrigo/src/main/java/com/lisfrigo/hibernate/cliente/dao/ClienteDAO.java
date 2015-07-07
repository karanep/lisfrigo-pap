package main.java.com.lisfrigo.hibernate.cliente.dao;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import main.java.com.lisfrigo.hibernate.cliente.bean.*;

public class ClienteDAO {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	public void addCliente(String nome, String morada, String cod_postal,
			String localidade, String concelho, int distrito, String telefone, String fax,
			String email, String observacoes) {
		try {
			Cliente cliente = new Cliente();
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			cliente.setNome(nome);
			cliente.setMorada(morada);
			cliente.setCod_postal(cod_postal);
			cliente.setLocalidade(localidade);
			cliente.setDistrito(distrito);
			cliente.setTelefone(telefone);
			cliente.setFax(fax);
			cliente.setEmail(email);
			cliente.setObservacoes(observacoes);
			cliente.setConcelho(concelho);
			session.save(cliente);
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

}