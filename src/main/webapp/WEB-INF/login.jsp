<%--
  Created by IntelliJ IDEA.
  User: arsen
  Date: 16/10/2020
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form method="post">

        <label for="login">Login : </label>
        <input id="login" name="login" type="text"/>

        <label for="password">Password : </label>
        <input id="password" name="password" type="password"/>

        <button type="submit">Submit</button>

    </form>
</body>
</html>
