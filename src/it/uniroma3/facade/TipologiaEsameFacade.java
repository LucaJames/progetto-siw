package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import it.uniroma3.clinic.Prerequisito;
import it.uniroma3.clinic.TipologiaEsame;

@Stateless
public class TipologiaEsameFacade {
	
	@PersistenceContext(unitName = "exams-unit")
    private EntityManager em;
	
	public TipologiaEsame createTipologiaEsame(String nome, String descrizione, Float price){
		TipologiaEsame tipEsame = new TipologiaEsame(nome, descrizione, price);
		em.persist(tipEsame);
		return tipEsame;
	}
	
	public TipologiaEsame getTipologiaEsame(Long id){
		TipologiaEsame tipEsame = em.find(TipologiaEsame.class, id);
		return tipEsame;
	}
	
	public List<Prerequisito> addPrerequisito(TipologiaEsame tipologiaEsame, Prerequisito prerequisitoEsame) {
//		List<Prerequisito> prerequisitiEsame = tipologiaEsame.getPrerequisiti();
//		System.out.println("LISTA PREREQ PRESA");
//		if (prerequisitiEsame==null) {
//			System.out.println("LISTA PREREQ NULL");
//		} else {
//			System.out.println("ELEMENTI LISTA PREREQ: " + prerequisitiEsame.size());
//		}
//		prerequisitiEsame.add(prerequisitoEsame);
//		System.out.println("PREREQ AGGIUNTO ALLA LISTA PRESA");
//		tipologiaEsame.setPrerequisitiEsame(prerequisitiEsame);
//		System.out.println("LISTA PREREQ SETTATA");
//		//this.updateTipologiaEsame(tipologiaEsame);
//		//System.out.println("TIPOLOGIA PREREQ AGGIORNATA");
		tipologiaEsame.addPrerequisito(prerequisitoEsame);
		return tipologiaEsame.getPrerequisiti();
	}
	
	public List<TipologiaEsame> getAllTipologieEsami(){
		CriteriaQuery<TipologiaEsame> cq = em.getCriteriaBuilder().createQuery(TipologiaEsame.class);
        cq.select(cq.from(TipologiaEsame.class));
        List<TipologiaEsame> tipologiaEsami = em.createQuery(cq).getResultList();
		return tipologiaEsami;
	}
	
	public void updateTipologiaEsame(TipologiaEsame t){
		em.merge(t);
	}
	
	public void deleteTipologiaEsame(TipologiaEsame t){
		em.remove(t);
	}
	
	public void deleteTipologiaEsame(Long id){
		TipologiaEsame tipEsame = em.find(TipologiaEsame.class, id);
		deleteTipologiaEsame(tipEsame);
	}

	public List<Prerequisito> listPrerequisiti(Long id) {
		TypedQuery<Prerequisito> q = em.createQuery("SELECT p FROM prerequisito p WHERE p.tipologia = :tip", Prerequisito.class);
		q.setParameter("tip", id);
		List<Prerequisito> listPrerequisiti = q.getResultList();
		return listPrerequisiti;
	}
}
