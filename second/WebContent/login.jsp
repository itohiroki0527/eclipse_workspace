<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<link rel="stylesheet" type="text/css" href="style.css">


  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
  <title>Sign in</title>
</head>

<body>
  <div class="main">
    <p class="sign" align="center">Sign in</p>
    <form action="login_page" method="post" class="form1">


      <input class="un " type="text" align="center" name="sessionid" placeholder="Username">
      <input class="pass" type="password" align="center" name="pass" placeholder="Password">
      <a><input type="submit" class="login_send" value="LOGIN"></a>

     <div class="error_msg"> <% if(request.getAttribute("message_id_pass_nothing")!=null){%>

<%= request.getAttribute("message_id_pass_nothing") %><br>
<%} %>
<% if(request.getAttribute("message_id_pass_error")!=null){%>

<%= request.getAttribute("message_id_pass_error") %><br>
<%} %>
</div>
</form>

    </div>

</body>

</html>


