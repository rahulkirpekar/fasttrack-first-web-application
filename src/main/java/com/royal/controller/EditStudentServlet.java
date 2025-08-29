package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class EditStudentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		HttpSession session = request.getSession(false);
		RequestDispatcher rd = null;
		
		if (session == null) 
		{
			response.sendRedirect("login.jsp");

		} else 
		{

			int id = Integer.parseInt(request.getParameter("id"));

			StudentDao dao = new StudentDao();

			StudentBean sbean = dao.getStudentById(id);

			if (sbean == null) 
			{
				request.setAttribute("dbError", "<font color='red'> Database Connection Error</font>");
				rd = request.getRequestDispatcher("ListStudentServlet");
			} else 
			{
				request.setAttribute("sbean", sbean);
				rd = request.getRequestDispatcher("editstudent.jsp");

			}
		}
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

}
