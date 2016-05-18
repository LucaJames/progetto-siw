package it.uniroma3.persistence;



import it.uniroma3.clinic.Esame;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class EsameDao extends Dao<Esame>{
	
	
	public EsameDao(EntityManagerFactory emf){
		super(emf);
	}
	
	@Override
	public Esame findById(long id){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Esame e = em.find(Esame.class, id);
		tx.commit();
		em.close();
		return e;
	}
	
	@Override
	public List<Esame> findAll(){
		EntityManager em = this.emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Esame> result = em.createNamedQuery("Esame.findAll").getResultList();
		em.close();
		return result;			
	}
	

	
	

}

