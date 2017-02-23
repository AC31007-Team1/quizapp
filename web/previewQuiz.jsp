<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>


<title>Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>

    <div class="jumbotron">


        <h1>Previewing Quiz</h1>
        <br>
        <div class="col-12 center"><h2></h2></div>
                <%for (int i = 0; i < quiz.getQuizQuestions().size(); i++) {
                        List quizQuestionList = quiz.getQuizQuestions();
                        List quizQuestionAnswers = quiz.getQuizCAnswers();
                        List quizQuestionInc1Answers = quiz.getQuizI1Answers();
                        List quizQuestionInc2Answers = quiz.getQuizI2Answers();
                        List quizQuestionInc3Answers = quiz.getQuizI3Answers();
                %>
        <h3>Questions: <%=quizQuestionList.get(i)%></h3>
        <p>Correct Answer <%=quizQuestionAnswers.get(i)%></p>
        <p>Incorrect Answer: <%=quizQuestionInc1Answers.get(i)%></p>
        <p>Incorrect Answer: <%=quizQuestionInc2Answers.get(i)%></p>
        <p>Incorrect Answer: <%=quizQuestionInc3Answers.get(i)%></p>
              
        <br>
        <%}%>

        <%@include file="footer.jsp"%>

