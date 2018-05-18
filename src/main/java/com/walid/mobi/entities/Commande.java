package com.walid.mobi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Commande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Integer id;
	private Integer quantite;
	@ManyToOne
	@JoinColumn(name="cin_client")
	private Client client;
	@OneToMany(mappedBy="article")
	private List<Article> articles;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(Integer id, Integer quantite, Client client, List<Article> articles) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.client = client;
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", quantite=" + quantite + ", client=" + client + ", articles=" + articles + "]";
	}
	
	

}
