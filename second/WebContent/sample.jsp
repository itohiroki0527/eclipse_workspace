<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Comment Tag</h1>
<!-- HTMLのComment -->
<%-- JSPのComment --%>

<h1>Expression Tag</h1>
<p><%= 5*5*Math.PI %></p>

<h1>Scriptlet Tag</h1>
<% for(int i=0;i<10;i++){ %>
<p><%= i %></p>
<% } %>

<h1>Declaration Tag</h1>
<%! int a = 0; %>
<%= a++ %>



</body>
</html>