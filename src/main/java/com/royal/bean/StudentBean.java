package com.royal.bean;

public class StudentBean 
{
	private String fullname =null;
	private String email    =null;
	private String phone    =null;
	private String gender   =null;
	private String course   =null;
	private String dob		=null;
	
	public StudentBean() {
		// TODO Auto-generated constructor stub
	}

	public StudentBean(String fullname, String email, String phone, String gender, String course, String dob) {
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.course = course;
		this.dob = dob;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

}
