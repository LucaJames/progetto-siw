package it.uniroma3.clinic;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="findAllExams", query="SELECT e FROM Esame e")

public class Esame {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private Date dataPrenotazione;
	@Column(nullable = false)
	private Date dataSvolgimento;
	@OneToOne
	@JoinColumn(name = "tipologia")
	private TipologiaEsame tipologia;
	@OneToMany
	@JoinColumn(name = "risultati_esame")
	private Map<String,Risultato> risultati = new HashMap<>();
	@ManyToOne
	private Paziente paziente;
	@ManyToOne
	private Medico medico;

	
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
	public TipologiaEsame getTipologia() {
		return tipologia;
	}
	public void setTipologia(TipologiaEsame tipologia) {
		this.tipologia = tipologia;
	}
	
	public Esame(Date dataPrenotazione, Date dataSvolgimento,TipologiaEsame tipologia,Paziente paziente, Medico medico) {
		this.dataPrenotazione = dataPrenotazione;
		this.dataSvolgimento = dataSvolgimento;
		this.tipologia = tipologia;
		this.paziente = paziente;
		this.medico = medico;
	}
	
	
	

}
