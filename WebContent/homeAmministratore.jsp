<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	<%@ include file="bootstrap/css/bootstrap.css" %>
	<%@ include file="bootstrap/css/bootstrap-theme.css" %>
	<%@ include file="styleSheets/style.css" %>
</style>
<title>Clinica-Home Amministratore</title>
</head>
<body>
	<f:view>
		<div id="header">
			<div class="jumbotron">
				<h1 id="title">Best Clinic</h1>
				<p id="title">Clinica specializzata</p>
				<img id="im_d"
					src="https://lh3.googleusercontent.com/-OvCyHpPzpow/AAAAAAAAAAI/AAAAAAAAABc/CyOcjcfDw44/photo.jpg"
					alt="testo"
					style="position: absolute; right: 75%; bottom: 70%; width: 12%">
				<img id="im_s"
					src="https://lh3.googleusercontent.com/-OvCyHpPzpow/AAAAAAAAAAI/AAAAAAAAABc/CyOcjcfDw44/photo.jpg"
					alt="testo"
					style="position: absolute; left: 75%; bottom: 70%; width: 12%">
			</div>

			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="<c:url value="/index.html"/>">Clinica
						</a>
					</div>
					<ul class="nav navbar-nav">
						<li><a href="<c:url value="/faces/homeAmministratore.jsp"/>">
							Home Amministratore</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="<c:url value="/faces/loginAmministratore.jsp"/>">
								Login Amministratore</a></li>
					</ul>
				</div>
			</nav>
		</div>
		<div id="corpo">
			<h2>Home Page Amministratore</h2>
			<div><h3><strong>${amministratore.nome}</strong>
				<strong>${amministratore.cognome}</strong></h3>
			</div>
			<div>
				<strong>Operazioni Disponibili</strong>
			</div>
			<ul>
				<li><a href='<c:url value="/faces/newEsame.jsp" />'> Crea
						nuovo esame </a></li>
				<li><a href='<c:url value="/faces/newTipologia.jsp" />'>
						Inserisci nuova tipologia di esame </a></li>
				<li><a href='<c:url value="/faces/esamiMedico.jsp" />'>
						Visualizza esami effettuati da un medico </a></li>
				<li><a href='<c:url value="/faces/inserisciRisultati.jsp" />'>
						Inserisci risultati </a></li>
			</ul>

		</div>
	</f:view>
</body>
</html>