package com.walid.mobi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	@Column
	private Long id;
    //@Column(name="cin_cli",nullable=false)
	@Column
	private Integer cin;
   // @Column(name="nom_cli",nullable=false)
	@Column
	private String nom;
   // @Column(name="prenom_cli",nullable=false)
	@Column
	private String prenom;
   // @Column(name="adresse_cli",nullable=false)
	@Column
	private String adresse;
   // @Column(name="email_cli",nullable=false)
	@Column
	private String email;
	
	@OneToMany(mappedBy="client")
	private List<Article> articles;
	
	@OneToMany(mappedBy="client")
	private List<Commande> commandes;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCin() {
		return cin;
	}
	public void setCin(Integer cin) {
		this.cin = cin;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Client(int cin, String nom, String prenom, String adresse, String email) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
	}
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Client [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", email="
				+ email + "]";
	}

}
