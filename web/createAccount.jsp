<%@include file="header.jsp"%>
<title>Create Account</title>
  <!--refactored to increase usability and normalize design-->
</head>
<body>
    <%@include file="navbar.jsp"%>
     <div style="margin: 1% 10% 10% 10%">
    <div class="jumbotron ">

    
    <h1 class="display-1">Create Account Page</h1>
    <div class ="row">
        <div class="col-12 display-4"><h2> Lets create your account! </h2></div>
    </div>
    <br>

    <div class="row marketing">
        <div class="col-lg-6">
            <form action="CreateAccount" method="post">  
                <div class="input-group">
                    <input type="text" class="form-control" name="firstname" placeholder="Firstname" aria-describedby="basic-addon1">
                </div><br>
                <div class="input-group">
                    <input type="text" class="form-control" name="lastname" placeholder="Lastname" aria-describedby="basic-addon1">
                </div><br>
                <div class="input-group">
                    <input type="email" class="form-control" name="email" placeholder="staff@dundee.ac.uk" aria-describedby="basic-addon1">
                </div><br>
                <div class ="input-group">
                    <select name ="soulChoice" class="form-control" id="selS" onchange="change(this)">
                        <option>Are you a staff member or student?</option>
                        <br/><br/>
                        <option value = "0">Staff Member</option>
                        <br/>
                        <option value = "1">Student</option>
                    </select>
                </div>
                <div id="staffID_div" style="display: none;">
                    <input type="text" class="form-control" name="staffID" placeholder="Staff ID Number" aria-describedby="basic-addon1">
                </div><br>
                <div id="matric_div" style="display: none;">
                    <input type="number" class="form-control" name="matric" placeholder="Matriculation Number" aria-describedby="basic-addon1">
                </div><br>
                <input type="submit" value="Create Account" class="display-4 btn btn btn-primary">
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
    </div>
     </div>



    