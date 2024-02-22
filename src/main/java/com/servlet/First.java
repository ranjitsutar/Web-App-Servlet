package com.servlet;


import java.io.IOException;

import javax.servlet.*;

public class First implements Servlet  {

	
// life cycle method
	@Override
	public void init(ServletConfig config) throws ServletException {

		System.out.println("Servlet statr");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("servlet service method");
	}
	
	@Override
	public void destroy() {

		System.out.println("servlet destroy method");
	}


// non lifecycle method
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
