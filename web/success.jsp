<%@ page import="org.mike.dto.User" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.07.13
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Succes</title>
</head>
<body>
<h3>Login successful!</h3>
<%
    User user = (User) request.getAttribute("user");
%>
Hello <%=user.getUserName()%>!
</body>
</html>