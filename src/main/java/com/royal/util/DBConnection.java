package com.royal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Java Program---connect--->Database
public class DBConnection 
{
	// 1. Make credentials
	private static final String URLNAME     ="jdbc:mysql://localhost:3306/fulldaydb";
	private static final String DRIVERCLASS ="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME    ="root";
	private static final String PASSWORD	="root";
	
	// 2. create getConnection method
	public static Connection getConnection() 
	{
		Connection conn = null; 
		try 
		{
			// 3. Load Driver class
			Class.forName(DRIVERCLASS);
			
			// 4. Pass credentials into DriverManager's getConnection method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
			// 5. validate conn object
			if (conn != null) 
			{
				System.out.println("Db Connected : "  + conn);
			} else 
			{
				System.out.println("Db Not Connected : "  + conn);
			}
			
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) 
	{
		Connection conn = DBConnection.getConnection();
		System.out.println("conn : " + conn);
	}
}