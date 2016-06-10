<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<h3>Login paziente</h3>
	<h4>inserire username e password del paziente</h4>
	<form>
		<div>
			Username:
			<h:inputText value="#{pazienteController.username}" required="true"
				requiredMessage="Nome Obbligatorio" id="username" />
				<h:message for="name" styleClass="error"/>		
		</div>
		<div>
			Password:
			<h:inputSecret required="true"
				requiredMessage="Password Obbligatoria" id="password" />
			<h:message for="password" styleClass="error"/>
		</div>
		<div>Se combinazione errata: Errore</div>
		<div>
			<input type="reset" name="reset" value="Reimposta">
			<h:commandButton value="invia" action="#{pazienteController.verificaPaziente}"/>
		</div>
	</form>
</body>
</html>