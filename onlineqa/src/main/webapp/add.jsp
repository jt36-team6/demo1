<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加页面</title>
</head>
<body>
<h1>我要提问</h1>
<h5><a href="/toAdd">返回首页</a></h5>
<form action="/addQues" method="post">
    <table>
        <tr>
            <td>标题</td>
            <td><input type="text" name="title"/></td>
        </tr>
        <tr>
            <td>描述</td>
            <td><textarea name="detaileDesc" id="" cols="30" rows="10"></textarea></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="我要提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
