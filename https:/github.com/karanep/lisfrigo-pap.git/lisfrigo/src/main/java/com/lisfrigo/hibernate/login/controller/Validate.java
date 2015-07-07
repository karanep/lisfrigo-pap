package main.java.com.lisfrigo.hibernate.login.controller;

import main.java.com.lisfrigo.hibernate.login.bean.Login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Validate {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private int m;

	public void check(int iddept, int user, String pass ) {
		final Login log;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		String hql="from Login WHERE  user=:user AND pass like=:pass";
		Query q=session.createQuery(hql);
		q.setInteger("user", user);
		q.setString("pass", pass);
		
		

	}
}
