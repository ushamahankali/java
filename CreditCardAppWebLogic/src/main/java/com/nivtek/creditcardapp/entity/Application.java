package com.nivtek.creditcardapp.entity;

public class Application {
	private int applicationId;
	private int customerId;
	private int questionId;
	private String word;
	
	public Application() {
		super();
	}

	public Application(int applicationId, int customerId, int questionId, String word) {
		super();
		this.applicationId = applicationId;
		this.customerId = customerId;
		this.questionId = questionId;
		this.word = word;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}	
}
