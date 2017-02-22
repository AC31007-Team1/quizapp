<%-- 
    Document   : DisplayQuizTable
    Created on : 20-Feb-2017, 11:24:35
    Author     : wphma
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Don't Know</title>
    </head>
    <body>
        <table>
        <%Iterator itr;
        List quiz = (List) request.getAttribute("QuizData");
        for(itr = quiz.iterator(); itr.hasNext();)
        {
        String id = (String) itr.next();
        %>
            <tr>
                <td>
                <% itr.next(); %> 
                </tb><td>
                    <input type="button" value="Delete" name="delete" onclick ="deleteRecord(<%=id%>)">
                </td>
            </tr>
            
                   
        <%}%>
        </table>
    </body>
</html>
