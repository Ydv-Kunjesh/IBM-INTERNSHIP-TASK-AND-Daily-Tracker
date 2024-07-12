package crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class registerC extends HttpServlet{
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("Registered");	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm" , "root" , "");  // connection string 
		pw.println("Conneccted");  // printing connection
		
//		String query = "create database ibm";
		pw.println("Db connected");
		
//		String query = "create table adit(name varchar(30) , mail varchar(40) , location varchar(40)) ";
		
		
		
		Statement st = conn.createStatement();
//		st.execute(query);
		pw.println("Table created");
		
		
		// getting values from frontend
		
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		String location = req.getParameter("location");	
		pw.print(name + mail + location) ;	
	String query = "insert into adit values(?,?,?)";
	PreparedStatement ps = conn.prepareStatement(query);
	ps.setString(1, name);
	ps.setString(2, mail);
	ps.setString(3, location);
	
	
	
	int inserted = ps.executeUpdate();
	if(inserted>0) 
	{
		pw.print("data inserted");
	
	}else {
		pw.print("not Inserted");
	}
	
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
}
