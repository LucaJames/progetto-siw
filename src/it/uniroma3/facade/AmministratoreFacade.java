package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import it.uniroma3.clinic.Amministratore;
import it.uniroma3.clinic.Paziente;

@Stateless
public class AmministratoreFacade {
	
	@PersistenceContext(unitName = "exams-unit")
	private EntityManager em;
	
	public Amministratore createAmministratore(String username, String nome, String cognome, String password){
		Amministratore a = new Amministratore(username, nome, cognome, password);
		em.persist(a);
		return a;
	}
	
	 public Amministratore checkPassword(String username, String password) throws Exception {
	        Amministratore a;

	        try {
	            Query query = this.em.createQuery("SELECT a FROM Amministratore a WHERE a.username=:username");
	            query.setParameter("username", username);
	            a = (Amministratore) query.getSingleResult();

	        }catch (Exception e){
	            throw new Exception("Amministratore inesistente!");
	        }
	        if(!a.checkPassword(password))
	            throw new Exception("Password non corretta!");

	        return a;
	    }
	
	public Amministratore getAmministratore(String username){
		Amministratore a = em.find(Amministratore.class, username);
		return a;
	}
	
	public List<Amministratore> getAllAmministratori(){
		CriteriaQuery<Amministratore> cq = em.getCriteriaBuilder().createQuery(Amministratore.class);
		cq.select(cq.from(Amministratore.class));
		List<Amministratore> amministratori = em.createQuery(cq).getResultList();
		return amministratori;
	}
	

	public void updateAmministratore(Amministratore amministratore){
		em.merge(amministratore);
	}
	
	public void deleteAmministratore(Amministratore amministratore){
		em.remove(amministratore);
	}
	
	public void deleteAmministratore(Long id){
		Amministratore a = em.find(Amministratore.class, id);
		deleteAmministratore(a);
	}
	
	
	
}
