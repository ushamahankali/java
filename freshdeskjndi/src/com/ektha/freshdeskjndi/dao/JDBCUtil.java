package com.ektha.freshdeskjndi.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * This returns Connection object after connecting to the DB
 *
 * @return the DB connection object
 */
public class JDBCUtil {
	public static Connection getConnection() {
		Context ctx = null;
		Connection jdbcConnection = null;

		try {

			// Loading the Driver
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("database");

			// getting the Connection
			jdbcConnection = ds.getConnection();
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (jdbcConnection != null) {
			System.out.println("Connection made to DB!");
		}
		return jdbcConnection;
	}

	Context ctx = null;

}
