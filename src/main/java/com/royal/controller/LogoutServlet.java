package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = 	request.getSession(false);

		if (session != null) 
		{
			// session destroy----
			session.invalidate();
			
			request.setAttribute("logoutSuccess", "<font color='green'>Logout succsfully</font>");
			
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		} else 
		{
			response.sendRedirect("login.jsp");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req, resp);
	}

}
