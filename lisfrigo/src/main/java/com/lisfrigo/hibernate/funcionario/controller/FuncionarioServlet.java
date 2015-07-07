package main.java.com.lisfrigo.hibernate.funcionario.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.funcionario.dao.FuncionarioDAO;

public class FuncionarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		int iddepartamento = Integer.parseInt(request
				.getParameter("iddepartamento"));
		try {
			FuncionarioDAO func = new FuncionarioDAO();
			func.addFuncionario(nome, iddepartamento);
			response.sendRedirect("consultarfuncionario.jsp");

		} catch (Exception e) {
			response.sendRedirect("500.jsp");
			e.printStackTrace();
		}

	}

}
