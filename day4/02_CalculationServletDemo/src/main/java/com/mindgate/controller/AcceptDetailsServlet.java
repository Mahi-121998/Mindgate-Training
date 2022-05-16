package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
	private PrintWriter out;
	private double Numb1;
	private double Numb2;
	private double result;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Numb1= Double.valueOf(request.getParameter("txtNumb1"));
		Numb2=Double.valueOf(request.getParameter("txtNumb2"));
		result= Numb1 + Numb2;
		out=response.getWriter();
		out.println("Addiotn of" + Numb1 + "and"+ Numb2 + "is" + result );
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
