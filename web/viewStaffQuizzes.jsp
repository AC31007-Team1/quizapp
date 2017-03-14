<%@page import="java.util.LinkedList"%>
<%@include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--refactored to increase usability and normalize design-->
<title>My Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>

    <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron">

            <c:if test="${empty quizList}">
                <h1 class="display-1">You have not yet created any Quizzes</h1>
            </c:if>
            <c:if test="${not empty quizList}">
                <h1 class="display-1">My Quizzes</h1>
            </c:if>
            <br>
            <div class="col-12 center "><h2></h2></div>
            <div class="container">
                <c:if test="${not empty quizList}">
                    <div class="row table">
                        <table class="table table-striped">
                            <thead class="thead-inverse">
                            <th> Quiz ID </th>
                            <th> Quiz Name </th>
                            <th> Availability </th>
                            <th> Change Availability</th>
                            <th> Delete Quiz </th>
                            </thead>
                            <tbody>
                                <c:forEach items="${quizList}" var="listItem">
                                    <tr>
                                        <td>${listItem.qid}</td>
                                        <td>${listItem.qn}</td> 
                                        <td>${listItem.qa}</td>
                                        <td>
                                            <form role="form" action="ChangeAvailability" method="post">
                                                <button type="submit" name="Availability" value="${listItem.qid}"
                                                        class="btn display-4 btn-md btn-success">Change Availability</button>
                                            </form>
                                        </td>
                                        <td>
                                            <form role="form" action="ViewStaffQuizzes" method="post">
                                                <button type="submit" style="cursor: pointer;" name="Delete" value="${listItem.qid}"
                                                        class="btn-danger display-4 btn justify-content-end">
                                                    <span class="ion-trash-b"></span></button>
                                            </form>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </c:if>
                </div>
            </div>     

        </div>

        <%@include file="footer.jsp"%>
