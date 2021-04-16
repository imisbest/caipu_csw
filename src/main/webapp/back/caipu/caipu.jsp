<%@ page pageEncoding="UTF-8" contentType="text/html; charset=utf-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE HTML>
<html>
<table border="1px" cellspacing="0px" cellpadding="5px">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>食材</td>
        <td>cover</td>
        <td>菜系</td>
        <td>工艺</td>
        <td>简介</td>
        <td>学习次数</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${caipuList}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>
                <c:forEach items="${p.shicaiList}" var="s">
                    ${s.name}
                </c:forEach>
            </td>
            <td>${p.cover}</td>
            <td>${p.caixi.name}</td>
            <td>${p.gongyi}</td>
            <td>${p.jianjie}</td>
            <td>${p.count}</td>
            <td>
                <a href="${path}/caipu/delete?id=${p.id}"><input type="button" value="删除"></a>
                <a href="${path}/caipu/updatefirst?id=${p.id}"><input type="button" value="修改"></a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${path}/caipu/addfirst"><input type="button" value="添加"> </a>
<a href="${path}/back/main.jsp"><input type="button" value="返回上一级菜单"></a>
<head>
</head>

<body>


</body>
</html>
