<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>

<head>

<title>検索ページ</title>

</head>

<body>
<form action="search_page" method="post">

デバッグ：セッションテスト<br>
<%= session.getAttribute("login_start") %><br>

<h1><p align="center">検索</p></h1><br>


<input type="submit" value="サンキューページへ">



<p align="center"><INPUT type size="40"="text" neme="kensaku"></p><br>

<p align="center">カテゴリ<select name="category">

<option value="サンプル1">サンプル1</option>

<option value="サンプル2">サンプル2</option>

<option value="サンプル3">サンプル3</option>

</select>

</p>

<p align="center"><input type="button" value="検索" onClick="location.href=''">

</p>



<table border="1" width="500" cellspacing="0"align="center" cellpadding="5" bordercolor="black">



<tr>

<th>商品名</th>

<th>価格</th>

<th>詳細</th>

</tr>

<tr>

<td>炊飯器</td>

<td>\14,800</td>

<td align="center"><form action="shoukai1.html"><input type="submit" value="詳細"></td>

</tr></form>

<tr>

<td>GOD</td>

<td>\10</td>

<td align="center"><form action="shoukai2.html"><input type="submit" value="詳細"></td>

</tr></form>

<tr>

<td>パソコン</td>

<td>\99,800</td>

<td align="center"><form action="shoukai3.html"><input type="submit" value="詳細"></td>

</tr>
</table>
</form>
</body>

</html>