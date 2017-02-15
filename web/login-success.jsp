<%-- 
    Document   : login-sucess
    Created on : 15-Feb-2017, 11:44:09
    Author     : anthonygrimes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="quizapp.bean.UserLogin"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <div class="alert alert-success" role="alert">
        <strong>Shablamzo!</strong> You logged in successfully. 
        <%UserLogin bean = (UserLogin) request.getAttribute("bean");
       out.print("Welcome, " + bean.getName() + ".");%>
    </div><br> 

    <a href ="index.html"><button type="button"  class="btn btn-success">Return to Home Page</button></a>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>
