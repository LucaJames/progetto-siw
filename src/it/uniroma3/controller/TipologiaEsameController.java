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
		this.tipologia = tipologiaEsameFacade.createTipologiaEsame(nome, descrizione, price);
		return "prerequisito";
	}


	public String listTipologiaEsame(){
		this.tipologie = tipologiaEsameFacade.getAllTipologieEsami();
		return "tipologie";
	}

	public String findPrerequisito(){
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





}
