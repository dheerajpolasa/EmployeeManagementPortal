<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/CSS/UserLogin.css">
</head>
<body>
	<div id="bg">
		<img src="${pageContext.request.contextPath }/Pictures/color.png"
			alt="">
	</div>

	<form action="/EmployeePortal/Access/Login" method="post">
		<div class="title">Welcome to Login Page</div>
		<input type="text" placeholder="Username" name="username"> <input
			type="password" placeholder="Password" name="password"> <input
			type="submit" value="Get in there">
	</form>
	<c:import url="${pageContext.request.contextPath }/JSP/commonHead.jsp" />
</body>
</html>