<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--jsp:forward page="destination2.jsp"の末尾に
?param1=abcdeを付けるとdestinationの>param1=<%= request.getParameter("param1")にabcdeが格納される--%>>
<jsp:forward page="destination2.jsp">

<jsp:param name="param2" value="ABCDE"/>
</jsp:forward>
</body>
</html>