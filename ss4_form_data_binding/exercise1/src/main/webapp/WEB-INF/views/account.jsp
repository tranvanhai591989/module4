<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/boostrap/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/boostrap/datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>
<h1>${message}</h1>
<field  >
    <h5>Account : ${mail.language} </h5>
    <h5>Page size : ${mail.pageSize} </h5>

    <c:if test="${mail.spamsFilter != null}">
        <h5> Spam Filer: Enable</h5>
    </c:if>

    <c:if test="${mail.spamsFilter == null}">
        <h5> Spam Filer: Disable</h5>
    </c:if>

    <h5>Signature : ${mail.signature} </h5>
</field>
<button value="/create-account" name="create">Add new mail</button>
<table class="table-primary col-12">
    <h1></h1>
    <tr class="col-12">
        <th class="col-2">ID</th>
        <th class="col-2">Language</th>
        <th class="col-2">Page Size</th>
        <th class="col-2">Spams Filter</th>
        <th class="col-2">Signature</th>
        <th class="col-2">Action</th>
    </tr>
    <c:forEach items="${mailList}" var="mail">
        <tr class="col-12">
           <td class="col-2">${mail.id}</td>
           <td class="col-2"> ${mail.language}</td>
           <td class="col-2">${mail.pageSize}</td>
           <td class="col-2">${mail.spamsFilter}</td>
           <td class="col-2">${mail.signature}</td>
            <td class="col-2 "><a href="/update?id=${mail.id}"><button value="update" class="bg-primary">update</button></a></td>
        </tr>
    </c:forEach>
</table>
</body>
<script src="/boostrap/jquery/jquery-3.5.1.min.js"></script>
<script src="/boostrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="/boostrap/datatables/js/dataTables.bootstrap4.min.js"></script>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="/boostrap/bootstrap413/js/bootstrap.bundle.min.js"></script>
</html>
