<%@ page contentType="text/html;charset=UTF-8" %>
<%--@elvariable id="Ref" type="com.foodhut"--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <style>
        .error {color:red}
    </style>
    <title>portal</title>
</head>
<body>
<h1>Student Portal</h1>

<!-- Make sure modelAttribute matches exactly (case-sensitive) -->

<form:form action="wel" modelAttribute="Ref" method="POST">

    <label>Name:</label>
    <form:input path="name" />
    <form:errors path="name" cssClass="error" /><br><br>

    <label>Roll No:</label>
    <form:input path="roll" />
    <form:errors path="roll" cssClass="error" /><br><br>

    <label>Address</label>
    <form:input path="address" />
    <form:errors path = "address" cssClass="error" /> <br><br>

    <input type="submit" value="Submit" />
</form:form>
</body>
</html>