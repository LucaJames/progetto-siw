package it.uniroma3.persistenceDaoInutilizzati;

import it.uniroma3.clinic.Prerequisito;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class PrerequisitoDao extends Dao<Prerequisito>{
	
	
	public PrerequisitoDao(EntityManagerFactory emf){
		super(emf);
	}
	
	@Override
	public Prerequisito findById(long id){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Prerequisito p = em.find(Prerequisito.class, id);
		tx.commit();
		em.close();
		return p;
	}
	
	@Override
	public List<Prerequisito> findAll(){
		return null;			
	}
	

	
	

}

