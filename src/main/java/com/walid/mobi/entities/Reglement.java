package com.walid.mobi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Reg",discriminatorType=DiscriminatorType.STRING)

public class Reglement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id;
	private Date date;
	private Float montant;
	@ManyToOne
	@JoinColumn(name="cin")
	private Client client ;
	@ManyToMany
	@JoinTable(name="commande_reglement")
	private List<Commande> commandes ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	public Reglement(Date date, Float montant) {
		super();
		this.date = date;
		this.montant = montant;
	}
	@Override
	public String toString() {
		return "Reglement [date=" + date + ", montant=" + montant + "]";
	}
	
}
