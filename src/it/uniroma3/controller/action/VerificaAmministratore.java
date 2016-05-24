package it.uniroma3.controller.action;

import javax.servlet.http.HttpServletRequest;

import it.uniroma3.clinic.Amministratore;
import it.uniroma3.controller.helper.HelperVerificaUtente;

public class VerificaAmministratore implements Action{

	@Override
	public String perform(HttpServletRequest request) {
		// TODO
		HelperVerificaUtente helper = new HelperVerificaUtente();

		if(helper.isValid(request)){
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String nome = "nome";
			String cognome = "cognome";

			Amministratore amministratore = new Amministratore(id, nome, cognome, password);
			request.setAttribute("amministratore", amministratore);
			return "/homeAmministratore.jsp";
		} else 
			return "/index.jsp";
	}

}
