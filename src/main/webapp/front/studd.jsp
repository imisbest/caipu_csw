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
<p1>菜谱列表</p1>
<br/>

<table border="1px" cellspacing="0px" cellpadding="5px">
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>

    <c:forEach items="${studds}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.caipu.name}</td>
        </tr>
    </c:forEach>
</table>

<a href="${path}/studd/addfirst"><input type="button" value="去添加菜谱"> </a>
<a href="${path}/front/login.jsp"><input type="button" value="去登录"></a>
</body>
</html>
