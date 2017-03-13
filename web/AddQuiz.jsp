<%-- 
    Document   : AddQuiz
    Created on : 16-Feb-2017, 15:16:32
    Author     : iain
--%>

<!--refactored to increase usability and normalize design-->
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
        <div style="margin: 1% 10% 10% 10%">
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
                                    <button class="btn btn-primary dropdown-toggle display-4" type="button" id="menu1" data-toggle="dropdown"><strong>Select Module</strong>

                                        <span class="caret"></span></button>
                                    <div class="dropdown-menu" role="menu" aria-labelledby="menu1">
                                        <%for (int i = 0; i < modfinder.getSize(); i++) { String a = modfinder.getModule(i); int b = i; b++; String c = Integer.toString(b);%>
                                        <a class="dropdown-item "role="presentation" onclick="dropdown(this.innerHTML);">
                                            <button type="submit"  name="module"  value="<%=c%>" class="dropdown-item">
                                                <p><%=a%></p>
                                            </button></a>
                                        <%}%> 
                                    </div>

                                </div>
                                <br>
                                <br>
                            </div>
                        </div>
                    </div>

                </form>
            </div>
            <script>
                function dropdown(val) {
                    var y = document.getElementsByClassName('btn btn-default dropdown-toggle');
                    var aNode = y[0].innerHTML = val + ' <span class="caret"></span>';
                }
            </script>
            <script>
                //if input has some value will show the button
                window.myFunction = function () {
                    //alert('it ran!');
                    var hasValue = document.getElementById('inputName').value;
                    if (!!hasValue) {
                        document.getElementById('whentext').style.display = 'inline';
                    } else {
                        document.getElementById('whentext').style.display = 'none';
                    }
                    ;
                };
            </script>

            <%@include file="footer.jsp"%>


