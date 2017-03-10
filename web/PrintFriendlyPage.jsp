<%@include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--refactored to increase usability and normalize design-->
<title>PrintFriendlyResults</title>
<style>

  body.day{ background-color:#FFFFFF; background-image:none; color:#000000 }
  body.night{ background-color:#FFFFFF; background-image:none; color:#000000 }
  #ad{ display:none;}
  #leftbar{ display:none;}
  #contentarea{ width:100%;}
  table, th, td {
  border: 1px solid black;
}

</style>
</head>
<body>
    <h1>Your Quiz Results</h1>
    <br>
            <table>
                                <th>Quiz ID</th>
                                <th>Quiz Name</th>
                                <th>Quiz Score</th>
                                <th>Date and Time Completed</th>
                        <c:forEach items="${statList}" var="listItem">
                            <tr>
                                <th>${listItem.qid}</th>
                                <th>${listItem.qn}</th>
                                <th>${listItem.qs}</th>
                                <th>${listItem.dt}</th>
                            </tr>
                        </c:forEach>
            </table>
   
    <%@include file="footer.jsp"%>