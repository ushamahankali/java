package com.techprimers.jpa.springjpahibernateexample.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users", catalog = "world")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer id;
	@Column(name = "name")
	private String name;
	private Integer salary;
	private String teamName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private List<UsersLog> usersLogs;

	public Users() {
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	public String getTeamName() {
		return teamName;
	}

	public List<UsersLog> getUsersLogs() {
		return usersLogs;
	}

	public Users setId(Integer id) {
		this.id = id;
		return this;
	}

	public Users setName(String name) {
		this.name = name;
		return this;
	}

	public Users setSalary(Integer salary) {
		this.salary = salary;
		return this;
	}

	public Users setTeamName(String teamName) {
		this.teamName = teamName;
		return this;
	}

	public void setUsersLogs(List<UsersLog> usersLogs) {
		this.usersLogs = usersLogs;
	}
}
