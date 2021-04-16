<%@ page pageEncoding="UTF-8" contentType="text/html; charset=utf-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE HTML>
<html>

<head>
    <script type="text/javascript" src="${path}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        $(function () {
            // 初始化省
            $.get('/studd/findName', function (data) {
                console.log(data);
                for (var i = 0; i < data.length; i++) {
                    $('#province')
                        .append($('<option value="' + data[i].id + '">' + data[i].name + '</option>'));
                }
                // 手动触发change事件
                $('#province').change();
            }, 'json');

            // 初始化市
            $('#province').change(function () {
                // 清空历史记录
                $('#city').empty();
                $.get('/studd/findCity', 'parentId=' + $(this).val(), function (data) {
                    for (var i = 0; i < data.length; i++) {
                        $('#city')
                            .append($('<option value="' + data[i].id + '">' + data[i].name + '</option>'));
                    }
                    // 手动触发city的change事件
                    $('#city').change();
                }, 'json');
            });

            $('#city').change(function () {
                // 清空历史记录
                //$('#country').empty();
                $.get('/studd/count', 'parentId=' + $(this).val(), function (data) {
                    console.log(data);
                    console.log(data.count);
                    $('#country').empty().val(data.count);
                }, 'json');
            });
        });
    </script>
</head>

<body>
<form method="post" action="${path}/caipu/update">
    <table border="1px" cellspacing="0px" cellpadding="5px">
        <tr>
            <td>name</td>
            <td>食材</td>
            <td>cover</td>
            <td>菜系</td>
            <td>工艺</td>
            <td>简介</td>
        </tr>
        <tr>
            <input type="text" value="${caipu.id}" name="id" hidden="hidden">
            <td><input type="text" value="${caipu.name}" name="name"></td>
            <td>
                <c:forEach items="${shicais}" var="s">
                    ${s.name}  <input type="checkbox" value="${s.id}" name="ttt">
                </c:forEach>
            </td>
            <td>
                <img src="${path}/img/${s.cover}"></td>
            <td>
                菜系；；<select id="province" name="xid"></select><br/>
                菜谱<select id="city"></select><br/>
            </td>
            <td><input type="text" value="${caipu.gongyi}" name="gongyi"></td>
            <td><input type="text" value="${caipu.jianjie}" name="jianjie"></td>
            <input type="text" value="${caipu.count}" name="count" hidden="hidden">
        </tr>
    </table>

    <a href="${path}/caipu/queryAll"><input type="button" value="返回上一级菜单"></a>
    <input type="submit" value="提交">
</form>
</body>
</html>
