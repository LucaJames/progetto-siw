package it.uniroma3.clinic;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name="findAllPatients", query = "SELECT p FROM Paziente p")
public class Paziente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String id;
	@Column(nullable = false)
	private String password;
//	@OneToMany
//	private List<Esame> esami;

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

	public Paziente(String id, String password, String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
		this.password = password;
	}

}
