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
@Table(name = "user", catalog = "nivtek")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int id;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	// @NotEmpty(message = "can't be null")

	private Customer customer;

	// @Size(min = 5, max = 20)
	@Column(name = "username")
	private String userName;

	// @Size(min = 6, max = 15)
	// @NotEmpty(message = "Spaces are not allowed")
	@Column(name = "passowrd")
	private String password;

	public Customer getCustomer() {
		return customer;
	}

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
