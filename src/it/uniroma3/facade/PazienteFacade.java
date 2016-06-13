package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import it.uniroma3.clinic.Esame;
import it.uniroma3.clinic.Paziente;

@Stateless
public class PazienteFacade {
	
	@PersistenceContext(unitName = "exams-unit")
    private EntityManager em;
	
	public Paziente createPaziente(String nome, String cognome, String username, String password){
		Paziente p = new Paziente(username, password, nome, cognome);
		em.persist(p);
		return p;
	}
	
	 public Paziente checkPassword(String username, String password) throws Exception {
	        Paziente p;

	        try {
	            Query query = this.em.createQuery("SELECT p FROM Paziente p WHERE p.username=:username");
	            query.setParameter("username", username);
	            p = (Paziente) query.getSingleResult();

	        }catch (Exception e){
	            throw new Exception("Paziente inesistente!");
	        }
	        if(!p.checkPassword(password))
	            throw new Exception("Password non corretta!");

	        return p;
	    }
	
	public Paziente getPaziente(Long id) {
	    Paziente paziente = em.find(Paziente.class, id);
		return paziente;
	}
	
	public List<Paziente> getAllPazienti(){
		CriteriaQuery<Paziente> cq = em.getCriteriaBuilder().createQuery(Paziente.class);
        cq.select(cq.from(Paziente.class));
        List<Paziente> pazienti = em.createQuery(cq).getResultList();
		return pazienti;
	}
	
	public List<Esame> getEsamiPaziente(Long id){
		String p = id.toString();
		TypedQuery<Esame> q = em.createQuery("SELECT * FROM Esame e WHERE e.paziente = ?", Esame.class);
		q.setParameter(1, p);
		List<Esame> esamiPaziente = q.getResultList();
		return esamiPaziente;
	}
	
	public void updatePaziente(Paziente paziente){
		em.merge(paziente);
	}
	
	public void deletePaziente(Paziente paziente){
		em.remove(paziente);
	}
	
	public void deletePaziente(Long id){
		Paziente paziente = em.find(Paziente.class, id);
		deletePaziente(paziente);
	}
	

}
