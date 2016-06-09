package it.uniroma3.controller.action;

import javax.servlet.http.HttpServletRequest;

import it.uniroma3.clinic.Paziente;
import it.uniroma3.controller.helper.HelperVerificaUtente;

public class VerificaPaziente implements Action{

	@Override
	public String perform(HttpServletRequest request) {
		// TODO perform VerificaPaziente
		HelperVerificaUtente helper = new HelperVerificaUtente();
		
		if(helper.isValid(request)){
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String nome = "nome";
			String cognome = "cognome";
			
			Paziente paziente = new Paziente(id, password, nome, cognome);
			request.setAttribute("paziente", paziente);
			return "/homePaziente.jsp";
		} else 
			return "/index.jsp";
	}

}
