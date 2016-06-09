package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.uniroma3.clinic.Paziente;

@Stateless
public class PazienteFacade {
	
	@PersistenceContext(unitName = "exams-unit")
    private EntityManager em;
	
	public Paziente createPaziente(String nome, String cognome, String user, String psw){
		Paziente p = new Paziente(user, psw, nome, cognome);
		em.persist(p);
		return p;
	}
	
	public Paziente getPaziente(Long id){
		Paziente p = em.find(Paziente.class, id);
		return p;
	}
	
	public List<Paziente> getAllPazienti(){
		CriteriaQuery<Paziente> cq = em.getCriteriaBuilder().createQuery(Paziente.class);
        cq.select(cq.from(Paziente.class));
        List<Paziente> pazienti = em.createQuery(cq).getResultList();
		return pazienti;
	}
	
	
	
	public void updatePaziente(Paziente paziente){
		em.merge(paziente);
	}
	
	public void deletePaziente(Paziente paziente){
		em.remove(paziente);
	}
	
	public void deletePaziente(Long id){
		Paziente paziente = em.find(Paziente.class, id);
		deletePaziente(paziente);
	}
	

}
