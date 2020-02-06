package com.ektha.customerapp.demo;

public class CustomerRequest {

	String firsName;
	String lastName;
	String emaiId;
	String phoneNumber;

	public String getEmaiId() {
		return emaiId;
	}

	public String getFirsName() {
		return firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
