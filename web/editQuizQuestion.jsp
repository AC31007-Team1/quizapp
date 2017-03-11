<%@include file="header.jsp"%>
<title>Edit a Quiz Question</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <%-- motherhecking comments in this friendly quiz app, will be replacing this mofo "QUIZ ONE" with a linking variable later--%>
<%QuestionContainer questionContainer = (QuestionContainer) session.getAttribute("QuestionContainer");%>
    <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron">
            <h1 class="display-3">You are editing the following question:</h1>

            <%-- will also need to find a way to get the quiz ID when navigating to this page, perhaps set from the quiz.jsp page controller/model--%>

            <h4 class="display-4"><%=questionContainer.getQuestion()%></h4>
            <br>
            

            <div class="row marketing">
                <div class="col-lg-6">
                    
                    <form action="editQuizQuestion" method="post">  
                    <div class="input-group">
                            <input type="text" class="form-control" name="question" value="<%=questionContainer.getQuestion()%>"  placeholder="Enter your question" aria-describedby="basic-addon1">
                        </div><br>
                     
                        <div class="input-group">
                            <input type="text" class="form-control" name="cAnswer" value="<%=questionContainer.getCorrect()%>" placeholder="Enter your question's correct answer." aria-describedby="basic-addon1">
                        </div><br>
                        <div class="input-group">
                            <input type="text" class="form-control" name="answeri1" value="<%=questionContainer.getIncorrect().get(0)%>" placeholder="Enter an incorrect answer." aria-describedby="basic-addon1">
                        </div><br>
                        <div class="input-group">
                            <input type="text" class="form-control" name="answeri2" value="<%=questionContainer.getIncorrect().get(1)%>" placeholder="Enter another incorrect answer." aria-describedby="basic-addon1">
                        </div><br>
                        <div class="input-group">
                            <input type="text" class="form-control" name="answeri3" value="<%=questionContainer.getIncorrect().get(2)%>" placeholder="You guessed it, another incorrect answer goes here." aria-describedby="basic-addon1">
                        </div><br>
                        <div class="input-group">
                            <input type="text" class="form-control" name="eAnswer" value="<%=questionContainer.getExplanation()%>" placeholder="Enter a explanation here." aria-describedby="basic-addon1">
                        </div><br>
                        <input type="submit" value="Update Question" class="btn btn-lg btn-primary">
                    </form>
                </div>
            </div>
        </div>
    </div>
    <%@include file="footer.jsp"%>
