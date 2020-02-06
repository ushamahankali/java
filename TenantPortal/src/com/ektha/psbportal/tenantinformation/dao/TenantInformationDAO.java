package com.ektha.psbportal.tenantinformation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ektha.psbportal.tenantinformation.entity.TenantInformation;

public class TenantInformationDAO {

	private final String url = "jdbc:mysql://localhost:3306/sys";
	private final String user = "root";
	private final String password = "ektha";
	PreparedStatement prepareStatement = null;
	Connection jdbcConnection = null;

	public List<TenantInformation> getTenantInformation() {

		List<TenantInformation> tenentList = new ArrayList<TenantInformation>();

		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// System.out.println("hello how r u");
			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);
			// System.out.println("this is for conncetion");
			// writing the SQL query
			String sql = "select * from tenantinformation ";
			// preparing the statement
			prepareStatement = jdbcConnection.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery(sql);

			// reading the resultSet
			while (rs.next()) {
				TenantInformation tentinfo = new TenantInformation();
				tentinfo.setCompanyName(rs.getString("companyname"));
				tentinfo.setSuitNumber(rs.getInt("suitnumber"));
				tentinfo.setPhoneNumber(rs.getInt("phonenumber"));
				tentinfo.setEmailId(rs.getString("emailid"));
				tenentList.add(tentinfo);

			}
			rs.close();
		} catch (

		SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (prepareStatement != null)
					jdbcConnection.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (jdbcConnection != null)
					jdbcConnection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
			// System.out.println("Goodbye!");
		return tenentList;

	}// end main
}// end JDBCExample