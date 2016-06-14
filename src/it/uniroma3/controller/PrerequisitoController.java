package it.uniroma3.controller;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "prerequisitoController")
@SessionScoped
public class PrerequisitoController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String descrizione;
	private Prerequisito prerequisito;
	private List<Prerequisito> prerequisiti;
	
	@EJB
	private PrerequisitoFacade prerequisitoFacade;
	
	@PostConstruct
	public void init(){
		this.prerequisiti = prerequisitoFacade.getAllPrerequisiti();
	}

	public String createPrerequisito(){
		this.prerequisito = prerequisitoFacade.createPrerequisito(descrizione);
		return "prerequisito";
	}
	

	public String listPrerequisiti(){
		this.prerequisiti = prerequisitoFacade.getAllPrerequisiti();
		return "prerequisiti";
	}

	public String findPrerequisito(){
		this.prerequisito = prerequisitoFacade.getPrerequisito(id);
		return "prerequisito";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public Prerequisito getPrerequisito() {
		return prerequisito;
	}


	public void setPrerequisito(Prerequisito prerequisito) {
		this.prerequisito = prerequisito;
	}


	public List<Prerequisito> getPrerequisiti() {
		return prerequisiti;
	}


	public void setPrerequisiti(List<Prerequisito> prerequisiti) {
		this.prerequisiti = prerequisiti;
	}
	
	
}