<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>

  <!--refactored to increase usability and normalize design-->
<title>Start Quiz</title>
</head>

<body>
    <%@include file="navbar.jsp"%>
    <div style="margin: 1% 10% 10% 10%">
    <div class="jumbotron">
        

            <h1 class="display-1">Starting Quiz: </h1>
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
            <form action="SubmitQuiz" method="post">
                <h4>Question: <%=quizQuestionList.get(i)%></h4>
                 <input type="radio" name="answer" value="correct<%=i%>" checked><%=quizQuestionAnswers.get(i)%><br>
                 <input type="radio" name="answer" value="incorrect" checked><%=quizQuestionInc1Answers.get(i)%><br>
                 <input type="radio" name="answer" value="incorrect" checked><%=quizQuestionInc2Answers.get(i)%><br>
                 <input type="radio" name="answer" value="incorrect" checked><%=quizQuestionInc3Answers.get(i)%><br> 
            </form>
        </div>
    </div>
    <%@include file="footer.jsp"%>
    
                            
               

