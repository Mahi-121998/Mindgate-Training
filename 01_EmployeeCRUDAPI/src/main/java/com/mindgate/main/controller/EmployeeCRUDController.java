package com.mindgate.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.Employee;
import com.mindgate.main.service.EmployeeServiceInterface;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("employeecrud")
public class EmployeeCRUDController {
	
	@Autowired
	private EmployeeServiceInterface employeeService;
	
	@RequestMapping(value= "employee", method = RequestMethod.POST)
	public boolean addNewEmployee(@RequestBody Employee employee) {
		System.out.println("object recived");
		System.out.println(employee);
		return employeeService.addNewEmployee(employee);
	}

}
