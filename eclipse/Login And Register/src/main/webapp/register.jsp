<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register page</title>
</head>
<body>
<form action="loginServlet" method="post">
<div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control"  placeholder="Enter email" name="uname">
   
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control"  placeholder="Enter email" name="umails">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
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