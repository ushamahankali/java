/*
 * package com.ektha.tenantportalpsb.entity;
 *
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.PreparedStatement; import java.sql.ResultSet; import
 * java.sql.SQLException; import java.sql.Statement;
 *
 * public class TestJDBC { private final static String user = "root";
 *
 * private final static String password = "jayant"; static Connection connection
 * = null; static PreparedStatement prepareStatement = null; static Statement
 * stm = null; static ResultSet rs = null; static Connection jdbcConnection =
 * null;
 *
 * private final static String url = "jdbc:mysql://localhost:3306/sys";
 *
 * public static TenantInformation getTenantInfo(String suitNumber) throws
 * ClassNotFoundException, SQLException {
 *
 * System.out.println("hello tenantDAO"); TenantInformation tentinfo = new
 * TenantInformation();
 *
 * try { // Loading the Driver Class.forName("com.mysql.cj.jdbc.Driver");
 * System.out.println("hello tenantDAO"); // getting the Connection
 * jdbcConnection = DriverManager.getConnection(url, user, password);
 * System.out.println("hello tenantDAO"); // writing the SQL query
 *
 * // preparing the statement stm = jdbcConnection.createStatement();
 * System.out.println("hello tenantDAO"); rs =
 * stm.executeQuery("select * from tenantinformation where suitnumber ='" +
 * suitNumber + "'"); System.out.println("hello tenantDAO"); // reading the
 * while (rs.next()) { System.out.println("hello tenantDAO");
 * tentinfo.setCompanyName(rs.getString("companyname"));
 * tentinfo.setSuitNumber(rs.getString("suitnumber"));
 * tentinfo.setPhoneNumber(rs.getString("phonenumber"));
 * tentinfo.setEmailId(rs.getString("emailid")); } rs.close(); return tentinfo;
 * } catch (SQLException logOrIgnore) { } if (stm != null) try { stm.close(); }
 * catch (SQLException logOrIgnore) { } if (jdbcConnection != null) try {
 * jdbcConnection.close(); } catch (SQLException logOrIgnore) { }
 *
 * return null; }
 *
 * public static void insertTenantInformation(TenantInformation tenantInfo) {
 * try { // Loading the Driver Class.forName("com.mysql.cj.jdbc.Driver");
 *
 * // getting the Connection jdbcConnection = DriverManager.getConnection(url,
 * user, password);
 *
 * // writing the SQL query
 *
 * String sql = "insert into tenantinformation values (?,?,?,?) "; // preparing
 * the statement prepareStatement = jdbcConnection.prepareStatement(sql);
 * TenantInformation tenantinfo = new TenantInformation(); // inserting the data
 * prepareStatement.setString(1, tenantinfo.getiD());
 * prepareStatement.setString(2, tenantinfo.getCompanyName());
 * prepareStatement.setString(3, tenantinfo.getSuitNumber());
 * prepareStatement.setString(4, tenantinfo.getPhoneNumber());
 * prepareStatement.setString(5, tenantinfo.getEmailId());
 * System.out.println("hello tenantcontroler"); int numRowsInserted =
 * prepareStatement.executeUpdate();
 *
 * System.out.println("Number of rows inserted into the database: " +
 * numRowsInserted);
 *
 * } catch (SQLException se) { // Handle errors for JDBC se.printStackTrace(); }
 * catch (Exception e) { // Handle errors for Class.forName e.printStackTrace();
 * } }
 *
 * public static void main(String[] args) { try { TenantInformation
 * tenantDetails = getTenantInfo("150");
 *
 * if (tenantDetails != null) {
 *
 * System.out.println("Company Name: " + tenantDetails.getCompanyName());
 * System.out.println("Suit Number :" + tenantDetails.getSuitNumber());
 * System.out.println("Phone Number :" + tenantDetails.getPhoneNumber());
 * System.out.println("Email Id :" + tenantDetails.getEmailId()); } } catch
 * (Exception e) { } } // TODO Auto-generated method stub }// end try //
 * System.out.println("Goodbye!");
 */