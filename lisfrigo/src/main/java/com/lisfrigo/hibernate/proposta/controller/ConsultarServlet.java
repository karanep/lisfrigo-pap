package main.java.com.lisfrigo.hibernate.proposta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.proposta.dao.Return;

//import main.java.com.lisfrigo.hibernate.proposta.dao.Return;


public class ConsultarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		Return r=new Return();
		int idP = Integer.parseInt(request.getParameter("param1"));
		writer.println("<html lang='pt'>"
				+ "<head> "
				+ "<meta http-equiv='Content-Type' content='text/html'; charset=UTF-8>"
				+ "</head>" + "<body>" + "<h1>" + "Ficha de proposta" + "</h1>"
				+"<b> Nome do cliente: </b></br>"
				+r.cliente(idP)+"</br>"
				+"<b> Funcionário responsável: </b> </br>"
				+r.funcionario(idP)+"</br>"
				+"<b>Data da proposta: </b> </br>"
				+r.data(idP)+"</br>"
				+"<b>Produto: </b>"+"</br>"
				+r.produto(idP));
	}

}

