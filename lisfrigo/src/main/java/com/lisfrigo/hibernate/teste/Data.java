package main.java.com.lisfrigo.hibernate.teste;

import main.java.com.lisfrigo.hibernate.cliente.*;
import main.java.com.lisfrigo.hibernate.cliente.bean.Cliente;
import org.hibernate.SQLQuery;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Data {
	public void met() {
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
	}

	public void getBackupFolderName() {
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		// return sdf.format(date);
	}

	public void abc() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = Calendar.getInstance().getTime();
	}

	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	public void join() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		String hql = " SELECT Cliente.nome, TipoCliente.tipocliente FROM Cliente INNER JOIN TipoCliente ON Cliente.tipocliente=TipoCliente.idTipoCliente";

	}

}
