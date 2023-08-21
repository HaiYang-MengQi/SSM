<%--
  Created by IntelliJ IDEA.
  User: Tom
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
        socket.onopen = function (event) {
            console.log("webSocket is opened")
        }
        socket.onerror = function (event) {
            console.error("webSocket error" + event)
        }
        socket.onmessage = function (event){
            var data = event.data;
            console.log("received message is " + data)
        }
        socket.onclose = function (event) {
            if (event.wasClean) {
                console.log("WebSocket closed cleanly, code=" + event.code + ", reason=" + event.reason);
            } else {
                console.error("WebSocket connection closed unexpectedly.");
            }
        }
        socket.send("hello world!");
       
    }

</script>
</body>
</html>
