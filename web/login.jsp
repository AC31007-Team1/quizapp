<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body>
        <div class="jumbotron">
            <div class="container">
                <h2>Log In</h2>
                <form action="Login" method="post">  
                    <div class="input-group">
                        <input type="text" class="form-control" name="name" placeholder="Username" aria-describedby="basic-addon1">
                    </div><br>
                    <div class="input-group">
                        <input type="password" class="form-control" name="password" placeholder="Password" aria-describedby="basic-addon1">
                    </div><br>
                    <input type="submit" value="Log In" class="btn btn-lg btn-primary">
                </form>
            </div>
        </div>
    </body>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</html>
