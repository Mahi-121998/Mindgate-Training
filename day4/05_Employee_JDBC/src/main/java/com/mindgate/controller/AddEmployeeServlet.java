package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.DAO.EmployeeDAO;
import com.mindgate.pojo.Employee;
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private PrintWriter out;
	private String name;
	private double salary;
	boolean result;
	private EmployeeDAO dao= new EmployeeDAO();

	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			out=response.getWriter();
			name=request.getParameter("txtname");
		salary=Double.parseDouble(request.getParameter("txtsalary"));
		out.println("name ::" + name);
		out.println("salary ::" + salary);
		
		Employee employee=new Employee(0, name, salary);
		result=dao.addEmployee(employee);
		response.setContentType("text/html");
		if(result) {
			out.print("recored");
			out.println("<a href=\"addemployee.html\">ADD NEW Employee</a>");
		}
		else {
			out.print("failed");
			out.println("<a href=\"GetAllEmployeeServlet\">GET All Employees</a>");
		}
		
			
		
		
		}
		

}
