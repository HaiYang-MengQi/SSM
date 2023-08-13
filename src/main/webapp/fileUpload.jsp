<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2023/8/13
  Time: 8:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传页面</title>
</head>
<body>
  <form action="/upload" enctype="multipart/form-data" method="post">
    <h1>上传文件页面</h1>
    <input type="file" name="fileName" multiple="multiple">
    <input type="submit" value="上传">
  </form>
</body>
</html>
