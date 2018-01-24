package fr.men.test;

import io.swagger.annotations.ApiModel;

@ApiModel
public class Agent {
	
	public Agent() {
	}

	private String nom;
	private String prenom;
	
	public String getNom() {
		return nom;
	}
	
	public Agent(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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

}
