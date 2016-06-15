package it.uniroma3.persistenceDaoInutilizzati;



import it.uniroma3.clinic.Medico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class MedicoDao extends Dao<Medico>{
	
	
	public MedicoDao(EntityManagerFactory emf){
		super(emf);
	}
	
	@Override
	public Medico findById(long id){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Medico m = em.find(Medico.class, id);
		tx.commit();
		em.close();
		return m;
	}
	
	@Override
	public List<Medico> findAll(){
		EntityManager em = this.emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Medico> result = em.createNamedQuery("Medico.findAll").getResultList();
		em.close();
		return result;			
	}
	

	
	

}
