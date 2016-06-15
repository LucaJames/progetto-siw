package it.uniroma3.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "tipologiaEsameController")
public class TipologiaEsameController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String descrizione;
	private Float price;
	private Prerequisito prerequisito;
	private String descrizionePrerequisito;
	private List<Risultato> risultati;
	private List<Prerequisito> prerequisiti;
	private TipologiaEsame tipologia;
	private List<TipologiaEsame> tipologie;


	@EJB
	private TipologiaEsameFacade tipologiaEsameFacade;
	
	@PostConstruct
	public void init(){
		this.tipologie = tipologiaEsameFacade.getAllTipologieEsami();
	}

	public String createTipologiaEsame() {

		this.tipologia = new TipologiaEsame(this.nome, this.descrizione, this.price);
		this.tipologia = tipologiaEsameFacade.createTipologiaEsame(nome, descrizione, price);
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("tipologia", this.tipologia);
		return "inserisciPrerequisiti";
	}

	public String listTipologiaEsame(){
		this.tipologie = tipologiaEsameFacade.getAllTipologieEsami();
		return "tipologie";
	}

	public String findTipologia(){
		this.tipologia = tipologiaEsameFacade.getTipologiaEsame(id);
		return "tipologia";
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


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}


	public List<Risultato> getRisultati() {
		return risultati;
	}


	public void setRisultati(List<Risultato> risultati) {
		this.risultati = risultati;
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


	public List<TipologiaEsame> getTipologie() {
		return tipologie;
	}


	public void setTipologie(List<TipologiaEsame> tipologie) {
		this.tipologie = tipologie;
	}


	public Prerequisito getPrerequisito() {
		return prerequisito;
	}


	public void setPrerequisito(Prerequisito prerequisito) {
		this.prerequisito = prerequisito;
	}


	public String getDescrizionePrerequisito() {
		return descrizionePrerequisito;
	}


	public void setDescrizionePrerequisito(String descrizionePrerequisito) {
		this.descrizionePrerequisito = descrizionePrerequisito;
	}

}
