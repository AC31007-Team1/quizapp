<%@include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--refactored to increase usability and normalize design-->
<title>Your Results</title>
</head>
<body>
    <%@include file="navbar.jsp"%>     
    <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron ">
            <div class="row marketing">
                <div class="col-lg-12">
                    <table class="table table-striped"style="width:100%"> 
                        <thead class="thead-inverse">
                            <tr>
                                <th>Quiz ID</th>
                                <th>Quiz Name</th>
                                <th>Score</th>
                                <th>Time Completed</th>
                            </tr>
                        </thead>
                        <c:forEach items="${statList}" var="listItem">
                            <tr>
                                <td>${listItem.qid}</td>
                                <td>${listItem.qn}</td>
                                <td>${listItem.qs}</td>
                                <td>${listItem.dt}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <form action="PrintResults" method="post">  
                    <div class="input-group">
                    </div><br>
                    <input type="submit" value="Print Results" class="btn btn-primary display-4">
                </form>
            </div>
        </div>
    
    <%@include file="footer.jsp"%>