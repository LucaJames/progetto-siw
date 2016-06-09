package it.uniroma3.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "tipologiaEsameController")
public class TipologiaEsameController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String descrizione;
	private Float price;
	private List<Risultato> risultati;
	private List<Prerequisito> prerequisiti;
	private TipologiaEsame tipologia;
	private List<TipologiaEsame> tipologie;
	
	@EJB
	private TipologiaEsameFacade tipologiaEsameFacade;

	public String createTipologiaEsame(){
		this.tipologia = tipologiaEsameFacade.createTipologiaEsame(nome, descrizione, price)
		return "prerequisito";
	}
	

	public String listPrerequisiti(){
		this.prerequisiti = tipologiaEsameFacade.getAllPrerequisiti();
		return "prerequisiti";
	}

	public String findPrerequisito(){
		this.prerequisito = tipologiaEsameFacade.getPrerequisito(id);
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
