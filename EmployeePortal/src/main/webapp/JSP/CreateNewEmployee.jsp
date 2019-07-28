<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/JavaScript/CreateNewEmployee.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath() %>/CSS/CreateNewEmployee.css">
</head>
<body>
	<ul>
		<li><a href="#">Username: ${username }</a></li>
		<li style="float: right"><a
			href="<%=request.getContextPath()%>/JSP/AdminHomePage.jsp">Home</a></li>
		<li style="float: right"><a
			href="/EmployeePortal/Access/FetchEmployeeDetails">Employee
				Details</a></li>
		<li style="float: right"><a class="active"
			href="/EmployeePortal/Access/create">New Employee</a></li>
	</ul>
	<center>
		<div>
			<form name="emp" action="/EmployeePortal/Access/addEmployee"
				onsubmit="return validateForm();" method="post">
				<table align="center" width=40% width="100%" cellspacing="2"
					cellpadding="2" border="5">
					<tr>
						<td colspan="2" align="center"><b>Employee Registration
								Form.</b></td>

					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Employee Id<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text" disabled value=""
							name="employeeId" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Employee First Name<span
							style="color: red">*</span></td>

						<td width="57%"><input type="text" value=""
							name="employeeFirstName" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Employee Last Name<span
							style="color: red">*</span></td>

						<td width="57%"><input type="text" value=""
							name="employeeLastName" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Blood Group:</td>
						<td width="57%"><input type="text" value="" name="bloodGroup"
							size="24"></td>
						</td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Age<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text" value="" name="age"
							size="24"></td>
					</tr>

					<tr>
						<td align="left" valign="top" width="41%">Date of birth:</td>
						<td width="57%"><input type="text" name="dateOfBirth"></td>
					</tr>

					<tr>
						<td align="left" valign="top" width="41%">HRA<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text" value=""
							name="houseRentAllowance" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Travel<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text" value=""
							name="travelAllowance" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Medical<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text" value=""
							name="medicalAllowance" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Salary<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text" value=""
							name="basicSalary" size="24"></td>
					</tr>

					<tr>
						<td colspan="2">
							<p align="center">
								<input type="submit" value="Submit" name="B4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="reset" value="  Reset All   " name="B5">
						</td>
					</tr>

				</table>
			</form>

		</div>
	</center>
</body>