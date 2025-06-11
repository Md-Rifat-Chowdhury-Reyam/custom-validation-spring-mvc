<%--@elvariable id="Ref" type="com.foodhut"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h2>Welcome ${Ref.name} to Student portal<br><br>
    Your Roll Number is ${Ref.roll} and from ${Ref.address}.</h2>
</body>
</html>