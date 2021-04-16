<%@ page pageEncoding="UTF-8" contentType="text/html; charset=utf-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE HTML>
<html>
<a href="${path}/caipu/queryAll"><input type="button" value="菜谱管理"></a>
<a href="${path}/caixi/queryAll"><input type="button" value="菜系管理"></a>
<a href="${path}/shicai/queryAll"><input type="button" value="食材管理"></a>
<head>
</head>
<a href="${path}/front/login.jsp"><input type="button" value="去登录"></a>

<body>


</body>
</html>
