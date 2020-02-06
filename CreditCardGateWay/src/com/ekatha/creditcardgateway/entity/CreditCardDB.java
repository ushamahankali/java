/**
 *
 */
package com.ekatha.creditcardgateway.entity;

/**
 * @author usha
 *
 */
public class CreditCardDB {

	public final String creditCardNumber = "123456";
	public final String nameOnTheCard = "usha";
	public final String cvvNumber = "123";
	public final String zipCode = "75038";

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
}
