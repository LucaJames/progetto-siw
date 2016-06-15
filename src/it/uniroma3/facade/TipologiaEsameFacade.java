package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import it.uniroma3.clinic.Prerequisito;
import it.uniroma3.clinic.TipologiaEsame;

@Stateless(name="tipologiaEsameFacade")
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
		tipologiaEsame.addPrerequisito(prerequisitoEsame);
		em.merge(tipologiaEsame);
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

	public List<Prerequisito> listPrerequisiti(TipologiaEsame tipologia) {
		TypedQuery<Prerequisito> q = em.createQuery("SELECT p FROM Prerequisito p JOIN p.tipologia_id t WHERE t = :tip", Prerequisito.class);
		q.setParameter("tip", tipologia);
		return q.getResultList();
	}
}
