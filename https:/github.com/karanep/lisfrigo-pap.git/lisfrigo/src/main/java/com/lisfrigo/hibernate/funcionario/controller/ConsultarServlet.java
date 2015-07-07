package main.java.com.lisfrigo.hibernate.funcionario.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.funcionario.dao.Return;

public class ConsultarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		PrintWriter writer = response.getWriter();
		Return r=new Return();
		int idF=Integer.parseInt(request.getParameter("idfunc"));
		response.setContentType("text/html");

		writer.println("<html lang='pt'>" + "<head> " + "<meta charset='UTF-8'>"
				+ "</head>" + "<body>" + "<h1>Ficha de Funcionario</h1></br>"
				+ "<b>Nome do Funcionário: </b>"+r.nome(idF)+"<br/>"
				+ "<b>Departamento: </b>"+r.dep(idF)+"<br/>"
				+"</body>"+"</html>");

	}
	

}
