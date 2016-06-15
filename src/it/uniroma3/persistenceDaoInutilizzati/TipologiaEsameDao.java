package it.uniroma3.persistenceDaoInutilizzati;

import it.uniroma3.clinic.TipologiaEsame;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class TipologiaEsameDao extends Dao<TipologiaEsame>{

	
	public TipologiaEsameDao(EntityManagerFactory emf){
		super(emf);
	}
	
	@Override
	public TipologiaEsame findById(long id){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		TipologiaEsame te = em.find(TipologiaEsame.class, id);
		tx.commit();
		em.close();
		return te;
	}
	
	@Override
	public List<TipologiaEsame> findAll(){
		EntityManager em = this.emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<TipologiaEsame> result = em.createNamedQuery("TipologiaEsame.findAll").getResultList();
		em.close();
		return result;			
	}
	

	
	

}

