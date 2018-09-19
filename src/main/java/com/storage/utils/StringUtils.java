package com.storage.utils;

import java.util.regex.Pattern;

public class StringUtils {
	private static Pattern p;
	static {
		  String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	        
	 
	        p = Pattern.compile(regEx1);

		
	}

	public static boolean isEmpty(String str){
		return ((str==null) ||str.trim().equals(""));
	}
	
	public static boolean isEmail(String str){
		if((str==null) ||str.trim().equals(""))
			return false;
		System.out.println(str);
		 return p.matcher(str).matches();
        
		
	}
	
}
