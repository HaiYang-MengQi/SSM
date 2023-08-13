<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2023/8/13
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载页面</title>
</head>
<body>
  <form action="/download" method="post">
      <input type="text" name="fileName" />
    <input type="submit" value="下载"/>
  </form>
</body>
</html>
