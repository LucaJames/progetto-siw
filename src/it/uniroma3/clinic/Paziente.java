package it.uniroma3.clinic;



import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQuery(name="findAllPatients", query = "SELECT p FROM Paziente p")
public class Paziente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String password;
	@OneToMany(mappedBy = "paziente")
	private List<Esame> esami;

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
		
	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	public Paziente(String userName, String password, String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		this.userName = userName;
		this.password = password;
		this.esami = new LinkedList<>();
	}
	
	
	public void addEsame(Esame e){
		this.esami.add(e);
	}

}
