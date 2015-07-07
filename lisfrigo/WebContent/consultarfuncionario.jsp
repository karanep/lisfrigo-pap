<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="header.jsp" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<style>
body {
	padding-top: 60px;
}

</style>
<!-- Custom CSS -->
<link href="css/full-slider.css" rel="stylesheet">
<link href="css/fich.css" rel="stylesheet" />
<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://127.6.90.2:3306/lisfrigo", "adminQPGNgch",
				"6AqUCYdHs_zH");
		Statement stmt = conn.createStatement();
		ResultSet func = stmt.executeQuery("select * from Funcionario ");
		out.println("<table class='table'>");
		out.println("<tr>");
		out.println("<th>idFuncionario</th>");
		out.println("<th>nome</th>");
		out.println("<th>departamento</th>");
		out.println("<th>Apagar</th>");
		out.println("</tr>");
		while (func.next()) {
			int idFunc = func.getInt(1);
			String nome = func.getString(2);
			int dept = func.getInt(3);
			out.println("<tr>");
			out.println("<td> <a href=" + request.getContextPath()
					+ "/func?idfunc=" + idFunc + ">" + idFunc + "</a></td>");
			out.println("<td>" + nome + "</td>");
			out.println("<td>" + dept + "</td>");
			out.println("<td> <a href=" + request.getContextPath()
					+ "/delfunc?param1=" + idFunc + ">" + "Apagar</a></td>");
			out.println("</tr>");

		}
	%>


</body>
</html>