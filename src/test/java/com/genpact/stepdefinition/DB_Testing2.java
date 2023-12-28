package com.genpact.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Testing2 {
	
	
	
	//Connection with Database Date//3-12-2023
	//Database connection with Selenium Date 28-12-2023
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/campus", "root", "Mathura@!0809");
		
		Statement smt=com.createStatement();
		ResultSet rs=smt.executeQuery("select * from campus.Item");
		
		while(rs.next()) {
			
			String firstname=rs.getString("FirstName");
			System.out.println(firstname);
		}
	}
}
