package com.java.jdbc1;

import java.sql.*;
import java.util.*;
public class AddERow3 {

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
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/INTADM22AJ028", "root", "root");
			PreparedStatement ps = conObj.prepareStatement("insert into emp(empname, job, salary) values(?,?,?)");
			ps.setString(1, ename);
			ps.setString(2, job);
			ps.setInt(3, sal);
			ps.executeUpdate();
			
			System.out.println("Row is Added....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
