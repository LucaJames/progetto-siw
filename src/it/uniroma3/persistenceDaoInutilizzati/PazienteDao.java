package it.uniroma3.persistenceDaoInutilizzati;



import it.uniroma3.clinic.Paziente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class PazienteDao extends Dao<Paziente>{
	
	
	public PazienteDao(EntityManagerFactory emf){
		super(emf);
	}
	
	@Override
	public Paziente findById(long id){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Paziente p = em.find(Paziente.class, id);
		tx.commit();
		em.close();
		return p;
	}
	
	@Override
	public List<Paziente> findAll(){
		EntityManager em = this.emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Paziente> result = em.createNamedQuery("Paziente.findAll").getResultList();
		em.close();
		return result;			
	}
	

	
	

}
