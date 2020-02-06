package com.nivtek.trustbank.creditcard.entity;

/**
 * @author Dipendra Pokharel
 *
 */
public class CreditCard {

	private int ccId;
	private Customer customer;
	private String name;
	private String cardNumber;
	private String expiryDate;
	private String cvv;
	private int limit;
	private String status;

	public int getCcId() {
		return ccId;
	}

	public void setCcId(int ccId) {
		this.ccId = ccId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
