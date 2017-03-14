<%@include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--refactored to increase usability and normalize design-->
<title>My Profile</title>
</head>
<body>
    <%@include file="navbar.jsp"%>     
    <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron ">

            <h1 class="display-1">My Profile</h1>

            <h3 class="display-4">ID Number:
                ${profile.getID()}
            </h3>
            <h3 class="display-4">Name:

                ${profile.getfName()} ${profile.getlName()}

            </h3>
            <h3 class="display-4">Email:
                ${profile.getEmail()} 
            </h3>
            <h3 class="display-4 text-capitalize">User Type:
                ${profile.getSoul()}
            </h3>

            <div class="row marketing">
                <div class="col-lg-6">
                    <form action="AccountProfile" method="post">  
                        <div class="input-group">
                        </div><br>
                        <input type="submit" value="Edit Profile" class="btn btn-primary display-4">
                    </form>
                    <% if (staffLogin != null) {
                            if (!staffLogin.getLoggedIn()) { %>
                    <form action="StudentResults" method="get">  
                        <div class="input-group">
                        </div><br>
                        <input type="submit" value="View all Results" class="btn btn-primary display-4">
                    </form>
                    <% }}%>
                    <c:set var="log" value="${whoLog}"/>
                    <c:choose>
                        <c:when test="${log == 'staff'}">
                        </c:when>
                        <c:when test="${log == 'student'}">
                            <form action="StudentResults" method="get">  
                                <div class="input-group">
                                </div><br>
                                <input type="submit" value="View all Results" class="btn btn-primary display-4">
                            </form>
                            <form action="ViewPinned" method="get">  
                                <div class="input-group">
                                </div><br>
                                <input type="submit" value="View My Favourites" class="btn btn-primary display-4">
                            </form>
                        </c:when>
                        <c:otherwise>
                            ${"backend error"}
                        </c:otherwise>
                    </c:choose>
                </div><br/>
          
            </div>
        </div>
    
    <%@include file="footer.jsp"%>
