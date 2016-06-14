<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clinica-Esame</title>
</head>
<body>
<f:view>
	<h2>Esame appena creato</h2>
	<div><strong>Tipologia Esame: </strong>${esameController.esame.tipologia} </div>
	<div><strong>Medico: </strong>${esameController.esame.medico.nome} ${esameController.esame.medico.cognome}</div>
	<div><strong>Paziente: </strong>${esameController.esame.paziente.nome} ${esameController.esame.paziente.cognome}</div> 
</f:view>
</body>
</html>