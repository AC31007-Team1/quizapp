<%-- 
    Document   : profile
    Created on : 20-Feb-2017, 17:08:38
    Author     : Think
--%>
<%@include file="header.jsp"%>
<title>My Profile</title>
</head>
<body>
    <%@include file="navbar.jsp"%>  <div class="jumbotron ">

        <h1 class="display-1">My Profile</h1>
        <img src="http://placehold.it/200x200" class="rounded float-right" alt="...">
        <blockquote class="blockquote">
            <p class="mb-0">What is a Man? A miserable little pile of Secrets.</p>
            <footer class="blockquote-footer">Alucard</footer>
        </blockquote>
        
        <h3 class="display-4"><u>ID Number</u>:</h3>
        <h3 class="display-4"><u>Name</u>:
            <%
                //staffLogin.setfName();
                //studentLogin.getfName();
            %>
        </h3>
        <h3 class="display-4"><u>Email</u>: </h3>
        <h3 class="display-4"><u>Foo</u>: </h3>
        


        <div class="row marketing">
            <div class="col-lg-6">
       
            </div>
        </div>
<%@include file="footer.jsp"%>
