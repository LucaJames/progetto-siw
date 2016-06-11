package it.uniroma3.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "pazienteController")
public class PazienteController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private List<Esame> esami;
	private Paziente paziente;
	private List<Paziente> pazienti;
	
	@EJB
	private PazienteFacade pazienteFacade;
	
	public String createPaziente(){
		this.paziente = pazienteFacade.createPaziente(nome, cognome, username, password);
		return "newPaziente";
	}
	
	public String listPazienti(){
		this.pazienti = pazienteFacade.getAllPazienti();
		return "pazienti";
	}
	
	public String findPaziente(){
		this.paziente = pazienteFacade.getPaziente(id);
		return "paziente";
	}
	
	public String findEsamiPazienteByID(){
		this.esami = pazienteFacade.getEsamiPaziente(id);
		return "esami";
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public List<Paziente> getPazienti() {
		return pazienti;
	}

	public void setPazienti(List<Paziente> pazienti) {
		this.pazienti = pazienti;
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	
	
	
}
