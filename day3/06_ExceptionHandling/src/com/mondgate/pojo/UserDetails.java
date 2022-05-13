package com.mondgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {
	int Userid;
	String name;
	int age;
	public void acceptUserDetails() {
		try {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter Your Nmae");
		name=scanner.next();
		
		System.out.println("Enter Your id");
		Userid = scanner.nextInt();
		
		System.out.println("Enter Your age");
		age = scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Invaliud user input");
			System.out.println("pleas put valid input");
			
		}
		
	}
	public void displayUserDetails()
	{ 
		System.out.println(Userid);
		System.out.println(name);
		System.out.println(age);
		
	}
}
