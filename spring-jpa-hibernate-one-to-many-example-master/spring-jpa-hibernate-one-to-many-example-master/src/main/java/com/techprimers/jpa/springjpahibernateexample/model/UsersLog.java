package com.techprimers.jpa.springjpahibernateexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users_log", catalog = "world")
@Entity
public class UsersLog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "log_id")
	private Integer id;

	private String log;

	@Column(name = "user_id")
	private Integer userId;

	public UsersLog() {
	}

	public Integer getId() {
		return id;
	}

	public String getLog() {
		return log;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
