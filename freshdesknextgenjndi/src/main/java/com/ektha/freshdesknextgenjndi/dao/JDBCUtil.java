package com.ektha.freshdesknextgenjndi.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

@Repository
public class JDBCUtil {

	Context ctx = null;

	public Connection getConnectionToDatabase() {

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

}
