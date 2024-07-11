package com.tap;

import javax.servlet.http.HttpServlet;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.PrintWriter;

public class Register  extends HttpServlet
{
	private static final long serialVersionUID =1L;
	
	
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		System.out.println("Servlet 2");
		
	}
}
