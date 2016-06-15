package it.uniroma3.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

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
	private String message;
	private String errore = null;
	private String numeroEsami = null;
	private String creato = null;

	@ManagedProperty(value="#{esameController}")
	public EsameController esameController;

	public EsameController getEsameController() {
		return esameController;
	}

	public void setEsameController(EsameController esameController) {
		this.esameController = esameController;
	}

	@EJB
	private PazienteFacade pazienteFacade;
	
	@EJB
	private EsameFacade esameFacade;
	
	@PostConstruct
	public void init(){
		try {
			this.pazienti = pazienteFacade.getAllPazienti();
			this.esami = esameController.getEsamiPaziente(id);
		} catch (Exception e) {
			message = e.getMessage();
			System.console();
		}
	}
	
	public String loginPaziente(){
		try{
            this.paziente = pazienteFacade.checkPassword(this.username, this.password);
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("paziente", paziente);
            return "homePaziente";
            
        }catch (Exception e){
            this.message = e.getMessage();
            this.errore = "Combinazione usernare e password errata";
            return "index";
        }
	}
	
	public String createPaziente(){
		this.paziente = pazienteFacade.createPaziente(nome, cognome, username, password);
		this.creato = "Utente Creato";
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
	
	public String listEsamiPaziente(){
		this.esami = pazienteFacade.getEsamiPaziente(id);
		if(esami.size()==0)
			this.numeroEsami = "Esami sostenuti: " + esami.size();
		return "esamiPaziente";
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
	
	public String getErrore() {
		return errore;
	}

	public void setErrore(String errore) {
		this.errore = errore;
	}

	public String getNumeroEsami() {
		return numeroEsami;
	}

	public void setNumeroEsami(String noEsami) {
		this.numeroEsami = noEsami;
	}
	
	public String getCreato() {
		return creato;
	}

	public void setCreato(String creato) {
		this.creato = creato;
	}
	
}
