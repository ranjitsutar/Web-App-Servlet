package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GrnericServelet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("generic servlet start");
		res.setContentType("text/html");
		PrintWriter writer =res.getWriter();
		writer.println("<h1> this is my genericServlet class</h1>");
		
	}

}
