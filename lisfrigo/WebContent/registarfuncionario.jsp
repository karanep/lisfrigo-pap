<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="header.jsp" />

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
	
}

form {
	width: 400px;
	margin-left: auto;
	margin-right: auto;
	padding-top:60px;

}

form li {
	list-style-type: none;
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
	<form action="regisfunc" method='post'>
		<li>Nome: <br /> <input type='text' name='nome' /></li> <br />
		<li>Departamento: <br /></li> <select name="iddepartamento">
			<li>
				<%
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection(
							"jdbc:mysql://127.6.90.2:3306/lisfrigo", "adminQPGNgch",
							"6AqUCYdHs_zH");
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select * from Departamento ");
					while (rs.next()) {
						int id = rs.getInt(1);
						String nome = rs.getString(2);
						out.println("<option value=" + id + ">" + id + " " + nome
								+ "</option>");
					}
				%>
		</li>
		</select> <br /> <br /> <input type="submit" value="Registar" class="btn btn-default" />
	</form>
</body>
</html>
