package it.uniroma3.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

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


	@SuppressWarnings("unchecked")
	public List<Esame> getEsamiMedico(Long id){
		Query q = em.createNativeQuery("select esame.id, esame.medico_id," 
				+ " esame.dataPrenotazione, esame.dataSvolgimento,"
				+ " esame.paziente_id, esame.tipologia_id"
				+ " from medico join esame on medico.id = medico_id"
				+ " where medico.id = ? ", Esame.class);
		q.setParameter(1, id);
		List<Esame> esami= q.getResultList();
		return esami;
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
