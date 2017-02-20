<%@include file="header.jsp"%>
<title>Student Login</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <br>
    <div class="jumbotron">
        <h1 class="display-3">Student Login Portal</h1>


        <div class="row marketing">
            <div class="col-lg-6">
                <form action="StudentLogin" method="post">  
                    <div class="input-group">
                        <input type="text" class="form-control" name="studentID" placeholder="Matriculation Number" aria-describedby="basic-addon1">
                    </div><br>
                    <input type="submit" value="Log In" class="btn btn-lg btn-primary">
                </form>
            </div>
        </div>
        <%@include file="footer.jsp"%>

