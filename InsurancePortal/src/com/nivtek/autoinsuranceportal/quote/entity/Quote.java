package com.nivtek.autoinsuranceportal.quote.entity;

/**
 * @author Sartha Tamang.
 *
 */
public class Quote {

	// Instance Variables

	private int amount;
	private int quoteNumber;
	private static final int term = 6;

	// Setters & Getters

	public static int getTerm() {
		return term;
	}

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

}
