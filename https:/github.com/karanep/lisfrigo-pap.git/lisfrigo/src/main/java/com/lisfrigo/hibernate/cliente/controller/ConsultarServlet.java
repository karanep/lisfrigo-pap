package main.java.com.lisfrigo.hibernate.cliente.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.cliente.dao.Return;

public class ConsultarServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		Return r = new Return();
		int idC = Integer.parseInt(request.getParameter("param1"));
		writer.println("<html lang='pt'>"
				+ "<head> "
				+ "<meta http-equiv='Content-Type' content='text/html'; charset=UTF-8>"
				+ "</head>" + "<body>" + "<h1>" + "Ficha de cliente" + "</h1>"
				+ "</br>" + "<b>" + "Nome do cliente: " + "</b>"
				+ r.retrieveNome(idC)
				+ "</br>"
				+ "<b>"
				+ "Morada: "
				+ "</b>"
				+ r.returnMorada(idC)
				+ "</br>"
				+ "<b>"
				+ "Codigo postal: "
				+ "</b>"
				+ r.codpos(idC)
				+ "</br>"
				+ "<b>"
				+ "Localidade: "
				+ "</b>"
				+ r.localidade(idC)
				+ "</br>"
				+ "<b>"
				+ "Distrito: "
				+ "</b>"
				+ r.distrito(idC)
				+ "</br>"
				+ "<b>"
				+ "Telefone: "
				+ "</b>"
				+ r.telefone(idC)
				+ "</br>"
				+ "<b>"
				+ "Fax: "
				+ "</b>"
				+ r.fax(idC)
				+ "</br>"
				+ "<b>"
				+ "Observações"
				+ "</b>"
				+ r.observacoes(idC) + "</br>" + "</body>" + "</html>");
		
	}
}
