package it.uniroma3.clinic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findAllResults",query = "SELECT r FROM Risultato r")
public class Risultato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String descrizione;
	
	public Risultato(){}
	
	public Risultato(String descrizione){
		this.descrizione = descrizione;
	}

}
