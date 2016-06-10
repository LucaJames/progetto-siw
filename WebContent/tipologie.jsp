<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Tipologie</title>
</head>
<body>
<f:view>
	<table>
		<tr><th>Tipologie Esami</th></tr>
		<tr><th>Nome</th><th>Prezzo</th><th>Prezzo</th>Descrizione</tr>
		<c:forEach var="tip" items="#{tipologiaEsameController.tipologie}">
		<tr>
			<td>
				<h:commandLink action="#{tipologiaEsameController.findTipologia}" value="#{tip.nome}">
					<f:param name="id" value="#{tip.id}"/>
				</h:commandLink>
			</td>
			<td></td>
			<td></td>
		</tr>
		</c:forEach>
	</table>

</f:view>
</body>
</html>