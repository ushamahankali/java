package com.ektha.freshdesk.entity;

public class User {

	private String firstName;
	private String lastName;
	private String password;
	private String phoneNumber;
	private String emailId;
	private boolean valid;

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
