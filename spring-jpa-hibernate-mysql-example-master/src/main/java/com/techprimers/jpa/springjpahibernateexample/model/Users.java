package com.techprimers.jpa.springjpahibernateexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", catalog = "world")
public class Users {

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	private Integer salary;
	private String teamName;

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

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}
