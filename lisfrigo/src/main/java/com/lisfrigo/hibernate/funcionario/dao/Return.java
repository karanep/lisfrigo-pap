package main.java.com.lisfrigo.hibernate.funcionario.dao;

import main.java.com.lisfrigo.hibernate.departamento.bean.Departamento;
import main.java.com.lisfrigo.hibernate.funcionario.bean.Funcionario;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Return {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private Funcionario f;
	private String resultado;
	private int resultadoI;
	private Departamento dept;

	public void util() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}
	public String nome(int idF) {
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		f = (Funcionario) session.get(Funcionario.class, idF);
		this.resultado = f.getNome();
		return resultado;
	}
	public String dep(int idF){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		f = (Funcionario) session.get(Funcionario.class, idF);
		this.resultadoI=f.getIddepartamento();
		dept=(Departamento) session.get(Departamento.class, resultadoI);
		this.resultado=dept.getNome();
		return resultado;
	}
}
