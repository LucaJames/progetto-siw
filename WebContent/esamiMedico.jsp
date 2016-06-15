<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
	<%@ include file="bootstrap/css/bootstrap.css" %>
	<%@ include file="bootstrap/css/bootstrap-theme.css" %>
	<%@ include file="styleSheets/style.css" %>
</style>
<title>Clinica-Esami Medico</title>
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
			<h2>${medicoController.nome}${medicoController.cognome}</h2>
			<h3>Lista esame</h3>
			<table>
				<tr>
					<td><strong>Tipologia</strong></td>
					<td><strong>Paziente</strong></td>
					<td><strong>Data Prenotazione</strong></td>
					<td><strong>Data Svolgimento</strong></td>
				</tr>
				<c:forEach var="esame" items="#{medicoController.esami}">
					<tr>
						<td><c:out value="${esame.tipologia.nome}" /></td>
						<td><c:out
								value="${esame.paziente.nome} ${esame.paziente.cognome}" /></td>
						<td><c:out value="${esame.dataPrenotazione}" /></td>
						<td><c:out value="${esame.dataSvolgimento}" /></td>
					</tr>
				</c:forEach>

			</table>
		</div>
	</f:view>
</body>
</html>