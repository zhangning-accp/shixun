<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/6
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
  <form action="/shixun/up" enctype="multipart/form-data" method="post">
    <input type="file" name="file">
    <input type="text" name="name">
    <input type="submit" value="提交">
  </form>
</body>
</html>
