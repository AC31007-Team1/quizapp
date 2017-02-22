<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>


<title>Quizzes</title>
</head>

<body>
    <%@include file="navbar.jsp"%>
    
    <h1>Please select a quiz!</h1>
    
    <%
        List quizList = new ArrayList();
        List quizIDList = new ArrayList();
            quizList = quiz.getQuizList();
            quizIDList = quiz.getQuizIDList();
        for(int i = 0; i <quizList.size(); i++){
        %>
        <a href="/quizapp/AddQuizQuestions/<%=quizIDList.get(i)%>"> <%=quizList.get(i)%></a>
        <%}
    %>
        
        
<%@include file="footer.jsp"%>
