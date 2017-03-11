<!--refactored to prevent changing multiple files-->

<nav class="navbar navbar-toggleable-md navbar-inverse bg-primary fixed-top">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="/2016-agileteam1">
        <img src="src/University_of_Dundee_logo.svg.png"height="25px"width="20px" style="position:relative;bottom:5px;"> 
        CraigMC</a>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mr-auto">
            <%
                if (staffLogin != null) {%>

            <%    if (staffLogin.getLoggedIn()) {
            %>
            <li class="nav-item display-5">
                <a class="nav-link" href="/2016-agileteam1/AccountProfile" data-toggle="tooltip" data-placement="bottom" title="Everything we know about you! Which isn't much!">
                    <span class="ion-person" aria-hidden="true"></span> My Profile</a>
            </li>
            <li class="nav-item display-5">
                <a class="nav-link" href="/2016-agileteam1/LogoutStaff" data-toggle="tooltip" data-placement="bottom" title="We hope to see you again soon!">
                    <span class="ion-log-out" aria-hidden="true"></span> Logout</a>
            </li>  
            <li class="nav-item display-5">
                <a class="nav-link" href="/2016-agileteam1/AddQuiz"data-toggle="tooltip" data-placement="Got a question sitting inside you, gnawing away at your brain and urge to teach? Slap it down!">
                    <span class="ion-plus-round" aria-hidden="true"></span> Add Quiz</a>
            </li>  

            <li class="nav-item display-5">
                <a class="nav-link" href="/2016-agileteam1/SelectModule" data-toggle="tooltip" data-placement="bottom" title="Displays all currently created quizzes, by you or any other teacher!">
                    <span class="ion-search" aria-hidden="true"></span> View Modules/Quizzes</a>
            </li>

            <li class="nav-item display-5">
                <a class="nav-link" href="/2016-agileteam1/ViewStaffQuizzes" data-toggle="tooltip" data-placement="bottom" title="All quizzes you've created or edited are displayed here!">
                    <span class="ion-heart" aria-hidden="true"></span> View My Quizzes/Quiz Settings</a>
            </li>
            <%  }
            } else {
                if (studentLogin != null) {
                    if (studentLogin.getLoggedIn()) { %>  
            <li class="nav-item display-5">
                <a class="nav-link" href="/2016-agileteam1/AccountProfile" data-toggle="tooltip" data-placement="bottom" title="Your Information, and how you've done on quizzes so far!">
                    <span class="ion-person" aria-hidden="true"></span> My Profile</a>
            </li>
            <li class="nav-item display-5" >
                <a class="nav-link" href="/2016-agileteam1/LogoutStudent" data-toggle="tooltip" data-placement="bottom" title="Don't Leave Us! :(">
                    <span class="ion-log-out" aria-hidden="true"></span> Logout</a>
            </li>
            <li class="nav-item display-5">
                <a class="nav-link" href="/2016-agileteam1/SelectModule" data-toggle="tooltip" data-placement="bottom" title="All quizzes and modules available currently are displayed here!">
                    <span class="ion-search" aria-hidden="true"></span> View Quizzes</a>
            </li>

            <%}
            } else {%>

            <li class="nav-item display-5">
                <a class="nav-link " href="/2016-agileteam1/CreateAccount" data-toggle="tooltip" data-placement="bottom" title="This lets you start creating or doing quizzes!">
                    <span class="ion-person-add" aria-hidden="true"></span> Create Account</a>
            </li>
            <li class="nav-item display-5">
                <a class="nav-link" href="/2016-agileteam1/StudentLogin" data-toggle="tooltip" data-placement="bottom" title="Login for Students!">
                    <span class="ion-ios-glasses-outline" aria-hidden="true"></span> Login As Student</a>
            </li>
            <li class="nav-item display-5">
                <a class="nav-link" href="/2016-agileteam1/StaffLogin" data-toggle="tooltip" data-placement="bottom" title="Login for Staff!">
                    <span class="ion-ios-book-outline" aria-hidden="true"></span> Login As Staff</a>

            </li>
            <%}
                }
            %>
            <script>
                $(document).ready(function () {
                    $('[data-toggle="tooltip"]').tooltip();
                });
            </script>
        </ul>
    </div>
</nav>

<br>
<br>
<br>