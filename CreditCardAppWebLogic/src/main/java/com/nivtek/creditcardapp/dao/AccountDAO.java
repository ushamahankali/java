package com.nivtek.creditcardapp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nivtek.creditcardapp.entity.Account;
import com.nivtek.creditcardapp.entity.CreditCard;

@Repository
public class AccountDAO {
	
	@Autowired
	private CreditCardDAO creditCardDAO;

	private JdbcTemplate templateObj;
	
	private static Logger logger = Logger.getLogger(AccountDAO.class);

	public void setDataSource(DataSource datasource) {
		this.templateObj = new JdbcTemplate(datasource);
	}
	
	public void saveAccount(String username, String password, String cardNo) {	
		CreditCard creditCard = creditCardDAO.getCreditCardByCardNo(cardNo);
		logger.debug("saving account, print creditcard:" +creditCard);
		
		String sql = "INSERT INTO accounts (cardId, username, password) VALUES(?,?,?)";	
		templateObj.update(sql, creditCard.getCardId(), username, password);	
	}
	
	public Account getAccountByUsername(String username) {
		String sql = "SELECT * FROM accounts WHERE username = '" + username + "'";
		List<Account> listOfAccount = templateObj.query(sql, new AccountMapper());	
		if(listOfAccount.size()==0) {
			return null;
		}
		return listOfAccount.get(0);
	}
	
	public Account getAccountByCardId(int cardId) {
		String sql = "SELECT * FROM accounts WHERE cardId = " + cardId;
		List<Account> listOfAccount = templateObj.query(sql, new AccountMapper());	
		if(listOfAccount.size()==0) {
			return null;
		}
		return listOfAccount.get(0);
	}

}
