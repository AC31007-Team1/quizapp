

<nav class="navbar navbar-inverse bg-primary">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="/quizapp"><img src="src/University_of_Dundee_logo.svg.png"height="25px"width="20px" style="position:relative;bottom:5px;"> Craig MC</a>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <%
                if (staffLogin != null) {%>

            <%    if (staffLogin.getLoggedIn()) {
            %>
            <li class="nav-item display-5">
                <a class="nav-link" href="/quizapp/AccountProfile">
                    <span class="ion-person" aria-hidden="true"></span> My Profile</a>
            </li>
            <li class="nav-item display-5">
                <a class="nav-link" href="/quizapp/LogoutStaff">
                    <span class="ion-log-out" aria-hidden="true"></span> Logout</a>
            </li>  
            <li class="nav-item display-5">
                <a class="nav-link" href="/quizapp/AddQuiz">
                    <span class="ion-plus-round" aria-hidden="true"></span> Add Quiz</a>
            </li>  
            <li class="nav-item display-5">
                <a class="nav-link" href="/quizapp/AddQuizQuestions">
                    <span class="ion-help-circled" aria-hidden="true"></span> Add Quiz Questions</a>
            </li>  
            <li class="nav-item display-5">
                <a class="nav-link" href="/quizapp/ViewQuizzes">
                    <span class="ion-search" aria-hidden="true"></span> View Quizzes</a>
            </li>
            <%  }
            } else {
                if (studentLogin != null) {
                    if (studentLogin.getLoggedIn()) { %>  
            <li class="nav-item display-5" >
                <a class="nav-link" href="/quizapp/LogoutStudent">
                    <span class="ion-log-out" aria-hidden="true"></span> Logout</a>
            </li>
            <%}
            } else {%>

            <li class="nav-item display-5">
                <a class="nav-link " href="/quizapp/CreateAccount">
                    <span class="ion-person-add" aria-hidden="true"></span> Create Account</a>
            </li>
            <li class="nav-item display-5">
                <a class="nav-link" href="/quizapp/StudentLogin">
                    <span class="ion-ios-glasses-outline" aria-hidden="true"></span> Login As Student</a>
            </li>
            <li class="nav-item display-5">
                <a class="nav-link" href="/quizapp/StaffLogin">
                    <span class="ion-ios-book-outline" aria-hidden="true"></span> Login As Staff</a>

            </li>
            <%}
                }
            %>
        </ul>
    </div>
</nav>