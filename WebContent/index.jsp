<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<title>ClinicaIndex</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
<f:view>
	<div class="container">
		<div class="jumbotron">
			<h1 style="text-align: center; color: #3366ff">Best Clinic</h1>
			<p style="text-align: center; color: #3366ff">Clinica
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
		<div class="row">
			<div class="col-sm-4">
				<h3>Tipologie di esami forniti dalla clinica</h3>
				<ul>
					<li>
						<h4><h:form>
							<h:commandLink action="#{tipologiaEsameController.listTipologiaEsame}"
							value="Lista tipologie esami disponibili" />
						</h:form></h4>
					</li>
				</ul>
			</div>
			<div class="col-sm-4">
				<h3>Login Paziente</h3>
				<h:form>
					<div class="row">
						<p class="col-sm-3">Username:</p>
						<h:inputText id="username" value="#{pazienteController.username}" required="true"
							requiredMessage="Username Obbligatorio" />
						<h:message for="username" styleClass="error" />
					</div>
					<div class="row">
						<p class="col-sm-3">Password:</p>
						<h:inputSecret id="password" value="#{pazienteController.password}" required="true"
							requiredMessage="Password Obbligatoria" />
						<h:message for="password" styleClass="error" />
					</div>
					<div>Combinazione errata: Errore</div>
					<div>
						<h:commandButton value="invia" action="#{pazienteController.loginPaziente}" />
					</div>
					<hr />
					<div>
						<h4>
							Puoi iscriverti alla clinica cliccando 
							<a href="<c:url value="/faces/newPaziente.jsp"/>">qui</a>
						</h4>
					</div>
				</h:form>
			</div>
			<div class="col-sm-4">
				<h3>
					<a href="<c:url value="/faces/loginAmministratore.jsp"/>">Accedi come
						amministratore</a>
				</h3>
			</div>
		</div>
	</div>
</f:view>
</body>
</html>