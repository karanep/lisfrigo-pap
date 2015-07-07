package main.java.com.lisfrigo.hibernate.entrega.dao;


import main.java.com.lisfrigo.hibernate.entrega.bean.Entrega;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class EntregaDAO {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	
	public void addEntr(int idtrans, int idcliente, int idprops, String data ){
		try{
		Entrega entrega=new Entrega();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		entrega.setData(data);
		entrega.setIdcliente(idcliente);
		entrega.setIdprops(idprops);
		entrega.setIdtrans(idtrans);
		session.save(entrega);
		tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}
		
	}

}
