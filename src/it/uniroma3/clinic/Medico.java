package it.uniroma3.clinic;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name="findAllDoctors", query = "SELECT m FROM Medico m")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String specializzazione;
//	@OneToMany
//	private List<Esame> esami;
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
//	public List<Esame> getEsami() {
//		return esami;
//	}
//	public void setEsami(List<Esame> esami) {
//		this.esami = esami;
//	}
	
	public Medico(String nome,String cognome,String specializzazione){
		this.nome = nome;
		this.cognome = cognome;
		this.specializzazione = specializzazione;
	}
	
	
}
