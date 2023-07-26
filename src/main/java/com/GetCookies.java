package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcookies")
public class GetCookies extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Cookie arr[] = req.getCookies();
	
		for (Cookie cookie : arr) {			
			String name=cookie.getName();
			String value=cookie.getValue();
			
			resp.getWriter().print("<h1>name : "+name + ", value : "+value+"</h1>");
		}
		
	}
	
	

}
