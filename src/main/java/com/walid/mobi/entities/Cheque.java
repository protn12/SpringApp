package com.walid.mobi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Cheque")
public class Cheque extends Reglement{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String numeroCheque;
	
	@Column
	private Date dateEcheance;
	
	public Date getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public String getNumeroCheque() {
		return numeroCheque;
	}
	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}
	
	public Cheque(Date date, Float montant, Date dateEcheance, String numeroCheque) {
		super(date, montant);
		this.dateEcheance = dateEcheance;
		this.numeroCheque = numeroCheque;
	}
	@Override
	public String toString() {
		return "Cheque [dateEcheance=" + dateEcheance + ", numeroCheque=" + numeroCheque + "]";
	}
	
}
