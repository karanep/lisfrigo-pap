package main.java.com.lisfrigo.hibernate.produto.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.produto.dao.Delete;

public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		Delete d=new Delete();
		int id=Integer.parseInt(request.getParameter("param1"));
		d.delete(id);
		response.sendRedirect("consultarproduto.jsp");
		
	}

}
