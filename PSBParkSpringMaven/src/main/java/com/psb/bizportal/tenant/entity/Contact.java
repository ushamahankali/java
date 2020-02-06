package com.psb.bizportal.tenant.entity;

public class Contact {

	private String name;
	private String phone;
	private String email_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	@Override
	public String toString() {
		return "Contact Details : <br>" + name + "<br>" + phone + "<br>" + email_id;
	}
}
