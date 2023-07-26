package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/deletecookies")
public class DeleteCookies extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Cookie arr[] = req.getCookies();
		
		for (Cookie cookie : arr) {
			
			String name=cookie.getName();
			
			if(name.equals("state"))
			{
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
				
				resp.getWriter().print("<h1>cookies added successfully </h1>");
			}			
		}
	}	
}
