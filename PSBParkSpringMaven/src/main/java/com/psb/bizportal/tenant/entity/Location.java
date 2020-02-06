package com.psb.bizportal.tenant.entity;

public class Location {

	private String name;
	private Address address;
	private Contact contact;
	private int noOfTenants;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public int getNoOfTenants() {
		return noOfTenants;
	}

	public void setNoOfTenants(int noOfTenants) {
		this.noOfTenants = noOfTenants;
	}

	@Override
	public String toString() {
		return "Location [LocationName=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
}
