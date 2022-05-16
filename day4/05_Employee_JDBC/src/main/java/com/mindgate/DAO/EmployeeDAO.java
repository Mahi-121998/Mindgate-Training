package com.mindgate.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private int result=0;
	
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String user="system";
	private String password="mindgate123";
	private String query="";
	
	public Set<Employee> getAllEmployees(){
		try {
			Class.forName(driver);
			connection= DriverManager.getConnection(url, user, password);
			query=" select * from employee_details";
			preparedStatement=connection.prepareStatement(query);
			resultSet=preparedStatement.executeQuery()	;
			
			Set<Employee> employees= new HashSet<Employee>();
			while(resultSet.next()) {
				int employeeid=resultSet.getInt("employee_id");
				String name= resultSet.getString("name");
				double salary= resultSet.getDouble("salary");
				
				Employee employee=new Employee(employeeid, name, salary);
				 employees.add(employee);
				
			}
			return employees;
			} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
			
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Exception");
				System.out.println(e.getMessage());
			}
		}
		return null;
		
	
	}

public boolean addEmployee(Employee employee) {
	try {
		Class.forName(driver);
		connection=DriverManager.getConnection(url, user, password);
		query="insert into employee_details(name,salary) values(?,?)";
		preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setDouble(2, employee.getSalary());
		result= preparedStatement.executeUpdate();
	
		if(result>0) {
			return true;
		
		}
		else {
			return false;
			
		}
	
	
	}
	catch (ClassNotFoundException | SQLException e) {
		System.out.println("Exception");
		System.out.println(e.getMessage());
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}
	return false;
	
}
}
