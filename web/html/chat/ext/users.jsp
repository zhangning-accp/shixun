<%@ page import="com.shixun.servlet.chat.biz.ext.User" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/6
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表页面</title>
</head>
<body>
<%
  List<User> users = (List)application.getAttribute("users");
  for(User u : users) {%>
      <div><%=u.getName()%></div>
 <% }%>

</body>
</html>
