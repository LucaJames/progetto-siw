<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>


<!DOCTYPE html>
<html>
<head>
<title>Inserisci Nuovo Medico</title>

</head>
<body>
	<f:view>
		<h:form>
								<strong class="">Inserisci dati medico</strong>

			
<div>
									Nome
									<div>
										<h:inputText value="#{medicoController.id}" required="true"
											requiredMessage="Id is mandatory" id="id"
											styleClass="form-control" />
										<h:message for="id" />
									</div>
	</div>
								
								
							
									<div>
										<h:commandLink
											action="#{medicoController.findEsamiMedicoByID}"
											value="Mostra Esami Medico"/>
										<button type="reset" class="btn btn-default btn-sm">Reset</button>
									</div>
		

		</h:form>
	</f:view>
</body>
</html>