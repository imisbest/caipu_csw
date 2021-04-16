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
<table border="1px" cellpadding="5px" cellspacing="0px">
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${shicais}" var="p">
        <tr>
            <td>
                    ${p.id}
            </td>
            <td>
                    ${p.name}
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${path}/back/shicai/add.jsp"><input type="button" value="去添加"></a>
<a href="${path}/back/main.jsp"><input type="button" value="返回上一级菜单"></a>
</body>
</html>
