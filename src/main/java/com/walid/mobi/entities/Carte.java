package com.walid.mobi.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("carteTelephonique")
public class Carte extends Article {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer dureeValidite;
	private Type_Carte type;
	private Operateur operateur;
	
	
	public Integer getDureeValidite() {
		return dureeValidite;
	}
	public void setDureeValidite(Integer dureeValidite) {
		this.dureeValidite = dureeValidite;
	}
	public Type_Carte getType() {
		return type;
	}
	public void setType(Type_Carte type) {
		this.type = type;
	}
	public Operateur getOperateur() {
		return operateur;
	}
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}
	public Carte(Long id, String quantiteSeuil, Integer prix, Integer dureeValidite, Type_Carte type,
			Operateur operateur) {
		super(id, quantiteSeuil, prix);
		this.dureeValidite = dureeValidite;
		this.type = type;
		this.operateur = operateur;
	}
	@Override
	public String toString() {
		return "Carte [dureeValidite=" + dureeValidite + ", type=" + type + ", operateur="
				+ operateur + "]";
	}
	
	

}
