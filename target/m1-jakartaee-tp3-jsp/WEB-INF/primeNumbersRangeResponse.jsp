<%--
  Created by IntelliJ IDEA.
  User: arsen
  Date: 15/10/2020
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<html>
<head>
    <title>Prime Numbers Range</title>
</head>
<body>
<ul>
    <j:forEach items="${numbers}" var="number">
        <li>Number : <j:out value="${ number.key }"/> is <j:out value="${number.value ? '' : 'not'}"/> a prime number
        </li>
    </j:forEach>
</ul>
</body>
</html>
