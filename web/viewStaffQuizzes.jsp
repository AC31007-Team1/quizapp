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

            <div class="container">
                <div class="row table">
                    <c:forEach items="${quizList}" var="listItem">
                        <div class="col-6">Quiz Name: ${listItem.qn} Quiz ID: ${listItem.qid} Availability: ${listItem.qa}</div>

                        <div class="col-3">
                            <form role="form" action="ChangeAvailability" method="post">
                                <button type="submit" name="Availability" value="${listItem.qid}"
                                        class="btn display-4 btn-md btn-success">Change Availability</button>
                            </form>
                        </div>
                        <div class="col-2 offset-md-1">
                            <form role="form" action="ViewStaffQuizzes" method="post">
                                <button type="submit" style="cursor: pointer;" name="Delete" value="${listItem.qid}"
                                        class="btn-danger display-4 btn justify-content-end" style="transform:translate(-100%,50%);">
                                    <span class="ion-trash-b"></span></button><br><br></form>
                        </div>
                    </c:forEach>
                </div>
            </div>     

        </div>
    
    <%@include file="footer.jsp"%>
