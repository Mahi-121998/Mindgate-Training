package com.mondgate.main;

import com.mondgate.pojo.UserDetails;

public class UserDetailsMain {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main starts");
		UserDetails details=new UserDetails();
		details.acceptUserDetails();
		details.displayUserDetails();
		System.out.println("main ends");
		Class.forName("com.mindgate.pojo.UserDetails");
		
	}

}



