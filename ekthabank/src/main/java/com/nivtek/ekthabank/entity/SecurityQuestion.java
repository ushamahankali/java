package com.nivtek.ekthabank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "securityquestion", catalog = "creditcard")
public class SecurityQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hint_id")
	private int id;

	@Column(name = "question")
	private String question;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;

	public SecurityQuestion() {

	}

	public Customer getCustomer() {
		return customer;
	}

	public int getId() {
		return id;
	}

	public String getQuestion() {
		return question;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
