<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home page Paziente</title>
</head>
<body>
	<h2> Home </h2>
	<div> ${paziente.nome} ${paziente.cognome} </div>
	<div> Esami Effettutati</div>
	<ul>
	<li> Lista Esami </li>
	<!--
	<c:forEach var="esame" items="${paziente.esami}">
		<li><a href="<c:url value="/controller/esame.get?id=${esame.id}" />">${esame.name}</a></li>
	</c:forEach>
	-->
	<li><a href="<c:url value="/index.jsp" />">Home</a></li>
	</ul>
</body>
</html>