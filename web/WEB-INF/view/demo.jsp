<%--
  Created by IntelliJ IDEA.
  User: song
  Date: 2017/10/14
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>this is a Demo JSP</h1>
<form action="/user/upload" method="post">
    <input type="text" name="id">
    <input type="text" name="name">
    <input type="file" name="file" id="file">
    <input type="submit" value="提交"><br>
    <a href="/user/down" style="text-decoration-line: none ">Download</a>
</form>
</body>
</html>
