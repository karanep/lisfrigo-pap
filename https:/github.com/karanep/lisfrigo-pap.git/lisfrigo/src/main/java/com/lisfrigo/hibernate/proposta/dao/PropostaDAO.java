package main.java.com.lisfrigo.hibernate.proposta.dao;

import main.java.com.lisfrigo.hibernate.proposta.bean.Proposta;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class PropostaDAO {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	public void addProposta(int idfunc, int cliente,int prod, String observacoes){
		try{
			Proposta p=new Proposta();
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			p.setCliente(cliente);
			p.setIdfunc(idfunc);
			p.setObservacoes(observacoes);
			p.setProd(prod);
			session.save(p);
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}
	}

}
