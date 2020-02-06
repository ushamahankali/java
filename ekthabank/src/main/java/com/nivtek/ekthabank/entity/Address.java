package com.nivtek.ekthabank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address", catalog = "creditcard")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int id;

	@Column(name = "homeaddress")
	private String homeAddress;

	@Column(name = "appartment")
	private String appartment;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "zipcode")
	private int zipCode;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@Column(name = "emailid")
	private String emailId;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;

	public Address() {

	}

	public String getAppartment() {
		return appartment;
	}

	public String getCity() {
		return city;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public int getId() {
		return id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getState() {
		return state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setAppartment(String appartment) {
		this.appartment = appartment;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
