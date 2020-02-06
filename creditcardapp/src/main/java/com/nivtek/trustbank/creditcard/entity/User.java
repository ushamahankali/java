/**
 * 
 */
package com.nivtek.trustbank.creditcard.entity;

/**
 * @author Dipendra Pokharel
 *
 */
public class User {

	private int userId;
	private int username;
	private String password;
	private Customer customer;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
