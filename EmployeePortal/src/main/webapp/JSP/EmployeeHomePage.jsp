<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login</title>
<script
	src="${pageContext.request.contextPath }/JavaScript/AdminHomePage.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/CSS/AdminHomePage.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class="wrapper">
		<h1>Personal Dashboard</h1>
		<div class="inner-container">
			<div class="grid-wrapper">
				<div class="grid">
					<div class="grid-header">
						<div class="icon">
							<i class="fa fa-user" aria-hidden="true"></i>
						</div>
						<div class="label">My Profile info</div>
					</div>
					<div class="grid-overlay">
						<div class="overlay-content-wrapper">

							<div class="overlay-header">My Profile info</div>
							<div class="overlay-label">Check Your Profile Here!</div>
						</div>

					</div>

				</div>
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
				<a href="<%=request.getContextPath()%>/LogoutServlet">
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
				<div class="grid">
					<div class="grid-header">
						<div class="icon">
							<i class="fa fa-arrow-right" aria-hidden="true"></i>

						</div>
						<div class="label">Dheeraj Polasa</div>
					</div>
					<div class="grid-overlay">
						<div class="overlay-content-wrapper">

							<div class="overlay-header">Dheeraj Polasa</div>
							<div class="overlay-label">
							</div>
						</div>
					</div>
				</div>
				<div class="grid user-grid">
					<div class="grid-header">
						<div class="icon">
							<i class="fa fa-user-circle-o" aria-hidden="true"></i>


						</div>
						<div class="label">${username }</div>
					</div>
				</div>
				<div class="grid">
					<div class="grid-header">
						<div class="icon">
							<i class="fa fa-arrow-left" aria-hidden="true"></i>

						</div>
						<div class="label">Dheeraj Polasa</div>
					</div>
					<div class="grid-overlay">
						<div class="overlay-content-wrapper">

							<div class="overlay-header">Dheeraj Polasa</div>
							<div class="overlay-label">
							</div>
						</div>
					</div>
				</div>





				<div class="foot-content">
					<div class='dheeraj'>
						Made with <i class="fa fa-heart" aria-hidden="true"></i> in India
						by Dheeraj Polasa..!
					</div>

				</div>
			</div>
		</div>
	</div>

</body>
</html>
