<%--
  Created by IntelliJ IDEA.
  User: arsen
  Date: 15/10/2020
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<html>
<head>
    <title>Prime Numbers</title>
</head>
<body>

<j:if test="${ isPrime }">
    <j:out value="${number}"/> is a Prime Number
</j:if>
<j:if test="${ !isPrime }">
    <j:out value="${number}"/>is not a Prime Number
</j:if>

</body>
</html>
