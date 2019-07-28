<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.List"%>
<%@ page import="com.learn.employee.portal.daoImpl.*"%>
<%@ page import="com.learn.employee.portal.db.*"%>
<%@ page import="com.learn.employee.portal.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/JavaScript/CreateNewEmployee.js"></script>
<style>
body {
	background-color: #dbe4ff;
}
/* form {
	background-color: white;
} */
</style>
</head>
<body>
	<%-- <%
		Employee employeeObj = (Employee) request.getAttribute("oneEmployee");
		EmployeeSalary employeeSalaryObj = (EmployeeSalary) request.getAttribute("oneEmployeeSalary");
	%> --%>
	<center>
		<div>
			<form name="emp" action="/EmployeePortal/Access/UpdateEmployee"
				onSubmit="return validateForm();" method="post">
				<table align="center" width=40% width="100%" cellspacing="2"
					cellpadding="2" border="5">
					<tr>
						<td colspan="2" align="center"><b>Employee Registration
								Form.</b></td>

					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Employee Id<span
							style="color: red">*</span></td>
						<td width="57%"><input type="number" readonly
							value="${oneEmployee.getEmpId()}" name="empId" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Employee First Name<span
							style="color: red">*</span></td>

						<td width="57%"><input type="text"
							value="${oneEmployee.getEmployeeFirstName()}"
							name="employeeFirstName" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Employee Last Name<span
							style="color: red">*</span></td>

						<td width="57%"><input type="text"
							value="${oneEmployee.getEmployeeLastName()}"
							name="employeeLastName" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Blood Group:</td>
						<td width="57%"><input type="text"
							value="${oneEmployee.getBloodGroup() }" name="bloodGroup"
							size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Age<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text"
							value="${oneEmployee.getAge() }" name="age" size="24"></td>
					</tr>

					<tr>
						<td align="left" valign="top" width="41%">Date of birth:</td>
						<td width="57%"><input type="text" name="dateOfBirth"
							value="${oneEmployee.getDateOfBirth() }"></td>
					</tr>

					<tr>
						<td align="left" valign="top" width="41%">HRA<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text"
							value="${oneEmployee.empSalList.getHouseRentAllowance() }"
							name="houseRentAllowance" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Travel<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text"
							value="${oneEmployee.empSalList.getTravelAllowance() }"
							name="travelAllowance" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Medical<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text"
							value="${oneEmployee.empSalList.getMedicalAllowance() }"
							name="medicalAllowance" size="24"></td>
					</tr>
					<tr>
						<td align="left" valign="top" width="41%">Salary<span
							style="color: red">*</span></td>
						<td width="57%"><input type="text"
							value="${oneEmployee.empSalList.getBasicSalary() }"
							name="basicSalary" size="24"></td>
					</tr>

					<tr>
						<td colspan="2">
							<p align="center">
								<input type="submit" value="  Submit" name="B4"
									onclick="clickButton()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="reset" value="  Reset All   " name="B5">
						</td>
					</tr>

				</table>
			</form>

		</div>
	</center>
</body>
</html>
