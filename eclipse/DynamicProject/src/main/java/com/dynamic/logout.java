//package com.dynamic;
//
//import java.io.IOException;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//
//@WebServlet("/logout")
//public class logout extends HttpServlet{
//	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
//		HttpSession session = req.getSession();
//		session.removeAttribute("user");
//		session.invalidate();
//		res.sendRedirect("login.jsp");
//	}
//
//}





package com.dynamic;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logout")
public class logout extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession(false); // Get existing session if present

        if (session != null) {
            session.removeAttribute("user"); // Remove specific attribute if needed
            session.invalidate(); // Invalidate the session
        }

        res.sendRedirect("login.jsp"); // Redirect to login page after logout
    }
}
