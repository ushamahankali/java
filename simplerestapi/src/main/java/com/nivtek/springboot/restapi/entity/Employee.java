package com.nivtek.springboot.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String lastname;

	private String title;

	public int getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
