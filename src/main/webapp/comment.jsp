<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2023/8/14
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评论区</title>
</head>
<body>
        ID:<input type="text" name="id" id="id"/><br><br>
        评论:<textarea name="comment" id="words" required></textarea><br><br>
        <button onclick="setDate()">发表评论</button><br><br>
        ID:<input type="text" id="commentID" placeholder="请在此输入要获取的ID值">
        <div id="comments"></div>
</body>
<script>
    function setDate() {
        const time = new Date();
        const data = {
            id: document.getElementById("id").value,
            comment: document.getElementById("words").value,
            time: time.toLocaleDateString()
        }
        var xhr = new XMLHttpRequest()
        xhr.open("POST", "/addComment", true)
        xhr.setRequestHeader('Content-Type', 'application/json');
        xhr.onreadystatechange = function () {
            if (xhr.status === 200 && xhr.readyState === 4) {
                console.log("请求发送成功,服务器端口响应全部数据!")
            }
        }
        xhr.send(JSON.stringify(data));
        xhr.timeout = 2000
        xhr.timeout = function () {
            alert("超时!")
        }
        xhr.onerror = function () {
            alert("网络异常!")
        }
    }

    function getComments() {
        const comments = document.getElementById("comments")
        comments.value = ''
        const commentID = document.getElementById("commentID").value
        const xhr = new XMLHttpRequest();
        xhr.open("GET", "/getComment?id=" + commentID, true);
        xhr.onreadystatechange = function () {
            if (xhr.status === 200 && xhr.readyState === 4) {
                let data = JSON.parse(xhr.responseText)
                console.log(data)
                comments.innerHTML = ""
                for (let i = 0; i < data.length; i++) {
                    comments.innerHTML += data[i].id + data[i].comment + data[i].time + "<br/>"
                }
            }
        }
        xhr.send()
        xhr.timeout = 2000
        xhr.timeout = function () {
            alert("超时!")
        }
        xhr.onerror = function () {
            alert("网络异常!")
        }
    }
    setInterval(getComments,1000)
</script>
</html>
