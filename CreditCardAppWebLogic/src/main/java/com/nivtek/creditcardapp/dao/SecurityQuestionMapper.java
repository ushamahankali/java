package com.nivtek.creditcardapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nivtek.creditcardapp.entity.SecurityQuestion;

public class SecurityQuestionMapper implements RowMapper<SecurityQuestion>{
	
	@Override
	public SecurityQuestion mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		SecurityQuestion securityQuestion = new SecurityQuestion();
		securityQuestion.setQuestionId(resultSet.getInt("questionId"));
		securityQuestion.setQuestion(resultSet.getString("question"));
		return securityQuestion;
	}
}
