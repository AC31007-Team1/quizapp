<%-- 
    Document   : navbar
    Created on : 15-Feb-2017, 12:50:54
    Author     : Think
--%>

<nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse fixed-top">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="index.jsp">CraigMC!</a>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/quizapp">
                    <span class="fa fa-home" aria-hidden="true"></span> Home<span class="sr-only">(current)</span></a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="/quizapp/CreateAccount">
                    <span class="fa fa-plus" aria-hidden="true"></span> Create Account</a>
            </li>
            <%
            if (studentLogin != null) 
            {
                if (studentLogin.getLoggedIn()) 
                {
            %>
                    <li class="nav-item">
                        <a class="nav-link" href="/quizapp/LogoutStudent">Logout</a>
                    </li>
            <%  }
            }else{
}%>
            <%
            if (staffLogin != null) 
            {

                if (staffLogin.getLoggedIn()) 
                {
            %>
            <li class="nav-item">
                <a class="nav-link" href="/quizapp/profile.jsp">Profile</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/quizapp/LogoutStaff">Logout</a>
            </li>
            <%  }
            } else 
            {%>
            
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <span class="fa fa-sign-in" aria-hidden="true"></span> Login Portal</a>
                    <div class="dropdown-menu" aria-labelledby="dropdown01">
                        <a class="dropdown-item" href="/quizapp/StaffLogin">
                            <span class="fa fa-graduation-cap" aria-hidden="true"></span> Staff Login</a>
                        <a class="dropdown-item" href="/quizapp/StudentLogin">
                            <span class="fa fa-book" aria-hidden="true"></span> Student Login</a>
                    </div>
                </li>
            <%
            }
            %>

        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search for a Quiz">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search!</button>
        </form>
    </div>
</nav>
<br><br><br>
