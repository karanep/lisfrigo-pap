<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date"%>
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
<style>
body {
	padding-top: 60px;
}
</style>
</head>
<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection conn = DriverManager.getConnection(
		"jdbc:mysql://127.6.90.2:3306/lisfrigo", "adminQPGNgch","6AqUCYdHs_zH");
		Statement stmt = conn.createStatement();
		out.println("<table class='table'>");
		out.println("<tr>");
		out.println("<th>idProposta</th>");
		out.println("<th>data</th>");
		out.println("<th>cliente</th>");
		out.println("<th>Funcionario</th>");
		out.println("<th>Apagar</th>");
		out.println("</tr>");
		String query = "SELECT Proposta.idproposta,Proposta.data,Cliente.nome,Funcionario.nome FROM Proposta INNER JOIN Cliente ON Proposta.cliente=Cliente.idCliente INNER JOIN Funcionario ON Proposta.idfunc";
		ResultSet props = stmt.executeQuery(query);
		while (props.next()) {
			int idprop = props.getInt(1);
			Date t = props.getTimestamp(2);
			String prop = props.getString(3);
			String func=props.getString(4);
			out.println("<tr>");
			out.println("<td> <a href=" + request.getContextPath()
					+ "/conscpro?param1=" + idprop + ">" + idprop
					+ "</a></td>");
			out.println("<td>" + t + "</td>");
			out.println("<td>" + prop + "</td>");
			out.println("<td>"+func+"</td>");
			out.println("<td> <a href=" + request.getContextPath()
					+ "/delprop?param2=" + idprop + ">" + "Apagar</a></td>");
			out.println("</tr>");
		}
		out.println("</table>");
	%>
	<!--  
			out.println("<td> <a href=" + request.getContextPath()
					+ "/conscpro?param1=" + idprop + ">" + idprop
					+ "</a></td>");-->

</body>
</html>