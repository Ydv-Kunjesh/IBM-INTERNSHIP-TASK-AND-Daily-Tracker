<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<h1>Hello Mr  ${user}</h1>
	
	<form action="logout">
		<input type="submit" value="Logout" />
	</form>
</body>
</html>