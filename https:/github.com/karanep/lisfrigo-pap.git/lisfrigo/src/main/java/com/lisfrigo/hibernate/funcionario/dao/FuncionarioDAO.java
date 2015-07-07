package main.java.com.lisfrigo.hibernate.funcionario.dao;

import main.java.com.lisfrigo.hibernate.funcionario.bean.Funcionario;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class FuncionarioDAO {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	public void addFuncionario(String nome, int iddepartamento) {
		try {
			Funcionario func = new Funcionario();
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			func.setNome(nome);
			func.setIddepartamento(iddepartamento);
			session.save(func);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
