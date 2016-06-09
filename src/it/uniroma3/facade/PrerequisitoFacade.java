package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import it.uniroma3.clinic.Prerequisito;


@Stateless
public class PrerequisitoFacade {
	
	@PersistenceContext(unitName = "exams-unit")
	private EntityManager em;
	
	public Prerequisito createPrerequisito(String descrizione){
		Prerequisito p = new Prerequisito(descrizione);
		em.persist(p);
		return p;
	}
	
	public Prerequisito getPrerequisito(Long id){
		Prerequisito p = em.find(Prerequisito.class, id);
		return p;		
	}
	
	public List<Prerequisito> getAllPrerequisiti(){
		CriteriaQuery<Prerequisito> cq = em.getCriteriaBuilder().createQuery(Prerequisito.class);
		cq.select(cq.from(Prerequisito.class));
		List<Prerequisito> prerequisiti = em.createQuery(cq).getResultList();
		return prerequisiti;
	}
	
	public void updatePrerequisito(Prerequisito p){
		em.merge(p);
	}
	
	public void deletePrerequisito(Prerequisito p){
		em.remove(p);
	}
	
	public void deletePrerequisito(Long id){
		Prerequisito p = em.find(Prerequisito.class, id);
		deletePrerequisito(p);
	}
	
}
