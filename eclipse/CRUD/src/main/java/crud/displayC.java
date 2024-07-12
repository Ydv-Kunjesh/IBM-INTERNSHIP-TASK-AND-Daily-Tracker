package crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/display")
public class displayC extends HttpServlet{
	public void service(HttpServletRequest req , HttpServletResponse  res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm" , "root" , "");
			Statement st = conn.createStatement();
			String query = "select * from adit";
			ResultSet rs = st.executeQuery(query);
			

			

			  pw.println("<table border=1>");
	            pw.println("<tr>");
	            pw.println("<th>Name</th>");
	            pw.println("<th>mail</th>");
//	            pw.println("<th>phone</th>");
	            pw.println("<th>location</th>");
	            pw.println("<th>Action</th>");
	            pw.println("</tr>");
	          
	            while(rs.next()) {
	            	while(rs.next()) {
	        			String name = rs.getString(1);
	        			String mail= rs.getString(2);
	        			String location = rs.getString(3);
	        			
	                pw.print("<tr><td>" + name + "</td><td>" + mail + "</td><td>" + location + "</td>" +  "<td><a href = 'crud?action=update&mail="+mail+"' >Update</a></td>"  +  "<td><a href = 'crud?action=delete&mail="+mail+"' >Delete</a></td>"   +"</tr>");
//	                pw.print("<td><a href = 'crud?action=update&mail="+mail+"' >Update</a> || <a href = 'crud?action=update&mail="+mail +"' >Update</a> ");
	            }

	            
	            pw.println("</table>");
		} 
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		}
		
	}


