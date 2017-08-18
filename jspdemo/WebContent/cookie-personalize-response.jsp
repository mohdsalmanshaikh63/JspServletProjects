<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cookie Personalize Response</title>


<%
	// read form data
	String favouriteLanguage = request.getParameter("favouriteLanguage");

	// create the cookie
	Cookie cookie = new Cookie("myApp.favouriteLanguage", favouriteLanguage);

	// set the cookie life span say for a year(in seconds)
	cookie.setMaxAge(60*60*24*365);

	// add cookie to the header
	response.addCookie(cookie);
%>
</head>
<body>


Thanks. We set your favourite language to : ${param.favouriteLanguage}

<br /><br />

<a href="cookies-homepage.jsp">Back to Home Page.</a>
</body>
</html>