package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArrayListDemo;
import com.mindgate.pojo.Employee;

public class ArrayListMain {
	public static void main(String[] args) {
		ArrayListDemo arrayListDemo=new ArrayListDemo();
		List<String> nameList= new ArrayList<String>();
		nameList.add("Mahima");
		nameList.add("Vinaya");
		nameList.add("Komal");
		arrayListDemo.setArrayListId(101);
		arrayListDemo.setNameList(nameList);
		
		
		System.out.println(arrayListDemo);
		System.out.println("-".repeat(50));
		List<Integer> numberList=new ArrayList<Integer>();
		numberList.add(101);
		numberList.add(102);
		numberList.add(102);
		System.out.println(numberList);
		System.out.println("-".repeat(50));
		Employee employee1=new Employee(101, "mahi",	1000 );
		Employee employee2=new Employee(102, "vinni",	2000 );
		Employee employee3=new Employee(103, "komal",	3000 );
		Employee employee4=new Employee(104, "Shshi",	4000 );

		List<Employee> employeeList= new ArrayList<Employee>();
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		System.out.println(employeeList);
		
		System.out.println("-".repeat(50));
		
		for  (Employee employee : employeeList) {
			System.out.println(employee);
			
		}
		
		
		
		}

}
