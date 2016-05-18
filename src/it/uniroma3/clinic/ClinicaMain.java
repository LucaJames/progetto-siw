package it.uniroma3.clinic;


import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClinicaMain {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exams-unit");
		
		emf.close();
	}
}
