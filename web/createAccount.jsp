<%-- 
    Document   : createAccount
    Created on : Feb 14, 2017, 3:22:37 PM
    Author     : craigwatt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <nav class = "navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse">
            <button class = "navbar-toggler navbar-toggler-right" type = "button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-label="Toggle Navigation">
                <span class = "navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="#">QuizMe!</a>
            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"> Student Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"> Staff Login</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown01">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="text" placeholder="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>
        <br><br><br>
        <h1>Create Account Page</h1>
        <div class ="row">
            <div class="col-12 center"><h2> Lets create your account! </h2></div>
        </div>

        <form data-toggle="validator" role="form" action="createAccount" method="post">
            <div class="form-group">
                <label for="inputName" class="control-label">Name</label>
                <input name = "username" type="text" class="form-control" id="inputName" placeholder="Cina Saffary" required>
            </div> 
            <div class="form-group">
                <label for="inputEmail" class="control-label">Email</label>
                <input name = "email" type="email" class="form-control" id="inputEmail" placeholder="Email" data-error="Bruh, that email address is invalid" required>
                <div class="help-block with-errors"></div>
            </div>
            <div class ="form-group">
                <label for="selS">Select Soul</label>
                <select name ="soulChoice" class="form-control" id="selS" onchange="selectS()">
                    <option>select your soul</option>
                    <option value = 'Staff'>Staff Member</option>
                    <option value = 'Student'>Student</option>
                </select>
            </div>
            <div class ="form-group" id="matricHTML">

            </div>
            <div class = "form-group" id="soulHTML">

            </div>
        </form>

        <script>
            function selectS() {
                var y = document.getElementById("selS");
                var i = y.selectedIndex;
                if (i === 0) {
                    document.getElementById("matricHTML").innerHTML = "";
                    document.getElementById("soulHTML").innerHTML = "";
                } else if (i === 1) {
                    document.getElementById("matricHTML").innerHTML = "";
                    document.getElementById("soulHTML").innerHTML = '<button type="submit" class="btn btn-primary btn-lg">Create Account</button></form>';
                } else if (i === 2) {
                    document.getElementById("matricHTML").innerHTML = '<label for="inputMatric" class="control-label">Matriculation Number</label><input name = "matric" type="number" class="form-control" id="inputMatric" placeholder="12345678" required>';
                    document.getElementById("soulHTML").innerHTML = '<button type="submit" class="btn btn-primary btn-lg">Create Account</button></form>';
                }
            }
        </script>

        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    </script>
</body>
</html>
