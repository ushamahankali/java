package com.nivtek.creditcardapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nivtek.creditcardapp.entity.Application;

public class ApplicationMapper implements RowMapper<Application>{
	
	@Override
	public Application mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Application application = new Application();
		application.setApplicationId(resultSet.getInt("applicationId"));
		application.setCustomerId(resultSet.getInt("customerId"));
		application.setQuestionId(resultSet.getInt("questionId"));
		application.setWord(resultSet.getString("word"));
		return application;
	}
}
