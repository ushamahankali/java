/**
 * 
 */
package com.nivtek.trustbank.creditcard.entity;

/**
 * @author Dipendra Pokharel
 *
 */
public class Address {

	private int addressId;
	private Customer customer;
	private String home;
	private String apt;
	private String zip;
	private String city;
	private String state;
	private String email;
	private String phone;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
