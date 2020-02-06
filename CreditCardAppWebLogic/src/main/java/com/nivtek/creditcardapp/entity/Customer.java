package com.nivtek.creditcardapp.entity;

import com.nivtek.creditcardapp.entity.Contact;

public class Customer {
	private int customerId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private String birthDate;
	private int annualIncome;
	private Contact contact;
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String firstName, String middleName, String lastName, String ssn, String birthDate,
			int annualIncome, Contact contact) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.birthDate = birthDate;
		this.annualIncome = annualIncome;
		this.contact = contact;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}		
}


