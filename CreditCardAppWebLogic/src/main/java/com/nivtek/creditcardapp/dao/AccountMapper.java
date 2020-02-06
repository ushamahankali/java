package com.nivtek.creditcardapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nivtek.creditcardapp.entity.Account;

public class AccountMapper implements RowMapper<Account>{
	
	@Override
	public Account mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Account account = new Account();
		account.setAccountId(resultSet.getInt("accountId"));
		account.setCardId(resultSet.getInt("cardId"));
		account.setUsername(resultSet.getString("username"));
		account.setPassword(resultSet.getString("password"));
		return account;
	}
}
