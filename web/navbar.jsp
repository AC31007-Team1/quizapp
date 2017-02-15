<%-- 
    Document   : navbar
    Created on : 15-Feb-2017, 12:50:54
    Author     : Think
--%>

<%@page import="quizapp.bean.*"%>
<nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse fixed-top">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="index.jsp">CraigMC!</a>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">Home<span class="sr-only">(current)</span></a>
            </li>
          
            <li class="nav-item">
                <a class="nav-link" href="/quizapp/CreateAccount">Create Account</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Login Portal</a>
                <div class="dropdown-menu" aria-labelledby="dropdown01">
                    <a class="dropdown-item" href="/quizapp/StudentLogin">Student Login</a>
                    <a class="dropdown-item" href="/quizapp/StaffLogin">Staff Login</a>
                </div>
            </li>

        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search for a Quiz">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search!</button>
        </form>
    </div>
</nav>
<br><br><br>
