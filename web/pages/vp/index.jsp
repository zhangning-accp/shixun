<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/5
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>演示使用Servelt技术生成图形验证码</title>
</head>
<script type="text/javascript">
  function changeImage() {
    document.getElementById("img").src = "/shixun/vp/vp.jpg";
  }

</script>
<body>
  验证码:<img src="/shixun/vp/vp.jpg" id="img"><a href="javascript:changeImage();">看不清,点击这里</a>
</body>
</html>
