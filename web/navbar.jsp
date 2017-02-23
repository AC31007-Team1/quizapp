<nav class="navbar navbar-inverse bg-primary">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="/quizapp"><img src="University_of_Dundee_logo.svg.png"height="25px"width="20px"> Craig MC</a>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
        <%
            if (staffLogin != null ) 
            {%>
            
            <%    if (staffLogin.getLoggedIn()) 
                {
            %>
            <li class="nav-item">
                <a class="nav-link" href="/quizapp/LogoutStaff">
                    <span class="fa fa-sign-out" aria-hidden="true"></span> Logout</a>
            </li>
            <%  }
            }
            else{ 
            if (studentLogin != null){
                if(studentLogin.getLoggedIn())
                { %>  
            <li class="nav-item" >
                <a class="nav-link" href="/quizapp/LogoutStudent">
                    <span class="fa fa-sign-out" aria-hidden="true"></span>Logout</a>
            </li>
                <%} }else{%>

            <li class="nav-item">
                <a class="nav-link " href="/quizapp/CreateAccount">Create Account</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/quizapp/StudentLogin">Login As Student</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/quizapp/StaffLogin">Login As Staff</a>
            </li>
            <%}} 
            %>
        </ul>
    </div>
</nav>