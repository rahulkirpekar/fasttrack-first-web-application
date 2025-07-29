package com.royal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.royal.bean.StudentBean;
import com.royal.util.DBConnection;

public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO students (fullname,email,phone,gender,hobbies,course,dob) VALUES (?,?,?,?,?,?,?)";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
				
				pstmt.setString(1, sbean.getFullname());
				pstmt.setString(2, sbean.getEmail());
				pstmt.setString(3, sbean.getPhone());
				pstmt.setString(4, sbean.getGender());
				
				
				String h[] = sbean.getHobbies();
				StringBuilder hobbies = new StringBuilder();
				for (String hobby : h) 
				{
					hobbies.append(hobby+",");
				}
				System.out.println("hobbies : " + hobbies);
				pstmt.setString(5, hobbies.toString());
				pstmt.setString(6, sbean.getCourse());
				pstmt.setString(7, sbean.getDob());
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not connected");
		}
		return rowsAffected;
	}
}
