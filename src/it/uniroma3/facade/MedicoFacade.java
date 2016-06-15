package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import it.uniroma3.clinic.Esame;
import it.uniroma3.clinic.Medico;

@Stateless
public class MedicoFacade {
	
	@PersistenceContext(unitName = "exams-unit")
    private EntityManager em;
	
	public Medico createMedico(String nome,String cognome,String specializzazione){
		Medico m = new Medico(nome, cognome, specializzazione);
		em.persist(m);
		return m;
	}
	
	public Medico getMedico(Long id){
		Medico m = em.find(Medico.class, id);
		return m;
	}
	
	public List<Medico> getAllMedici(){
		CriteriaQuery<Medico> cq = em.getCriteriaBuilder().createQuery(Medico.class);
        cq.select(cq.from(Medico.class));
        List<Medico> medici = em.createQuery(cq).getResultList();
		return medici;
	}
	
	public List<Esame> getEsamiMedico(Long id){
		String m = id.toString();
		TypedQuery<Esame> q = em.createQuery("SELECT e FROM Esame e WHERE e.medico = ?", Esame.class);
		q.setParameter(1, m);
		List<Esame> esamiMedico = q.getResultList();
		return esamiMedico;
	}
	
	public void updateMedico(Medico m){
		em.merge(m);
	}
	
	public void deleteMedico(Medico m){
		em.remove(m);
	}
	
	public void deleteMedico(Long id){
		Medico medico = em.find(Medico.class, id);
		deleteMedico(medico);
	}
}
