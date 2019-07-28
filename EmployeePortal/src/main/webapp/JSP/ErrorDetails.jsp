<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background: #dbe4ff;
  margin: 0 0;
  padding:10px;
  text-align:center;
  	/*  width: 100%;
	 height: 100%;
	 margin: 0;
	 padding: 0;
	 background-color: #dbe4ff;
	  text-align:center;
	 font-family: "PT Sans Narrow", sans-serif; */
}
input {
  display: block;
  font-size: 14px;
  width:240px;
  margin: 10px auto;
  padding: 10px 8px 10px 8px;
  border-radius: 5px;
  box-shadow: inset 0 1px 2px rgba(0,0,0, .55), 0px 1px 1px rgba(255,255,255,.5);
  border: 1px solid #666;
}

input {
  opacity: 0.5;
}

input:hover,
input:focus {
  opacity: .7;
  color:#08c;
  border: 1px solid #08c;
   box-shadow: 0px 1px 0px rgba(255,255,255,.25),inset 0px 3px 6px rgba(0,0,0,.25);
}

input[type="submit"] {
  appearance: none;
  opacity: .99;
  width:120px;
  background: #08c;
  box-shadow: inset 0 1px 2px rgba(255,255,255, .35), 0px 1px 6px rgba(0,246,255,.5);
  border: 1px solid #0a5378;
  border-radius: 4px;
  color: #eee;
  cursor: pointer;
  text-shadow:0px -1px 0px rgba(0,0,0,.5);
}

input[type="submit"]:hover {
  background: #08c;
  width:120px;
  border: 1px solid #0a5378;
  border-radius: 3px;
  box-shadow: inset 0px 3px 16px rgba(0,0,0,.25),0px 1px 10px rgba(255,255,255,.5),inset 0px -1px 2px rgba(255,255,255,.35);
  text-shadow:0px 1px 1px rgba(0,0,0,.65);
  -webkit-transition: all 0.40s ease-out;
  transition: all 0.40s ease-out;
}
</style>
</head>
<body>
<center>
<h1>The Error is: <span>${errorMsg }</span></h1>
<h2>Try Again</h2>
<input type="submit" value="Go to the Home Page" onclick="window.location.href='/EmployeePortal/Access/Login'">
</center>
</body>
</html>