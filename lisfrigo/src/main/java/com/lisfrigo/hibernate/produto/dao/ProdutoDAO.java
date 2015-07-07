package main.java.com.lisfrigo.hibernate.produto.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import main.java.com.lisfrigo.hibernate.produto.bean.Produto;

public class ProdutoDAO {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	public void addProduto(String nome, String descricao, double altura,
			double largura, double profundidade, double volume, double peso,
			double potencia, String observacao, int tipoprod, double preco) {
		try {
			Produto prod = new Produto();
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();
			prod.setAltura(altura);
			prod.setDescricao(descricao);
			prod.setLargura(largura);
			prod.setNome(nome);
			prod.setObservacao(observacao);
			prod.setPeso(peso);
			prod.setPotencia(potencia);
			prod.setProfundidade(profundidade);
			prod.setTipoprod(tipoprod);
			prod.setTipoprod(tipoprod);
			prod.setPreco(preco);
			Transaction tx = session.beginTransaction();
			session.save(prod);
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

}
