<%@include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--refactored to increase usability and normalize design-->
<title>Student"yournamehere" Results</title>
</head>
<body>
    <%@include file="navbar.jsp"%>     
    <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron ">
            <div class="row marketing">
                <div class="col-lg-12">
                    <table style="width:100%">                 
                        <c:forEach items="${statList}" var="listItem">
                            <tr>
                                <th>${listItem.qid}</th>
                                <th>${listItem.qn}</th>
                                <th>${listItem.qs}</th>
                                <th>${listItem.dt}</th>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <%@include file="footer.jsp"%>