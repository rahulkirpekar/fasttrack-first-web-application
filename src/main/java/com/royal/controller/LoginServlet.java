package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("=====LoginServlet---doGet()=====");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		System.out.println("UserName : " + userName);
		System.out.println("Password : " + password);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("=====LoginServlet---doPost()=====");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		System.out.println("UserName : " + userName);
		System.out.println("Password : " + password);
		
	}
}
