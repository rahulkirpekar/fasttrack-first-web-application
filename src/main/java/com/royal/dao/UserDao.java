package com.royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.royal.util.DBConnection;

public class UserDao 
{
	public static boolean authenticUser(String userName,String password) 
	{
		String selectQuery = "SELECT  * from users WHERE userName='"+userName+"' AND password='"+password+"'";
		
		System.out.println("selectQuery : " + selectQuery);

		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				ResultSet rs =	stmt.executeQuery(selectQuery);
				
				if (rs.next()) 
				{
					return true;
				}else 
				{
					return false;
				}
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			} 
			
		} else 
		{
			System.out.println("Db not connected");
		}
		return false;
	}
}
