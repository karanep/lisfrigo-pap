package main.java.com.lisfrigo.hibernate.produto.controller;

import main.java.com.lisfrigo.hibernate.produto.dao.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProdutoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) {
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		double altura = Double.parseDouble(request.getParameter("altura"));
		double largura = Double.parseDouble(request.getParameter("largura"));
		double profundidade = Double.parseDouble(request.getParameter("profundidade"));
		double volume = Double.parseDouble(request.getParameter("volume"));
		double peso = Double.parseDouble(request.getParameter("peso"));
		double potencia = Double.parseDouble(request.getParameter("potencia"));
		int tipoprod = Integer.parseInt(request.getParameter("tipoprod"));
		double preco=Double.parseDouble(request.getParameter("preco"));
		String observacao = request.getParameter("observacao");
		try {
			ProdutoDAO dao = new ProdutoDAO();
			dao.addProduto(nome, descricao, altura, largura, profundidade,
					volume, peso, potencia, observacao, tipoprod, preco);
			response.sendRedirect("consultarproduto.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
