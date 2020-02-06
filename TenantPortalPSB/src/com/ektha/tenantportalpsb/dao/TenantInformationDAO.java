package com.ektha.tenantportalpsb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ektha.tenantportalpsb.entity.ContactDetails;
import com.ektha.tenantportalpsb.entity.TenantInformation;

public class TenantInformationDAO {

	private final String url = "jdbc:mysql://localhost:3306/sys";
	private final String user = "root";
	private final String password = "jayant";
	Connection connection = null;
	PreparedStatement prepareStatement = null;
	Statement stm = null;
	ResultSet rs = null;
	Connection jdbcConnection = null;

	/*
	 * getting the contat details of Tenant method implimentation in arrayList
	 *
	 */
	public List<TenantInformation> getContactDetails() {

		// List<TenantInformation> tenantInfoList = new List<TenantInformation>();

		List<TenantInformation> tenantInfoList = new ArrayList<TenantInformation>();

		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);

			// writing the SQL query
			String sql = "select tenantinformation.companyname, contactdetails.contactname, "
					+ "contactdetails.contacttype, contactdetails.phonenumber, contactdetails.emailid "
					+ "from tenantinformation inner join contactdetails on "
					+ "tenantinformation.companyid = contactdetails.companyid order by " + "companyname";
			// preparing the statement
			prepareStatement = jdbcConnection.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery(sql);

			TenantInformation tenantInfo = new TenantInformation();
			List<ContactDetails> contactList = new ArrayList<ContactDetails>();

			// reading the resultSet
			while (rs.next()) {

				if (tenantInfo.getCompanyName() != "") {
					if (tenantInfo.getCompanyName() != rs.getString("contactname")) {
						tenantInfo.setContactDetailsList(contactList);
						tenantInfoList.add(tenantInfo);

						tenantInfo = new TenantInformation();
						contactList = new ArrayList<ContactDetails>();
					}

				}

				ContactDetails contact = new ContactDetails();
				contact.setContactName(rs.getString("contactname"));
				contact.setContactType(rs.getString("contacttype"));
				contact.setEmailId(rs.getString("emailid"));
				contact.setPhoneNumber(rs.getString("phonenumber"));
				tenantInfo.setCompanyName(rs.getString("companyname"));
				contactList.add(contact);

			}

			tenantInfo.setContactDetailsList(contactList);
			tenantInfoList.add(tenantInfo);
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
		return tenantInfoList;
	}

	/*
	 * getting the contat details of Tenant method implimentation in HashMap
	 *
	 */
	public Map<String, TenantInformation> getContactListForAllTenant() {

		Map<String, TenantInformation> tenantMap = new HashMap<String, TenantInformation>();
		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);

			// writing the SQL query
			String sql = "select tenantinformation.companyname, contactdetails.contactname, "
					+ "contactdetails.contacttype, contactdetails.phonenumber, contactdetails.emailid "
					+ "from tenantinformation inner join contactdetails on "
					+ "tenantinformation.companyid = contactdetails.companyid order by " + "companyname";
			// preparing the statement
			prepareStatement = jdbcConnection.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery(sql);
			// System.out.println("Starting of DAO GetAll Tenant");
			TenantInformation tenantInfo = new TenantInformation();
			List<ContactDetails> contactList = tenantInfo.getContactDetailsList();
			while (rs.next()) {
				String companyName = rs.getString("companyname");

				if (!tenantMap.containsKey(companyName)) {
					if (tenantInfo.getCompanyName() != rs.getString("contactname")) {
						tenantInfo.setContactDetailsList(contactList);
						tenantInfo = new TenantInformation();
						contactList = new ArrayList<ContactDetails>();
						tenantMap.put(companyName, tenantInfo);
					}

				}

				ContactDetails contact = new ContactDetails();
				contact.setContactName(rs.getString("contactname"));
				contact.setContactType(rs.getString("contacttype"));
				contact.setEmailId(rs.getString("emailid"));
				contact.setPhoneNumber(rs.getString("phonenumber"));
				tenantInfo.setCompanyName(rs.getString("companyname"));
				contactList.add(contact);
				tenantMap.put(companyName, tenantInfo);

			}
			tenantInfo.setContactDetailsList(contactList);
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

		return tenantMap;

	}
	/*
	 * getting the contat details of Tenant based on suit Number
	 *
	 */

	public TenantInformation getTenantInfo(int suitNumber) throws ClassNotFoundException, SQLException {

		TenantInformation tentinfo = new TenantInformation();

		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);
			// writing the SQL query

			// preparing the statement
			stm = jdbcConnection.createStatement();

			rs = stm.executeQuery("select * from tenantinformation where suitnumber ='" + suitNumber + "'");

			// reading the resultSet
			while (rs.next()) {

				tentinfo.setCompanyName(rs.getString("companyname"));
				tentinfo.setSuitNumber(rs.getInt("suitnumber"));
				tentinfo.setPhoneNumber(rs.getString("phonenumber"));
				tentinfo.setEmailId(rs.getString("emailid"));
			}
			rs.close();
			return tentinfo;

		} catch (SQLException logOrIgnore) {
		}
		// finally block used to close resources
		finally {
			if (stm != null)
				try {
					stm.close();
				} catch (SQLException logOrIgnore) {
				}
			if (jdbcConnection != null)
				try {
					jdbcConnection.close();
				} catch (SQLException logOrIgnore) {
				}
		}
		return null;
	}// end main

	/*
	 * getting the details of Tenant
	 *
	 */
	public List<TenantInformation> getTenantInformation() {

		List<TenantInformation> tenantList = new ArrayList<TenantInformation>();

		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);

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
				tentinfo.setPhoneNumber(rs.getString("phonenumber"));
				tentinfo.setEmailId(rs.getString("emailid"));
				tenantList.add(tentinfo);

			}
			rs.close();

		} catch (SQLException se) {
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
		return tenantList;
	}

	/*
	 * saving the TenantInfomation into the Database
	 *
	 */

	public void saveTenantInformation(TenantInformation tenantInfo) {
		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);

			// writing the SQL query

			String sql = "insert into tenantinformation values (?,?,?,?,?) ";
			// preparing the statement
			prepareStatement = jdbcConnection.prepareStatement(sql);

			// inserting the data
			prepareStatement.setString(1, null);
			prepareStatement.setString(2, tenantInfo.getCompanyName());
			prepareStatement.setInt(3, tenantInfo.getSuitNumber());
			prepareStatement.setString(4, tenantInfo.getPhoneNumber());
			prepareStatement.setString(5, tenantInfo.getEmailId());
			int numRowsInserted = prepareStatement.executeUpdate();

			System.out.println("Number of rows inserted into the database: " + numRowsInserted);

		} catch (SQLIntegrityConstraintViolationException se) {
			// Handle errors for JDBC
			System.out.println("The entered suit number already available");
			// se.printStackTrace();
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
			// System.out.println("Goodbye!");
	}
}// end JDBCExample
