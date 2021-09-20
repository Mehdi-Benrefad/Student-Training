package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //On dit a spring que toutes les methodes de cette interface doivent etre accessibles via une api rest.
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

	public List<Etudiant> findByNomContains(String nom);
	
	/*
	 * Methode 2: 
	 * 
	 * @Query("select p from Etudiant e where e.nom like :x" )
	 * public List<Etudiant> chercher(@Params("x") String nom);
	 * */
	
	
}
