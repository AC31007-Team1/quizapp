<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>


<title>Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>

    <div class="jumbotron">


        <h1>Select a quiz</h1>
        <br>
        <div class="col-12 center"><h2></h2></div>
                <%            for (int i = 0; i < quiz.getQuizIDList().size(); i++) {
                        List quizList = quiz.getQuizList();
                        List quizIdList = quiz.getQuizIDList();
                %>
        <form role="form" action="PreviewQuiz" method="post">
            <div class="list-group">


                <h3><%=quizList.get(i)%></h3>
                <button type="submit" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                        class="list-group-item list-group-item-action"><p style="text-align: center;">Preview Quiz</p></button>
            </div>
        </form>
        
        <form role="form" action="AddQuizQuestions" method="post">
            <div class="list-group">
                <button type="submit" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                        class="list-group-item list-group-item-action"><p style="text-align: center;">Add Quiz Questions</p></button>
            </div>
        </form>

        <form role="form" action="QuizStatistics" method="post">
            <div class="list-group">
                <button type="submit" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                        class="list-group-item list-group-item-action"><p style="text-align: center;">View Quiz Statistics</p></button>
            </div>
        </form>
                        
                        
                        <br>
        <%}%>

        <%@include file="footer.jsp"%>
