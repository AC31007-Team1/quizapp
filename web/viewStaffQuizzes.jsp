<%@page import="java.util.LinkedList"%>
<%@include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <!--refactored to increase usability and normalize design-->
<title>Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>

    <div style="margin: 10% 10% 10% 10%">
        <div class="jumbotron">


            <h1 class="display-1">My Quizzes</h1>
            <br>

            <%               // for (int i = 0; i <= 14; i++) { %>

            <div class="col-12 center "><h2></h2></div>
            <form role="form" action="ViewStaffQuizzes" method="post">
                <div class="container">
                    <div class="row justify-content-start table table-striped">
                        <c:forEach items="${quizList}" var="listItem">
                            <div class="col-8">Quiz Name: ${listItem.qn} Quiz ID: ${listItem.qid}</div>
                           <form role="form" action="ChangeAvailability" method="post">
                              <button type="submit" style="cursor: pointer;" name="Availability" value="${listItem.qid}"
                            class="list-group-item list-group-item-action">Quiz Name:${listItem.qn} Quiz Availability: ${listItem.qa}</button>
                            </form>
                            <div class="col-2 justify-content-end">
                                <button type="submit" style="cursor: pointer;" name="Delete" value="${listItem.qid}"
                                        class="btn-danger display-4 btn justify-content-end" style="transform:translate(-100%,50%);">
                                    <span class="ion-trash-b"></span></button><br><br>
                            </div>
                        </c:forEach>
                    </div>
                </div>     
            </form>
        </div>
    </div>
    <%@include file="footer.jsp"%>
