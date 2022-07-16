<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/bootstrap/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/bootstrap/datatables/css/dataTables.bootstrap4.min.css"/>
    <link href="/bootstrap413/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div>
    <h1>${message}</h1>
    <table class="table table-striped table-inverse table-responsive col-lg-12">
        <thead class="thead-inverse col-lg-12">
        <tr class="col-lg-12">
            <th>ID</th>
            <th>Name</th>
            <th>BirthYear</th>
            <th>Gender</th>
            <th>national</th>
            <th>idCard</th>
            <th>transportType</th>
            <th>transportId</th>
            <th>seat</th>
            <th>inputDay</th>
            <th>inputMonth</th>
            <th>inputYear</th>
            <th>outDay</th>
            <th>outMonth</th>
            <th>outYear</th>
            <th>other</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${infoList}" var="item">
            <tr class="col-lg-12">
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.birthYear}</td>
                <td>${item.gender}</td>
                <td>${item.national}</td>
                <td>${item.idCard}</td>
                <td>${item.transportType}</td>
                <td>${item.transportId}</td>
                <td>${item.seat}</td>
                <td>${item.inputDay}</td>
                <td>${item.inputMonth}</td>
                <td>${item.inputYear}</td>
                <td>${item.outDay}</td>
                <td>${item.outMonth}</td>
                <td>${item.outYear}</td>
                <td>${item.other}</td>
                <td>
                    <button>
                        <a href="/update?${item.id}">update </a>
                    </button>
                </td>

            </tr>
        </c:forEach>
        <tr>
            <th>
                <a href="/create">Create</a>
            </th>
        </tr>
        </tbody>
    </table>
</div>
</body>
<script src="/bootstrap/jquery/jquery-3.5.1.min.js"></script>
<script src="/bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/bootstrap/bootstrap413/js/bootstrap.bundle.min.js"></script>
</html>
