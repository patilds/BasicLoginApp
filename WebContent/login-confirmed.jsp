<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Successful</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test" method="post">
    <input type="submit" value="Log Out" />
</form>
<center> 
        <center>Login Success</center>
        Welcome to Demo Site
<%--         Welcome <%= session.getAttribute("FirstName") + " " + session.getAttribute("LastName") %> --%>
</center>
</body>
</html>