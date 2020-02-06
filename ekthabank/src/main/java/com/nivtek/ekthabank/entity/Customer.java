package com.nivtek.ekthabank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "customer", catalog = "creditcard")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int id;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "middlename")
	private String middleName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "dateofbirth")
	private String dateOfBirth;

	@Column(name = "ssn")
	private int ssn;

	@Column(name = "annualincome")
	private double annualIncome;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Address address;
	@OneToOne
	@PrimaryKeyJoinColumn
	private SecurityQuestion question;

	@OneToOne
	@PrimaryKeyJoinColumn
	private SecurityAnswer answer;

	@OneToOne
	@PrimaryKeyJoinColumn
	private CreditCard creditcard;

	public Customer() {

	}

	public Address getAddress() {
		return address;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public SecurityAnswer getAnswer() {
		return answer;
	}

	public CreditCard getCreditcard() {
		return creditcard;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public SecurityQuestion getQuestion() {
		return question;
	}

	public int getSsn() {
		return ssn;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public void setAnswer(SecurityAnswer answer) {
		this.answer = answer;
	}

	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setQuestion(SecurityQuestion question) {
		this.question = question;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
