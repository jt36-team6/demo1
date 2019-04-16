<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>详细内容</title>
    <form action="/addAnswers" method="get">
        <input type="hidden" name="qid" value="${questions.id}">
        <table>
            <tr>
                <td>问题</td>
                <td>${questions.title}</td>
            </tr>
            <tr>
                <td>问题描述</td>
                <td>${questions.detaileDesc}</td>
            </tr>
            <tr>
                <td>网友回答</td>
                <td>
                    <c:forEach items="${questions.answersList}" var="ans">
                        <p style="background-color: #e2e028;margin-bottom: 5px">
                            <fmt formatDate value="${ans.ansDate}" pattern="yyyy-MM-dd"/>
                            <br/>
                                ${ans.ansContent}
                        </p>
                    </c:forEach>
                </td>
            </tr>
            <tr>
                <td>我来回答</td>
                <td><textarea name="ansContent" id="" cols="30" rows="10"></textarea></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="我来回答"/>
                    <a href="/showQuest">返回首页</a>
                </td>
            </tr>
        </table>
    </form>
</head>
<body>

</body>
</html>
