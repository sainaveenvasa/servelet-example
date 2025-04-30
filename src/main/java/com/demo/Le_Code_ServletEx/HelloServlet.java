package com.demo.Le_Code_ServletEx;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.*;


public class HelloServlet extends HttpServlet {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	res.setContentType("text/html"); // to mentioning that we are sending either text or html code
	PrintWriter out = res.getWriter(); // res is the response object to write on the server
	out.println("<h1><b>Hello World! babe <b/></h1>");
}	


}
