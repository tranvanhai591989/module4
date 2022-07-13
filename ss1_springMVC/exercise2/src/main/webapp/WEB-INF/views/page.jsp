<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tranvanhai
  Date: 7/13/2022
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <table>
        <tr>
            <th><label>English___</label><input type="text" name="english" placeholder="english"></th>
            <th><input type="submit" value="search"></th>
        </tr>
        <tr>
            <th>
                <label>Vietnamese</label>
                <input type="text" name="vietnamese" placeholder="vietnamese" value="${answer}">
            </th>
        </tr>
    </table>
</form>
</body>
</html>
