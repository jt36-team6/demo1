
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>在线问答</h1>
    <h5><a href="/toAdd">我要提问</a> </h5>
    <table>
    <tr>
        <td>序号</td>
        <td>问题</td>
        <td>回答次数</td>
        <td>最后修改</td>
    </tr>
    <c:forEach items="${questions}" var="que">
        <tr>
            <td>${que.id}</td>
            <td><a href="/showDetail/${que.id}">${que.title}</a></td>
            <td>${que.answerCount}</td>
            <td>
                <fmt:formatDate value="${que.lastModified}" pattern="yyyy-MM-dd"/>
            </td>
        </tr>
    </c:forEach>
    </table>

</body>
</html>
