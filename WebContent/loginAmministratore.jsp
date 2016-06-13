<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:view>
	<h2> Login Amministratore </h2>
	<h4> Inserire codice e password dell'amministratore </h4>
	<h:form>
		<div> Username: 
			<h:inputText value="#{amministratoreController.username}" 
			required="true" 
			requiredMessage="Username obbligatorio"
			id="username" />
			<h:message for="username" styleClass="error" />
		</div>
		<div>Password: 
			<h:inputSecret value="#{amministratoreController.password}" 
			required="true"
			requiredMessage="Password obbligatoria"
			id="password" />
			<h:message for="password" styleClass="error" />
		</div>
		<div>
			<h:commandButton value="Invia" action="#{amministratoreController.loginAmministratore}" />
			&nbsp
			<a href="<c:url value="/index.html" />">Home</a>
		</div>
		
	</h:form>
</f:view>
</body>
</html>