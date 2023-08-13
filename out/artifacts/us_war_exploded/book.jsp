<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Book List</title>
</head>
<body>
<h1>Book List</h1>

<!-- 显示当前页的数据 -->
<table>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
    </tr>
    <tr th:each="book : ${pageInfo.list}">
        <td th:text="${book.id}"></td>
        <td th:text="${book.title}"></td>
        <td th:text="${book.author}"></td>
    </tr>
</table>

<!-- 显示分页导航 -->
<div>
    <ul>
        <li th:each="page : ${pageInfo.navigatepageNums}">
            <a th:href="@{/getBooks(pageNum=${page})}" th:text="${page}"></a>
        </li>
    </ul>
</div>
</body>
</html>
