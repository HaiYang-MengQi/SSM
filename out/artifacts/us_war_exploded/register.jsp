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
    <title>注册页面</title>
</head>
<body>
<form method="post" action="/register">
    账号:<input type="text" name="username" id="username" required="required"><br>
    密码:<input type="password" name="password" id="password" required><br>
    性别:<input type="text" name="sex" id="sex"><br>
    电话号:<input type="text" name="tel" id="tel"><br>
    地址:<input type="text" name="address" id="address">
    <input type="submit" value="注册">
    <input type="reset" value="清空">
</form>
</body>
</html>
