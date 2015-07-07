package main.java.com.lisfrigo.hibernate.login.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import main.java.com.lisfrigo.hibernate.login.bean.*;

public class LoginDAO {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	//int dept, String user, String pass
	public void doLogin(){
		try{
			Login login=new Login();
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();
			
			
			
			
		}catch(HibernateException e){
			e.printStackTrace();
			
		}
	}


}
