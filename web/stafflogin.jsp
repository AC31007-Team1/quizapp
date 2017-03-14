<%@include file="header.jsp"%>
<title>Staff Login</title>
  <!--refactored to increase usability and normalize design-->
</head>
<body>
    <%@include file="navbar.jsp"%>
    
<div style="margin: 1% 10% 10% 10%">

        <div class="jumbotron">
            <h1 class="display-1">Staff Login Portal</h1>


            <div class="row marketing">
                <div class="col-lg-6">
                    <form action="StaffLogin" method="post">  
                        <div class="input-group">
                            <input type="number" class="form-control" name="staffID" placeholder="Staff ID Number" aria-describedby="basic-addon1">
                        </div><br>
                        <input type="submit" value="Log In" class="btn btn-primary display-4">
                    </form>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>

