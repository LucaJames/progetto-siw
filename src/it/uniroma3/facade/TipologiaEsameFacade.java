package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

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
}
