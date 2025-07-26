package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;
import com.royal.util.StringUtils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		boolean flag = false;
		
		String fullname =request.getParameter("fullname");
		String email    =request.getParameter("email");
		String phone    =request.getParameter("phone");
		String gender   =request.getParameter("gender");
		
		String hobbies[] = request.getParameterValues("hobbies");
		
		String course   =request.getParameter("course");
		String dob  	 =   request.getParameter("dob");

		StudentBean sbean = new StudentBean();
		
		// data -- validate
		// fullname--validatation
		if(!StringUtils.isValidString(fullname)) 
		{
			flag = true;
			request.setAttribute("fullnameErr", "<font color = 'red'>Please enter valid FullName.</font>");
		}else 
		{
			sbean.setFullname(fullname); 
		}
		
		// email--validatation
		if(!StringUtils.isValidString(email)) 
		{
			flag = true;
			request.setAttribute("emailErr", "<font color = 'red'>Please enter valid Email.</font>");
		}else 
		{
			sbean.setEmail(email); 
		}
		// phone--validatation
		if(!StringUtils.isValidString(phone)) 
		{
			flag = true;
			request.setAttribute("phoneErr", "<font color = 'red'>Please enter valid Phone.</font>");
		}else 
		{
			sbean.setPhone(phone); 
		}		
		// gender--validatation
		if(!StringUtils.isValidString(gender)) 
		{
			flag = true;
			request.setAttribute("genderErr", "<font color = 'red'>Please enter valid Gender.</font>");
		}else 
		{
			sbean.setGender(gender); 
		}		

		// Hobbies--validatation
		if (  (hobbies == null)  || (hobbies.length == 0)) 
		{
			flag = true;
			request.setAttribute("hobbiesErr", "<font color = 'red'>Please select Hobby.</font>");
		} else 
		{
			sbean.setHobbies(hobbies);
		}
		
		// course--validatation
		if(!StringUtils.isValidString(course)) 
		{
			flag = true;
			request.setAttribute("courseErr", "<font color = 'red'>Please enter valid Course.</font>");
		}else 
		{
			sbean.setCourse(course) ;
		}		
		// dob--validatation
		if(!StringUtils.isValidString(dob)) 
		{
			flag = true;
			request.setAttribute("dobErr", "<font color = 'red'>Please enter valid Dob.</font>");
		}else 
		{
			sbean.setDob(dob); 
		}		

		RequestDispatcher rd = null;
		
		request.setAttribute("sbean", sbean);
		if (flag) 
		{
			rd = request.getRequestDispatcher("studregi.jsp");
		} else 
		{
			rd = request.getRequestDispatcher("ListStudentServlet");
		}
		rd.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
