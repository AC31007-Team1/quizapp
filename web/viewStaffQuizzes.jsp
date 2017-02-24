<%@page import="java.util.LinkedList"%>
<%@include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>

    <div class="jumbotron">
        <div style="margin: 10% 10% 10% 10%">

            <h1>Your created Quizzes</h1>
            <br>

            <%               // for (int i = 0; i <= 14; i++) { %>
            <div class="col-12 center"><h2></h2></div>
            <form role="form" action="ViewStaffQuizzes" method="post">
                <table border="1">
                    <tr>
                    </tr>
                    <c:forEach items="${quizList}" var="listItem">
                        <td>${listItem.qn}</td>
                        <button type="submit" style="cursor: pointer;" name="Delete" value="${listItem.qid}"
                                class="list-group-item list-group-item-action"><p style="text-align: center;">Quiz Name:${listItem.qn} Quiz id: ${listItem.qid} Delete Quiz</p></button>
                        </c:forEach>
                </table>
            </form>

            <%@include file="footer.jsp"%>