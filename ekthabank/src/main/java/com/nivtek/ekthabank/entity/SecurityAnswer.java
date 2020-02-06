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
@Table(name = "securityanswer", catalog = "creditcard")
public class SecurityAnswer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "security_id")
	private int id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hint_id", referencedColumnName = "hint_id")
	private SecurityQuestion securityquestion;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;

	@Column(name = "word")
	private String word;

	public SecurityAnswer() {

	}

	public Customer getCustomer() {
		return customer;
	}

	public int getId() {
		return id;
	}

	public SecurityQuestion getSecurityquestion() {
		return securityquestion;
	}

	public String getWord() {
		return word;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSecurityquestion(SecurityQuestion securityquestion) {
		this.securityquestion = securityquestion;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
