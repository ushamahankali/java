package com.ektha.tenantportalpsb.entity;

import java.util.ArrayList;
import java.util.List;

public class TenantInformation {

	private String companyName;
	private int suitNumber;
	private String phoneNumber;
	private String emailId;
	private List<ContactDetails> conactDetailsList = new ArrayList<ContactDetails>();

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @return the conactDetailsList
	 */
	public List<ContactDetails> getContactDetailsList() {
		return conactDetailsList;
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
	public String getPhoneNumber() {
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
	 * @return the iD
	 */

	/**
	 * @return the tenantList
	 */

	/**
	 * @param conactDetailsList the conactDetailsList to set
	 */
	public void setContactDetailsList(List<ContactDetails> conactDetailsList) {
		this.conactDetailsList = conactDetailsList;
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
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @param iD the iD to set
	 */

	/**
	 * @param suitNumber the suitNumber to set
	 */
	public void setSuitNumber(int suitNumber) {
		this.suitNumber = suitNumber;
	}

	/**
	 * @param string the tenantList to set
	 */

}
