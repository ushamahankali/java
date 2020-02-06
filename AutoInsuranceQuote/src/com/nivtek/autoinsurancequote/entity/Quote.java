package com.nivtek.autoinsurancequote.entity;


/**
 * @author Bootcamp User 024
 *
 */
public class Quote {
	// instance variables
	private int amount;
	private int quoteNumber;
	private static final int term = 6;
	//getters and setters
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(int quoteNumber) {
		this.quoteNumber = quoteNumber;
	}
	public static int getTerm() {
		return term;
	}
	
	
}
