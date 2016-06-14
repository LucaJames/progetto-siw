package it.uniroma3.controller;


import java.util.List;




import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "risultatoController")
public class RisultatoController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String descrizione;
	private Risultato risultato;
	private List<Risultato> risultati;
	
	@EJB
	private RisultatoFacade risultatoFacade;
	
	@PostConstruct
	public void init(){
		this.risultati = risultatoFacade.getAllRisultati();
	}

	public String createRisultato(){
		this.risultato = risultatoFacade.createRisultato(descrizione);
		return "risultato";
	}
	

	public String listPrerequisiti(){
		this.risultati = risultatoFacade.getAllRisultati();
		return "risultati";
	}

	public String findPrerequisito(){
		this.risultato = risultatoFacade.getRisultato(id);
		return "risultato";
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


	public Risultato getRisultato() {
		return risultato;
	}


	public void setRisultato(Risultato risultato) {
		this.risultato = risultato;
	}


	public List<Risultato> getRisultati() {
		return risultati;
	}


	public void setRisultati(List<Risultato> risultati) {
		this.risultati = risultati;
	}

	
}
