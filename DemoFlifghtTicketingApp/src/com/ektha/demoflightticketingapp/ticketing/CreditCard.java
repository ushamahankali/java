/* this is class with setter and getter to insert data from console*/
package com.ektha.demoflightticketingapp.ticketing;

public class CreditCard {

	String nameOnTheCard;

	int ccNumber;

	int cvvNumber;

	public void setCcNumber(int ccNumber) {
		this.ccNumber = ccNumber;
	}

	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

}