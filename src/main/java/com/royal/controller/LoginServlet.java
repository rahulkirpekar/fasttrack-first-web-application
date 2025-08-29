package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("=====LoginServlet---doGet()=====");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		RequestDispatcher rd=  null;
		
		HttpSession session = null;
		
		if(	((userName!=null) && (userName.trim().length() > 0)) 	&& (((password!=null) && (password.trim().length() > 0)))	) 
		{
			if((userName.trim().equals("rahulkirpekar")) && (password.trim().equals("rahul@123"))) 
			{
				// create session object
				session = request.getSession();
				
				session.setAttribute("userName", userName);
				
				rd=  request.getRequestDispatcher("studregi.jsp");
				
				
			}else 
			{
				request.setAttribute("loginCrdErr", "Login Credentials Invalid,\n\tPLease enter valid Username and Password");
				rd=  request.getRequestDispatcher("login.jsp");

			}
		}else 
		{
			System.out.println("outer else");
			request.setAttribute("loginCrdErr", "Login Credentials Invalid,\n\tPLease enter valid Username and Password");
			rd=  request.getRequestDispatcher("login.jsp");
		}
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
