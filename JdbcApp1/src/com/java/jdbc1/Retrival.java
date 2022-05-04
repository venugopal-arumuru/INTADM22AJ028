package com.java.jdbc1;

import java.sql.*;

public class Retrival {

	public static void main(String[] args) throws SQLException {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/INTADM22AJ028", "root", "root");
			Statement stmt = conObj.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt("empno"));
				System.out.println(rs.getString("empname"));
				System.out.println(rs.getString("job"));
				System.out.println(rs.getInt("salary"));
				System.out.println("----------------");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}		
	}

}
