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
<h1>Currency Convert</h1>
<form method="post">
    <label>Rate: </label>
    <input type="text" name="rate" placeholder="Rate" value="23000" ><br>
    <label>USD: </label>
    <input type="number" name="usd" placeholder="USD"><br>
    <label>VND : </label>
    <input type="text" placeholder="VND" value="${result}"><br>
    <input type="submit" id="submit" value="Converter">

</form>
</body>
</html>
