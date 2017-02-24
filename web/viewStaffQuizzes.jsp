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

            <c:forEach items="${quizList}" var="listItem">
                <form role="form" action="ViewStaffQuizzes" method="post">
                    <button type="submit" style="cursor: pointer;" name="Delete" value="${listItem.qid}"
                            class="list-group-item list-group-item-action">Quiz Name:${listItem.qn} Quiz id: ${listItem.qid} Delete Quiz</button>
                </form>
                <form role="form" action="ChangeAvailability" method="post">
                    <button type="submit" style="cursor: pointer;" name="Availability" value="${listItem.qid}"
                            class="list-group-item list-group-item-action">Quiz Name:${listItem.qn} Quiz Availability: ${listItem.qa}</button>
                </form>
            </c:forEach>

            <%@include file="footer.jsp"%>