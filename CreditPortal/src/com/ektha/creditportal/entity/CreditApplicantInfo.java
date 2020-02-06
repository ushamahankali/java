package com.ektha.creditportal.entity;

public class CreditApplicantInfo {

	String firstName;
	String lastName;
	int ssnNumber;
	int salary;

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
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @return the ssnNumber
	 */
	public int getSsnNumber() {
		return ssnNumber;
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
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @param ssnNumber the ssnNumber to set
	 */
	public void setSsnNumber(int ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

}
