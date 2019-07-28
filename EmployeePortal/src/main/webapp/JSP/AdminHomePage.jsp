<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<script src="/JavaScript/AdminHomePage.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/CSS/AdminHomePage.css">
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class="wrapper">
		<h1>Personal Dashboard</h1>
		<div class="inner-container">

			<div class="grid-wrapper">
				<a href="/EmployeePortal/Access/create">
					<div class="grid">
						<div class="grid-header">
							<div class="icon">
								<i class="fa fa-address-card" aria-hidden="true"></i>

							</div>
							<div class="label">New Employee</div>
						</div>
						<div class="grid-overlay">
							<div class="overlay-content-wrapper">

								<div class="overlay-header">New Employee</div>
								<div class="overlay-label">
									New Employee Onboarding.....?<br> Create A New Record
								</div>
							</div>
						</div>
					</div>
				</a>

				<div class="grid user-grid">
					<div class="grid-header">
						<div class="icon">
							<i class="fa fa-user-circle-o" aria-hidden="true"></i>


						</div>
						<div class="label">${username}</div>
					</div>
				</div>

				<a href="/EmployeePortal/Access/FetchEmployeeDetails">
					<div class="grid">
						<div class="grid-header">
							<div class="icon">
								<i class="fa fa-edit" aria-hidden="true"></i>

							</div>
							<div class="label">Update/Delete</div>
						</div>
						<div class="grid-overlay">
							<div class="overlay-content-wrapper">

								<div class="overlay-header">Update/Delete</div>
								<div class="overlay-label">
									Any Modification to the existing Records..?<br> Come On
									in!
								</div>
							</div>
						</div>
					</div>
				</a>

				<div class="grid">
					<div class="grid-header">
						<div class="icon">
							<i class="fa fa-lock" aria-hidden="true"></i>

						</div>
						<div class="label">Change Password</div>
					</div>
					<div class="grid-overlay">
						<div class="overlay-content-wrapper">

							<div class="overlay-header">Change Password</div>
							<div class="overlay-label">Change Your Password every 30
								days</div>
						</div>
					</div>
				</div>
				<div class="grid">
					<div class="grid-header">
						<div class="icon">
							<i class="fa fa-heart" aria-hidden="true"></i>

						</div>
						<div class="label">Dheeraj Polasa</div>
					</div>
					<div class="grid-overlay">
						<div class="overlay-content-wrapper">

							<div class="overlay-header">Dheeraj Polasa</div>
							<div class="overlay-label">Software Engineer</div>
						</div>
					</div>
				</div>
				<a href="/EmployeePortal/Access/Logout">
					<div class="grid">
						<div class="grid-header">
							<div class="icon">
								<i class="fa fa-sign-out" aria-hidden="true"></i>

							</div>
							<div class="label">Logout</div>
						</div>
						<div class="grid-overlay">
							<div class="overlay-content-wrapper">

								<div class="overlay-header">Logout</div>
								<div class="overlay-label">Logout Your Session Here!</div>
							</div>
						</div>
					</div>
				</a>








			</div>
		</div>
	</div>
</body>
</html>