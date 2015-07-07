package main.java.com.lisfrigo.hibernate.departamento.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.departamento.dao.Return;

public class ConsultarDepartamento extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		int idD = Integer.parseInt(request.getParameter("dept"));
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();
		Return r = new Return();

		writer.println("<html lang='pt'>" + "<head> "
				+ "<meta charset='UTF-8'>" + "</head>" + "<body>"
				+ "<h1>Ficha de Departamento</h1>"
				+ "<b>Id do departamento: </b>"
				+ r.iddept(idD)+"</br>"
				+"<b>Nome do Departamento: </b>"
				+ r.nome(idD)+"</br>"
				+"</body>" + "</html>");
	}

}
