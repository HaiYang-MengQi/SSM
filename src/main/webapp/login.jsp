<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2023/7/8
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
</head>
<body>
    <form method="post" action="/login">
        账号:<input type="text" name="username" id="username" required="required"><br>
        密码:<input type="password" name="password" id="password" required><br>
        <input type="submit" value="提交">
        <input type="reset" value="清空">
    </form>
<a href="register.jsp" >注册</a>
</body>
</html>
