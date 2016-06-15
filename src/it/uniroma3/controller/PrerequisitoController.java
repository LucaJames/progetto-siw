package it.uniroma3.controller;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "prerequisitoController")
public class PrerequisitoController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String valore;
	private Prerequisito prerequisito;
	private List<Prerequisito> prerequisiti;
	private TipologiaEsame tipologia;

	@EJB
	private PrerequisitoFacade prerequisitoFacade;
	
	@EJB
	private TipologiaEsameFacade tipologiaEsameFacade;
	
	@PostConstruct
	public void init(){
		this.prerequisiti = prerequisitoFacade.getAllPrerequisiti();
	}

	public String createPrerequisito(){
		this.prerequisito = prerequisitoFacade.createPrerequisito(nome, valore);
		tipologia = (TipologiaEsame) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("tipologia");
		this.tipologiaEsameFacade.addPrerequisito(tipologia, this.prerequisito);
		return "inserisciPrerequisito";
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

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getValore() {
		return valore;
	}
	
	public void setValore(String valore) {
		this.valore = valore;
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
	
	public TipologiaEsame getTipologia() {
		return tipologia;
	}

	public void setTipologia(TipologiaEsame tipologia) {
		this.tipologia = tipologia;
	}
	
}