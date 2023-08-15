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
        评论:<textarea name="comment" id="words"></textarea><br><br>
        <button onclick="setDate()">发表评论</button>
        <div id="comments"></div>
</body>
<script type="text/javascript">
    function setDate() {
        const time = new Date();
        const data = {
            id : document.getElementById("id").value,
            comment : document.getElementById("words").value,
            time : time.toLocaleDateString()
        }
        var xhr =new XMLHttpRequest()
        xhr.open("POST","/addComment",true)
        xhr.setRequestHeader('Content-Type', 'application/json');
        xhr.onreadystatechange = function () {
            if(xhr.status === 200  && xhr.readyState === 4){
                console.log("请求发送成功,服务器端口响应全部数据!")
            }
        }
        xhr.send(JSON.stringify(data));
        xhr.timeout = 2000
        xhr.timeout =function () {
            alert("超时!")
        }
        xhr.onerror =function () {
            alert("网络异常!")
        }
    }

    // setInterval(getComments,1000);
    getComments()
    function getComments() {
        // const id = document.getElementById("comments").value;
        const  id = document.getElementById("comments")
        const xhr = new XMLHttpRequest();
        xhr.open("GET","loadComments?id=1",true);
        xhr.onreadystatechange = function (){
            if (xhr.status === 200 && xhr.readyState ===4){
                let data = xhr.response.list
                console.log(data)

                for(let i =0 ; i<data.length ; i++){
                    id.innerHTML = data[i].id+"<br>"+
                    data[i].comment+"<br>"+
                    data[i].time+"<br>"
                }

            }
        }
        xhr.send()
        xhr.timeout = 2000
        xhr.timeout =function () {
            alert("超时!")
        }
        xhr.onerror =function () {
            alert("网络异常!")
        }
    }
</script>
</html>
