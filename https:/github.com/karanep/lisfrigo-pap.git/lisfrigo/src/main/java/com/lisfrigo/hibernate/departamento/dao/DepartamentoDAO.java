package main.java.com.lisfrigo.hibernate.departamento.dao;

import main.java.com.lisfrigo.hibernate.departamento.bean.Departamento;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DepartamentoDAO {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	public void addDept(String nome){
		try{
			Departamento dept=new Departamento();
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			dept.setNome(nome);
			session.save(dept);
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}
	}

}
