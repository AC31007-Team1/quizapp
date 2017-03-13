<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>
  <!--refactored to increase usability and normalize design-->
<title>Quizzes</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <div style="margin: 1% 10% 10% 10%">
    <div class="jumbotron">


        <h1 class="display-1">Select a Quiz:</h1>
        <br>
        <div class=""><h2></h2></div>
                <%            for (int i = 0; i < quiz.getQuizIDList().size(); i++) {
                        List quizList = quiz.getQuizList();
                        List quizIdList = quiz.getQuizIDList();
                %>
            <form role="form" class="fix"  action="StartQuiz" method="post">
                    <h3 class='display-4'><%=quizList.get(i)%></h3>
                    <button type="submit" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                            class="btn btn-primary display-4 col-md-3">Start Quiz</button>            
            </form>

            <form role="form" class="fix "action="PrintFriendlyResults" method="post">
                    <button type="submit" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                            class="btn btn-primary display-4 col-md-5">Print Friendly Results</button>
            </form>

            <form role="form" class="fix " action="AddPinned" method="post">
                    <button type="submit" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                            class="btn btn-primary display-4 col-md-3">Pin to Favourites</button>
            </form>                
                            <br>
                        <br>
        <%}%>
    </div>
    

        <%@include file="footer.jsp"%>