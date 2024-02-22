package com.formcreate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer= resp.getWriter();
		writer.println("<h1>welcome to Registor page</h1>");
		String  name= req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender= req.getParameter("radio");
		String course= req.getParameter("course");
		String cond= req.getParameter("condition");
		
		
		if(cond==null) {
		if(cond.equals("checked")) {
			System.out.println("<h2>Name :"+name+" </h2>");
			System.out.println("<h2>Email :"+email+" </h2>");
			System.out.println("<h2>Password :"+password+" </h2>");
			System.out.println("<h2>Gender :"+gender+" </h2>");
			System.out.println("<h2>Course :"+course+" </h2>");
		}
		else {
			System.out.println("Click on Agree Button");
		}
		}
		else {
			System.out.println("<h2>Click on Agree Button</h2>");

		}
		
		
		
	}
	

}
