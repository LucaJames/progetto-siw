package it.uniroma3.controller.helper;


import javax.servlet.http.HttpServletRequest;

public class HelperVerificaUtente {
	
	public boolean isValid(HttpServletRequest request){
		boolean isValid = true;
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		if(id == null | id.equals("")){
			request.setAttribute("idError", "Campo id obbligatorio");
			isValid = false;
		}
		if(password == null | password.equals("")){
			request.setAttribute("pswError", "Campo password obbligatorio");
			isValid = false;
		}
		
		// TODO HelperVerificaUtente 
		/* verifico la combinazione utente-password... come si accede al database?
		 * 
		 * conviene una superclasse utente (amministratore e paziente come sottoclassi)
		 * oppure conviente avere due action e due helper diversi?  
		 * 
		 * */
		
		return isValid;
	}
	
}
