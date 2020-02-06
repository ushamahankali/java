package com.nivtek.creditcardapp.entity;

public class Contact {
	private int contactId;
	private int customerId;
	private String address;
	private String apt;
	private String city;
	private String state;
	private String zipcode;
	private String phone;
	private String email;
	
	public Contact() {
		super();
	}

	public Contact(int contactId, int customerId, String address, String apt, String city, String state, String zipcode,
			String phone, String email) {
		super();
		this.contactId = contactId;
		this.customerId = customerId;
		this.address = address;
		this.apt = apt;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
		this.email = email;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}
