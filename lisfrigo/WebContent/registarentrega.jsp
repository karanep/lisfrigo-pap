<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="header.jsp" />
<!DOCTYPE html>
<html lang="pt">

<head>
<style>
body {
	padding-top: 60px;
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

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Registar Entrega</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/full-slider.css" rel="stylesheet">
<link href="css/fich.css" rel="stylesheet" />


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<form action='regisentrega' method='post'>
		<li>Cliente:</li> <select name="cliente">
			<li>
				<%
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection(
							"jdbc:mysql://127.6.90.2:3306/lisfrigo", "adminQPGNgch",
							"6AqUCYdHs_zH");
					Statement stmt = conn.createStatement();

					ResultSet cliente = stmt
							.executeQuery("select idCliente, nome from Cliente ");
					while (cliente.next()) {
						int id = cliente.getInt(1);
						String nome = cliente.getString(2);
						out.println("<option value=" + id + ">" + id + " " + nome
								+ "</option>");

					}
				%>
		
		</select><br />
		<li>Data e hora de entrega</li> <input type="datetime-local" name="data">

		<li>Transportador</li> <select name="transportador">

			<li>
				<%
					Statement stmt1 = conn.createStatement();

					ResultSet trans = stmt1
							.executeQuery("SELECT idtransportador, nome FROM Transportador");
					while (trans.next()) {
						int id = trans.getInt("idtransportador");
						String nome = trans.getString("nome");
						out.println("<option value=" + id + ">" + id + " " + nome
								+ "</option>");
					}
				%>
		</li>
		</select> <br /> 
		<li>Proposta</li> <select name="proposta">

			<li>
				<%
					Statement stmt2 = conn.createStatement();
					ResultSet prop = stmt2
							.executeQuery("SELECT idproposta FROM Proposta");
					while (prop.next()) {
						int id = prop.getInt(1);
						out.println("<option value=" + id + ">" + id + "</option");
					}
				%>
		
		</select>
		<br>
		<br>
		<li><input type="submit" value="Registar" class="btn btn-default"/></li>
		
	</form>


	<!-- Footer -->
	<footer>
		<div class="footer_bottom">
			<div class="copy">
				<p>Copyright &copy; 2015 Lisfrigo</p>
			</div>
		</div>


	</footer>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Script to Activate the Carousel -->
	<script>
		$('.carousel').carousel({
			interval : 5000
		//changes the speed
		})
	</script>

</body>

</html>
