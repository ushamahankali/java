package com.ektha.jesery.restwebservice.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {

	private long id;
	private String profileName;
	private String firstName;
	private String lastName;

	private Date created;

	public Profile() {

	}

	public Profile(long id, String profileName, String firstName, String lastName) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = new Date();
	}

	public Date getCreated() {
		return created;
	}

	public String getFirstName() {
		return firstName;
	}

	public long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

}
