package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Java Class--->Servlet
public class FirstServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException 
	{
		System.out.println("FirstServlet---init()----"+this);
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Set MIME
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<h1>FirstServlet---service(HttpServletRequest request, HttpServletResponse response)--Hello World</h1>");
		System.out.println("FirstServlet---service()----"+this);
		System.out.println(request+"----------"+response);
		System.out.println("-------------------------------------------");
	}
	@Override
	public void destroy() 
	{
		System.out.println("FirstServlet---destroy()----"+this);
	}
}
