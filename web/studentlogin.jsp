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
                        <input type="text" class="form-control" name="matricID" placeholder="Matriculation Number" aria-describedby="basic-addon1">
                    </div><br>
                    <div class="input-group">
                        <input type="password" class="form-control" name="password" placeholder="Password" aria-describedby="basic-addon1">
                    </div><br>
                    <input type="submit" value="Log In" class="btn btn-lg btn-primary">
                </form>
            </div>
        </div>
        <%@include file="footer.jsp"%>
</body>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</html>
