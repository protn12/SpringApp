package com.walid.mobi.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Ligne_Telphonique")

public class Ligne_Telep extends Article {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long numeroTelephone;
	private Operateur operateur ;
	
	public long getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(long numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public Operateur getOperateur() {
		return operateur;
	}

	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}

	public Ligne_Telep(Long id, String quantiteSeuil, Integer prix, long numeroTelephone, Operateur operateur) {
		super(id, quantiteSeuil, prix);
		this.numeroTelephone = numeroTelephone;
		this.operateur = operateur;
	}

	@Override
	public String toString() {
		return "Ligne_Telep [numeroTelephone=" + numeroTelephone + ", operateur=" + operateur + "]";
	}


}
