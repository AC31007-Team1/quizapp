<%@include file="header.jsp"%>
<title>Staff Login</title>
</head>
  <!--refactored to increase usability and normalize design-->
<body>
    <%@include file="navbar.jsp"%>
    <br>
<div style="margin: 1% 10% 10% 10%">
<%ChosenQuizStatistics chosenQuiz = (ChosenQuizStatistics) session.getAttribute("ChosenQuizStatistics");%>
        <div class="jumbotron">
            <h1 class="display-1">Quiz Statistics</h1>


            <div class="row marketing">
                <div class="col-lg-6">
                    <%if (chosenQuiz.getNoresults()==true)
                    {%>
                    <p>There are no statistics available for this quiz. A student has probably not taken this quiz yet!</p>
                    <%}else{%>
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
                            <%}%>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>