package com.dynamic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/loginServlet")

public class loginServlet extends HttpServlet{
	public void service(HttpServletRequest req ,  HttpServletResponse res) throws ServletException, IOException {	
		
		String Name = req.getParameter("uname");
		
		String Pass = req.getParameter("upass");	
		
		
		
		if(Name.equals("Kunjesh") && Pass.equals("Kunjesh@123")) {
				
			HttpSession session = req.getSession();
			session.setAttribute("user", Name);
			
			RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");  
			rd.forward(req, res);
		}
		else {
			res.sendRedirect("login.jsp");
		}
	}
}

