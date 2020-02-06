package com.nivtek.ekthabank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard", catalog = "creditcard")
public class CreditCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id")
	private int id;

	@Column(name = "cardnumber")
	private long cardNumber;

	@Column(name = "cvvnumber")
	private long cvvNumber;

	@Column(name = "expirydate")
	private String expiryDate;

	@Column(name = "creditlimit")
	private double creditLimit;

	@Column(name = "cardstatus")
	private String cardStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;

	public CreditCard() {

	}

	public long getCardNumber() {
		return cardNumber;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public long getCvvNumber() {
		return cvvNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public int getId() {
		return id;
	}

	public void setCardNumber(long number) {
		this.cardNumber = number;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setCvvNumber(long n3) {
		this.cvvNumber = n3;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setId(int id) {
		this.id = id;
	}

}
