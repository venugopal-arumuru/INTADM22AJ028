package com.java.jdbc1;

import java.sql.*;
import java.util.*;
public class AddERow2 {

	public static void main(String[] args) throws SQLException {
		//insert into emp(empname, job, salary) values('Satya', 'Manager', 12000);
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Employee Name ");
			String ename = sc.next();
			System.out.println("Employee Job ");
			String job = sc.next();
			System.out.println("Employee Salary ");
			int sal = sc.nextInt();
			
			String inscmd = "insert into emp(empname, job, salary) values('";
			inscmd = inscmd + ename + "','" + job + "'," + sal + ")";
			System.out.println(inscmd);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/INTADM22AJ028", "root", "root");
			Statement stmt = conObj.createStatement();
			stmt.executeUpdate(inscmd);
			System.out.println("Row is Added....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}		
	}
}
