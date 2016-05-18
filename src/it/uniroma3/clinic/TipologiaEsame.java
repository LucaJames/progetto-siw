package it.uniroma3.clinic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TipologiaEsame {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	private String descrizione;
	private Float price;
	private Map<String,String> prerequisiti = new HashMap<>();
	private List<String> risultatiTipologia = new LinkedList<>();
	
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
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public Float getPrice() {
		return price;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public Map<String, String> getPrerequisiti() {
		return prerequisiti;
	}
	
	public void setPrerequisiti(Map<String, String> prerequisiti) {
		this.prerequisiti = prerequisiti;
	}
	
	public TipologiaEsame(Long id, String nome, String descrizione,
			Float price, Map<String, String> prerequisiti, List<String> risultatiTipologia) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.price = price;
		this.prerequisiti = prerequisiti;
		this.risultatiTipologia = risultatiTipologia;
	}

	public List<String> getRisultatiTipologia() {
		return risultatiTipologia;
	}

	public void setRisultatiTipologia(List<String> risultatiTipologia) {
		this.risultatiTipologia = risultatiTipologia;
	}
	
	
	
	

}
