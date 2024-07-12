package com.dynamic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/simple")

public class simple extends HttpServlet {
	
	protected void service(HttpServletRequest  req , HttpServletResponse res) throws ServletException, IOException {
		
		String name = "Kunjesh";
		int age = 19;
		
		req.setAttribute("Key1", name);
		req.setAttribute("Key2", age);
		
		RequestDispatcher rd = req.getRequestDispatcher("kunjesh.jsp");
		rd.forward(req, res);
	}

}
