<%-- 
WARNING: Always, always load header.jsp and footer.jsp in __every__ page or things break. 
You have been warned.
You will probably want navbar.jsp as well.
--%>
<%@include file="header.jsp"%>
<%@page import="quizapp.bean.*"%> <%--used to check if loggedin?--%>
<title>INDEX TEST</title>
</head>
<body>
    <%@include file="navbar.jsp"%>

    <div class="panel panel-default"
        <!-- Table -->
        <table class="table">
            <thead>
            <tr>
                <th>
                    Quiz ID
                </th>
                <th>
                    Module Name
                </th>
                <th>
                    School of Study
                </th>
                <th>
                    Quiz Name
                </th>
                <th>
                    Date Created
                </th>
            </tr>
            <tbody>
            <td>
                1
            </td>
            <td>
                Fartonomics
            </td>
            <td>
                School of Foobar
            </td>
            <td> 
                How to Mockup Tables in Bootstrap 101
            </td>
            <td>
                2017.12.23
            </td>
            </tbody>
        </table>
    </div>

    <%@include file="footer.jsp"%>

