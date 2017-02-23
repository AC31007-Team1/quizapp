<%@include file="header.jsp"%>
<title>Staff Login</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <br>
<div style="margin: 1% 10% 10% 10%">
<%ChosenQuizStatistics chosenQuiz = (ChosenQuizStatistics) session.getAttribute("ChosenQuizStatistics");%>
        <div class="jumbotron">
            <h1 class="display-1">You have selected Quiz with ID: </h1>


            <div class="row marketing">
                <div class="col-lg-6">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                              <th>Quiz ID</th>
                              <th>Cumulative Quiz Attempts</th>
                              <th>Average Quiz Score</th>
                              <th>Total Quiz Score</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><%=chosenQuiz.getQuiz_id()%></td>
                                <td><%=chosenQuiz.getCumulative_quiz_attempts()%></td>
                                <td><%=chosenQuiz.getAvg_quiz_score()%></td>
                                <td><%=chosenQuiz.getCumulative_quiz_total()%></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>