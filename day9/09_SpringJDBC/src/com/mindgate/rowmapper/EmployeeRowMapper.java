package com.mindgate.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.pojo.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultset, int i) throws SQLException {
		int employeeID= resultset.getInt("employee_id");
		String name= resultset.getString("name");
		double salary= resultset.getDouble("salary");
		
		Employee employee= new Employee(employeeID, name, salary);
		return employee;
		
		
		
	}

}
