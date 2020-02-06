package com.nivtek.creditcardapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nivtek.creditcardapp.entity.Contact;

public class ContactMapper implements RowMapper<Contact>{
	
	@Override
	public Contact mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Contact contact = new Contact();
		contact.setContactId(resultSet.getInt("contactId"));
		contact.setCustomerId(resultSet.getInt("customerId"));
		contact.setAddress(resultSet.getString("address"));
		contact.setApt(resultSet.getString("apt"));
		contact.setCity(resultSet.getString("city"));
		contact.setState(resultSet.getString("state"));
		contact.setZipcode(resultSet.getString("zipcode"));
		contact.setPhone(resultSet.getString("phone"));
		contact.setEmail(resultSet.getString("email"));

		return contact;
	}
}
