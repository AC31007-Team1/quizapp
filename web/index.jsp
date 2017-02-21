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

    <%
        if (staffLogin != null) {
            if (staffLogin.getLoggedIn()) {

    %>
    <h1>YOU ARE LOGGED IN AS STAFF</h1> 
    <h1>Hello, <%=staffLogin.getfName()%>!</h1>
    <%      }
    } else {
    %>
    <h1>YOU ARE NOT LOGGED IN AS STAFF</h1>
    <%   }
        if (studentLogin != null) {
            if (studentLogin.getLoggedIn()) {
    %>
    <h1> YOU ARE LOGGED IN AS STUDENT </h1>
    <%      }
    } else {
    %>
    <h1> YOU ARE NOT LOGGED IN AS STUDENT </h1>
    <%  }
    %>

    <%@include file="footer.jsp"%>

