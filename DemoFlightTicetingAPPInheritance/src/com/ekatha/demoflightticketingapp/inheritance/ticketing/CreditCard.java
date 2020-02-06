package com.ekatha.demoflightticketingapp.inheritance.ticketing;

public class CreditCard extends UserDetails {

	int ccNumber;

	int cvvNumber;

	public void setCcNumber(int ccNumber) {
		this.ccNumber = ccNumber;
	}

	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

}
