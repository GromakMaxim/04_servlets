<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.03.2021
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input user</title>
</head>
<body>
    <form action="add-success" method="post">
        <input name="name" placeholder="name" type="text">
        <input name="surname" placeholder="surname" type="text" required>
        <input name="age" placeholder="age" type="text">
        <input name="email" placeholder="email" type="email" required>
        <button>Send</button>
    </form>
</body>
</html>
