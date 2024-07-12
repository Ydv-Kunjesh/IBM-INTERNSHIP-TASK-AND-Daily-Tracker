<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<form action="loginServlet" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="text" class="form-control"  placeholder="Enter email" name="uname">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" placeholder="Password" name="upass">
  </div>
    <button type="submit" class="btn btn-primary" value="submit" >Submit</button>
    
    <a href="index.html"> Back to Home </a>
</form>
</body>
</html>