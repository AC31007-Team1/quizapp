<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="quizapp.bean.*"%> <%--used to check if loggedin--%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">

        <% 
        StaffLogin staffLogin = (StaffLogin) session.getAttribute("StaffLogin");
        StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
        %>