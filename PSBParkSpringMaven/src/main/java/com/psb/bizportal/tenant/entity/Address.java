package com.psb.bizportal.tenant.entity;

public class Address {

	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private int zipcode;
	private String property_value;

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
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

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getProperty_value() {
		return property_value;
	}

	public void setProperty_value(String property_value) {
		this.property_value = property_value;
	}

	@Override
	public String toString() {
		return address_line1 + "<br>" + address_line2 + "<br>" + city + " " + state + " " + zipcode
				+ "<br>Property Value=" + property_value + "<br>";
	}

}
