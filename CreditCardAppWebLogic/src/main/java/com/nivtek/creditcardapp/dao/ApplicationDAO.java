package com.nivtek.creditcardapp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nivtek.creditcardapp.entity.Application;

@Repository
public class ApplicationDAO {
	
	private JdbcTemplate templateObj;

	public void setDataSource(DataSource datasource) {
		this.templateObj = new JdbcTemplate(datasource);
	}
	
	public void saveApplication(Application application) {
		String sql = "INSERT INTO applications (customerId, questionId, word) VALUES(?,?,?)";	
		templateObj.update(sql, application.getCustomerId(), application.getQuestionId(), application.getWord());	
	}

	public Application getApplicationByCustomerId(int customerId) {
		String sql = "SELECT * FROM applications WHERE customerId = " + customerId;
		List<Application> listOfApplication = templateObj.query(sql, new ApplicationMapper());	
		if(listOfApplication.size()==0) {
			return null;
		}
		return listOfApplication.get(0);
	}
}
