<%@include file="header.jsp"%>
<title>Student Login</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <br>
    <br>
    <%-- motherfucking comments in this bitch, will be replacing this mofo "QUIZ ONE" with a linking variable later--%>
    <h1>Add question to Quiz ID</h1>

    <%-- will also need to find a way to get the quiz ID when navigating to this page, perhaps set from the quiz.jsp page controller/model--%>

    <div class="row marketing">
        <div class="col-lg-6">
            <form action="SubmitQuestions" method="post">  
                <div class="input-group">
                    <input type="text" class="form-control" name="question" placeholder="Please enter your question" aria-describedby="basic-addon1">
                </div><br>
                <div class="input-group">
                    <input type="text" class="form-control" name="cAnswer" placeholder="Please enter the correct answer to the questions only" aria-describedby="basic-addon1">
                </div><br>
                <div class="input-group">
                    <input type="text" class="form-control" name="answeri1" placeholder="Please enter an incorrect answer" aria-describedby="basic-addon1">
                </div><br>
                <div class="input-group">
                    <input type="text" class="form-control" name="answeri2" placeholder="Please enter an incorrect answer" aria-describedby="basic-addon1">
                </div><br>
                <div class="input-group">
                    <input type="text" class="form-control" name="answeri3" placeholder="Please enter an incorrect answer" aria-describedby="basic-addon1">
                </div><br>
                <input type="submit" value="Add question" class="btn btn-lg btn-primary">
            </form>
        </div>
    </div>

    <%@include file="footer.jsp"%>
