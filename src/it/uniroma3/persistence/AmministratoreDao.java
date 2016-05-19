package it.uniroma3.persistence;



import it.uniroma3.clinic.Amministratore;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AmministratoreDao extends Dao<Amministratore>{
	
	
	public AmministratoreDao(EntityManagerFactory emf){
		super(emf);
	}
	
	@Override
	public Amministratore findById(long id){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Amministratore a = em.find(Amministratore.class, id);
		tx.commit();
		em.close();
		return a;
	}
	
	@Override
	public List<Amministratore> findAll(){
		return null;			
	}
	

	
	

}

