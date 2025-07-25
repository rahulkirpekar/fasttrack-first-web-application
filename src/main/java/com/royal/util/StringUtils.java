package com.royal.util;

public class StringUtils 
{
	public static boolean isValidString(String value) 
	{
		return ((value != null) && (value.trim().length() > 0)) ? true : false;

	}
	
	public static void main(String[] args) 
	{
		String name = "rahul";
		System.out.println(StringUtils.isValidString(name));
		
	}
}
