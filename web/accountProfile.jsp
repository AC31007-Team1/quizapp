<%@include file="header.jsp"%>
<title>My Profile</title>
</head>
<body><!--foo-->
    <%@include file="navbar.jsp"%>  <div class="jumbotron ">

        <h1 class="display-1">My Profile</h1>
        <img src="http://placehold.it/200x200" class="rounded float-right" alt="...">
        <blockquote class="blockquote">
            <p class="mb-0">Account Profile</p>
            <footer class="blockquote-footer">Alucard</footer>
        </blockquote>
        
        <h3 class="display-4"><u>ID Number</u>:
            ${profile.getStaffID()}
        </h3>
        <h3 class="display-4"><u>Name</u>:
            ${profile.getfName()}
        </h3>
        <h3 class="display-4"><u>Email</u>:
            ${profile.getEmail()} 
        </h3>
        <h3 class="display-4"><u>Soul</u>:
            ${profile.getSoul()}
        </h3>
        


        <div class="row marketing">
            <div class="col-lg-6">
       
            </div>
        </div>
<%@include file="footer.jsp"%>
