package com.walid.mobi.entities;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Produit", discriminatorType=DiscriminatorType.STRING)

public class Article implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id;
	private String quantiteSeuil;
	private Integer prix;
	@ManyToOne
	@JoinColumn(name="numero_cmd")
	private Commande commande;
	
	@ManyToOne
	private Client client;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuantiteSeuil() {
		return quantiteSeuil;
	}
	public void setQuantiteSeuil(String quantiteSeuil) {
		this.quantiteSeuil = quantiteSeuil;
	}
	
	public Integer getPrix() {
		return prix;
	}
	public void setPrix(Integer prix) {
		this.prix = prix;
	}
	
	public Article(Long id, String quantiteSeuil, Integer prix) {
		super();
		this.id = id;
		this.quantiteSeuil = quantiteSeuil;
		this.prix = prix;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", quantiteSeuil=" + quantiteSeuil + ", prix=" + prix + "]";
	}


	

}
