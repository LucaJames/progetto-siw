<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuova Tipologia</title>
</head>
<body>

	<h2>Creazione nuova tipologia di esame</h2>
	<h:form>
		<div>
			Nome:
			<h:inputText value="#{tipologiaEsameController.nome}" required="true"
				requiredMessage="Nome Obbligatorio" id="nome" />
			<strong><h:message for="nome" /></strong>
		</div>
		<div>
			Descrizione:
			<h:inputText value="#{tipologiaEsameController.descrizione}" required="true"
				requiredMessage="Descrizione Obbligatoria" id="descrizione" />
			<strong><h:message for="descrizione" /></strong>
		</div>
		<div>
			Prezzo: 
			<h:inputText value="#{tipologiaEsameController.price}" required="true"
				requiredMessage="Username Obbligatorio" id="price"/>
				<strong><h:message for="price" /></strong>
		</div>
		<div>
			Prerequisito:
			<h:inputText value="#{tipologiaEsameController.descrizionePrerequisito}"  id="prerequisito" />
			<strong><h:message for="prerequisito" /></strong>
		</div>
		<h:commandButton value="Invia" action="#{tipologiaEsameController.createTipologiaEsame}" />
	</h:form>
</body>
</html>
</f:view>