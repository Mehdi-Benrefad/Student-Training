package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class StudentTrainingApplication implements CommandLineRunner{

	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	FormationRepository formationRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentTrainingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Formation f1 = formationRepository.save(new Formation(null , "Informatique" , 52 , null));
		
		etudiantRepository.save(new Etudiant(null ,"Mehdi", "Benrefad" , new Date() , f1));
		etudiantRepository.save(new Etudiant(null ,"etd2", "etd" , new Date() , f1));
		etudiantRepository.save(new Etudiant(null ,"etd3", "etd" , new Date() , f1));
		etudiantRepository.save(new Etudiant(null , "etd4", "etd" , new Date() , f1));
		
		
	}
	
	/*Grace a l'annotation [@RepositoryRestResource]On peut beneficier directement au 
	 * ressources sans creer des controlleurs
	 * Ajouter un Etudiant: 
	  {
	  	url: http://localhost:8089/etudiants
	  	body:
	  		{
	  			"nom":"nom",
	  			"prenom":"prenom",
	  			"dateNaissaince":"1999-07-17",
	  			"formation":"http://localhost:8089/etudiants/1"
	  		}
	  }
	 
	 
	 * */

}
