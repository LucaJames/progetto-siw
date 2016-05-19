package it.uniroma3.clinic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findAllPrerequisites",query = "SELECT p FROM Prerequisito p")
public class Prerequisito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private String descrizione;
	
	public Prerequisito(String descrizione){
		this.descrizione = descrizione;
	}

}
