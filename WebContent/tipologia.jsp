<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tipologia</title>
</head>
<body>
	<f:view>
		<div>
			<strong>Dettagli Tipologia Esame</strong>
		</div>
		<div>Nome: ${tipologiaEsameController.tipologia.nome}</div>
		<div>Prezzo: ${tipologiaEsameController.tipologia.price}</div>
		<div>${tipologiaEsameController.tipologia.descrizione}</div>
		<h:form>
			<h:commandLink
				action="#{tipologiaEsameController.listTipologiaEsame}"
				value="Indietro" />
		</h:form>
		<a href="<c:url value="/index.html"/>">Home</a>
	</f:view>
</body>
</html>