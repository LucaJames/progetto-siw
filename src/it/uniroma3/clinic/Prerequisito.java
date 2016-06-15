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
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String valore;
	
	public Prerequisito(){}
	
	public Prerequisito(String nome, String valore){
		this.nome = nome;
		this.valore = valore;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getValore() {
		return valore;
	}
	
	public void setValore(String valore) {
		this.valore = valore;
	}
	
}
