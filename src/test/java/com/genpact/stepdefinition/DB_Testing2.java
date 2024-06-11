package com.genpact.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Testing2 {
	
	
	
	
	//Database connection with Selenium Date 11-6-2024
	
	 public static void main(String args[]) throws ClassNotFoundException, SQLException {
		 
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/campus", "root", "Mathura@!0809");
		 
		 Statement smt=conn.createStatement();
		ResultSet rs= smt.executeQuery("select * from campus.Item");
		
		while(rs.next()) {
			
			String firstName=rs.getString("FirstName");
			System.out.println(firstName);
			System.out.println("dataBase Connected");
		}
	 }
}
