<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="quizapp.bean.*"%> <%--used to check if loggedin--%>
<!DOCTYPE html>
  <!--refactored to prevent changing multiple files-->
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <link rel="stylesheet" href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <script src="//cdn.rawgit.com/namuol/cheet.js/master/cheet.min.js" type="text/javascript"></script>
        <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
        <link rel="stylesheet" href="css/css_snippets.css">
        <%
            StaffLogin staffLogin = (StaffLogin) session.getAttribute("StaffLogin");
            StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
            modulecount modfinder = (modulecount) session.getAttribute("modulecount");
            module specificModule = (module) session.getAttribute("module");
            Quiz quiz = (Quiz) session.getAttribute("Quiz");
        %> 
