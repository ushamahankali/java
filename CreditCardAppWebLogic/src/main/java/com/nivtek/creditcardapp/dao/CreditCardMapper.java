package com.nivtek.creditcardapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nivtek.creditcardapp.entity.CreditCard;

public class CreditCardMapper implements RowMapper<CreditCard>{
	
	@Override
	public CreditCard mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		CreditCard creditCard = new CreditCard();
		creditCard.setCardId(resultSet.getInt("cardId"));
		creditCard.setCustomerId(resultSet.getInt("customerId"));
		creditCard.setCardNo(resultSet.getString("cardNo"));
		creditCard.setCvv(resultSet.getString("cvv"));
		creditCard.setCreditLimit(resultSet.getInt("creditLimit"));
		creditCard.setActivationStatus(resultSet.getInt("activationStatus"));		
		creditCard.setApprovedDate(resultSet.getString("approvedDate"));
		creditCard.setExpirationDate(resultSet.getString("expirationDate"));
	
		return creditCard;
	}
}
