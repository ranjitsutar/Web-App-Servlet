package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet extends javax.servlet.http.HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		System.out.println("this is get method.."
				+ "........");
		
		response.setContentType("text/html");
		
		PrintWriter writer=response.getWriter();
		writer.println("<h1>This is Http Servlet</h1>");
		
	}
	
	

}
