<%--
  Created by IntelliJ IDEA.
  User: tranvanhai
  Date: 7/13/2022
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Convert</title>
</head>
<body>
<form method="post" action="/find">
    <label>English : </label>
    <input type="text" name="english" placeholder="english" >
    <label>USD: </label>
    <input type="text" name="vietnamese" placeholder="vietnamese" >
    <label>VND : </label>
    <input type="text"  placeholder="VND" value="${result}"><br>
    <input type="submit" id="submit" value="Converter">

</form>
</body>
</html>
