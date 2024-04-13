package com.genpact.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Testing2 {
	
	
	
	
	//Database connection with Selenium Date 13-04-2024
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/campus", "root", "Mathura@!0809");
		Statement smt=con.createStatement();
		
		ResultSet rs=smt.executeQuery("select * from campus.Item");
		
		while(rs.next()) {
			
			String fName=rs.getString("FirstName");
			System.out.println(fName);
			System.out.println("DataBase updated date- 13-4-24");
		}
	}
}
