<%@include file="header.jsp"%>

<!--refactored to increase usability and normalize design-->
<title>Edit Profile</title>
</head>
<body>
    <%@include file="navbar.jsp"%>     
    <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron ">

            <h1 class="display-1">Edit Profile</h1>

            <h3 class="display-4">ID Number:
                ${profile.getID()}
            </h3>
            <h3 class="display-4">Name:
                ${profile.getfName()}
            </h3>
            <h3 class="display-4">Email:
                ${profile.getEmail()} 
            </h3>
            <h3 class="display-4 text-capitalize">User Type:
                ${profile.getSoul()}
                ${test}
                ${test2}
            </h3>

            <div class="row marketing">
                <div class="">
                    <form action="EditProfile" method="post">  
                        <div class="input-group">
                            <span class="input-group-addon">First Name: </span><input type="text" class="form-control" name = "first_name" id="first_name"  value="${profile.getfName()}"  placeholder="Edit First Name" aria-describedby="basic-addon1"> 
                        </div><br/>
                        <div class="input-group">
                            <span class="input-group-addon">Last Name: </span><input type="text" class="form-control" name = "last_name" id="last_name"  value="${profile.getlName()}"  placeholder="Edit Last Name" aria-describedby="basic-addon1">
                        </div><br/>
                        <div class="input-group">
                            
                            <span class="input-group-addon">Email: </span><input type="text" class="form-control" name = "email" id="email"  value="${profile.getEmail()}"  placeholder="Edit Last Name" aria-describedby="basic-addon1">
                        </div><br/>
                        <input type="submit" value="Update" class="btn btn-lg btn-primary">
                    </form>
                </div>
                <div class ="col-lg-6">

                </div>
            </div>
        </div>
    
    <%@include file="footer.jsp"%>
