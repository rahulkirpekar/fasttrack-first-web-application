package com.royal.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListStudentServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("ListStudentServlet : doGet()");
		
		StudentDao dao  = new StudentDao();
		
		ArrayList<StudentBean> list = dao.getAllStudentRecords();
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("liststudents.jsp");
		rd.forward(request, response);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req, resp);
	}

}
