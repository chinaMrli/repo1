<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/12/16
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>你讲的也忒好了</h3>
<c:forEach items="${success}" var="account">
    ${account.name}<br/>
    ${account.money}

</c:forEach>



</body>
</html>
