package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mindgate.dao.EmployeeDAOInterface;
import com.mindgate.pojo.Employee;

@Service("employeeService")
@Scope("prototype")
public class EmployeeService implements EmployeeServiceInterface {
	
	@Autowired
	private EmployeeDAOInterface employeeDAOInterface;

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("inside employeeservice addNewEmployee()");
		System.out.println(employee);
		return employeeDAOInterface.addNewEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAOInterface.getAllEmployees();
	}

	@Override
	public Employee getEmployeeByEmployeeID(int employeeID) {
		return employeeDAOInterface.getEmployeeByEmployeeID(employeeID);
	}

	@Override
	public boolean deleteEmployeeByEMployeeID(int employeeID) {
		return employeeDAOInterface.deleteEmployeeByEMployeeID(41) ;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeDAOInterface.updateEmployee(employee);
	}

}
