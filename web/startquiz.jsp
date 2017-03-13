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
        
        <% 
                            List quizQuestionList = quiz.getQuizQuestions();
                            List quizQuestionAnswers = quiz.getQuizCAnswers();
                            List quizQuestionInc1Answers = quiz.getQuizI1Answers();
                            List quizQuestionInc2Answers = quiz.getQuizI2Answers();
                            List quizQuestionInc3Answers = quiz.getQuizI3Answers();
                            List quizQuestionID = quiz.getQuizQuestionID();
                            int i = quiz.getQuizIndex();
                            String id = quiz.getQuizID();
        %>
        
            <div class="col-12 center"><h2></h2></div>
            
            <% if(quiz.getQuizIndex() != quiz.getQuizQuestions().size()){ %>
                <form action="SubmitQuizQuestion" method="post">
                <h4>Question: <%=quizQuestionList.get(i)%></h4>

                <button type="radio" class="btn btn-primary mg col-lg-12 row" name="answer" value="c"><%=quizQuestionAnswers.get(i)%></button>
                <button type="radio" class="btn btn-success mg col-lg-12 row" name="answer" value="i"><%=quizQuestionInc1Answers.get(i)%></button>
                <button type="radio" class="btn btn-danger mg col-lg-12 row"  name="answer" value="i"><%=quizQuestionInc2Answers.get(i)%></button>
                <button type="radio" class="btn btn-warning mg col-lg-12 row" name="answer" value="i"><%=quizQuestionInc3Answers.get(i)%></button>

                 <input type="hidden" name="quizID" value="<%=id%>">
                 <input type="hidden" name="quizIndex" value="<%=i%>">
                 
                 <br><br>
                 <input type="submit" value="Submit Question" class="btn btn-primary display-4">
            </form>          
            <%} else {%>
            <!-- There will be a button here that submits the current quiz bean to be updated in database and results calculated-->
            <form action="SubmitQuiz" method="post">
                <h3>You've reached the end of the quiz</h3>
                <br><br>
                <input type="submit" value="Submit Quiz" class="btn btn-primary display-4">
            </form>
            <%}%>
        </div>
    
    <%@include file="footer.jsp"%>