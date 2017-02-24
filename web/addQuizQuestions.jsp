<%@include file="header.jsp"%>
<title>Add a Quiz Question</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <%-- motherhecking comments in this friendly quiz app, will be replacing this mofo "QUIZ ONE" with a linking variable later--%>

    <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron">
            <h1 class="display-1">Add a question to Quiz ID: <%=quiz.getQuizID()%></h1>

            <%-- will also need to find a way to get the quiz ID when navigating to this page, perhaps set from the quiz.jsp page controller/model--%>

            <h4 class="display-4">Choose your question's name, the correct and incorrect answer, and click "Add Question". <br>It's that easy!</h4>
            <br

            <div class="row marketing">
                <div class="col-lg-6">
                    <form action="SubmitQuestions" method="post">  
                        <div class="input-group">
                            <input type="text" class="form-control" name="question" placeholder="Enter your question's name." aria-describedby="basic-addon1">
                        </div><br>
                        <div class="input-group">
                            <input type="text" class="form-control" name="cAnswer" placeholder="Enter your question's correct answer." aria-describedby="basic-addon1">
                        </div><br>
                        <div class="input-group">
                            <input type="text" class="form-control" name="answeri1" placeholder="Enter an incorrect answer." aria-describedby="basic-addon1">
                        </div><br>
                        <div class="input-group">
                            <input type="text" class="form-control" name="answeri2" placeholder="Enter another incorrect answer." aria-describedby="basic-addon1">
                        </div><br>
                        <div class="input-group">
                            <input type="text" class="form-control" name="answeri3" placeholder="You guessed it, another incorrect answer goes here." aria-describedby="basic-addon1">
                        </div><br>
                        <input type="submit" value="Add question" class="btn btn-lg btn-primary">
                    </form>
                </div>
            </div>
        </div>
    </div>
    <%@include file="footer.jsp"%>
