<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--　SetAttributeServletの前にidやscopeを記入　 -->
<jsp:useBean id="emp" scope="request" class="web.EmpBean"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>UseBean</h1>
<table border="1">
	<tr>
	<td>Name</td>
	<!--　propertyはclass EmpBeanのnameを呼び出す　 -->
	<td><jsp:getProperty name="emp" property="name"/></td>
	</tr>
	<tr>
	<td>Age</td>
	<!--　propertyはclass EmpBeanのageを呼び出す　 -->
	<td><jsp:getProperty name="emp" property="age"/></td>
	</tr>
</table>
</body>
</html>