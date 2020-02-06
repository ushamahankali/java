/**
 * 
 */
package com.nivtek.trustbank.creditcard.entity;

/**
 * @author Dipendra Pokharel
 *
 */
public class Security {

	private int securityId;
	private SecurityHint hint;
	private Customer customer;
	private String word;

	public int getSecurityId() {
		return securityId;
	}

	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}

	public SecurityHint getHint() {
		return hint;
	}

	public void setHint(SecurityHint hint) {
		this.hint = hint;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
