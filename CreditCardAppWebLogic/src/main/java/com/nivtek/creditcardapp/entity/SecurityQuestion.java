package com.nivtek.creditcardapp.entity;

public class SecurityQuestion {
	private int questionId;
	private String question;
	
	public SecurityQuestion() {
		super();
	}

	public SecurityQuestion(int questionId, String question) {
		super();
		this.questionId = questionId;
		this.question = question;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
}
