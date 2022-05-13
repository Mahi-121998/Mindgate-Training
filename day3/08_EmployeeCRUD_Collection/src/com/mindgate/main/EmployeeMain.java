package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		int id;
		String name;
		double salary;

		Employee employee ;
		int choice;
		boolean result;
		EmployeeDAO edao= new  EmployeeDAO();
		Scanner scanner=new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("1.Add new Employee");
		System.out.println("2.Delete empployee");
		System.out.println("2.Update new employee");
		System.out.println("3.Get  single employee by id");
		System.out.println("4.get all employee by id");
		System.out.println("Enter your choice");
		 
		choice=scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("enter your id");
			id=scanner.nextInt();
			System.out.println("Emter your name");
			name=scanner.next();
			System.out.println("enter your salary");
			 salary=scanner.nextDouble();
			
			employee=new Employee(101, "mahi", 1000);
			result=edao.addNewEmployee(employee);
			if(result) {
				System.out.println("Added succefully");
				
			}
			else {
				System.out.println("failed to add");
			}
			
			break;
		case 2:
			System.out.println("enter your id");
			id=scanner.nextInt();
			System.out.println("Emter your name");
			 name=scanner.next();
			System.out.println("enter your salary");
			salary=scanner.nextDouble();
			
			employee=new Employee(id, name, salary);
			result=edao.updateEmployee(employee);
			
			if(result) {
				System.out.println("Added succefully");
				
			}
			else {
				System.out.println("failed to add");
			}
			break;
		case 3:
			
			
			
			
			
			
			break;

		default:
			break;
		}
		
	}

}