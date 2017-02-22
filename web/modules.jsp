<%-- 
    Document   : modules
    Created on : 22-Feb-2017, 12:01:18
    Author     : iain
--%>

<%@include file="header.jsp"%>
<%%>
<!DOCTYPE html>
<html>
    <head>
        <title>
            QuizMe
        </title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <div class="jumbotron">
        <div style="margin: 10% 10% 10% 10%">
        
        <h1>Select a Module</h1>
        <br>
        
            <div class="col-12 center"><h2></h2></div>
            <div class="list-group">
            <%for (int i=0; i<modfinder.getSize(); i++)
                   {String a=modfinder.getModule(i);int b=i;b++;String c=Integer.toString(b);%>
         
                <button type="submit" style="cursor: pointer;" name="module"  value="<%=c%>"
                        class="list-group-item list-group-item-action"><p style="text-align:center;"><%=a%></p></button>
            
         <%}%> 
            </div>
        </div>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    </script>
</body>
