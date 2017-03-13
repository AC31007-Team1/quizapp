<%@include file="header.jsp"%>
  <!--refactored to increase usability and normalize design-->
<title>Student Login</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <div style="margin: 1% 10% 10% 10%">

        <div class="jumbotron">
            <h1 class="display-1">Student Login Portal</h1>


            <div class="row marketing">
                <div class="col-lg-6">
                    <form action="StudentLogin" method="post">  
                        <div class="input-group">
                            <input type="number" class="form-control" name="studentID" placeholder="Matriculation Number" aria-describedby="basic-addon1">
                        </div><br>
                        <input type="submit" value="Log In" class="btn btn-primary display-4">
                    </form>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>

