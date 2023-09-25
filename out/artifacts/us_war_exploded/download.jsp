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
    <div id="fileName">

    </div>
</body>
<script type="text/javascript">
    window.onload = function () {
        var xhr = new XMLHttpRequest();
        xhr.open("get","/getFileList",true)
        xhr.send();
        xhr.onreadystatechange = function (response) {
            if (xhr.status === 200 && xhr.readyState === 4){
                let data = JSON.parse(xhr.responseText);
                let context =""
                for(var i = 0 ; i<data.length ; i++)
                 context = context + data[i]+"<br/>"
                document.getElementById("fileName").innerHTML = context
            }
        }
    }
</script>
</html>
