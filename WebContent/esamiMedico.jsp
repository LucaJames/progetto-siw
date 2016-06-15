<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<f:view>
		<h:form>
		
								<strong class="">Inserisci dati medico</strong>

							
						
<div>
									Nome
										<h:inputText value="#{medicoController.id}" required="true"
											requiredMessage="Nome is mandatory" id="nome"
											/>
										<h:message for="nome" />
									</div>
								

							
								
								<div class="form-group last">
									<div class="col-sm-offset-3 col-sm-9">
										<h:commandLink
											action="#{medicoController.findEsamiMedicoByID}"
											value="Mostra Esami Medico"/>
										<button type="reset" class="btn btn-default btn-sm">Reset</button>
									</div>
								</div>
		</h:form>
	</f:view>

</body>
</html>