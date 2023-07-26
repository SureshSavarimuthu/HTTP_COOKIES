package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addcookies")
public class AddCookies extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		Cookie c1=new Cookie("email", "s@gmail.com");
		Cookie c2=new Cookie("pass", "s@123");
		
		Cookie c3=new Cookie("state", "UK");
		c3.setMaxAge(60*60);	
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.addCookie(c3);
		
		resp.getWriter().print("<h1>Cookies Added Successfully</h1>");
	}
}
