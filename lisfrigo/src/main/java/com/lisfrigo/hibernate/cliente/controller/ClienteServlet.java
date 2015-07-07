package main.java.com.lisfrigo.hibernate.cliente.controller;

import main.java.com.lisfrigo.hibernate.cliente.dao.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String morada = request.getParameter("morada");
		String cod_postal = request.getParameter("cod_postal");
		String localidade = request.getParameter("localidade");
		int distrito = Integer.parseInt(request.getParameter("distrito"));
		String telefone = request.getParameter("telefone");
		String fax = request.getParameter("fax");
		String email = request.getParameter("email");
		String observacoes = request.getParameter("observacoes");
		String concelho = request.getParameter("concelho");
		
		try {
			ClienteDAO dao = new ClienteDAO();
			dao.addCliente(nome, morada, cod_postal, localidade, concelho,
					distrito, telefone, fax, email, observacoes);
			response.sendRedirect("consultarcliente.jsp");

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("500.jsp");
		}

	}

}
