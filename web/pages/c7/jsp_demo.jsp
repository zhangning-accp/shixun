<%@ page import="java.awt.*" %>
<%@ page import="org.apache.jasper.runtime.HttpJspBase" %>
<%@ page import="java.awt.image.BufferedImage" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/5
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    HttpJspBase self = (HttpJspBase)page;
    BufferedImage image = new BufferedImage(200,100,BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2D = (Graphics2D)image.getGraphics();
    graphics2D.drawImage();
%>
</body>
</html>
