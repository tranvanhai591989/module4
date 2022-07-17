<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<div>
    <h1>${message}</h1>
    <table class="table-primary table-responsive col-lg-12">
        <thead class="thead-inverse col-lg-12">
        <tr class="col-lg-12 table-primary">
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">BirthYear</th>
            <th scope="col">Gender</th>
            <th scope="col">national</th>
            <th scope="col">idCard</th>
            <th scope="col">transportType</th>
            <th scope="col">transportId</th>
            <th scope="col">seat</th>
            <th scope="col">inputDay</th>
            <th scope="col">inputMonth</th>
            <th scope="col">inputYear</th>
            <th scope="col">outDay</th>
            <th scope="col">outMonth</th>
            <th scope="col">outYear</th>
            <th scope="col">other</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${infoList}" var="item">
            <tr class="col-lg-12 table-primary">
                <th class="table-primary" scope="col">${item.id}</th>
                <td class="table-primary">${item.name}</td>
                <td class="table-primary">${item.birthYear}</td>
                <td class="table-primary">${item.gender}</td>
                <td class="table-primary">${item.national}</td>
                <td class="table-primary">${item.idCard}</td>
                <td class="table-primary">${item.transportType}</td>
                <td class="table-primary">${item.transportId}</td>
                <td class="table-primary">${item.seat}</td>
                <td class="table-primary">${item.inputDay}</td>
                <td class="table-primary">${item.inputMonth}</td>
                <td class="table-primary">${item.inputYear}</td>
                <td class="table-primary">${item.outDay}</td>
                <td class="table-primary">${item.outMonth}</td>
                <td class="table-primary">${item.outYear}</td>
                <td class="table-primary">${item.other}</td>
                <td>

                    <a class="btn btn-primary" href="/update?id=${item.id}">
                        <button value="update" class="bg-primary">update</button>
                    </a>

                </td>

            </tr>
        </c:forEach>
        <tr>
            <th>
                <a href="/create" class="btn btn-primary">Create</a>
            </th>
        </tr>
        </tbody>
    </table>
</div>
</body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
        crossorigin="anonymous"></script>
</html>
