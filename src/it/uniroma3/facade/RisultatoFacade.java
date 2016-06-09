package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;


import it.uniroma3.clinic.Risultato;


@Stateless
public class RisultatoFacade {
	
	@PersistenceContext(unitName = "exams-unit")
	private EntityManager em;
	
	public Risultato createRisultato(String descrizione){
		Risultato r = new Risultato(descrizione);
		em.persist(r);
		return r;
	}
	
	public Risultato getRisultato(Long id){
		Risultato r = em.find(Risultato.class, id);
		return r;		
	}
	
	public List<Risultato> getAllRisultati(){
		CriteriaQuery<Risultato> cq = em.getCriteriaBuilder().createQuery(Risultato.class);
		cq.select(cq.from(Risultato.class));
		List<Risultato> risultati = em.createQuery(cq).getResultList();
		return risultati;
	}
	
	public void updateRisultato(Risultato r){
		em.merge(r);
	}
	
	public void deleteRisultato(Risultato r){
		em.remove(r);
	}
	
	public void deleteRisultato(Long id){
		Risultato r = em.find(Risultato.class, id);
		deleteRisultato(r);
	}
	
}
