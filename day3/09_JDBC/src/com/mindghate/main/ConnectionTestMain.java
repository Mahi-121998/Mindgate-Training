package com.mindghate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestMain {
	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mindgate123");
			System.out.println("Connected!!!!!:-)");
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed to Load Driver");
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
	}

}
