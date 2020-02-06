package com.nivtek.creditcardapp.entity;

public class Account {
	private int accountId;
	private int cardId;
	private String username;
	private String password;
	
	public Account() {
		super();
	}

	public Account(int accountId, int cardId, String username, String password) {
		super();
		this.accountId = accountId;
		this.cardId = cardId;
		this.username = username;
		this.password = password;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}	