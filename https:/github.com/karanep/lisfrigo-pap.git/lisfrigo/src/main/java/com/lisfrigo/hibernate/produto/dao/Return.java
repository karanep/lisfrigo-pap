package main.java.com.lisfrigo.hibernate.produto.dao;

import main.java.com.lisfrigo.hibernate.produto.bean.Produto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Return {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private Produto p;
	private String resultado;
	private double resultadoD;

	
	public void util() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}

	public String nome(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultado=p.getNome();
		return resultado;
	}
	public String descricao(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultado=p.getDescricao();
		return resultado;
	}
	public double altura(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultadoD=p.getAltura();
		return resultadoD;
	}
	public double largura(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultadoD=p.getLargura();
		return resultadoD;
	}
	public double profundidade(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultadoD=p.getProfundidade();
		return resultadoD;
	}
	public double volume(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultadoD=p.getVolume();
		return resultadoD;
	}
	public double peso(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultadoD=p.getPeso();
		return resultadoD;
	}
	public double potencia(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultadoD=p.getPotencia();
		return resultadoD;
	}
	public String observacao(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultado=p.getObservacao();
		return resultado;
	}
	public double preco(int idP){
		util();
		Session session = sessionFactory.openSession();
		session.beginTransaction();/* lets hope an id of 1 exists! */
		p=(Produto) session.get(Produto.class, idP);
		this.resultadoD=p.getPreco();
		return resultadoD;
	}
}
