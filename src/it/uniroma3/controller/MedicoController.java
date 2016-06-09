
package it.uniroma3.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "medicoController")
public class MedicoController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String cognome;
	private String specializzazione;
	private List<Esame> esami;
	private Medico medico;
	private List<Medico> medici;


	@EJB
	private MedicoFacade medicoFacade;

	public String createMedico(){
		this.medico = medicoFacade.createMedico(nome, cognome, specializzazione);
		return "medico";
	}

	public String listMedici(){
		this.medici = medicoFacade.getAllMedici();
		return "medici";
	}

	public String findMedico(){
		this.medico = medicoFacade.getMedico(id);
		return "medico";
	}
}
