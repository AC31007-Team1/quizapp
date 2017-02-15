<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="header.jsp"/>

<title>quizQuestions</title>
<script src="js/quizme.js"></script>
</head>

<body>
    <%-- motherfucking comments in this bitch, will be replacing this mofo "QUIZ ONE" with a linking variable later--%>
    <h1>Please enter a question for Quiz One</h1>

    <%-- will also need to find a way to get the quiz ID when navigating to this page, perhaps set from the quiz.jsp page controller/model--%>

    <input id="Add question" type="button" value="addQuestion" onclick="createQuestionForm()" />

</body>
</html>
