<%@ page import="com.shixun.servlet.chat.biz.ext.User" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/7
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c"%>
<html>
<head>
    <title></title>
</head>
<%
  String name = "1@2@#3#@4|5|6|";
  request.setAttribute("name",name);
%>
<body>

    <c:forTokens items="${requestScope.name}" delims="@|" var="value">
        ${value}</br>
    </c:forTokens>

</body>
</html>
