package com.dynamic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class kunjeshC extends HttpServlet{

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		String a = req.getParameter("uname");
		String b =  req.getParameter("password");
		String c = req.getParameter("age");
		String d = req.getParameter("email");
		
		
		System.out.println( a + " " + b + " " + c + " " + d);
		String Detail = a + " " + b + " " + c + " " + d ;
//		PrintWriter out = res.getWriter();
//		out.println(Detail);
		
		
//		sending the data to another servlet
//		String kunjesh = "Hii user this data will be sent through another servlet" + Detail ;
//		req.setAttribute("Data" , kunjesh);
		
		 // Dispatching the request to another servlet
		
//		RequestDispatcher rd = req.getRequestDispatcher("anshu");  
//		rd.forward(req, res); 
		
		 // Another approach to achive the same 
//		res.sendRedirect("anshu?data="+Detail);    // but if i also want to parse the data from this servlet to antoher servlet we have to chnge its url with query
	

//		3rd approach to passing value from one servlet to another servlet
		HttpSession session = req.getSession();
		session.setAttribute("Data", Detail);
		res.sendRedirect("anshu");  //url where you want to send next url 
		
		
		
		
		
	}
	 
}
