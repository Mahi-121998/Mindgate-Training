package com.mindghate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.security.auth.PrivateCredentialPermission;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";

		int result = 0;
		String sqlQuery = "";

		Connection connection;
		// Statement statement;
		PreparedStatement preparedStatement;
		ResultSet resultset;

		System.out.println("employee Details");
		System.out.println("*".repeat(50));
		
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, username, password);
			sqlQuery="SELECT * FROM  employee_details";
			preparedStatement=connection.prepareStatement(sqlQuery);
			resultset=preparedStatement.executeQuery();
			
			while(resultset.next()) {
				System.out.println(resultset.getInt("employee_id"));
				System.out.println(resultset.getString("name"));
				System.out.println(resultset.getDouble("salary"));
				System.out.println("+".repeat(50));
			}
			connection.close();
			} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}

//		System.out.println("Deleted");
//		
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, username, password);
//			sqlQuery="DELETE employee_details WHERE employee_id=?";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setInt(1, 6);
//			result=preparedStatement.executeUpdate();
//			connection.close();
//			if(result>0) {
//				System.out.println("deletd");
//			}
//			else {
//				System.out.println("failed");
//			}
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}
//		

//		System.out.println("Updated Example");
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, username, password);
//			sqlQuery="UPDATE employee_details SET name=?,salary=? WHERE employee_id=?";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "shashi");
//			preparedStatement.setDouble(2, 90000);
//			preparedStatement.setInt(3,6);
//			result=preparedStatement.executeUpdate();
//			connection.close();
//			if(result>0) {
//				System.out.println("updates!!");
//			}
//			else {
//				System.out.println("failed");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

//		System.out.println("Inserted Example");
//
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, username, password);
//			sqlQuery = "INSERT INTO employee_details(name,salary) VALUES(?,?)";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "mahima");
//			preparedStatement.setDouble(2, 600000);
//			
//			result = preparedStatement.executeUpdate();
//			connection.close();
//			if (result > 0) {
//				System.out.println("record inserted !!");
//			} else {
//				System.out.println("failed to insert");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exceptions");
//			System.out.println(e.getMessage());
//		}
	}

}
