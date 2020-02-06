/**
 *
 */
package com.ekatha.creditcardgateway.entity;

/**
 * @author usha
 *
 */
public class CreditCard {

	public String creditCardNumber;
	public String nameOnTheCard;
	public String cvvNumber;
	public String zipCode;

	/**
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * @return the cvvNumber
	 */
	public String getCvvNumber() {
		return cvvNumber;
	}

	/**
	 * @return the nameOnTheCard
	 */
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param creditCardNumber the creditCardNumber to set
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * @param cvvNumber the cvvNumber to set
	 */
	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	/**
	 * @param nameOnTheCard the nameOnTheCard to set
	 */
	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
