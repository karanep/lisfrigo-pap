<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="header.jsp" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table, th, td {
	border: 1px solid black;
}
body {
	padding-top: 60px;
}
</style>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/full-slider.css" rel="stylesheet">
<link href="css/fich.css" rel="stylesheet" />
<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://127.6.90.2:3306/lisfrigo", "adminQPGNgch",
				"6AqUCYdHs_zH");
		Statement stmt = conn.createStatement();
		ResultSet cliente = stmt.executeQuery("select * from Cliente ");
		out.println("<table class='table'>");
		out.println("<tr>");
		out.println("<th>idCliente</th>");
		out.println("<th>nome</th>");
		out.println("<th>localidade</th>");
		out.println("<th>Apagar</th>");
		out.println("</tr>");
		while (cliente.next()) {
			int idCliente = cliente.getInt("idCliente");
			String nome = cliente.getString("nome");
			String localidade = cliente.getString("localidade");
			out.println("<tr>");
			out.println("<td> <a href=" + request.getContextPath()
					+ "/conscliente?param1=" + idCliente + ">" + idCliente
					+ "</a>");
			out.println("<td>" + nome + "</td>");
			out.println("<td>" + localidade + "</td>");
			out.println("<td> <a href=" + request.getContextPath()
					+ "/delcli?param1=" + idCliente + ">"
					+ "Apagar</a></td>");
			out.println("</tr>");
		}
		out.println("</table>");
	%>

</body>
</html>