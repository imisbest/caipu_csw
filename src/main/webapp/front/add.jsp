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

<form action="${path}/studd/add" method="post">


    菜系；；<select id="province"></select><br/>
    菜谱<select id="city" name="pid"><br>
    <%--已经学习<select id="country">次<br/>--%>
    已经学习<input type="text" id="country">次
</select>
    <input type="submit" value="去学习">
    <a href="${path}/studd/queryAll"><input type="button" value="返回上一层"></a>
</form>

</body>
</html>
