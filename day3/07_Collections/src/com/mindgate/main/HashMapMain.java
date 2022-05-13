package com.mindgate.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap =new HashMap<Integer, String>();
		
		employeeMap.put(101, "mahima");
		employeeMap.put(102,"vinaya");
		employeeMap.put(103, "komal");
		employeeMap.put(104, "sashank");
		employeeMap.put(105, "Vaibhav");
		
		System.out.println(employeeMap);
	}

}
