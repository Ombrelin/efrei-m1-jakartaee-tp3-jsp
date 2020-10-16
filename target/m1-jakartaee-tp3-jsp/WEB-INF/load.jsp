<%--
  Created by IntelliJ IDEA.
  User: arsen
  Date: 16/10/2020
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<html>
<head>
    <title>Home</title>
</head>
<body>

Logged in user : <br>
    <j:out value="${sessionScope.user.login}"/>
    <j:out value="${sessionScope.user.password}"/>

</body>
</html>
