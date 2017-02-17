<%@include file="header.jsp"%>
<title>Student Login</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <br>
    <br>
    <h1>Create Account Page</h1>
    <div class ="row">
        <div class="col-12 center"><h2> Lets create your account! </h2></div>
    </div>

    <div class="row marketing">
        <div class="col-lg-6">
            <form action="CreateAccount" method="post">  
                <div class="input-group">
                    <input type="text" class="form-control" name="firstname" placeholder="Username" aria-describedby="basic-addon1">
                </div><br>
                <div class="input-group">
                    <input type="email" class="form-control" name="email" placeholder="abc@email.com" aria-describedby="basic-addon1">
                </div><br>
                <div class ="input-group">
                    <select name ="soulChoice" class="form-control" id="selS" onchange="change(this)">
                        <option>select your soul</option>
                        <option value = "0">Staff Member</option>
                        <option value = "1">Student</option>
                    </select>
                </div><br>
                <div id="staffID_div" style="display: none;">
                    <input type="text" class="form-control" name="staffID" placeholder="staffID" aria-describedby="basic-addon1">
                </div><br>
                <div id="matric_div" style="display: none;">
                    <input type="number" class="form-control" name="matric" placeholder="matricNumber" aria-describedby="basic-addon1">
                </div><br>
                <input type="submit" value="Create Account" class="btn btn-lg btn-primary">
            </form>
        </div>
    </div>
    <script>
        function change(obj) {
            var selectBox = obj;
            var selected = selectBox.options[selectBox.selectedIndex].value;
            var div = document.getElementById("matric_div");
            var div2 = document.getElementById("staffID_div");
            if (selected === '1') {
            div.style.display = "block";
            } else {
            div.style.display = "none";
            }
            if (selected === '0'){
            div2.style.display = "block";
            } else {
            div2.style.display = "none";
            }
        }
    </script>




    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
</script>
</body>
</html>
