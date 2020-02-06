package com.ektha.freshdesknextgenjdbc.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:database.properties")
public class JDBCUtil {

	@Autowired
	Environment environment;

	private final String URL = "db.url";
	private final String USER = "db.user";
	private final String DRIVER = "db.dname";
	private final String PASSWORD = "db.password";

	@Bean
	public DataSource getConnectionToDatabase() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(environment.getProperty(DRIVER));
		dataSource.setUrl(environment.getProperty(URL));
		dataSource.setUsername(environment.getProperty(USER));
		dataSource.setPassword(environment.getProperty(PASSWORD));

		return dataSource;
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getConnectionToDatabase());

	}
}