<%@page import="java.util.LinkedList"%>
<%@include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>My Favourite Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>

    <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron">
            <c:if test="${empty pinnedList}">
                <h1 class="display-1">You have not yet pinned any Quizzes</h1>
            </c:if>
            <c:if test="${not empty pinnedList}">
                <h1 class="display-1">My Favourite Quizzes</h1>
                <br>

                <div class="col-12 center "><h2></h2></div>

                <div class="container">
                    <div class="row table">
                        <table class="table table-striped">
                            <thead class="thead-inverse">
                            <th>Quiz ID</th>
                            <th>Quiz Name</th>
                            <th>Delete Quiz</th>
                            </thead>
                            <tbody>
                                <c:forEach items="${pinnedList}" var="listItem">

                                    <tr>
                                        <td class="display-5">${listItem.qid}</td>
                                        <td class="display-5">${listItem.qn}</td>
                                        <td><form role="form" action="ViewPinned" method="post">
                                                <button type="submit" style="cursor: pointer;" name="DeletePinned" value="${listItem.qid}"
                                                        class="btn-danger display-4 btn justify-content-end">
                                                    <span class="ion-trash-b"></span></button><br><br></form></td>
                                    </tr>
                                </c:forEach>
                            </tbody>

                        </table>
                    </div>
                </div>
            </c:if>
        </div>

        <%@include file="footer.jsp"%>