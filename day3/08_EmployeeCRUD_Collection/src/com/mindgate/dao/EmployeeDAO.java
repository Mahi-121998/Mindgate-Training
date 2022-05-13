package com.mindgate.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> employeeSet = new HashSet<Employee>();
	
	public boolean addNewEmployee(Employee employee) {
		return  employeeSet.add(employee);
		
	}

	public boolean updateEmployee(Employee employee) {
		for (Employee emp : employeeSet) {
			if(emp.getEmpId()== employee.getEmpId()) {
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				return true;
			}
			
		
		}

		return false;
	}
	public boolean deleteEmployeeByEmployeeID(int employeeID) {
		for (Employee employee : employeeSet) {
			if(employee.getEmpId() == employeeID) {
				return employeeSet.remove(employee);
			}		}
		return false;
	}
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmpId() == employeeId)
				return employee;
			
		}
		return null;
		
	}
	public Set<Employee> getAllEmployees()
{	return employeeSet;
		}
}
