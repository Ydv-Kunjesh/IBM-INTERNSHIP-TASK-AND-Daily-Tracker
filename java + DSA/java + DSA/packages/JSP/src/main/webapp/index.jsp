<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP INPUT TRACKER</title>
</head>
<body>
<form>
	Name : <input type="text" name="fname" />
	<br/>
	Gender : 
	Male :	<input type="radio" value="male" name="gender"/>
	Female: <input type="radio" value="female" name="gender"/>
	<br/>
	<br/>
	<input type="submit" />
</form>

${param.fname }
${param.gender }
<br/>
<% out.println(request.getParameter("fname")); %>
<br/>


<br/>

</body>
</html>