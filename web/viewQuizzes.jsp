<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>
  <!--refactored to increase usability and normalize design-->
<title>View Quizzes</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <div style="margin: 1% 10% 10% 10%">
    <div class="jumbotron">
        
        <% if(quiz.isQuizSet()) { %>
        <h1 class="display-1">Select a Quiz:</h1>
        <br>
        <div class=""><h2></h2></div>
        
            <%for (int i = 0; i < quiz.getQuizIDList().size(); i++) {
                List quizList = quiz.getQuizList();
                List quizIdList = quiz.getQuizIDList();
                %>
            <form role="form" class="fix"  action="PreviewQuiz" method="post">
                    <h3 class='display-4'><%=quizList.get(i)%></h3>
                    <button type="submit"  action="PreviewQuiz" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                            class="btn btn-primary display-4 col-md-4">Preview Quiz</button>            
            </form>

            <form role="form" class="fix "action="AddQuizQuestions" method="post">
                    <button type="submit" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                            class="btn btn-primary display-4 col-md-3">Add Quiz Questions</button>
            </form>

            <form role="form"class="fix " action="QuizStatistics" method="post">
                    <button type="submit" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                            class="btn btn-primary display-4 col-md-4">View Quiz Statistics</button>

            </form>
                        
                            <br>
                        <br>
        <%}
            } else {%>
            <h1 class="display-1">There are no quizzes to display!</h1>
        <br>
        <div class=""><h2></h2></div>
        <%}%>
    </div>
    

        <%@include file="footer.jsp"%>
