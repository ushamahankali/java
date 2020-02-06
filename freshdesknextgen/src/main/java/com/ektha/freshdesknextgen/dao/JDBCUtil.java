package com.ektha.freshdesknextgen.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:database.properties")
public class JDBCUtil {

	@Autowired
	Environment environment;

	private final String URL = "db.url";

	private final String USER = "db.user";
	private final String DRIVER = "db.dname";
	private final String PASSWORD = "db.password";

	public Connection getConnectionToDatabase() {

		Connection connection = null;

		String dbname = environment.getProperty(DRIVER);
		String url = environment.getProperty(URL);
		String user = environment.getProperty(USER);
		String password = environment.getProperty(PASSWORD);

		try {
			Class.forName(dbname);

			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conncetion created");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("Connection made to DB!");
		}
		return connection;
	}

}
