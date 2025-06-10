<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<body>
<%--@elvariable id="studentRef" type="com.foodhut"--%>
<div>
    <h2>Welcome ${studentRef.name} to Student portal<br><br>
        Your Roll Number is ${studentRef.roll} and you live in Bangladesh.</h2>
</div>
</body>
</html>