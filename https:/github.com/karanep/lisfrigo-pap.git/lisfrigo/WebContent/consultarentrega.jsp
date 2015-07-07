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
				"jdbc:mysql://127.6.90.2:3306/lisfrigo", "adminQPGNgch",
				"6AqUCYdHs_zH");
		Statement stmt = conn.createStatement();
		out.println("<table class='table'>");
		out.println("<tr>");
		out.println("<th>idEntrega</th>");
		out.println("<th>Cliente</th>");
		out.println("<th>Data de entrega</td>");
		out.println("<th>Transportador</th>");
		out.println("<th>idProposta</th>");
		out.println("</tr>");
		String query = "SELECT Entrega.identrega,Cliente.nome, Entrega.data, Transportador.nome,Proposta.idproposta FROM Entrega INNER JOIN Transportador on Entrega.idtrans=Transportador.idtransportador INNER JOIN Cliente on Entrega.idcliente=Cliente.idCliente INNER JOIN Proposta on Entrega.idprops=Proposta.idproposta;";
		ResultSet entre = stmt.executeQuery(query);
		while (entre.next()) {
			int identre = entre.getInt(1);
			String cliente = entre.getString(2);
			String data = entre.getString(3);
			String trans = entre.getString(4);
			int idprop = entre.getInt(5);
			out.println("<tr>");
			out.println("<td>" + identre + "</td>");
			out.println("<td>" + cliente + "</td>");
			out.println("<td>" + data + "</td>");
			out.println("<td>" + trans + "</td>");
			out.println("<td>" + idprop + "</td>");
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