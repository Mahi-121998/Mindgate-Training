package com.mindgate.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;
import com.mindgate.rowmapper.EmployeeRowMapper;

@Repository
@Scope("prototype")
public class EmployeeDAO implements EmployeeDAOInterface {
	
	private int result;
	private JdbcTemplate jdbcTemplate;
	private static final String INSERT_EMPLOYEE="INSERT INTO employee_details(name,salary) VALUES(?,?)";
	
	private static final String SELECT_ALL_EMPLOYEES="SELECT * FROM employee_details";
	private static final String SELECT_SINGLE_EMPLOYEE="SELECT * FROM employee_details WHERE employee_id=?";
	private static final String UPDATE_EMPLOYEE="UPDATE employee_details set name=?,salary=? WHERE employee_id=?";
	private static final String DELETE_EMPLOYEE="DELETE employee_details WHERE employee_id=?";
	public EmployeeDAO() {
	}
	@Autowired
	public EmployeeDAO(DataSource dataSource) {
		
		jdbcTemplate =new JdbcTemplate(dataSource);
				}
	
	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("insering new employees to the database");
		System.out.println(employee);
		
		Object[] args= { employee.getName(),employee.getSalary()};
		result= jdbcTemplate.update(INSERT_EMPLOYEE, args);
		if(result >0) {
			return true;
		}
		else {
				return false;
			}
				
				
		}
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees= jdbcTemplate.query(SELECT_ALL_EMPLOYEES, new EmployeeRowMapper());
		return allEmployees;
	}
	@Override
	public Employee getEmployeeByEmployeeID(int employeeID) {
		Object[] args= {employeeID};
		Employee employee=jdbcTemplate.queryForObject(SELECT_SINGLE_EMPLOYEE, args, new EmployeeRowMapper());
		
		return employee;
	}
	@Override
	public boolean deleteEmployeeByEMployeeID(int employeeID) {
		Object[] args= {employeeID};
		result=jdbcTemplate.update(DELETE_EMPLOYEE, args);
		if(result >0) {
			return true;
		}
		else {
				return false;
			}
		
		
		
	}
	@Override
	public boolean updateEmployee(Employee employee) {
		Object[] args= { employee.getName(),employee.getSalary(),
				employee.getEmployeeId()};
		result= jdbcTemplate.update(UPDATE_EMPLOYEE, args);
		if(result >0) {
			return true;
		}
		else {
				return false;
			}
				

		
	}
}
		
	


