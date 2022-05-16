package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private PrintWriter out;
    private String id;
    private String password ;
    
    
    
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		id=request.getParameter("txtlogin");
	password=request.getParameter("txtpswd");
	if(id.equals("mahi") && password.equals("123")) {
	
		out.println("welcome");
	}
	else {
		out.println("invalid");
	}
	
	}
	}


