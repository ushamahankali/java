package com.ektha.freshdeskweb.domain;

import javax.validation.constraints.Size;

public class User {

	@Size(min = 2, max = 20)
	private String firstName;
	@Size(min = 2, max = 20)
	private String lastName;
	@Size(min = 2, max = 20)
	private String email;
	@Size(min = 2, max = 20)
	private String password;
	@Size(min = 2, max = 20)
	private String phoneNum;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
