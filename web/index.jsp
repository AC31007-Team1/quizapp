<%-- 
WARNING: Always, always load header.jsp and footer.jsp in __every__ page or things break. 
You have been warned.
You will probably want navbar.jsp as well.
--%>
<%@include file="header.jsp"%>
    <title>INDEX TEST</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    
    <h1>Hello World!</h1>
    <a href="/quizapp/Login">LOGIN</a>
    <a href="/quizapp/CreateAccount">ehllo</a>
    <a href="/quizapp/QuizQuestions">thanks warren</a>
    <%@include file="footer.jsp"%>

