<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>


<title>Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>
    
    <div class="jumbotron">
        <div style="margin: 10% 10% 10% 10%">
        
        <h1>Select a quiz</h1>
        <br>
        
            <div class="col-12 center"><h2></h2></div>
            <form role="form" action="AddQuizQuestions" method="post">
                <div class="list-group">
                    <% 
                        for(int i = 0; i < quiz.getQuizIDList().size(); i++) {
                            List quizList = quiz.getQuizList();
                            List quizIdList = quiz.getQuizIDList();
                        %>
                        
                        <button type="submit" style="cursor: pointer;" name="quiz" value="<%=quizIdList.get(i)%>"
                                class="list-group-item list-group-item-action"><p style="text-align: center;"><%=quizList.get(i)%></p></button>
                                <%}%>
                </div>
            </form>
        
        
<%@include file="footer.jsp"%>
