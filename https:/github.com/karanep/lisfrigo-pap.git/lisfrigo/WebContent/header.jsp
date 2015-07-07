<!DOCTYPE html>
<html lang="pt">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="images/icone.png">

<title>Sistema de gestão lisfrigo</title>

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

	<!-- Navigation -->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<a href="index.jsp"><img id="img_header"
					src="images/lisfrigo_b.png" height="50" style="padding-left: 10%" /></a>
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-left">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Clientes <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/registarCliente.jsp">Registar cliente</a></li>
							<li><a href="/consultarcliente.jsp">Consultar cliente</a></li>
						</ul>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Produtos <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="registarproduto.jsp">Criar produtos</a></li>
							<li><a href="consultarproduto.jsp">Consultar produtos</a></li>
						</ul>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Proposta <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="registarproposta.jsp">Registar propostas</a></li>
							<li><a href="mostrarproposta.jsp">Consultar propostas</a></li>
						</ul>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Transportador <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="registartransportador.jsp">Registar
									transportador</a></li>
							<li><a href="consultartransportador.jsp">Consultar
									transportador</a></li>
						</ul>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Funcionario <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="registarfuncionario.jsp">Registar
									funcionário</a></li>
							<li><a href="consultarfuncionario.jsp">Consultar
									funcionário</a></li>
						</ul>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Departamento <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="consultardept.jsp">Consultar Departamento</a></li>
						</ul>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Entrega <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="registarentrega.jsp">Registar Entrega</a></li>
							<li><a href="consultarentrega.jsp">Consultar Entrega</a></li>
						</ul>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
</body>
</html>