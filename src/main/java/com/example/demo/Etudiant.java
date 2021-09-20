package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//l'annotation Data de lambook permet de generer les getters et les setters sans ecrir du code.

@Entity
public class Etudiant {

	public Etudiant(Long id , String nom, String prenom, Date dateNaissaince, Formation formation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissaince = dateNaissaince;
		this.formation = formation;
	}
	public Etudiant() {
		
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	private Date dateNaissaince;
	@ManyToOne
	private Formation formation;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	public Date getDateNaissaince() {
		return dateNaissaince;
	}
	public void setDateNaissaince(Date dateNaissaince) {
		this.dateNaissaince = dateNaissaince;
	}

}
