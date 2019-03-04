<%--
  Created by IntelliJ IDEA.
  User: sea
  Date: 2019/3/1
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户添加</title>
</head>
<body>
<form action="/user/addUser" method="post">
    <p>用户名: <input type="text" name="username"></p>
    <p>密  码: <input type="password" name="password"></p>
    <p><input type="submit" value="添加"></p>
</form>
</body>
</html>
