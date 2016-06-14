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
</style>
<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<div id="header">
			<div class="jumbotron">
				<h1 id="title">Best Clinic</h1>
				<p id="title">Clinica
					specializzata</p>
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
			<h2>Login Amministratore</h2>
			<h4>Inserire codice e password dell'amministratore</h4>
			<h:form>
				<div>
					Username:
					<h:inputText value="#{amministratoreController.username}"
						required="true" requiredMessage="Username obbligatorio"
						id="username" />
					<h:message for="username" styleClass="error" />
				</div>
				<div>
					Password:
					<h:inputSecret value="#{amministratoreController.password}"
						required="true" requiredMessage="Password obbligatoria"
						id="password" />
					<h:message for="password" styleClass="error" />
				</div>
				<div>
					<h:commandButton value="Invia"
						action="#{amministratoreController.loginAmministratore}" />
				</div>
			</h:form>
		</div>
	</f:view>
</body>
</html>