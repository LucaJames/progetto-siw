package it.uniroma3.controller.action;

import javax.servlet.http.HttpServletRequest;

public class ListTipologie implements Action{

	@Override
	public String perform(HttpServletRequest request) {
		// TODO perform ListTipologie 
		return "/tipologie.jsp";
	}

}
