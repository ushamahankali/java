package com.ektha.creditcardgateway.demo;

public class CreditCard {

	String creditCardNumber;
	String nameOnTheCard;
	String cvvNumber;
	String zipCode;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public String getCvvNumber() {
		return cvvNumber;
	}

	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
