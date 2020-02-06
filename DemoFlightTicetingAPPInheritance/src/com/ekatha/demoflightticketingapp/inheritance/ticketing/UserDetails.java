package com.ekatha.demoflightticketingapp.inheritance.ticketing;

public class UserDetails {

	public static final int CREDITCARDTYPE = 1;
	public static final int BANKTYPE = 2;
	public static final int PAYPALTYPE = 3;
	String firstName;
	String lastName;
	int balanceLimit;
	int typeOfPayment;

	public void setBalanceLimit(int balanceLimit) {
		this.balanceLimit = balanceLimit;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int setTypeOfPayment(int typeOfPayment) {
		return this.typeOfPayment = typeOfPayment;
	}

}