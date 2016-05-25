<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ClinicaIndex</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<!--
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    -->
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1 style="text-align: center; color: #3366ff">Best Clinic</h1>
			<p style="text-align: center; color: #3366ff">Clinica specializzata</p>
			<img id="im_d"
				src="https://lh3.googleusercontent.com/-OvCyHpPzpow/AAAAAAAAAAI/AAAAAAAAABc/CyOcjcfDw44/photo.jpg"
				alt="testo"
				style="position: absolute; right: 75%; bottom: 70%; width: 12%">
			<img id="im_s"
				src="https://lh3.googleusercontent.com/-OvCyHpPzpow/AAAAAAAAAAI/AAAAAAAAABc/CyOcjcfDw44/photo.jpg"
				alt="testo"
				style="position: absolute; left: 75%; bottom: 70%; width: 12%">
		</div>
		<div class="row">
			<div class="col-sm-4">
				<h3>Tipologie di esami forniti dalla clinica</h3>
				<ul><li>
					<h4><a href="<c:url value="/controller/tipologie.list" />"> guarda i nostri esami </a></h4>
				</li></ul>
			</div>
			<div class="col-sm-4">
				<h3>Login Paziente</h3>
				<form action="<c:url value="/controller/paziente.verifica" />" method='post'>
					<div class="row">
						<p class="col-sm-3"> ${idError} <label>Id:</label></p>
						<input class="col-sm-6" type="text" name="id" value='${param["id"]}' 
							placeholder="inserisci id paziente" >
					</div>
					<div class="row">
						<p class="col-sm-3"> ${pswError} <label>Password:</label></p>
						<input class="col-sm-6" type="password" name="password" placeholder="inserisci password" >
					</div>
					<div>${autenticazioneError}</div>
					<div><input type="submit" name="submit" value="invia"></div>
					<hr/>
					<div>
						<h4>Puoi iscriverti alla clinica cliccando <a href="<c:url value="/newPaziente.jsp" />">qui</a></h4>
					</div>
				</form>
			</div>
			<div class="col-sm-4">
				<h3><a href="<c:url value="loginAmministratore.jsp"/>">Accedi come amministratore</a></h3>
			</div>
		</div>
	</div>
</body>
</html>