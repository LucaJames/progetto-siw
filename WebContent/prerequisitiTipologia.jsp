<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clinica-Prerequisiti Tipologia</title>
</head>
<body>
<f:view>

	<div id="corpo">
		<h3>Presequisiti dell'esame selezionato</h3>
		<c:forEach var="pre" items="#{tipologiaEsameController.prerequisiti}">
			<c:out value="${pre.nome} ${pre.valore}"/>
		</c:forEach>
		<div>${tipologiaEsameController.noPrerequisiti}</div>
	</div>
</f:view>
</body>
</html>