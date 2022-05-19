package com.mindgate.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;


public class EmployeeCRUDMain {
	public static void main(String[] args) {
		
		Employee employee= new Employee(101, "mahi", 2000);
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeServiceInterface employeeServiceInterface=applicationContext.getBean("employeeService", EmployeeService.class);
		
//		boolean result= employeeServiceInterface.addNewEmployee(employee);
//		if(result) {
//			System.out.println("employee added succesffully");
//		}
//		else {
//			System.out.println("failed to add employee");
//		}
//		List<Employee> allEmployees=employeeServiceInterface.getAllEmployees();
//		
//		for(Employee emp: allEmployees) {
//			System.out.println(emp);
//		}
//		System.out.println("*".repeat(50));
//		
//		Employee mahi=employeeServiceInterface.getEmployeeByEmployeeID(41);
//		System.out.println(mahi);
//		
		
//		Employee emp= new Employee(23, "shashi", 90000);
//		boolean result= employeeServiceInterface.updateEmployee(emp);
//		if(result) {
//			System.out.println("employee updated succesffully");
//		}
//		else {
//			System.out.println("failed to add employee");
//		}
//		
		boolean result=employeeServiceInterface.deleteEmployeeByEMployeeID(23);
		if(result) {
		System.out.println("employee deleted succesffully");
	}
	else {
		System.out.println("failed to delete employee");
	}
		
	}

}
