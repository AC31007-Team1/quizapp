<%-- 
    Document   : AddQuiz
    Created on : 16-Feb-2017, 15:16:32
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
        <div style="margin: 10% 10% 10% 10%">
        <div class="jumbotron">
        <h1 class="display-1">Add Quiz</h1>
        <br>
        <div class ="row">
            <div class="col-12 center"><h2></h2></div>
        </div>
        
        <form data-toggle="validator" role="form" action="AddQuiz" method="post">
            <div class="form-group">
                <label for="inputName" class="control-label display-4">Quiz Name</label>
                
                <input name = "quizname" type="text" class="form-control" id="inputName" placeholder="" onkeyup="myFunction()" required>
            </div>
            <div id="whentext" style="display:none">
            <div class="row">
                  <div class="col-xs-12 col-sm-6 col-md-8">
            <div class="dropdown">
                <button class="btn btn-default dropdown-toggle display-4" style="background-color:white;border: 1px;"type="button" id="menu1" data-toggle="dropdown"><strong>Select Module</strong>
                
                <span class="caret"></span></button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                   <%for (int i=0; i<modfinder.getSize(); i++)
                   {String a=modfinder.getModule(i);int b=i;b++;String c=Integer.toString(b);%>
                    <li role="presentation" onclick="dropdown(this.innerHTML);"><button type="submit" style="border:none;background-color:white;" name="module"  value="<%=c%>"
                                                                                        class="btn btn-default"><p></p><%=a%></button></li>
                    <%}%> 
                </ul>
                
            </div>
            <br>
            <br>
            </div>
            </div>
            </div>
            
        </form>
        </div>
        </div>
        <script>
            function dropdown(val) {
                var y = document.getElementsByClassName('btn btn-default dropdown-toggle');
                var aNode = y[0].innerHTML = val + ' <span class="caret"></span>';
            }
        </script>
        <script>
            //if input has some value will show the button
              window.myFunction = function() {
              //alert('it ran!');
              var hasValue = document.getElementById('inputName').value;
              if (!!hasValue) {
                document.getElementById('whentext').style.display = 'inline';
              } else {
                document.getElementById('whentext').style.display = 'none';
              };
             };
        </script>
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    </script>
</body>
</html>

