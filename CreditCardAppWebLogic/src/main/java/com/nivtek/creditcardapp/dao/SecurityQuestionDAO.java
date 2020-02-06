package com.nivtek.creditcardapp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nivtek.creditcardapp.entity.SecurityQuestion;

@Repository
public class SecurityQuestionDAO {
	
	private JdbcTemplate templateObj;
	
	public void setDataSource(DataSource datasource) {
		this.templateObj = new JdbcTemplate(datasource);
	}

	public List<SecurityQuestion> getSecurityQuestion() {
		String sql = "SELECT * FROM security_questions";
		List<SecurityQuestion> listOfQuestion = templateObj.query(sql, new SecurityQuestionMapper());
		return listOfQuestion;		
	}
}
