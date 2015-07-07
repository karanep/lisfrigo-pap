package main.java.com.lisfrigo.hibernate.teste;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String b=request.getParameter("param1");
		String c=request.getParameter("param2");
		String d=request.getParameter("bday");
		writer.println("<html>" + "<body bgcolor='cyan'>" + "<center>"
				+ "Details Added Successfully" +"<h1>"+d+"</h1>"+ "</center>" + "</body>"
				+ "</html>");
		

	}


}
