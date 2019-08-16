<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><%= session.getAttribute("title") %></h1>

<!-- getAttribute で値を受け取る -->
	session(name) = <%= session.getAttribute("name") %><br>
	request(age) = <%= request.getAttribute("age") %>
</body>
</html>