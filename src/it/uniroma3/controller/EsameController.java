
package it.uniroma3.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "esameController")
public class EsameController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private Date dataPrenotazione;
	private Date dataSvolgimento;
	private TipologiaEsame tipologia;
	private Map<String,Risultato> risultati;
	private Paziente paziente;
	private Medico medico;
	private Esame esame;
	private List<Esame> esami;


	@EJB
	private EsameFacade esameFacade;

	public String createEsame(){
		this.esame = esameFacade.createEsame(new Date(), tipologia, paziente, medico);
		return "esame";
	}
	

	public String listEsami(){
		this.esami = esameFacade.getAllEsami();
		return "esami";
	}

	public String findEsame(){
		this.esame = esameFacade.getEsame(id);
		return "medico";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}


	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}


	public Date getDataSvolgimento() {
		return dataSvolgimento;
	}


	public void setDataSvolgimento(Date dataSvolgimento) {
		this.dataSvolgimento = dataSvolgimento;
	}


	public TipologiaEsame getTipologia() {
		return tipologia;
	}


	public void setTipologia(TipologiaEsame tipologia) {
		this.tipologia = tipologia;
	}


	public Map<String, Risultato> getRisutati() {
		return risultati;
	}


	public void setRisutati(Map<String, Risultato> risutati) {
		this.risultati = risutati;
	}


	public Paziente getPaziente() {
		return paziente;
	}


	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Esame getEsame() {
		return esame;
	}


	public void setEsame(Esame esame) {
		this.esame = esame;
	}


	public List<Esame> getEsami() {
		return esami;
	}


	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}
	
	
	
}

