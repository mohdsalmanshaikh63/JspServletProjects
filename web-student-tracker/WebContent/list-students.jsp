<%@page import="com.luv2code.jdbc.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Tracker App</title>

<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

	

	<div id="wrapper">
		<div id="header">
			<h2>Bridgelab University</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>					
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>

				<c:forEach var="student" items="${students_list}">
				<tr>					
					<td>${student.firstName}</td>
					<td>${student.lastName}</td>
					<td>${student.email}</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>