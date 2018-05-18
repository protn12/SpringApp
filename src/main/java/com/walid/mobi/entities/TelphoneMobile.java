package com.walid.mobi.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Telephone")
public class TelphoneMobile extends Article {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String model;
	
	@Column
	private String refrence;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRefrence() {
		return refrence;
	}
	public void setRefrence(String refrence) {
		this.refrence = refrence;
	}
	public TelphoneMobile(Long id, String quantiteSeuil, Integer prix, String model, String refrence) {
		super(id, quantiteSeuil, prix);
		this.model = model;
		this.refrence = refrence;
	}
	@Override
	public String toString() {
		return "TelphoneMobile [model=" + model + ", refrence=" + refrence + "]";
	}
	
}
