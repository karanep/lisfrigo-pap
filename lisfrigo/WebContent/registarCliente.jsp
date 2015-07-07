<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="header.jsp" />
<!DOCTYPE html>
<html lang="pt">

<head>
<style>
body {
	
}

form {
	width: 400px;
	margin-left: auto;
	margin-right: auto;
	padding-top: 60px;
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

<title>Registar Cliente</title>

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



	<form action='regiscliente' method='post'>
		<li>Nome:<br /> <input type='text' name='nome' /></li>
		<li>Morada:<br /> <input type='text' name='morada' /></li>
		<li>Distrito:<br />
		<li><select name="distrito" class="selectpicker">
				<%
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.6.90.2:3306/lisfrigo", "adminQPGNgch","6AqUCYdHs_zH");
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select *from distrito");
					while (rs.next()) {
						int idD = rs.getInt(1);
						String nome = rs.getString(2);
						out.println("<option value=" + idD + ">" + nome + "</option>");
					}
				%>


		</select> <br />
		<li>Concelho:<br> <input type='text' name='concelho' /></li>
		<li>Codigo postal:<br /> <input type='text' name='cod_postal' /></li>
		<li>Localidade :<br /> <input type='text' name='localidade' /></li>
		<li>Telefone:<br /> <input type='text' name='telefone' /></li>
		<li>FAX:<br /> <input type='text' name='fax' /></li>
		<li>Email:<br /> <input type='text' name='email' /></li>
		<li>Observações:<br /> <textarea rows='5' cols='25'
				name="observacoes"></textarea></li> <br /> <input type="submit"
			value="Registar" class="btn btn-default" />
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
