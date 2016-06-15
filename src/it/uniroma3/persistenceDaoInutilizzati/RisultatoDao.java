package it.uniroma3.persistenceDaoInutilizzati;

import it.uniroma3.clinic.Risultato;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class RisultatoDao extends Dao<Risultato>{
	
	
	public RisultatoDao(EntityManagerFactory emf){
		super(emf);
	}
	
	@Override
	public Risultato findById(long id){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Risultato r = em.find(Risultato.class, id);
		tx.commit();
		em.close();
		return r;
	}
	
	@Override
	public List<Risultato> findAll(){
		return null;			
	}
	

	
	

}
