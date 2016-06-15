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
<title>Clinica-Nuovo Paziente</title>
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
					<ul class="nav navbar-nav navbar-right">
						<li><a href="<c:url value="/faces/loginAmministratore.jsp"/>">
								Login Amministratore</a></li>
					</ul>
				</div>
			</nav>
		</div>
		<div id="corpo">
			<h2>Creazione nuovo profilo paziente</h2>
			<h:form>
				<div>
					<strong>Name: </strong>
					<h:inputText value="#{pazienteController.nome}" required="true"
						requiredMessage="Nome Obbligatorio" id="nome" />
					<div><h:message for="nome" /></div>
				</div>
				<div>
					<strong>Cognome: </strong>
					<h:inputText value="#{pazienteController.cognome}" required="true"
						requiredMessage="Cognome Obbligatorio" id="cognome" />
					<div><h:message for="cognome" /></div>
				</div>
				<div>
					<strong>Username: </strong>
					<h:inputText value="#{pazienteController.username}" required="true"
						requiredMessage="Username Obbligatorio" id="username" />
					<div><h:message for="username" /></div>
				</div>
				<div>
					<strong>Password: </strong>
					<h:inputSecret value="#{pazienteController.password}"
						required="true" requiredMessage="Password Obbligatoria"
						id="password" />
					<div><h:message for="password" /></div>
				</div>
				<h:commandButton value="Invia"
					action="#{pazienteController.createPaziente}" />
			</h:form>
			<div>${pazienteController.creato}</div>
		</div>
	</f:view>
</body>
</html>