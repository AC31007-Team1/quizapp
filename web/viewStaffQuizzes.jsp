<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>


<title>Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>

    <div class="jumbotron">
        <div style="margin: 10% 10% 10% 10%">

            <h1>Your created Quizzes</h1>
            <br>
            
            <% for (int i = 0; i <= 15; i++)
            { %>
            <div class="col-12 center"><h2></h2></div>
            <form role="form" action="ViewStaffQuizzes" method="post">
                <div class="list-group">
                    <a href="#" class="list-group-item list-group-item-action flex-column align-items-start active">
                        ${quizBean.getQuizIDStaff()}
                    </a>
                </div>
                <% } %>
            </form>

            <%@include file="footer.jsp"%>