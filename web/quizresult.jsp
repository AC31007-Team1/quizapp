<%@include file="header.jsp"%>
<title>Your result</title>
</head>

<body>
   <%@include file="navbar.jsp"%>
   
    <br>
    <div style="margin: 1% 10% 10% 10%">
        <%StudentQuiz studentQuiz = (StudentQuiz) session.getAttribute("StudentQuiz");%>
        
        <div class="jumbotron">
            <h1 class="display-1">Your results</h1>


            <div class="row marketing">
                <div class="col-lg-6">
                    <h3>You scored: <%=studentQuiz.getScoreTally()%> out of a total <%=studentQuiz.getQuestionTally()%></h3>
                    <% for(int i = 0; i < quiz.getQuizEAnswers().size(); i++) {%>
                    <br><h3>Question <%=i+1%> Explanation</h3><br>
                    <p><%=quiz.getQuizEAnswers().get(i)%></p>
                    <%}%>
                </div>
            </div>
        </div>
    </div>
   
   
   
   
   <%@include file="footer.jsp"%>