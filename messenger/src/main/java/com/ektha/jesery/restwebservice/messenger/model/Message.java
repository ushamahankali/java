package com.ektha.jesery.restwebservice.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long id;
	private String message;
	private Date created;
	private String author;

	public Message() {

	}

	public Message(long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}

	public String getAuthor() {
		return author;
	}

	public Date getCreated() {
		return created;
	}

	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
