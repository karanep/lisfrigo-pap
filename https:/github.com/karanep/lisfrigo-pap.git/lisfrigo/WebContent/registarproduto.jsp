<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="header.jsp" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
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
	<form action='regisprod' method='post'>
		<!-- Fazer o form 26/4/15 -->
		<li>Nome:<br /> <input type='text' name='nome' /></li>
		<li>Descrição:<br /> <textarea rows='5' cols='25'
				name='descricao'></textarea></li>
		<li>Altura:<br /> <input type='number' name='altura' step='0.01' /></li>
		<li>Largura:<br /> <input type='number' name='largura'
			step='0.01' /></li>
		<li>Profundidade:<br /> <input type='number' name='profundidade'
			step='0.01' /></li>
		<li>Volume:<br /> <input type='number' name='volume' step='0.01' /></li>
		<li>Peso:<br /> <input type='number' name='peso' step='0.01' /></li>
		<li>Potencia:<br /> <input type='number' name='potencia'
			step='0.01' /></li>
		<li>Preço:<br /> <input type='number' name='preco' step='0.01' /></li>
		<li>Observações:<br /> <textarea rows='5' cols='25'
				name='observacao'></textarea></li>
		<li>Tipo de produto</li> <br /> <select name="tipoprod">
			<li>
				<%
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection(
							"jdbc:mysql://127.6.90.2:3306/lisfrigo", "adminQPGNgch",
							"6AqUCYdHs_zH");
					Statement stmt = conn.createStatement();

					ResultSet rs = stmt.executeQuery("select * from TipoProduto ");
					while (rs.next()) {
						int id = rs.getInt(1);
						String nome = rs.getString(2);
						out.println("<option value=" + id + ">" + id + " " + nome
								+ "</option>");
					}
				%>
		</li>
		</select> <br /> <br /> <input type="submit" value="Registar" class="btn btn-default"/><br />
	</form>



</body>
</html>