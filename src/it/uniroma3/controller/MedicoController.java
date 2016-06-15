
package it.uniroma3.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "medicoController")
public class MedicoController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String cognome;
	private String specializzazione;
	private List<Esame> esami;
	private Medico medico;
	private List<Medico> medici;


	@EJB
	private MedicoFacade medicoFacade;
	
	@PostConstruct
	public void init(){
		this.medici = medicoFacade.getAllMedici();
	}

	public String createMedico(){
		this.medico = medicoFacade.createMedico(nome, cognome, specializzazione);
		return "medico";
	}

	public String listMedici(){
		this.medici = medicoFacade.getAllMedici();
		return "medici";
	}

	public String findMedico(){
		this.medico = medicoFacade.getMedico(id);
		return "medico";
	}
	
	public String findEsamiMedicoByID(){
		this.esami = medicoFacade.getEsamiMedico(id);
		return "esamiMedico";
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public List<Medico> getMedici() {
		return medici;
	}

	public void setMedici(List<Medico> medici) {
		this.medici = medici;
	}
		
}
