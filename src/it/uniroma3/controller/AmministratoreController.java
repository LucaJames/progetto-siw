package it.uniroma3.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import it.uniroma3.clinic.*;
import it.uniroma3.facade.*;

@ManagedBean(name = "amministratoreController")
public class AmministratoreController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private Amministratore amministratore;
	private List<Amministratore> amministratori;
	private String message;


	@EJB
	private AmministratoreFacade amministratoreFacade;
	
	public String loginAmministratore(){
		try{
            this.amministratore = amministratoreFacade.checkPassword(this.username, this.password);
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("amministratore", amministratore);
            return "homeAmministratore";

        }catch (Exception e){
            this.message = e.getMessage();
            return "loginAmministratore";
        }
	}

	public String createAmministratore(){
		this.amministratore = amministratoreFacade.createAmministratore(nome, cognome, username, password);
		return "amministratore";
	}

	public String listAmministratori(){
		this.amministratori = amministratoreFacade.getAllAmministratori();
		return "amministratori";
	}

	public String findAmminisitratore(){
		this.amministratore = amministratoreFacade.getAmministratore(username);
		return "amministratore";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Amministratore getAmministratore() {
		return amministratore;
	}

	public void setAmministratore(Amministratore amministratore) {
		this.amministratore = amministratore;
	}

	public List<Amministratore> getAmministratori() {
		return amministratori;
	}

	public void setAmministratori(List<Amministratore> amministratori) {
		this.amministratori = amministratori;
	}

	public AmministratoreFacade getAmministratoreFacade() {
		return amministratoreFacade;
	}

	public void setAmministratoreFacade(AmministratoreFacade amministratoreFacade) {
		this.amministratoreFacade = amministratoreFacade;
	}



}
