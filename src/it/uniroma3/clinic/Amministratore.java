package it.uniroma3.clinic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findAllAdmins", query="SELECT a FROM Amministratore a")
public class Amministratore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	@Column(nullable=false)
	private String id;
	@Column(nullable=false)
	private String password;
	
	
	public Amministratore(String id, String nome, String cognome, String password) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.password = password;
	}
	
	
	

}
