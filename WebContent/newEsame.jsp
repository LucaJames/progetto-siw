<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo Esame</title>
</head>
<body>
	<f:view>
		<h2>Creazione Nuovo Esame</h2>
		<h:form>
			<div>
				Tipologia Esame:
				<h:selectOneMenu value="#{esameController.tipologia}"
					converter="#{tipologiaEsameConverter}">
					<f:selectItems value="#{tipologiaEsameController.tipologie}"
						var="tipologia" itemValue="#{tipologia}"
						itemLabel="#{tipologia.nome}" />
				</h:selectOneMenu>
			</div>
			<div>
				Medico:
				<h:inputText id="medico" value="#{esameController.medico}"
					required="true" requiredMessage="Medico Obbligatorio" />
				<h:message for="medico" styleClass="error" />
			</div>
			<div>
				Paziente:
				<h:selectOneMenu value="#{esameController.paziente}"
					converter="#{pazienteConverter}">
					<f:selectItems value="#{pazienteController.pazienti}"
						var="paziente" itemValue="#{paziente}"
						itemLabel="#{paziente.username}" />
				</h:selectOneMenu>
			</div>





		</h:form>

	</f:view>
</body>
</html>