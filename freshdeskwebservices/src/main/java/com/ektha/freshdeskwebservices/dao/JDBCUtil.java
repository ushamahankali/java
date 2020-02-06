package com.ektha.freshdeskwebservices.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*@Configuration
@PropertySource("classpath:database.properties")*/
public class JDBCUtil {

	public static Properties loadProperties() {
		Properties p = new Properties();

		try (FileInputStream fis = new FileInputStream(
				"C:\\bootcampjan2019\\development\\CoreJava\\freshdeskwebservices\\src\\main\\resources\\database.properties")) {
			p.load(fis);

		}

		catch (IOException e) {

			e.printStackTrace();
		}
		return p;
	}

	public Connection getConnectionToDatabase() {

		Properties properties = loadProperties();
		Connection connection = null;

		String dbname = properties.getProperty("db.dname");
		String url = properties.getProperty("db.url");
		String user = properties.getProperty("db.user");
		String password = properties.getProperty("db.password");

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

	/*
	 * Environment environment; private final String URL = "db.url"; private final
	 * String USER = "db.user";
	 *
	 * private final String DRIVER = "db.dname";
	 *
	 * private final String PASSWORD = "db.password";
	 */
}