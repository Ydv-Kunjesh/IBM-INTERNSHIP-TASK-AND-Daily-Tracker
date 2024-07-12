package com.dynamic;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
public class anshuC extends HttpServlet{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
//		1st approach to do geting value from another servlet 
		
//		PrintWriter out = res.getWriter();
//		out.println("Hello user  your have called another servlet");
//		String data = (String) req.getAttribute("Data"); 
//		out.println(data);

//		2nd approach to getting value from another servlet 
		
//	String datas = req.getParameter("data");
//	PrintWriter out = res.getWriter();
//	out.println(datas);
		
		

//		3rd approach to passing value from one servlet to another servlet
		
		HttpSession session = req.getSession();
		String trail  = (String) session.getAttribute("Data");
		PrintWriter out = res.getWriter();
		out.println(trail);
		
		
// fetching value of servlet context 
		ServletContext ctx = getServletContext();
		String data = ctx.getInitParameter("Name");
		
		out.println(data);
		
		
//fetching the value of servlet config value
		
		ServletConfig cg = getServletConfig();
		String cgdata = cg.getInitParameter("phone");
		out.println(cgdata);
		
		
		
		
		
		
		
		
		
	}

}
