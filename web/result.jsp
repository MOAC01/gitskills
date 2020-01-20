<%--
  Created by IntelliJ IDEA.
  User: UYSCT
  Date: 2020/1/20
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
   <h3>注册信息</h3>

   <%
       String str= (String) request.getAttribute("userInfo");
       if(str!=null){
           out.println("注册成功，用户名："+str);
       }else {
           out.println("用户信息不全");
       }
   %>

</body>
</html>
