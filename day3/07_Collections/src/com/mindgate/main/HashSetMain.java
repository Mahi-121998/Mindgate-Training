package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {
	public static void main(String[] args) {
		Set<String> nameSet= new  HashSet<String>();
		
		nameSet.add("mahi");
		nameSet.add("komal");
		nameSet.add("vini");
		System.out.println(nameSet);
		
		System.out.println("-".repeat(50));
		
		Employee employee1= new Employee(101,"mahi",1000 );
		System.out.println(employee1.hashCode());
		Employee employee2= new Employee(102,"vinni",2000 );
		System.out.println(employee2.hashCode());
		Employee employee3= new Employee(103,"komal",3000 );
		System.out.println(employee3.hashCode());
		Employee employee4= new Employee(101,"mahi",1000 );
		System.out.println(employee4.hashCode());
		Employee employee5= new Employee(105,"Sashi",5000 );
		System.out.println(employee5.hashCode());
		
		Set<Employee> employeeSet =new HashSet<Employee>()	;
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);
		employeeSet.add(employee5);
		
		for (Employee employee : employeeSet) {
			System.out.println(employee);
			
		}
		}

}
