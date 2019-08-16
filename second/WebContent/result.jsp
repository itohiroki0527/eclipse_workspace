<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="result" class="web.ResultBean" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=request.getParameter("name")%>さんの運勢
	</h1>
		<table border>
		<tr>
			<th>金運</th>
			<td> <jsp:getProperty name="result" property="money"/></td>
		</tr>
		<tr>
			<th>恋愛運</th>
			<td><jsp:getProperty name="result" property="love"/></td>
		</tr>
		<tr>
			<th>仕事運</th>
			<td><jsp:getProperty name="result" property="work"/></td>
		</tr>
		<tr>
			<th>健康運</th>
			<td><jsp:getProperty name="result" property="health"/></td>
		</tr>
		<tr>
			<th>全体運</th>
			<td><jsp:getProperty name="result" property="total"/></td>
		</tr>
	</table>
</body>
</html>