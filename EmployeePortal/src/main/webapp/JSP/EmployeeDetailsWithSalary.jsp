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
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/CSS/EmployeeDetailsWithSalary.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/CSS/MenuBar.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
s
</head>
<title></title>

<body>
	<%-- <%
		List<Employee> employeeList = ${employeeList};
		List<EmployeeSalary> employeeSalaryList = ${employeeSalaryList};
	%> --%>
	<ul>
		<li><a href="#">Username: <%=session.getAttribute("username")%></a></li>
		<li style="float: right"><a
			href="<%=request.getContextPath()%>/JSP/AdminHomePage.jsp">Home</a></li>
		<li style="float: right"><a class="active"
			href="<%=request.getContextPath()%>/FetchEmployeeWithSalaryServlet">Employee
				Details</a></li>
		<li style="float: right"><a
			href="<%=request.getContextPath()%>/JSP/CreateNewEmployee.jsp">New
				Employee</a></li>
	</ul>
	<div class="wrapper">
		<div class="row">
			<div class="column">ID</div>
			<div class="column">Name</div>
			<div class="column">Blood Group</div>
			<div class="column">DOB</div>
			<div class="column">HRA</div>
			<div class="column">Travel</div>
			<div class="column">Medical</div>
			<div class="column">Salary</div>
			<div class="column">Edit</div>
			<div class="column">Delete</div>
		</div>
		<c:forEach var="employee" items="${employeeList}">
			<div class="row">
				<div class="column">
					<c:out value="${employee.empId}" />
				</div>
				<div class="column">
					<c:out
						value="${employee.employeeFirstName} ${employee.employeeLastName }" />
				</div>
				<div class="column">
					<c:out value="${employee.bloodGroup}" />
				</div>
				<div class="column">
					<c:out value="${employee.dateOfBirth}" />
				</div>
				<div class="column">
					<c:out value="${employee.empSalList.houseRentAllowance }" />
				</div>
				<div class="column">
					<c:out value="${employee.empSalList.travelAllowance }" />
				</div>
				<div class="column">
					<c:out value="${employee.empSalList.medicalAllowance }" />
				</div>
				<div class="column">
					<c:out value="${employee.empSalList.basicSalary }" />
				</div>
				<a
					href="/EmployeePortal/Access/fetchOneEmployee?empID=${employee.empId}&empName=${employee.employeeFirstName}"><div
						class="column">
						<i class="fa fa-edit" aria-hidden="true"></i>
					</div></a> <a href="/EmployeePortal/Access/delete?empID=${employee.empId}"
					onclick="return confirm('Want to continue');"><div
						class="column">
						<i class="fa fa-trash" aria-hidden="true"></i>
					</div></a>
			</div>
		</c:forEach>

		<%-- <%
			for (int i = 0, j = 0; i < employeeList.size() && j < employeeSalaryList.size(); i++, j++) {
		%>
		<div class="row">
			<div class="column"><%=employeeList.get(i).getEmpId()%></div>
			<div class="column"><%=employeeList.get(i).getEmployeeFirstName() + " " + employeeList.get(i).getEmployeeLastName()%></div>
			<div class="column"><%=employeeList.get(i).getBloodGroup()%></div>
			<div class="column"><%=employeeList.get(i).getDateOfBirth()%></div>
			<div class="column"><%=employeeSalaryList.get(j).getHouse_Rent_Allowance()%></div>
			<div class="column"><%=employeeSalaryList.get(j).getTravel_Allowance()%></div>
			<div class="column"><%=employeeSalaryList.get(j).getMedical_Allowance()%></div>
			<div class="column"><%=employeeSalaryList.get(j).getBasic_Salary()%></div>
			<a href="/EmployeePortal/Access/fetchOneEmployee?empID=${employeeList.get(i).getEmpId()}"><div class="column"><i class="fa fa-edit" aria-hidden="true"></i></div></a>
   			<a href="/EmployeePortal/Access/delete?empID=${employeeList.get(i).getEmpId()}" onclick="return confirm('Want to continue');" ><div class="column"><i class="fa fa-trash" aria-hidden="true"></i></div></a>
		</div>
		<%
			}
		%> --%>
	</div>
</body>
</html>
