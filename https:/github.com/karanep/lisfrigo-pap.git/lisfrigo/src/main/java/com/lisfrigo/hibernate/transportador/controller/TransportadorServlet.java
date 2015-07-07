package main.java.com.lisfrigo.hibernate.transportador.controller;
import main.java.com.lisfrigo.hibernate.transportador.dao.TransportadorDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TransportadorServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response){
		String nome=request.getParameter("nome");
		String armazem=request.getParameter("armazem");
		
		HttpSession session = request.getSession(true);
		
		try{
			TransportadorDAO trans=new TransportadorDAO();
			trans.addTransportador(nome, armazem);
			response.sendRedirect("consultartransportador.jsp");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

}
