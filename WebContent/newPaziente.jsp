<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo Paziente</title>
</head>
<body>

	<h2>Creazione nuovo profilo paziente</h2>
	<h:form>
		<div>
			Name:
			<h:inputText value="#{pazienteController.nome}" required="true"
				requiredMessage="Nome Obbligatorio" id="nome" />
			<strong><h:message for="nome" /></strong>
		</div>
		<div>
			Cognome:
			<h:inputText value="#{pazienteController.cognome}" required="true"
				requiredMessage="Cognome Obbligatorio" id="cognome" />
			<strong><h:message for="cognome" /></strong>
		</div>
		<div>
			Username: 
			<h:inputText value="#{pazienteController.username}" required="true"
				requiredMessage="Username Obbligatorio" id="username"/>
				<strong><h:message for="username" /></strong>
		</div>
		<div>
			Password:
			<h:inputSecret value="#{pazienteController.password}" required="true"
				requiredMessage="Password Obbligatoria" id="password" />
			<strong><h:message for="password" /></strong>
		</div>
		<h:commandButton value="Invia" action="#{pazienteController.createPaziente}" />
	</h:form>
</body>
</html>
</f:view>