package com.nivtek.ekthabank.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "auth_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "auth_user_id")
	private int id;

	@NotEmpty(message = "first name is compulsory")
	@Column(name = "first_name")
	private String name;

	@NotEmpty(message = "last name is compulsory")
	@Column(name = "last_name")
	private String lastName;

	@NotEmpty(message = "email is compulsory")
	@Email(message = "email is invalid")
	@Column(name = "email")
	private String email;

	@NotEmpty(message = "password is compulsory")
	@Length(min = 5, message = "password length is minimum 5")
	@Column(name = "password")
	private String password;

	@Column(name = "status")
	private String status;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "auth_user_role", joinColumns = @JoinColumn(name = "auth_user_id"), inverseJoinColumns = @JoinColumn(name = "auth_role_id"))
	private Set<Role> roles;

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public String getStatus() {
		return status;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
