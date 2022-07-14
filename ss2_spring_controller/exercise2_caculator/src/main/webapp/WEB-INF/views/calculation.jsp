<%--
  Created by IntelliJ IDEA.
  User: tranvanhai
  Date: 7/14/2022
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="cal" method="get">
    <input type="text" name="num1" pattern="^\d*(\.\d{0,2})?$" value="${num1}">

        <button value="Add" name="calculation">Addition</button>
        <button value="Sub" name="calculation">Subtraction</button>
        <button value="Mul"name="calculation">Multiplication</button>
        <button value="Div" name="calculation">Division</button>

    <input type="text" pattern="^\d*(\.\d{0,2})?$" name="num2" value="${num2}">

</form>
<span>${total}</span>
</body>
</html>
