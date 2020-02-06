package com.ektha.freshdeskweb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String category;
	private String priority;
	private String description;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
