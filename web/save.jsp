<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加信息</h1>

<form name="accountForm" action="${pageContext.request.contextPath}/account/save" method="post">
    账户名称 : <input type="text" name="name"><br>
    账户余额 : <input type="text" name="money"><br>
    <input type="submit" value="保存"><br>
</form>

</body>
</html>
