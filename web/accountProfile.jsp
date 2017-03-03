<%@include file="header.jsp"%>
  <!--refactored to increase usability and normalize design-->
<title>My Profile</title>
</head>
<body>
    <%@include file="navbar.jsp"%>     
    <div style="margin: 1% 10% 10% 10%">
    <div class="jumbotron ">

        <h1 class="display-1">My Profile</h1>
        
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
        </h3>
        


        <div class="row marketing">
            <div class="col-lg-6">
       
            </div>
        </div>
    </div>
            </div>
<%@include file="footer.jsp"%>
