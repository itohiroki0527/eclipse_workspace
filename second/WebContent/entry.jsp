<%@page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<h1>占いアプリケーション</h1>
<form action="test_entry" method="POST">
<table>
<tr>
<th>氏名</th>
<td><input type="text" name="name"></td>
</tr>
<tr>
<th>生年月日</th>
<td>
<select name="year">
<% for(int i=1900;i<=2010;i++) { %>
<option value="<%= i %>"><%= i %></option>
<% } %>
</select>年
<select name="month">
<% for(int i=1;i<=12;i++) { %>
<option value="<%= i %>"><%= i %></option>
<% } %>
</select>
月
<select name="date">
<% for(int i=1;i<=31;i++) { %>
<option value="<%= i %>"><%= i %></option>
<% } %>
</select>
日
</td>
</tr>
</table>
<input type="submit" value="占い">
</form>
</body>
</html>