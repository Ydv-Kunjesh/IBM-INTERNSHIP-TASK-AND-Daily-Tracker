<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP FILE</title>
</head>
<body>


<% 

	//getting value from server and render it to frontend
	
	String name = request.getAttribute("Key1").toString();
	out.print(name);
	
		
%>
			${Key2}
			
</body>
</html>