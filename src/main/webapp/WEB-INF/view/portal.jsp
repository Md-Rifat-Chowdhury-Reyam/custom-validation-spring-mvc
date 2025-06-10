<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <style>
        .error {color:yellow}
    </style>
</head>
<body>
<h1>Student Portal</h1>
<%--@elvariable id="studentRef" type="com.foodhut"--%>
<form:form action="welcome" modelAttribute="studentRef">

    <label>Name:</label>
    <form:input path="name" />
    <form:errors path="name" cssClass="error" /><br><br>


    <label>Roll No:</label>
    <form:input path="roll" />
    <form:errors path="roll" cssClass="error" /><br><br>


    <input type="submit" value="Submit" />
</form:form>
</body>
</html>