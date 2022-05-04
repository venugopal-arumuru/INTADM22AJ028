package com.java.jdbc1;

import java.sql.*;

public class ConnEx {

	public static void main(String[] args) throws SQLException {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/INTADM22AJ028", "root", "root");
			if(conObj!=null)
				System.out.println("Connected");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}

}
