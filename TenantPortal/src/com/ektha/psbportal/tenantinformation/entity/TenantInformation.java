package com.ektha.psbportal.tenantinformation.entity;

public class TenantInformation {

	private String companyName;
	private int suitNumber;
	private int phoneNumber;
	private String emailId;

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the suitNumber
	 */
	public int getSuitNumber() {
		return suitNumber;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @param suitNumber the suitNumber to set
	 */
	public void setSuitNumber(int suitNumber) {
		this.suitNumber = suitNumber;
	}

}
