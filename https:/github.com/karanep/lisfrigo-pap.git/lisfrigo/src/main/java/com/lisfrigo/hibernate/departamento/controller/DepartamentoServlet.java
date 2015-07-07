package main.java.com.lisfrigo.hibernate.departamento.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.departamento.dao.DepartamentoDAO;

import org.hibernate.HibernateException;

public class DepartamentoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome=request.getParameter("nomedep");
		
		try{
			DepartamentoDAO dept=new DepartamentoDAO();
			dept.addDept(nome);
			response.sendRedirect("index.html");
		}catch(HibernateException e){
			e.printStackTrace();
		}
	}

}
