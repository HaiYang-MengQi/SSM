<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2023/8/17
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>webSocket测试</title>
</head>
<body>
<script>
    function communicate() {
        const socket = new WebSocket("ws://localhost:8080/getComment");
        socket.addEventListener("open",(event => {
            console.log("webSocket已经连接!")
            socket.send("hello socket!")
            socket.close()
        }));
        socket.addEventListener("message",(event => {
            const  message = event.data
            console.log("接收到信息!"+message)
        }));
        socket.addEventListener("close",event => {
            console.log("webSocket已经关闭!")
        });
        socket.addEventListener("error",event => {
            console.log("webSocket连接错误!")
        });
    }

</script>
</body>
</html>
