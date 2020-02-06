package com.ekatha.demoflightticketingapp.inheritance.ticketing;

public class BankAccountDetails extends UserDetails {

	int routingNumber;
	int accountNumber;

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}

}
