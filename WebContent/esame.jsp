<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clinica-Dettagli Esame</title>
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
						<li><a href="<c:url value="/faces/homePaziente.jsp"/>">
								Home Paziente</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="<c:url value="/faces/loginAmministratore.jsp"/>">
								Login Amministratore</a></li>
					</ul>
				</div>
			</nav>
		</div>
		<div id="corpo">
			<h3>Dettagli Esame</h3>
			<table>
				<tr>
					<td><strong>Tipologia Esame</strong></td>
					<td>${esameController.esame.tipologia.nome}</td>
				</tr>
				<tr>
					<td><strong>Medico</strong></td>
					<td>${esameController.esame.medico.nome}</td>
				</tr>
				<tr>
					<td><strong>Data Prenotazione</strong></td>
					<td>${esameController.esame.dataPrenotazione}</td>
				</tr>
				<tr>
					<td><strong>Data Svolgimento</strong></td>
					<td>${esameController.esame.dataSvolgimento}</td>
				</tr>
			</table>
		</div>
</f:view>
</body>
</html>