package it.uniroma3.controller;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginFilter implements javax.servlet.Filter{
	
	private ServletContext application;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Metodo da implementare bene
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		if (session.getAttribute("utente")==null) { // questa condizione può essere definita meglio
			RequestDispatcher rd  = this.application.getRequestDispatcher("/PazienteController.");
			rd.forward(request, response);	
		}
		else {
			chain.doFilter(request, response);
		}
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {		
		this.application = fConfig.getServletContext();	
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
