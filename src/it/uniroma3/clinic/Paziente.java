package it.uniroma3.clinic;


import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Paziente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String password;
	@OneToMany(mappedBy = "paziente", fetch = FetchType.EAGER)
	private List<Esame> esami;
	
	public Paziente(){}

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

	public Paziente(String username, String password, String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.esami = new LinkedList<>();
	}
	
	public void addEsame(Esame e){
		this.esami.add(e);
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
	
	 public boolean checkPassword(String password) {
	        return this.password.equals(password);
	    }
	
	

}
