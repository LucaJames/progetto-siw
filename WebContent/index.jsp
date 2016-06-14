<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	<%@ include file="bootstrap/css/bootstrap.css" %>
	<%@ include file="bootstrap/css/bootstrap-theme.css" %>
	<%@ include file="styleSheets/style.css" %>
</style>
<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>
<title>Clinica</title>
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
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-5">
				<h3>Tipologie di esami forniti dalla clinica</h3>
				<ul>
					<li><h:form>
							<h:commandLink
								action="#{tipologiaEsameController.listTipologiaEsame}"
								value="Lista tipologie esami disponibili" />
						</h:form></li>
				</ul>
			</div>
			<div class="col-sm-5">
				<h3>Login Paziente</h3>
				<h:form>
					<div class="row">
						<p class="col-sm-3">Username:</p>
						<h:inputText id="username" value="#{pazienteController.username}"
							required="true" requiredMessage="Username Obbligatorio" />
						<h:message for="username" styleClass="error" />
					</div>
					<div class="row">
						<p class="col-sm-3">Password:</p>
						<h:inputSecret id="password"
							value="#{pazienteController.password}" required="true"
							requiredMessage="Password Obbligatoria" />
						<h:message for="password" styleClass="error" />
					</div>
					<div>
						<c:if test='${param["loginError"] != null}'>
							errorFunction()
						</c:if>
						<script>
							function errorFunction() {	alert("Combinazione utente e password errata");}
						</script>
					</div>
					<div>
						<h:commandButton value="invia"
							action="#{pazienteController.loginPaziente}" />
					</div>
					<hr />
					<div>
						<h4>
							Puoi iscriverti alla clinica cliccando <a
								href="<c:url value="/faces/newPaziente.jsp"/>">qui</a>
						</h4>
					</div>
				</h:form>
			</div>
			<div class="col-sm-1"></div>
		</div>
	</f:view>
</body>
</html>