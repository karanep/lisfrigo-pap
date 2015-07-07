package main.java.com.lisfrigo.hibernate.entrega.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.entrega.dao.EntregaDAO;

import org.hibernate.HibernateException;


public class RegistarEntrega extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response){
		int idCliente=Integer.parseInt(request.getParameter("cliente"));
		int idTrans=Integer.parseInt(request.getParameter("transportador"));
		int idprops=Integer.parseInt(request.getParameter("proposta"));
		String data=request.getParameter("data");
		try{
			EntregaDAO a=new EntregaDAO();
			a.addEntr(idTrans, idCliente, idprops, data);
			response.sendRedirect("consultarentrega.jsp");
		}catch(HibernateException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
