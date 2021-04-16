<%@ page pageEncoding="UTF-8" contentType="text/html; charset=utf-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE HTML>
<html>
<head>
</head>

<body>
<form action="${path}/caixi/add" method="post">
    请输入菜系名字<input type="text" value="" name="name">
    <input type="submit" value="提交">
</form>
<a href="${path}/caixi/queryAll"><input type="button" value="返回上一级菜单"></a>
</body>
</html>
