package com.nivtek.creditcardapp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nivtek.creditcardapp.entity.Contact;

@Repository
public class ContactDAO {
	
	private JdbcTemplate templateObj;

	public void setDataSource(DataSource datasource) {
		this.templateObj = new JdbcTemplate(datasource);
	}

	public void saveContact(Contact contact) {
		String sql = "INSERT INTO contacts (customerId, address, apt, city, state, zipcode, phone, email) VALUES(?,?,?,?,?,?,?,?)";	
		templateObj.update(sql, contact.getCustomerId(), contact.getAddress(), contact.getApt(), contact.getCity(), contact.getState(), contact.getZipcode(), contact.getPhone(), contact.getEmail());
	}
	
	public Contact getContactByCustomerId(int customerId) {
		String sql = "SELECT * FROM contacts WHERE customerId = " + customerId;
		List<Contact> listOfContact = templateObj.query(sql, new ContactMapper());	
		
		if(listOfContact.size()==0) {
			return null;
		}
		return listOfContact.get(0);	
	}		
}
