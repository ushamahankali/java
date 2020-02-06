package com.nivtek.creditcardapp.entity;

public class CreditCard {
	private int cardId;
	private int customerId;
	private String cardNo;
	private String cvv;
	private int creditLimit;
	private int activationStatus;
	private String approvedDate;
	private String expirationDate;
	
	public CreditCard() {
		super();
	}

	public CreditCard(int cardId, int customerId, String cardNo, String cvv, int creditLimit, int activationStatus,
			String approvedDate, String expirationDate) {
		super();
		this.cardId = cardId;
		this.customerId = customerId;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.creditLimit = creditLimit;
		this.activationStatus = activationStatus;
		this.approvedDate = approvedDate;
		this.expirationDate = expirationDate;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(int activationStatus) {
		this.activationStatus = activationStatus;
	}

	public String getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}	
}
