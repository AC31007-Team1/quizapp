<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>


<title>Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>
    <div style="margin: 1% 10% 10% 10%">
    <div class="jumbotron">
        

            <h1 class="display-1">Previewing Quiz: </h1>
            <br>
            <div class="col-12 center"><h2></h2></div>
                    <%for (int i = 0; i < quiz.getQuizQuestions().size(); i++) {
                            List quizQuestionList = quiz.getQuizQuestions();
                            List quizQuestionAnswers = quiz.getQuizCAnswers();
                            List quizQuestionInc1Answers = quiz.getQuizI1Answers();
                            List quizQuestionInc2Answers = quiz.getQuizI2Answers();
                            List quizQuestionInc3Answers = quiz.getQuizI3Answers();
                            List quizQuestionID = quiz.getQuizQuestionID();
                    %>
            <h3>Question: <%=quizQuestionList.get(i)%></h3><form action="EditQuestion" method="post"><button type="submit" value="<%=quizQuestionID.get(i)%>" class="btn btn-link">Edit Question</button></form>
            <p>Correct Answer <%=quizQuestionAnswers.get(i)%></p>
            <p>Incorrect Answer: <%=quizQuestionInc1Answers.get(i)%></p>
            <p>Incorrect Answer: <%=quizQuestionInc2Answers.get(i)%></p>
            <p>Incorrect Answer: <%=quizQuestionInc3Answers.get(i)%></p>

            <br>
            <%}%>

        </div>
    </div>
    <%@include file="footer.jsp"%>
    
                            
                %>
        <h3>Questions: <%=quizQuestionList.get(i)%></h3><form action="EditQuestion" method="post"><button type="submit" value="<%=quizQuestionID.get(i)%>" class="btn btn-link">Edit Question</button></form>
        <p>Correct Answer: <%=quizQuestionAnswers.get(i)%></p>

