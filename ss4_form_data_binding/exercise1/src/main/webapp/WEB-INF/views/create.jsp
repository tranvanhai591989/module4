<%--
  Created by IntelliJ IDEA.
  User: tranvanhai
  Date: 7/15/2022
  Time: 8:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/boostrap/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/boostrap/datatables/css/dataTables.bootstrap4.min.css"/>

</head>
<body>
<h1>CREATE MAIL</h1>
<form:form modelAttribute="mail" action="/create-account" method="post">
    <table class="table table-striped table-inverse table-responsive">
        <tr>
            <th>Language :</th>
            <td><form:select path="language" items="${languageList}"></form:select></td>
        </tr>
        <tr>
            <th>Page size :</th>
            <td>
                Show <form:select path="pageSize" items="${pageSizeList}">
            </form:select>
                emails per page
            </td>
        </tr>
        <tr>
            <th>Spams filter :</th>
            <td>
                Show <form:checkbox path="spamsFilter" value="enable"/> Enable spams filter
            </td>
        </tr>
        <tr>
            <th>Signature :</th>
            <td> Show <form:textarea path="signature"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit" value="/create-account"> Update</button>
                <button type="reset" class="pri"> Cancel</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
<script src="/boostrap/jquery/jquery-3.5.1.min.js"></script>
<script src="/boostrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="/boostrap/datatables/js/dataTables.bootstrap4.min.js"></script>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="/boostrap/bootstrap413/js/bootstrap.bundle.min.js"></script>
</html>
