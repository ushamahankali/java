package com.psb.bizportal.tenant.entity;

public class Tenant {

	private String name;
	private Address address;
	private Contact contact;

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

	@Override
	public String toString() {
		return "<br><br>" + name + "<br>" + address + "<br>" + contact;
	}

}
