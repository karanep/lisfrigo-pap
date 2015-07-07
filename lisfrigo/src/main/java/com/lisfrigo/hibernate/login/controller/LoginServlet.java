package main.java.com.lisfrigo.hibernate.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
	    response.setContentType("text/html");
		PrintWriter out=response.getWriter();	
		int iddept=Integer.parseInt(request.getParameter("iddept"));
		int user=Integer.parseInt(request.getParameter("user"));
		String pass=request.getParameter("pass");
		
		
		

		
		
		
	}

}
