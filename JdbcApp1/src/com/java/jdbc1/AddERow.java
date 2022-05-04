package com.java.jdbc1;

import java.sql.*;

public class AddERow {

	public static void main(String[] args) throws SQLException {
		//insert into emp(empname, job, salary) values('Satya', 'Manager', 12000);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/INTADM22AJ028", "root", "root");
			Statement stmt = conObj.createStatement();
			stmt.executeUpdate("insert into emp(empname, job, salary) values('Satya', 'Manager', 12000)");
			System.out.println("Row is Added....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}

}
