<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/boostrap/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/boostrap/datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>

<h3>TỜ KHAI Y TẾ</h3><br>
<h5>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN
    NHIỄM</h5>
<span class="text-danger"> Khuyến cáo : Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể bị xử lý hình sự</span>
<form:form action="/create" modelAttribute="infoForm" method="post">
    <table class="table-primary col-lg-12">
        <tr class="col-lg-12">
            <label >Id <p class="text-danger">(*)</p></label>
        </tr>
        <tr class="col-lg-12">
            <td class="col-lg-12"> <form:input path="id"/>

            </td>
        </tr>
        <tr class="col-lg-12">
            <td class="col-lg-12">  <label >Họ tên(ghi chữ in hoa) <p class="text-danger">(*)</p></label></td>
        </tr>
        <tr class="col-lg-12">
            <td class="col-lg-12"> <form:input  path="name" /></td>
        </tr>
        <tr class="col-lg-12">
            <td class="col-lg-3">Năm sinh <p class="text-danger">(*)</p></td>
            <td class="col-lg-3">Giới tính <p class="text-danger">(*)</p></td>
            <td class="col-lg-3">Quốc tịch <p class="text-danger">(*)</p></td>
        </tr>
        <tr class="col-lg-12">
            <td class="col-lg-3"><form:options items="" path="birthYear" itemValue="${birthdayList}"/></td>
            <td class="col-lg-3"><form:options items="" path="gender" itemValue="${genderList}"/></td>
            <td class="col-lg-3"><form:options items="" path="national" itemValue="${nalionalityList}"/></td>
        </tr>
        <tr class="col-lg-12">
            <label for="idCard">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác <p class="text-danger">
                (*)</p></label>
        </tr>
        <tr class="col-lg-12">
            <form:input path="idCard" id="idCrad" cssClass="col-lg-12"/>
        </tr>
        <tr class="col-lg-12">
            Thông tin đi lại <p class="text-danger">(*)</p>
        </tr>
        <tr class="col-lg-12">
            <form:checkboxes path="transportType" items="${transportType}"/>
        </tr>
        <tr class="col-lg-12">
            <td class="col-lg-6"> Số hiệu phương tiện</td>
            <td class="col-lg-6">Số ghế</td>
        </tr>
        <tr class="col-lg-12">
            <td class="col-lg-6> <form:input path="transportId"/></td>
           <td class=" col-lg-6><form:input path="seat"/></td>
        </tr>
        <tr class="col-lg-12">
            <td class="col-lg-6">Ngày khởi hành <p class="text-danger">(*)</p></td>
            <td class="col-lg-6">Ngày kết thúc <p class="text-danger">(*)</p></td>
        </tr>
        <tr class="col-lg-12">
            <td class="col-lg-2"><form:options path="inputDay" itemValue="${inputDay}"/></td>
            <td class="col-lg-2"><form:options path="inputMonth" itemValue="${inputMonth}"/></td>
            <td class="col-lg-2"><form:options path="inputYear" itemValue="${inputYear}"/></td>
            <td class="col-lg-2"><form:options path="outDay" itemValue="${outDay}"/></td>
            <td class="col-lg-2"><form:options path="outMonth" itemValue="${outMonth}"/></td>
            <td class="col-lg-2"><form:options path="outYear" itemValue="${outYear}"/></td>
        </tr>
        <tr class="col-lg-12">
            trong vòng 14 ngày qua , Anh/chị có đi đến tỉnh thành phố nào? <p class="text-danger">(*)</p>
        </tr>
        <tr class="col-lg-12">
            <form:input path="other"/>
        </tr>
        <tr>
            <button type="submit" class="bg-primary">Đăng kí</button>
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
