package com.nivtek.creditcardapp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nivtek.creditcardapp.entity.CreditCard;

@Repository
public class CreditCardDAO {
	
	private JdbcTemplate templateObj;

	public void setDataSource(DataSource datasource) {
		this.templateObj = new JdbcTemplate(datasource);
	}
	
	public CreditCard getCreditCardByCardNo(String cardNo) {
		String sql = "SELECT * FROM creditcards WHERE cardNo = '"+ cardNo +"'";
		List<CreditCard> listOfCreditCard = templateObj.query(sql, new CreditCardMapper());	
		if(listOfCreditCard.size()==0) {
			return null;		
		}
		return listOfCreditCard.get(0);				
	}
	
	public void saveCreditCard(CreditCard creditCard) {
		String sql = "INSERT INTO creditcards (customerId, cardNo, cvv, creditLimit, activationStatus, approvedDate, expirationDate) VALUES (?,?,?,?,?,?,?)";
		templateObj.update(sql, creditCard.getCustomerId(), creditCard.getCardNo(), creditCard.getCvv(), creditCard.getCreditLimit(), creditCard.getActivationStatus(), creditCard.getApprovedDate(),creditCard.getExpirationDate());
	}

	public int getActivationStatus(String cardNo) {		
		return getCreditCardByCardNo(cardNo).getActivationStatus();			
	}

	public int getCustomerIdByCardNo(String cardNo) {
		if(getCreditCardByCardNo(cardNo)==null) {
			return -1;	
		}
		return getCreditCardByCardNo(cardNo).getCustomerId();
	}

	public void activateCard(String cardNo) {
		String sql = "UPDATE creditcards SET activationStatus = 1 WHERE cardNo = '" + cardNo +"'";
		templateObj.update(sql);		
	}

	public CreditCard getCreditCardByCardId(int cardId) {
		String sql = "SELECT * FROM creditcards WHERE cardId = "+ cardId;
		List<CreditCard> listOfCreditCard = templateObj.query(sql, new CreditCardMapper());	
		if(listOfCreditCard.size()==0) {
			return null;		
		}
		return listOfCreditCard.get(0);
	}
}
