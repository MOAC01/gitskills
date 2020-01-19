<%--
  Created by IntelliJ IDEA.
  User: UYSCT
  Date: 2020/1/19
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test page</title>
</head>
<body>
<%
    out.println("Hello world!");
    out.print(request.getAttribute("webParam"));
%>
</body>
</html>
