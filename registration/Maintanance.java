package com.uniquedeveloper.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Maintanance
 */

public class Maintanance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   
	
		int a=Integer.parseInt(request.getParameter("weight"));
		int b=Integer.parseInt(request.getParameter("height"));
		int c=Integer.parseInt(request.getParameter("age"));
		int calorie=(int) ((10*a)+(6.25*b)-(5*c)+5);
	
	PrintWriter out=response.getWriter(); 
	
		out.print("your maintance calorie is: "+calorie);
	}

}
