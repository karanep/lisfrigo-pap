package main.java.com.lisfrigo.hibernate.proposta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.proposta.dao.PropostaDAO;

import org.hibernate.HibernateException;

public class PropostaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idfunc=Integer.parseInt(request.getParameter("funcionario"));
		int idc=Integer.parseInt(request.getParameter("cliente"));
		int prod=Integer.parseInt(request.getParameter("produto"));
		String observacoes=request.getParameter("observacoes");
		try{
			PropostaDAO prop=new PropostaDAO();
			prop.addProposta(idfunc, idc, prod, observacoes);
			response.sendRedirect("mostrarproposta.jsp");
		}catch(HibernateException e){
			response.sendRedirect("500.jsp");
			e.printStackTrace();
		}
		
	}
}
