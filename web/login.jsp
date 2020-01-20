<%--
  Created by IntelliJ IDEA.
  User: UYSCT
  Date: 2020/1/20
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="/login" method="post">
    用户名： <input type="text" name="user_name"><br>
    密 &nbsp; 码：<input type="password" name="passwd"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
