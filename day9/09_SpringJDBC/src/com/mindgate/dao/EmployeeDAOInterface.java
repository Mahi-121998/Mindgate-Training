package com.mindgate.dao;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeDAOInterface {
	public boolean addNewEmployee(Employee employee); 
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeByEmployeeID(int employeeID);
	
	public boolean deleteEmployeeByEMployeeID(int employeeID);
	
	public boolean updateEmployee(Employee employee );

}

