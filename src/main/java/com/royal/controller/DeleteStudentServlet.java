package com.royal.controller;

import java.io.IOException;

import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteStudentServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		
		StudentDao dao= new StudentDao();
		
		int rowsAffected = dao.deleteStudent(id);
		
		RequestDispatcher rd = request.getRequestDispatcher("ListStudentServlet");
		
		if (rowsAffected > 0) 
		{
			request.setAttribute("dbError", "<font color='Green'> Record successfully Deleted</font>");
			
		} else 
		{
			request.setAttribute("dbError", "<font color='red'> Database Deletion Error</font>");
		}
		rd.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		super.doPost(req, resp);
	}
}
