/**
 *
 */
package com.ekatha.creditcardgateway.entity;

/**
 * @aut usha
 *
 */
public class BankdDB {

	public final String creditCardNumber = "123456";
	final String nameOnTheCard = "usha";
	final String cvvNumber = "123";
	final String zipCode = "75038";

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
