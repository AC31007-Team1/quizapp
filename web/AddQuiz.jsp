<%-- 
    Document   : AddQuiz
    Created on : 16-Feb-2017, 15:16:32
    Author     : iain
--%>


<%@include file="header.jsp"%>

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
        <div style="margin: 10% 10% 10% 10%">
        
        
        <h1>Add Quiz</h1>
        <br>
        <div class ="row">
            <div class="col-12 center"><h2></h2></div>
        </div>
        
        <form data-toggle="validator" role="form" action="AddQuiz" method="post">
            <div class="form-group">
                <label for="inputName" class="control-label">Quiz Name</label>
                
                <input name = "quizname" type="text" class="form-control" id="inputName" placeholder="Cina Saffary" required>
            </div>
            <div class="row">
                  <div class="col-xs-12 col-sm-6 col-md-8">
            <div class="dropdown">
                <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Select Module
                
                <span class="caret"></span></button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                    <li role="presentation" onclick="dropdown(this.innerHTML);"><a role="menuitem" href="#"><p>module 1</p></a></li>
                    <li role="presentation" onclick="dropdown(this.innerHTML);"><a role="menuitem" href="#"><p>module 2</p></a></li>
                   <li role="presentation" onclick="dropdown(this.innerHTML);"><a role="menuitem" href="#"><p>module 3</p></a></li>
                </ul>
                
            </div>
            <br>
            <br>
            </div>
            </div>
            <div style="text-align:center;">
                <input type="submit" value="Submit"> 
            </div>
            
        </form>
        </div>
        <script>
        function dropdown(val) {
            var y = document.getElementsByClassName('btn btn-default dropdown-toggle');
            var aNode = y[0].innerHTML = val + ' <span class="caret"></span>';
        }
        </script>
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    </script>
</body>
</html>

