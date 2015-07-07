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
	<form action="trans" method='post'>
		<li>Nome: <br /> <input type='text' name='nome' /></li>
		<li>Armazem: <br /> <input type='text' name='armazem' /></li> <br />
		<input type="submit" value="Registar transportador" class="btn btn-default" />
	</form>


</body>
</html>
